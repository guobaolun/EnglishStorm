package com.english.storm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.EnglishCircleChildComment;
import com.english.storm.entity.EnglishCircleComment;
import com.english.storm.entity.User;
import com.english.storm.mapper.EnglishCircleCommentMapper;
import com.english.storm.modle.ChildCommentData;
import com.english.storm.modle.CommentData;
import com.english.storm.modle.PageListResponse;
import com.english.storm.service.IEnglishCircleCommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.english.storm.service.utils.CacheManager;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class EnglishCircleCommentServiceImpl extends ServiceImpl<EnglishCircleCommentMapper, EnglishCircleComment> implements IEnglishCircleCommentService {

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String imageServerBaseUrl;

    @Autowired
    private CacheManager cacheManager;

    @Override
    public EnglishStormResult addComment(String token, long articleId, String content, String voice, int voiceTime, int type) throws IOException {

        User user = cacheManager.getCacheUser(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        Date date = new Date();
        EnglishCircleComment comment = new EnglishCircleComment();
        comment.setGmtCreate(date);
        comment.setGmtModified(date);
        comment.setCommentCount(0);
        comment.setPraiseCount(0);
        comment.setArticleId(articleId);
        comment.setUserId(user.getUserId());
        comment.setContent(content);
        comment.setVoice(voice);
        comment.setVoiceTime(voiceTime);
        comment.setType(type);
        comment.setCommentCount(0);
        comment.setPraiseCount(0);

        boolean isOk = comment.insert();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok();
    }


    @Override
    public EnglishStormResult findCommentList(long articleId, int page, int rows, long time) {

        EntityWrapper<EnglishCircleComment> commentWrapper = new EntityWrapper<>();
        commentWrapper.orderBy("gmt_create DESC");
        if (time > 0) {
            commentWrapper.le("gmt_create", new Date(time));
        }
        Page<EnglishCircleComment> commentPageInfo = selectPage(new Page<EnglishCircleComment>(page, rows), commentWrapper);


        int pageSize = commentPageInfo.getTotal() % rows == 0 ? commentPageInfo.getTotal() / rows : commentPageInfo.getTotal() / rows + 1;
        boolean isFirstPage = page == 0;
        boolean isLastPage = page == pageSize;

        PageListResponse listResult = new PageListResponse();
        listResult.setIsFirstPage(isFirstPage);
        listResult.setIsLastPage(isLastPage);
        listResult.setPageNum(page);
        listResult.setPages(commentPageInfo.getPages());
        listResult.setPageSize(pageSize);
        listResult.setSize(commentPageInfo.getSize());
        listResult.setTotal(commentPageInfo.getTotal());
        List<EnglishCircleComment> list = commentPageInfo.getRecords();

        ArrayList<CommentData> dataList = new ArrayList<>();

        for (EnglishCircleComment comment : list) {

            User user = new User();
            user = user.selectOne(new EntityWrapper<User>().eq("user_id", comment.getUserId()));

            CommentData commentData = new CommentData();

            commentData.setId(comment.getId());
            commentData.setArticleId(articleId);
            commentData.setUserId(comment.getUserId());
            commentData.setNickname(user.getNickname());
            commentData.setPortrait(imageServerBaseUrl + user.getPortrait());
            commentData.setTime(comment.getGmtCreate().getTime());
            if (comment.getType() == 0) {
                commentData.setContent(comment.getContent());
            } else {
                commentData.setVoice(imageServerBaseUrl + comment.getVoice());
                commentData.setVoiceTime(comment.getVoiceTime());
            }
            commentData.setType(comment.getType());
            commentData.setCommentCount(comment.getCommentCount());
            commentData.setPraiseCount(comment.getPraiseCount());

            EnglishCircleChildComment circleChildComment = new EnglishCircleChildComment();
//            Page<EnglishCircleChildComment> childPageInfo = circleChildComment.selectPage(new Page<EnglishCircleChildComment>(0, 5),
//                    new EntityWrapper<EnglishCircleChildComment>().orderBy("gmt_create DESC").eq("comment_id", comment.getId()).le("gmt_create", new Date(time)));
//

            EntityWrapper<EnglishCircleChildComment> childCommentWrapper = new EntityWrapper<>();
            childCommentWrapper.orderBy("gmt_create DESC");
            childCommentWrapper.eq("comment_id", comment.getId());
            if (time > 0) {
                childCommentWrapper.le("gmt_create", new Date(time));
            }
            Page<EnglishCircleChildComment> childCommentPageInfo = circleChildComment.selectPage(new Page<EnglishCircleChildComment>(page, rows), childCommentWrapper);


//            PageHelper.startPage(0, 5);
//            EnglishCircleChildCommentExample childCommentExample = new EnglishCircleChildCommentExample();
//            childCommentExample.setOrderByClause("time DESC");
//
//            EnglishCircleChildCommentExample.Criteria childCommentCriteria = childCommentExample.createCriteria();
//            childCommentCriteria.andTimeLessThanOrEqualTo(time);
//            childCommentCriteria.andCommentIdEqualTo(comment.getId());

//            List<EnglishCircleChildComment> selectChildComment = childCommentMapper.selectByExample(childCommentExample);

//            PageInfo<EnglishCircleChildComment> childPageInfo = new PageInfo<>(selectChildComment);
            List<EnglishCircleChildComment> childCommentList = childCommentPageInfo.getRecords();
            ArrayList<ChildCommentData> childCommentDataList = new ArrayList<>();


            for (EnglishCircleChildComment childComment : childCommentList) {
                User childUser = new User();
                childUser = childUser.selectOne(new EntityWrapper<User>().eq("user_id", childComment.getUserId()));
                User childTargetUser = childUser.selectOne(new EntityWrapper<User>().eq("user_id", childComment.getTargetUserId()));

                ChildCommentData data = new ChildCommentData(
                        childComment.getId(),
                        childComment.getCommentId(),
                        childComment.getUserId(),
                        childUser.getNickname(),
                        childUser.getPortrait(),
                        childTargetUser.getUserId(),
                        childTargetUser.getNickname(),
                        childComment.getTime(),
                        childComment.getContent(),
                        childComment.getVoice(),
                        childComment.getVoiceTime(),
                        childComment.getType(),
                        childComment.getPraiseCount());
                childCommentDataList.add(data);

            }

            commentData.setChildCommentList(childCommentDataList);

            dataList.add(commentData);
        }

        listResult.setList(dataList);


        return EnglishStormResult.ok(listResult);
    }

}
