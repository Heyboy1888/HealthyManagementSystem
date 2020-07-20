package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.List;

public class TCCommuityVerifierRelaCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCCommuityVerifierRelaCriteria() {
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

        public Criteria andRelaIdIsNull() {
            addCriterion("rela_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelaIdIsNotNull() {
            addCriterion("rela_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelaIdEqualTo(String value) {
            addCriterion("rela_ID =", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotEqualTo(String value) {
            addCriterion("rela_ID <>", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdGreaterThan(String value) {
            addCriterion("rela_ID >", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdGreaterThanOrEqualTo(String value) {
            addCriterion("rela_ID >=", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLessThan(String value) {
            addCriterion("rela_ID <", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLessThanOrEqualTo(String value) {
            addCriterion("rela_ID <=", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLike(String value) {
            addCriterion("rela_ID like", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotLike(String value) {
            addCriterion("rela_ID not like", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdIn(List<String> values) {
            addCriterion("rela_ID in", values, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotIn(List<String> values) {
            addCriterion("rela_ID not in", values, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdBetween(String value1, String value2) {
            addCriterion("rela_ID between", value1, value2, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotBetween(String value1, String value2) {
            addCriterion("rela_ID not between", value1, value2, "relaId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdIsNull() {
            addCriterion("COMMUITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommuityIdIsNotNull() {
            addCriterion("COMMUITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommuityIdEqualTo(String value) {
            addCriterion("COMMUITY_ID =", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotEqualTo(String value) {
            addCriterion("COMMUITY_ID <>", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdGreaterThan(String value) {
            addCriterion("COMMUITY_ID >", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUITY_ID >=", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdLessThan(String value) {
            addCriterion("COMMUITY_ID <", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdLessThanOrEqualTo(String value) {
            addCriterion("COMMUITY_ID <=", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdLike(String value) {
            addCriterion("COMMUITY_ID like", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotLike(String value) {
            addCriterion("COMMUITY_ID not like", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdIn(List<String> values) {
            addCriterion("COMMUITY_ID in", values, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotIn(List<String> values) {
            addCriterion("COMMUITY_ID not in", values, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdBetween(String value1, String value2) {
            addCriterion("COMMUITY_ID between", value1, value2, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotBetween(String value1, String value2) {
            addCriterion("COMMUITY_ID not between", value1, value2, "commuityId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdIsNull() {
            addCriterion("VERIFIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIdIsNotNull() {
            addCriterion("VERIFIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierIdEqualTo(String value) {
            addCriterion("VERIFIER_ID =", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdNotEqualTo(String value) {
            addCriterion("VERIFIER_ID <>", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdGreaterThan(String value) {
            addCriterion("VERIFIER_ID >", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFIER_ID >=", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdLessThan(String value) {
            addCriterion("VERIFIER_ID <", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdLessThanOrEqualTo(String value) {
            addCriterion("VERIFIER_ID <=", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdLike(String value) {
            addCriterion("VERIFIER_ID like", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdNotLike(String value) {
            addCriterion("VERIFIER_ID not like", value, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdIn(List<String> values) {
            addCriterion("VERIFIER_ID in", values, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdNotIn(List<String> values) {
            addCriterion("VERIFIER_ID not in", values, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdBetween(String value1, String value2) {
            addCriterion("VERIFIER_ID between", value1, value2, "verifierId");
            return (Criteria) this;
        }

        public Criteria andVerifierIdNotBetween(String value1, String value2) {
            addCriterion("VERIFIER_ID not between", value1, value2, "verifierId");
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