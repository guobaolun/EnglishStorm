package com.english.storm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemoryProgressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryProgressExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWordIdIsNull() {
            addCriterion("word_id is null");
            return (Criteria) this;
        }

        public Criteria andWordIdIsNotNull() {
            addCriterion("word_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordIdEqualTo(Integer value) {
            addCriterion("word_id =", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotEqualTo(Integer value) {
            addCriterion("word_id <>", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThan(Integer value) {
            addCriterion("word_id >", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_id >=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThan(Integer value) {
            addCriterion("word_id <", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThanOrEqualTo(Integer value) {
            addCriterion("word_id <=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdIn(List<Integer> values) {
            addCriterion("word_id in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotIn(List<Integer> values) {
            addCriterion("word_id not in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdBetween(Integer value1, Integer value2) {
            addCriterion("word_id between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("word_id not between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andSpellTimeIsNull() {
            addCriterion("spell_time is null");
            return (Criteria) this;
        }

        public Criteria andSpellTimeIsNotNull() {
            addCriterion("spell_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpellTimeEqualTo(Long value) {
            addCriterion("spell_time =", value, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeNotEqualTo(Long value) {
            addCriterion("spell_time <>", value, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeGreaterThan(Long value) {
            addCriterion("spell_time >", value, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("spell_time >=", value, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeLessThan(Long value) {
            addCriterion("spell_time <", value, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeLessThanOrEqualTo(Long value) {
            addCriterion("spell_time <=", value, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeIn(List<Long> values) {
            addCriterion("spell_time in", values, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeNotIn(List<Long> values) {
            addCriterion("spell_time not in", values, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeBetween(Long value1, Long value2) {
            addCriterion("spell_time between", value1, value2, "spellTime");
            return (Criteria) this;
        }

        public Criteria andSpellTimeNotBetween(Long value1, Long value2) {
            addCriterion("spell_time not between", value1, value2, "spellTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeIsNull() {
            addCriterion("memory_time is null");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeIsNotNull() {
            addCriterion("memory_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeEqualTo(Long value) {
            addCriterion("memory_time =", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeNotEqualTo(Long value) {
            addCriterion("memory_time <>", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeGreaterThan(Long value) {
            addCriterion("memory_time >", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("memory_time >=", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeLessThan(Long value) {
            addCriterion("memory_time <", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeLessThanOrEqualTo(Long value) {
            addCriterion("memory_time <=", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeIn(List<Long> values) {
            addCriterion("memory_time in", values, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeNotIn(List<Long> values) {
            addCriterion("memory_time not in", values, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeBetween(Long value1, Long value2) {
            addCriterion("memory_time between", value1, value2, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeNotBetween(Long value1, Long value2) {
            addCriterion("memory_time not between", value1, value2, "memoryTime");
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