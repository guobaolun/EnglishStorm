package com.english.storm.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNull() {
            addCriterion("portrait is null");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNotNull() {
            addCriterion("portrait is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitEqualTo(String value) {
            addCriterion("portrait =", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotEqualTo(String value) {
            addCriterion("portrait <>", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThan(String value) {
            addCriterion("portrait >", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("portrait >=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThan(String value) {
            addCriterion("portrait <", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThanOrEqualTo(String value) {
            addCriterion("portrait <=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLike(String value) {
            addCriterion("portrait like", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotLike(String value) {
            addCriterion("portrait not like", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitIn(List<String> values) {
            addCriterion("portrait in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotIn(List<String> values) {
            addCriterion("portrait not in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitBetween(String value1, String value2) {
            addCriterion("portrait between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotBetween(String value1, String value2) {
            addCriterion("portrait not between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("lv is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("lv is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Integer value) {
            addCriterion("lv =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Integer value) {
            addCriterion("lv <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Integer value) {
            addCriterion("lv >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("lv >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Integer value) {
            addCriterion("lv <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Integer value) {
            addCriterion("lv <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Integer> values) {
            addCriterion("lv in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Integer> values) {
            addCriterion("lv not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Integer value1, Integer value2) {
            addCriterion("lv between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Integer value1, Integer value2) {
            addCriterion("lv not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Long value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Long value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Long value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Long value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Long value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Long value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Long> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Long> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Long value1, Long value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Long value1, Long value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Long value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Long value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Long value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Long value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Long> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Long> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Long value1, Long value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(Integer value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(Integer value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(Integer value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(Integer value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<Integer> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<Integer> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(Integer value1, Integer value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryIsNull() {
            addCriterion("current_country is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryIsNotNull() {
            addCriterion("current_country is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryEqualTo(String value) {
            addCriterion("current_country =", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryNotEqualTo(String value) {
            addCriterion("current_country <>", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryGreaterThan(String value) {
            addCriterion("current_country >", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryGreaterThanOrEqualTo(String value) {
            addCriterion("current_country >=", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryLessThan(String value) {
            addCriterion("current_country <", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryLessThanOrEqualTo(String value) {
            addCriterion("current_country <=", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryLike(String value) {
            addCriterion("current_country like", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryNotLike(String value) {
            addCriterion("current_country not like", value, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryIn(List<String> values) {
            addCriterion("current_country in", values, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryNotIn(List<String> values) {
            addCriterion("current_country not in", values, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryBetween(String value1, String value2) {
            addCriterion("current_country between", value1, value2, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentCountryNotBetween(String value1, String value2) {
            addCriterion("current_country not between", value1, value2, "currentCountry");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIsNull() {
            addCriterion("current_province is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIsNotNull() {
            addCriterion("current_province is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceEqualTo(String value) {
            addCriterion("current_province =", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotEqualTo(String value) {
            addCriterion("current_province <>", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceGreaterThan(String value) {
            addCriterion("current_province >", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("current_province >=", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLessThan(String value) {
            addCriterion("current_province <", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLessThanOrEqualTo(String value) {
            addCriterion("current_province <=", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLike(String value) {
            addCriterion("current_province like", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotLike(String value) {
            addCriterion("current_province not like", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIn(List<String> values) {
            addCriterion("current_province in", values, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotIn(List<String> values) {
            addCriterion("current_province not in", values, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceBetween(String value1, String value2) {
            addCriterion("current_province between", value1, value2, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotBetween(String value1, String value2) {
            addCriterion("current_province not between", value1, value2, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNull() {
            addCriterion("current_city is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNotNull() {
            addCriterion("current_city is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityEqualTo(String value) {
            addCriterion("current_city =", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotEqualTo(String value) {
            addCriterion("current_city <>", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThan(String value) {
            addCriterion("current_city >", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThanOrEqualTo(String value) {
            addCriterion("current_city >=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThan(String value) {
            addCriterion("current_city <", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThanOrEqualTo(String value) {
            addCriterion("current_city <=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLike(String value) {
            addCriterion("current_city like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotLike(String value) {
            addCriterion("current_city not like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIn(List<String> values) {
            addCriterion("current_city in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotIn(List<String> values) {
            addCriterion("current_city not in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityBetween(String value1, String value2) {
            addCriterion("current_city between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotBetween(String value1, String value2) {
            addCriterion("current_city not between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaIsNull() {
            addCriterion("current_area is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaIsNotNull() {
            addCriterion("current_area is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaEqualTo(String value) {
            addCriterion("current_area =", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaNotEqualTo(String value) {
            addCriterion("current_area <>", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaGreaterThan(String value) {
            addCriterion("current_area >", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaGreaterThanOrEqualTo(String value) {
            addCriterion("current_area >=", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaLessThan(String value) {
            addCriterion("current_area <", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaLessThanOrEqualTo(String value) {
            addCriterion("current_area <=", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaLike(String value) {
            addCriterion("current_area like", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaNotLike(String value) {
            addCriterion("current_area not like", value, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaIn(List<String> values) {
            addCriterion("current_area in", values, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaNotIn(List<String> values) {
            addCriterion("current_area not in", values, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaBetween(String value1, String value2) {
            addCriterion("current_area between", value1, value2, "currentArea");
            return (Criteria) this;
        }

        public Criteria andCurrentAreaNotBetween(String value1, String value2) {
            addCriterion("current_area not between", value1, value2, "currentArea");
            return (Criteria) this;
        }

        public Criteria andHometownCountryIsNull() {
            addCriterion("hometown_country is null");
            return (Criteria) this;
        }

        public Criteria andHometownCountryIsNotNull() {
            addCriterion("hometown_country is not null");
            return (Criteria) this;
        }

        public Criteria andHometownCountryEqualTo(String value) {
            addCriterion("hometown_country =", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryNotEqualTo(String value) {
            addCriterion("hometown_country <>", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryGreaterThan(String value) {
            addCriterion("hometown_country >", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryGreaterThanOrEqualTo(String value) {
            addCriterion("hometown_country >=", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryLessThan(String value) {
            addCriterion("hometown_country <", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryLessThanOrEqualTo(String value) {
            addCriterion("hometown_country <=", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryLike(String value) {
            addCriterion("hometown_country like", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryNotLike(String value) {
            addCriterion("hometown_country not like", value, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryIn(List<String> values) {
            addCriterion("hometown_country in", values, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryNotIn(List<String> values) {
            addCriterion("hometown_country not in", values, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryBetween(String value1, String value2) {
            addCriterion("hometown_country between", value1, value2, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownCountryNotBetween(String value1, String value2) {
            addCriterion("hometown_country not between", value1, value2, "hometownCountry");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceIsNull() {
            addCriterion("hometown_province is null");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceIsNotNull() {
            addCriterion("hometown_province is not null");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceEqualTo(String value) {
            addCriterion("hometown_province =", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceNotEqualTo(String value) {
            addCriterion("hometown_province <>", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceGreaterThan(String value) {
            addCriterion("hometown_province >", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("hometown_province >=", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceLessThan(String value) {
            addCriterion("hometown_province <", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceLessThanOrEqualTo(String value) {
            addCriterion("hometown_province <=", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceLike(String value) {
            addCriterion("hometown_province like", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceNotLike(String value) {
            addCriterion("hometown_province not like", value, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceIn(List<String> values) {
            addCriterion("hometown_province in", values, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceNotIn(List<String> values) {
            addCriterion("hometown_province not in", values, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceBetween(String value1, String value2) {
            addCriterion("hometown_province between", value1, value2, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownProvinceNotBetween(String value1, String value2) {
            addCriterion("hometown_province not between", value1, value2, "hometownProvince");
            return (Criteria) this;
        }

        public Criteria andHometownCityIsNull() {
            addCriterion("hometown_city is null");
            return (Criteria) this;
        }

        public Criteria andHometownCityIsNotNull() {
            addCriterion("hometown_city is not null");
            return (Criteria) this;
        }

        public Criteria andHometownCityEqualTo(String value) {
            addCriterion("hometown_city =", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityNotEqualTo(String value) {
            addCriterion("hometown_city <>", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityGreaterThan(String value) {
            addCriterion("hometown_city >", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityGreaterThanOrEqualTo(String value) {
            addCriterion("hometown_city >=", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityLessThan(String value) {
            addCriterion("hometown_city <", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityLessThanOrEqualTo(String value) {
            addCriterion("hometown_city <=", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityLike(String value) {
            addCriterion("hometown_city like", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityNotLike(String value) {
            addCriterion("hometown_city not like", value, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityIn(List<String> values) {
            addCriterion("hometown_city in", values, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityNotIn(List<String> values) {
            addCriterion("hometown_city not in", values, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityBetween(String value1, String value2) {
            addCriterion("hometown_city between", value1, value2, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownCityNotBetween(String value1, String value2) {
            addCriterion("hometown_city not between", value1, value2, "hometownCity");
            return (Criteria) this;
        }

        public Criteria andHometownAreaIsNull() {
            addCriterion("hometown_area is null");
            return (Criteria) this;
        }

        public Criteria andHometownAreaIsNotNull() {
            addCriterion("hometown_area is not null");
            return (Criteria) this;
        }

        public Criteria andHometownAreaEqualTo(String value) {
            addCriterion("hometown_area =", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaNotEqualTo(String value) {
            addCriterion("hometown_area <>", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaGreaterThan(String value) {
            addCriterion("hometown_area >", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaGreaterThanOrEqualTo(String value) {
            addCriterion("hometown_area >=", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaLessThan(String value) {
            addCriterion("hometown_area <", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaLessThanOrEqualTo(String value) {
            addCriterion("hometown_area <=", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaLike(String value) {
            addCriterion("hometown_area like", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaNotLike(String value) {
            addCriterion("hometown_area not like", value, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaIn(List<String> values) {
            addCriterion("hometown_area in", values, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaNotIn(List<String> values) {
            addCriterion("hometown_area not in", values, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaBetween(String value1, String value2) {
            addCriterion("hometown_area between", value1, value2, "hometownArea");
            return (Criteria) this;
        }

        public Criteria andHometownAreaNotBetween(String value1, String value2) {
            addCriterion("hometown_area not between", value1, value2, "hometownArea");
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