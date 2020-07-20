package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCHealthCodeModifyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCHealthCodeModifyRecordExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andCertCodeIsNull() {
            addCriterion("cert_code is null");
            return (Criteria) this;
        }

        public Criteria andCertCodeIsNotNull() {
            addCriterion("cert_code is not null");
            return (Criteria) this;
        }

        public Criteria andCertCodeEqualTo(String value) {
            addCriterion("cert_code =", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeNotEqualTo(String value) {
            addCriterion("cert_code <>", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeGreaterThan(String value) {
            addCriterion("cert_code >", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_code >=", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeLessThan(String value) {
            addCriterion("cert_code <", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeLessThanOrEqualTo(String value) {
            addCriterion("cert_code <=", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeLike(String value) {
            addCriterion("cert_code like", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeNotLike(String value) {
            addCriterion("cert_code not like", value, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeIn(List<String> values) {
            addCriterion("cert_code in", values, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeNotIn(List<String> values) {
            addCriterion("cert_code not in", values, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeBetween(String value1, String value2) {
            addCriterion("cert_code between", value1, value2, "certCode");
            return (Criteria) this;
        }

        public Criteria andCertCodeNotBetween(String value1, String value2) {
            addCriterion("cert_code not between", value1, value2, "certCode");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeIsNull() {
            addCriterion("is_healthy_before is null");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeIsNotNull() {
            addCriterion("is_healthy_before is not null");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeEqualTo(String value) {
            addCriterion("is_healthy_before =", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeNotEqualTo(String value) {
            addCriterion("is_healthy_before <>", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeGreaterThan(String value) {
            addCriterion("is_healthy_before >", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("is_healthy_before >=", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeLessThan(String value) {
            addCriterion("is_healthy_before <", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeLessThanOrEqualTo(String value) {
            addCriterion("is_healthy_before <=", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeLike(String value) {
            addCriterion("is_healthy_before like", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeNotLike(String value) {
            addCriterion("is_healthy_before not like", value, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeIn(List<String> values) {
            addCriterion("is_healthy_before in", values, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeNotIn(List<String> values) {
            addCriterion("is_healthy_before not in", values, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeBetween(String value1, String value2) {
            addCriterion("is_healthy_before between", value1, value2, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBeforeNotBetween(String value1, String value2) {
            addCriterion("is_healthy_before not between", value1, value2, "isHealthyBefore");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterIsNull() {
            addCriterion("is_healthy_after is null");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterIsNotNull() {
            addCriterion("is_healthy_after is not null");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterEqualTo(String value) {
            addCriterion("is_healthy_after =", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterNotEqualTo(String value) {
            addCriterion("is_healthy_after <>", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterGreaterThan(String value) {
            addCriterion("is_healthy_after >", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterGreaterThanOrEqualTo(String value) {
            addCriterion("is_healthy_after >=", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterLessThan(String value) {
            addCriterion("is_healthy_after <", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterLessThanOrEqualTo(String value) {
            addCriterion("is_healthy_after <=", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterLike(String value) {
            addCriterion("is_healthy_after like", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterNotLike(String value) {
            addCriterion("is_healthy_after not like", value, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterIn(List<String> values) {
            addCriterion("is_healthy_after in", values, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterNotIn(List<String> values) {
            addCriterion("is_healthy_after not in", values, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterBetween(String value1, String value2) {
            addCriterion("is_healthy_after between", value1, value2, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsHealthyAfterNotBetween(String value1, String value2) {
            addCriterion("is_healthy_after not between", value1, value2, "isHealthyAfter");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysIsNull() {
            addCriterion("isolation_days is null");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysIsNotNull() {
            addCriterion("isolation_days is not null");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysEqualTo(Integer value) {
            addCriterion("isolation_days =", value, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysNotEqualTo(Integer value) {
            addCriterion("isolation_days <>", value, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysGreaterThan(Integer value) {
            addCriterion("isolation_days >", value, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("isolation_days >=", value, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysLessThan(Integer value) {
            addCriterion("isolation_days <", value, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysLessThanOrEqualTo(Integer value) {
            addCriterion("isolation_days <=", value, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysIn(List<Integer> values) {
            addCriterion("isolation_days in", values, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysNotIn(List<Integer> values) {
            addCriterion("isolation_days not in", values, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysBetween(Integer value1, Integer value2) {
            addCriterion("isolation_days between", value1, value2, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("isolation_days not between", value1, value2, "isolationDays");
            return (Criteria) this;
        }

        public Criteria andIsolationDateIsNull() {
            addCriterion("isolation_date is null");
            return (Criteria) this;
        }

        public Criteria andIsolationDateIsNotNull() {
            addCriterion("isolation_date is not null");
            return (Criteria) this;
        }

        public Criteria andIsolationDateEqualTo(Date value) {
            addCriterion("isolation_date =", value, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateNotEqualTo(Date value) {
            addCriterion("isolation_date <>", value, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateGreaterThan(Date value) {
            addCriterion("isolation_date >", value, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("isolation_date >=", value, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateLessThan(Date value) {
            addCriterion("isolation_date <", value, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateLessThanOrEqualTo(Date value) {
            addCriterion("isolation_date <=", value, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateIn(List<Date> values) {
            addCriterion("isolation_date in", values, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateNotIn(List<Date> values) {
            addCriterion("isolation_date not in", values, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateBetween(Date value1, Date value2) {
            addCriterion("isolation_date between", value1, value2, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andIsolationDateNotBetween(Date value1, Date value2) {
            addCriterion("isolation_date not between", value1, value2, "isolationDate");
            return (Criteria) this;
        }

        public Criteria andModifyCodeIsNull() {
            addCriterion("modify_code is null");
            return (Criteria) this;
        }

        public Criteria andModifyCodeIsNotNull() {
            addCriterion("modify_code is not null");
            return (Criteria) this;
        }

        public Criteria andModifyCodeEqualTo(String value) {
            addCriterion("modify_code =", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeNotEqualTo(String value) {
            addCriterion("modify_code <>", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeGreaterThan(String value) {
            addCriterion("modify_code >", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_code >=", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeLessThan(String value) {
            addCriterion("modify_code <", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeLessThanOrEqualTo(String value) {
            addCriterion("modify_code <=", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeLike(String value) {
            addCriterion("modify_code like", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeNotLike(String value) {
            addCriterion("modify_code not like", value, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeIn(List<String> values) {
            addCriterion("modify_code in", values, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeNotIn(List<String> values) {
            addCriterion("modify_code not in", values, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeBetween(String value1, String value2) {
            addCriterion("modify_code between", value1, value2, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyCodeNotBetween(String value1, String value2) {
            addCriterion("modify_code not between", value1, value2, "modifyCode");
            return (Criteria) this;
        }

        public Criteria andModifyReasonIsNull() {
            addCriterion("modify_reason is null");
            return (Criteria) this;
        }

        public Criteria andModifyReasonIsNotNull() {
            addCriterion("modify_reason is not null");
            return (Criteria) this;
        }

        public Criteria andModifyReasonEqualTo(String value) {
            addCriterion("modify_reason =", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonNotEqualTo(String value) {
            addCriterion("modify_reason <>", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonGreaterThan(String value) {
            addCriterion("modify_reason >", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("modify_reason >=", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonLessThan(String value) {
            addCriterion("modify_reason <", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonLessThanOrEqualTo(String value) {
            addCriterion("modify_reason <=", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonLike(String value) {
            addCriterion("modify_reason like", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonNotLike(String value) {
            addCriterion("modify_reason not like", value, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonIn(List<String> values) {
            addCriterion("modify_reason in", values, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonNotIn(List<String> values) {
            addCriterion("modify_reason not in", values, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonBetween(String value1, String value2) {
            addCriterion("modify_reason between", value1, value2, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyReasonNotBetween(String value1, String value2) {
            addCriterion("modify_reason not between", value1, value2, "modifyReason");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIsNull() {
            addCriterion("modify_person is null");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIsNotNull() {
            addCriterion("modify_person is not null");
            return (Criteria) this;
        }

        public Criteria andModifyPersonEqualTo(String value) {
            addCriterion("modify_person =", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonNotEqualTo(String value) {
            addCriterion("modify_person <>", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonGreaterThan(String value) {
            addCriterion("modify_person >", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("modify_person >=", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonLessThan(String value) {
            addCriterion("modify_person <", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonLessThanOrEqualTo(String value) {
            addCriterion("modify_person <=", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonLike(String value) {
            addCriterion("modify_person like", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonNotLike(String value) {
            addCriterion("modify_person not like", value, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonIn(List<String> values) {
            addCriterion("modify_person in", values, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonNotIn(List<String> values) {
            addCriterion("modify_person not in", values, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonBetween(String value1, String value2) {
            addCriterion("modify_person between", value1, value2, "modifyPerson");
            return (Criteria) this;
        }

        public Criteria andModifyPersonNotBetween(String value1, String value2) {
            addCriterion("modify_person not between", value1, value2, "modifyPerson");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
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