package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.List;

public class TmpXkmChinaDistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmpXkmChinaDistrictExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameIsNull() {
            addCriterion("district_full_name is null");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameIsNotNull() {
            addCriterion("district_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameEqualTo(String value) {
            addCriterion("district_full_name =", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameNotEqualTo(String value) {
            addCriterion("district_full_name <>", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameGreaterThan(String value) {
            addCriterion("district_full_name >", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("district_full_name >=", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameLessThan(String value) {
            addCriterion("district_full_name <", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameLessThanOrEqualTo(String value) {
            addCriterion("district_full_name <=", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameLike(String value) {
            addCriterion("district_full_name like", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameNotLike(String value) {
            addCriterion("district_full_name not like", value, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameIn(List<String> values) {
            addCriterion("district_full_name in", values, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameNotIn(List<String> values) {
            addCriterion("district_full_name not in", values, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameBetween(String value1, String value2) {
            addCriterion("district_full_name between", value1, value2, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictFullNameNotBetween(String value1, String value2) {
            addCriterion("district_full_name not between", value1, value2, "districtFullName");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNull() {
            addCriterion("district_code is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("district_code is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(String value) {
            addCriterion("district_code =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(String value) {
            addCriterion("district_code <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(String value) {
            addCriterion("district_code >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("district_code >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(String value) {
            addCriterion("district_code <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("district_code <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLike(String value) {
            addCriterion("district_code like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotLike(String value) {
            addCriterion("district_code not like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<String> values) {
            addCriterion("district_code in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<String> values) {
            addCriterion("district_code not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(String value1, String value2) {
            addCriterion("district_code between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("district_code not between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeIsNull() {
            addCriterion("district_type is null");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeIsNotNull() {
            addCriterion("district_type is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeEqualTo(String value) {
            addCriterion("district_type =", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotEqualTo(String value) {
            addCriterion("district_type <>", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeGreaterThan(String value) {
            addCriterion("district_type >", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("district_type >=", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeLessThan(String value) {
            addCriterion("district_type <", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeLessThanOrEqualTo(String value) {
            addCriterion("district_type <=", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeLike(String value) {
            addCriterion("district_type like", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotLike(String value) {
            addCriterion("district_type not like", value, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeIn(List<String> values) {
            addCriterion("district_type in", values, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotIn(List<String> values) {
            addCriterion("district_type not in", values, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeBetween(String value1, String value2) {
            addCriterion("district_type between", value1, value2, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictTypeNotBetween(String value1, String value2) {
            addCriterion("district_type not between", value1, value2, "districtType");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNull() {
            addCriterion("district_name is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("district_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("district_name =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("district_name <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("district_name >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("district_name >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("district_name <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("district_name <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("district_name like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("district_name not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("district_name in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("district_name not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("district_name between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("district_name not between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeIsNull() {
            addCriterion("p_district_code is null");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeIsNotNull() {
            addCriterion("p_district_code is not null");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeEqualTo(String value) {
            addCriterion("p_district_code =", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeNotEqualTo(String value) {
            addCriterion("p_district_code <>", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeGreaterThan(String value) {
            addCriterion("p_district_code >", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("p_district_code >=", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeLessThan(String value) {
            addCriterion("p_district_code <", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("p_district_code <=", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeLike(String value) {
            addCriterion("p_district_code like", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeNotLike(String value) {
            addCriterion("p_district_code not like", value, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeIn(List<String> values) {
            addCriterion("p_district_code in", values, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeNotIn(List<String> values) {
            addCriterion("p_district_code not in", values, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeBetween(String value1, String value2) {
            addCriterion("p_district_code between", value1, value2, "pDistrictCode");
            return (Criteria) this;
        }

        public Criteria andPDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("p_district_code not between", value1, value2, "pDistrictCode");
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