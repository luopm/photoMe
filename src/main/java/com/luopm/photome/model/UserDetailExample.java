package com.luopm.photome.model;

import java.util.ArrayList;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailExample() {
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

        public Criteria andPhotomeUserdetailIdIsNull() {
            addCriterion("photome_userdetail_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdIsNotNull() {
            addCriterion("photome_userdetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdEqualTo(Integer value) {
            addCriterion("photome_userdetail_id =", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdNotEqualTo(Integer value) {
            addCriterion("photome_userdetail_id <>", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdGreaterThan(Integer value) {
            addCriterion("photome_userdetail_id >", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_userdetail_id >=", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdLessThan(Integer value) {
            addCriterion("photome_userdetail_id <", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("photome_userdetail_id <=", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdIn(List<Integer> values) {
            addCriterion("photome_userdetail_id in", values, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdNotIn(List<Integer> values) {
            addCriterion("photome_userdetail_id not in", values, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("photome_userdetail_id between", value1, value2, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_userdetail_id not between", value1, value2, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameIsNull() {
            addCriterion("photome_userdetail_username is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameIsNotNull() {
            addCriterion("photome_userdetail_username is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameEqualTo(String value) {
            addCriterion("photome_userdetail_username =", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotEqualTo(String value) {
            addCriterion("photome_userdetail_username <>", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameGreaterThan(String value) {
            addCriterion("photome_userdetail_username >", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_username >=", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameLessThan(String value) {
            addCriterion("photome_userdetail_username <", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_username <=", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameLike(String value) {
            addCriterion("photome_userdetail_username like", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotLike(String value) {
            addCriterion("photome_userdetail_username not like", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameIn(List<String> values) {
            addCriterion("photome_userdetail_username in", values, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotIn(List<String> values) {
            addCriterion("photome_userdetail_username not in", values, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameBetween(String value1, String value2) {
            addCriterion("photome_userdetail_username between", value1, value2, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_username not between", value1, value2, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionIsNull() {
            addCriterion("photome_userdetail_userintroduction is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionIsNotNull() {
            addCriterion("photome_userdetail_userintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction =", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction <>", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionGreaterThan(String value) {
            addCriterion("photome_userdetail_userintroduction >", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction >=", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionLessThan(String value) {
            addCriterion("photome_userdetail_userintroduction <", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction <=", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionLike(String value) {
            addCriterion("photome_userdetail_userintroduction like", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotLike(String value) {
            addCriterion("photome_userdetail_userintroduction not like", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionIn(List<String> values) {
            addCriterion("photome_userdetail_userintroduction in", values, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotIn(List<String> values) {
            addCriterion("photome_userdetail_userintroduction not in", values, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionBetween(String value1, String value2) {
            addCriterion("photome_userdetail_userintroduction between", value1, value2, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_userintroduction not between", value1, value2, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameIsNull() {
            addCriterion("photome_userdetail_usercovername is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameIsNotNull() {
            addCriterion("photome_userdetail_usercovername is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameEqualTo(String value) {
            addCriterion("photome_userdetail_usercovername =", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameNotEqualTo(String value) {
            addCriterion("photome_userdetail_usercovername <>", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameGreaterThan(String value) {
            addCriterion("photome_userdetail_usercovername >", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercovername >=", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameLessThan(String value) {
            addCriterion("photome_userdetail_usercovername <", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercovername <=", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameLike(String value) {
            addCriterion("photome_userdetail_usercovername like", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameNotLike(String value) {
            addCriterion("photome_userdetail_usercovername not like", value, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameIn(List<String> values) {
            addCriterion("photome_userdetail_usercovername in", values, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameNotIn(List<String> values) {
            addCriterion("photome_userdetail_usercovername not in", values, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercovername between", value1, value2, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovernameNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercovername not between", value1, value2, "photomeUserdetailUsercovername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeIsNull() {
            addCriterion("photome_userdetail_usercovercode is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeIsNotNull() {
            addCriterion("photome_userdetail_usercovercode is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeEqualTo(String value) {
            addCriterion("photome_userdetail_usercovercode =", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeNotEqualTo(String value) {
            addCriterion("photome_userdetail_usercovercode <>", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeGreaterThan(String value) {
            addCriterion("photome_userdetail_usercovercode >", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercovercode >=", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeLessThan(String value) {
            addCriterion("photome_userdetail_usercovercode <", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercovercode <=", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeLike(String value) {
            addCriterion("photome_userdetail_usercovercode like", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeNotLike(String value) {
            addCriterion("photome_userdetail_usercovercode not like", value, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeIn(List<String> values) {
            addCriterion("photome_userdetail_usercovercode in", values, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeNotIn(List<String> values) {
            addCriterion("photome_userdetail_usercovercode not in", values, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercovercode between", value1, value2, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercovercodeNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercovercode not between", value1, value2, "photomeUserdetailUsercovercode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameIsNull() {
            addCriterion("photome_userdetail_usermusicname is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameIsNotNull() {
            addCriterion("photome_userdetail_usermusicname is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameEqualTo(String value) {
            addCriterion("photome_userdetail_usermusicname =", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameNotEqualTo(String value) {
            addCriterion("photome_userdetail_usermusicname <>", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameGreaterThan(String value) {
            addCriterion("photome_userdetail_usermusicname >", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usermusicname >=", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameLessThan(String value) {
            addCriterion("photome_userdetail_usermusicname <", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usermusicname <=", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameLike(String value) {
            addCriterion("photome_userdetail_usermusicname like", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameNotLike(String value) {
            addCriterion("photome_userdetail_usermusicname not like", value, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameIn(List<String> values) {
            addCriterion("photome_userdetail_usermusicname in", values, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameNotIn(List<String> values) {
            addCriterion("photome_userdetail_usermusicname not in", values, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usermusicname between", value1, value2, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicnameNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usermusicname not between", value1, value2, "photomeUserdetailUsermusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeIsNull() {
            addCriterion("photome_userdetail_usermusiccode is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeIsNotNull() {
            addCriterion("photome_userdetail_usermusiccode is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeEqualTo(String value) {
            addCriterion("photome_userdetail_usermusiccode =", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeNotEqualTo(String value) {
            addCriterion("photome_userdetail_usermusiccode <>", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeGreaterThan(String value) {
            addCriterion("photome_userdetail_usermusiccode >", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usermusiccode >=", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeLessThan(String value) {
            addCriterion("photome_userdetail_usermusiccode <", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usermusiccode <=", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeLike(String value) {
            addCriterion("photome_userdetail_usermusiccode like", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeNotLike(String value) {
            addCriterion("photome_userdetail_usermusiccode not like", value, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeIn(List<String> values) {
            addCriterion("photome_userdetail_usermusiccode in", values, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeNotIn(List<String> values) {
            addCriterion("photome_userdetail_usermusiccode not in", values, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usermusiccode between", value1, value2, "photomeUserdetailUsermusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusiccodeNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usermusiccode not between", value1, value2, "photomeUserdetailUsermusiccode");
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