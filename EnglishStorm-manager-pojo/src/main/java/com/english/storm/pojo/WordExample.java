package com.english.storm.pojo;

import java.util.ArrayList;
import java.util.List;

public class WordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andChineseIsNull() {
            addCriterion("chinese is null");
            return (Criteria) this;
        }

        public Criteria andChineseIsNotNull() {
            addCriterion("chinese is not null");
            return (Criteria) this;
        }

        public Criteria andChineseEqualTo(String value) {
            addCriterion("chinese =", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotEqualTo(String value) {
            addCriterion("chinese <>", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThan(String value) {
            addCriterion("chinese >", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThanOrEqualTo(String value) {
            addCriterion("chinese >=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThan(String value) {
            addCriterion("chinese <", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThanOrEqualTo(String value) {
            addCriterion("chinese <=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLike(String value) {
            addCriterion("chinese like", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotLike(String value) {
            addCriterion("chinese not like", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseIn(List<String> values) {
            addCriterion("chinese in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotIn(List<String> values) {
            addCriterion("chinese not in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseBetween(String value1, String value2) {
            addCriterion("chinese between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotBetween(String value1, String value2) {
            addCriterion("chinese not between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticIsNull() {
            addCriterion("uk_phonetic is null");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticIsNotNull() {
            addCriterion("uk_phonetic is not null");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticEqualTo(String value) {
            addCriterion("uk_phonetic =", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticNotEqualTo(String value) {
            addCriterion("uk_phonetic <>", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticGreaterThan(String value) {
            addCriterion("uk_phonetic >", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticGreaterThanOrEqualTo(String value) {
            addCriterion("uk_phonetic >=", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticLessThan(String value) {
            addCriterion("uk_phonetic <", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticLessThanOrEqualTo(String value) {
            addCriterion("uk_phonetic <=", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticLike(String value) {
            addCriterion("uk_phonetic like", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticNotLike(String value) {
            addCriterion("uk_phonetic not like", value, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticIn(List<String> values) {
            addCriterion("uk_phonetic in", values, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticNotIn(List<String> values) {
            addCriterion("uk_phonetic not in", values, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticBetween(String value1, String value2) {
            addCriterion("uk_phonetic between", value1, value2, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkPhoneticNotBetween(String value1, String value2) {
            addCriterion("uk_phonetic not between", value1, value2, "ukPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticIsNull() {
            addCriterion("us_phonetic is null");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticIsNotNull() {
            addCriterion("us_phonetic is not null");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticEqualTo(String value) {
            addCriterion("us_phonetic =", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticNotEqualTo(String value) {
            addCriterion("us_phonetic <>", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticGreaterThan(String value) {
            addCriterion("us_phonetic >", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticGreaterThanOrEqualTo(String value) {
            addCriterion("us_phonetic >=", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticLessThan(String value) {
            addCriterion("us_phonetic <", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticLessThanOrEqualTo(String value) {
            addCriterion("us_phonetic <=", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticLike(String value) {
            addCriterion("us_phonetic like", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticNotLike(String value) {
            addCriterion("us_phonetic not like", value, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticIn(List<String> values) {
            addCriterion("us_phonetic in", values, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticNotIn(List<String> values) {
            addCriterion("us_phonetic not in", values, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticBetween(String value1, String value2) {
            addCriterion("us_phonetic between", value1, value2, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUsPhoneticNotBetween(String value1, String value2) {
            addCriterion("us_phonetic not between", value1, value2, "usPhonetic");
            return (Criteria) this;
        }

        public Criteria andUkSoundIsNull() {
            addCriterion("uk_sound is null");
            return (Criteria) this;
        }

        public Criteria andUkSoundIsNotNull() {
            addCriterion("uk_sound is not null");
            return (Criteria) this;
        }

        public Criteria andUkSoundEqualTo(String value) {
            addCriterion("uk_sound =", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundNotEqualTo(String value) {
            addCriterion("uk_sound <>", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundGreaterThan(String value) {
            addCriterion("uk_sound >", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundGreaterThanOrEqualTo(String value) {
            addCriterion("uk_sound >=", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundLessThan(String value) {
            addCriterion("uk_sound <", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundLessThanOrEqualTo(String value) {
            addCriterion("uk_sound <=", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundLike(String value) {
            addCriterion("uk_sound like", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundNotLike(String value) {
            addCriterion("uk_sound not like", value, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundIn(List<String> values) {
            addCriterion("uk_sound in", values, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundNotIn(List<String> values) {
            addCriterion("uk_sound not in", values, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundBetween(String value1, String value2) {
            addCriterion("uk_sound between", value1, value2, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUkSoundNotBetween(String value1, String value2) {
            addCriterion("uk_sound not between", value1, value2, "ukSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundIsNull() {
            addCriterion("us_sound is null");
            return (Criteria) this;
        }

        public Criteria andUsSoundIsNotNull() {
            addCriterion("us_sound is not null");
            return (Criteria) this;
        }

        public Criteria andUsSoundEqualTo(String value) {
            addCriterion("us_sound =", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundNotEqualTo(String value) {
            addCriterion("us_sound <>", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundGreaterThan(String value) {
            addCriterion("us_sound >", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundGreaterThanOrEqualTo(String value) {
            addCriterion("us_sound >=", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundLessThan(String value) {
            addCriterion("us_sound <", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundLessThanOrEqualTo(String value) {
            addCriterion("us_sound <=", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundLike(String value) {
            addCriterion("us_sound like", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundNotLike(String value) {
            addCriterion("us_sound not like", value, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundIn(List<String> values) {
            addCriterion("us_sound in", values, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundNotIn(List<String> values) {
            addCriterion("us_sound not in", values, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundBetween(String value1, String value2) {
            addCriterion("us_sound between", value1, value2, "usSound");
            return (Criteria) this;
        }

        public Criteria andUsSoundNotBetween(String value1, String value2) {
            addCriterion("us_sound not between", value1, value2, "usSound");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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