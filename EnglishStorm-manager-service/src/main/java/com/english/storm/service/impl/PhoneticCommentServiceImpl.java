package com.english.storm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.*;
import com.english.storm.mapper.PhoneticCommentMapper;
import com.english.storm.modle.ChildCommentData;
import com.english.storm.modle.CommentData;
import com.english.storm.modle.PageListResponse;
import com.english.storm.service.IPhoneticCommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
 *  服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class PhoneticCommentServiceImpl extends ServiceImpl<PhoneticCommentMapper, PhoneticComment> implements IPhoneticCommentService {


    @Value("${IMAGE_SERVER_BASE_URL}")
    private String imageServerBaseUrl;

    @Autowired
    private JedisClient jedisClient;

    @Override
    public EnglishStormResult addComment(String token, long articleId, String content, String voice, int voiceTime, int type) throws IOException {

        String userInfoStr = jedisClient.get(token);

        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }
        User user = JsonUtils.jsonToObject(userInfoStr, User.class);

        Date date = new Date();
        PhoneticComment comment = new PhoneticComment();
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

        EntityWrapper<PhoneticComment> commentWrapper = new EntityWrapper<>();
        commentWrapper.orderBy("gmt_create DESC");
        if (time > 0) {
            commentWrapper.le("gmt_create", new Date(time));
        }
        Page<PhoneticComment> commentPageInfo = selectPage(new Page<PhoneticComment>(page, rows), commentWrapper);


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
        List<PhoneticComment> list = commentPageInfo.getRecords();

        ArrayList<CommentData> dataList = new ArrayList<>();

        for (PhoneticComment comment : list) {

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

            PhoneticChildComment circleChildComment = new PhoneticChildComment();

            EntityWrapper<PhoneticChildComment> childCommentWrapper = new EntityWrapper<>();
            childCommentWrapper.orderBy("gmt_create DESC");
            childCommentWrapper.eq("comment_id", comment.getId());
            if (time > 0) {
                childCommentWrapper.le("gmt_create", new Date(time));
            }
            Page<PhoneticChildComment> childCommentPageInfo = circleChildComment.selectPage(new Page<PhoneticChildComment>(page, rows), childCommentWrapper);


            List<PhoneticChildComment> childCommentList = childCommentPageInfo.getRecords();
            ArrayList<ChildCommentData> childCommentDataList = new ArrayList<>();

            for (PhoneticChildComment phoneticChildComment : childCommentList) {
                User childUser = new User();
                childUser = childUser.selectOne(new EntityWrapper<User>().eq("user_id", phoneticChildComment.getUserId()));
                User childTargetUser = childUser.selectOne(new EntityWrapper<User>().eq("user_id", phoneticChildComment.getTargetUserId()));

                ChildCommentData data = new ChildCommentData(
                        phoneticChildComment.getId(),
                        phoneticChildComment.getCommentId(),
                        phoneticChildComment.getUserId(),
                        childUser.getNickname(),
                        childUser.getPortrait(),
                        childTargetUser.getUserId(),
                        childTargetUser.getNickname(),
                        phoneticChildComment.getTime(),
                        phoneticChildComment.getContent(),
                        phoneticChildComment.getVoice(),
                        phoneticChildComment.getVoiceTime(),
                        phoneticChildComment.getType(),
                        phoneticChildComment.getPraiseCount());
                childCommentDataList.add(data);

            }

            commentData.setChildConmentList(childCommentDataList);

            dataList.add(commentData);
        }

        listResult.setList(dataList);


        return EnglishStormResult.ok(listResult);
    }

}
