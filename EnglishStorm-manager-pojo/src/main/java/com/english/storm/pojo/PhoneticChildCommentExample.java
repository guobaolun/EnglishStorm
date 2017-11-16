package com.english.storm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhoneticChildCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhoneticChildCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("_id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("_id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("comment_id like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("comment_id not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIsNull() {
            addCriterion("target_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIsNotNull() {
            addCriterion("target_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdEqualTo(String value) {
            addCriterion("target_user_id =", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotEqualTo(String value) {
            addCriterion("target_user_id <>", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdGreaterThan(String value) {
            addCriterion("target_user_id >", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("target_user_id >=", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLessThan(String value) {
            addCriterion("target_user_id <", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLessThanOrEqualTo(String value) {
            addCriterion("target_user_id <=", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLike(String value) {
            addCriterion("target_user_id like", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotLike(String value) {
            addCriterion("target_user_id not like", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIn(List<String> values) {
            addCriterion("target_user_id in", values, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotIn(List<String> values) {
            addCriterion("target_user_id not in", values, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdBetween(String value1, String value2) {
            addCriterion("target_user_id between", value1, value2, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotBetween(String value1, String value2) {
            addCriterion("target_user_id not between", value1, value2, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Long value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Long value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Long value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Long value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Long value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Long> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Long> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Long value1, Long value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Long value1, Long value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNull() {
            addCriterion("voice is null");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNotNull() {
            addCriterion("voice is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceEqualTo(String value) {
            addCriterion("voice =", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotEqualTo(String value) {
            addCriterion("voice <>", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThan(String value) {
            addCriterion("voice >", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("voice >=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThan(String value) {
            addCriterion("voice <", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThanOrEqualTo(String value) {
            addCriterion("voice <=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLike(String value) {
            addCriterion("voice like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotLike(String value) {
            addCriterion("voice not like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceIn(List<String> values) {
            addCriterion("voice in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotIn(List<String> values) {
            addCriterion("voice not in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceBetween(String value1, String value2) {
            addCriterion("voice between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotBetween(String value1, String value2) {
            addCriterion("voice not between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeIsNull() {
            addCriterion("voice_time is null");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeIsNotNull() {
            addCriterion("voice_time is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeEqualTo(Integer value) {
            addCriterion("voice_time =", value, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeNotEqualTo(Integer value) {
            addCriterion("voice_time <>", value, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeGreaterThan(Integer value) {
            addCriterion("voice_time >", value, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("voice_time >=", value, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeLessThan(Integer value) {
            addCriterion("voice_time <", value, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeLessThanOrEqualTo(Integer value) {
            addCriterion("voice_time <=", value, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeIn(List<Integer> values) {
            addCriterion("voice_time in", values, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeNotIn(List<Integer> values) {
            addCriterion("voice_time not in", values, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeBetween(Integer value1, Integer value2) {
            addCriterion("voice_time between", value1, value2, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andVoiceTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("voice_time not between", value1, value2, "voiceTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNull() {
            addCriterion("praise_count is null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNotNull() {
            addCriterion("praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountEqualTo(Integer value) {
            addCriterion("praise_count =", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotEqualTo(Integer value) {
            addCriterion("praise_count <>", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThan(Integer value) {
            addCriterion("praise_count >", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("praise_count >=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThan(Integer value) {
            addCriterion("praise_count <", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThanOrEqualTo(Integer value) {
            addCriterion("praise_count <=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIn(List<Integer> values) {
            addCriterion("praise_count in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotIn(List<Integer> values) {
            addCriterion("praise_count not in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountBetween(Integer value1, Integer value2) {
            addCriterion("praise_count between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("praise_count not between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andAccusationIsNull() {
            addCriterion("accusation is null");
            return (Criteria) this;
        }

        public Criteria andAccusationIsNotNull() {
            addCriterion("accusation is not null");
            return (Criteria) this;
        }

        public Criteria andAccusationEqualTo(Integer value) {
            addCriterion("accusation =", value, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationNotEqualTo(Integer value) {
            addCriterion("accusation <>", value, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationGreaterThan(Integer value) {
            addCriterion("accusation >", value, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationGreaterThanOrEqualTo(Integer value) {
            addCriterion("accusation >=", value, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationLessThan(Integer value) {
            addCriterion("accusation <", value, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationLessThanOrEqualTo(Integer value) {
            addCriterion("accusation <=", value, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationIn(List<Integer> values) {
            addCriterion("accusation in", values, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationNotIn(List<Integer> values) {
            addCriterion("accusation not in", values, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationBetween(Integer value1, Integer value2) {
            addCriterion("accusation between", value1, value2, "accusation");
            return (Criteria) this;
        }

        public Criteria andAccusationNotBetween(Integer value1, Integer value2) {
            addCriterion("accusation not between", value1, value2, "accusation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}