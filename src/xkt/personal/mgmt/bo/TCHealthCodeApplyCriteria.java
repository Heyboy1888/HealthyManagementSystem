package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCHealthCodeApplyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCHealthCodeApplyCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
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

        public Criteria andCertCodeHideIsNull() {
            addCriterion("cert_code_hide is null");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideIsNotNull() {
            addCriterion("cert_code_hide is not null");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideEqualTo(String value) {
            addCriterion("cert_code_hide =", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideNotEqualTo(String value) {
            addCriterion("cert_code_hide <>", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideGreaterThan(String value) {
            addCriterion("cert_code_hide >", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideGreaterThanOrEqualTo(String value) {
            addCriterion("cert_code_hide >=", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideLessThan(String value) {
            addCriterion("cert_code_hide <", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideLessThanOrEqualTo(String value) {
            addCriterion("cert_code_hide <=", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideLike(String value) {
            addCriterion("cert_code_hide like", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideNotLike(String value) {
            addCriterion("cert_code_hide not like", value, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideIn(List<String> values) {
            addCriterion("cert_code_hide in", values, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideNotIn(List<String> values) {
            addCriterion("cert_code_hide not in", values, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideBetween(String value1, String value2) {
            addCriterion("cert_code_hide between", value1, value2, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeHideNotBetween(String value1, String value2) {
            addCriterion("cert_code_hide not between", value1, value2, "certCodeHide");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretIsNull() {
            addCriterion("cert_code_secret is null");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretIsNotNull() {
            addCriterion("cert_code_secret is not null");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretEqualTo(String value) {
            addCriterion("cert_code_secret =", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretNotEqualTo(String value) {
            addCriterion("cert_code_secret <>", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretGreaterThan(String value) {
            addCriterion("cert_code_secret >", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretGreaterThanOrEqualTo(String value) {
            addCriterion("cert_code_secret >=", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretLessThan(String value) {
            addCriterion("cert_code_secret <", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretLessThanOrEqualTo(String value) {
            addCriterion("cert_code_secret <=", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretLike(String value) {
            addCriterion("cert_code_secret like", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretNotLike(String value) {
            addCriterion("cert_code_secret not like", value, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretIn(List<String> values) {
            addCriterion("cert_code_secret in", values, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretNotIn(List<String> values) {
            addCriterion("cert_code_secret not in", values, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretBetween(String value1, String value2) {
            addCriterion("cert_code_secret between", value1, value2, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andCertCodeSecretNotBetween(String value1, String value2) {
            addCriterion("cert_code_secret not between", value1, value2, "certCodeSecret");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNull() {
            addCriterion("nation_code is null");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNotNull() {
            addCriterion("nation_code is not null");
            return (Criteria) this;
        }

        public Criteria andNationCodeEqualTo(String value) {
            addCriterion("nation_code =", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotEqualTo(String value) {
            addCriterion("nation_code <>", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThan(String value) {
            addCriterion("nation_code >", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nation_code >=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThan(String value) {
            addCriterion("nation_code <", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThanOrEqualTo(String value) {
            addCriterion("nation_code <=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLike(String value) {
            addCriterion("nation_code like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotLike(String value) {
            addCriterion("nation_code not like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeIn(List<String> values) {
            addCriterion("nation_code in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotIn(List<String> values) {
            addCriterion("nation_code not in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeBetween(String value1, String value2) {
            addCriterion("nation_code between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotBetween(String value1, String value2) {
            addCriterion("nation_code not between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("update_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("update_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(String value) {
            addCriterion("update_flag =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(String value) {
            addCriterion("update_flag <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(String value) {
            addCriterion("update_flag >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("update_flag >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(String value) {
            addCriterion("update_flag <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(String value) {
            addCriterion("update_flag <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLike(String value) {
            addCriterion("update_flag like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotLike(String value) {
            addCriterion("update_flag not like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<String> values) {
            addCriterion("update_flag in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<String> values) {
            addCriterion("update_flag not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(String value1, String value2) {
            addCriterion("update_flag between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(String value1, String value2) {
            addCriterion("update_flag not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretIsNull() {
            addCriterion("relation_cert_secret is null");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretIsNotNull() {
            addCriterion("relation_cert_secret is not null");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretEqualTo(String value) {
            addCriterion("relation_cert_secret =", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretNotEqualTo(String value) {
            addCriterion("relation_cert_secret <>", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretGreaterThan(String value) {
            addCriterion("relation_cert_secret >", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretGreaterThanOrEqualTo(String value) {
            addCriterion("relation_cert_secret >=", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretLessThan(String value) {
            addCriterion("relation_cert_secret <", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretLessThanOrEqualTo(String value) {
            addCriterion("relation_cert_secret <=", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretLike(String value) {
            addCriterion("relation_cert_secret like", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretNotLike(String value) {
            addCriterion("relation_cert_secret not like", value, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretIn(List<String> values) {
            addCriterion("relation_cert_secret in", values, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretNotIn(List<String> values) {
            addCriterion("relation_cert_secret not in", values, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretBetween(String value1, String value2) {
            addCriterion("relation_cert_secret between", value1, value2, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andRelationCertSecretNotBetween(String value1, String value2) {
            addCriterion("relation_cert_secret not between", value1, value2, "relationCertSecret");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationIsNull() {
            addCriterion("apply_entrust_relation is null");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationIsNotNull() {
            addCriterion("apply_entrust_relation is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationEqualTo(String value) {
            addCriterion("apply_entrust_relation =", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationNotEqualTo(String value) {
            addCriterion("apply_entrust_relation <>", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationGreaterThan(String value) {
            addCriterion("apply_entrust_relation >", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationGreaterThanOrEqualTo(String value) {
            addCriterion("apply_entrust_relation >=", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationLessThan(String value) {
            addCriterion("apply_entrust_relation <", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationLessThanOrEqualTo(String value) {
            addCriterion("apply_entrust_relation <=", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationLike(String value) {
            addCriterion("apply_entrust_relation like", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationNotLike(String value) {
            addCriterion("apply_entrust_relation not like", value, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationIn(List<String> values) {
            addCriterion("apply_entrust_relation in", values, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationNotIn(List<String> values) {
            addCriterion("apply_entrust_relation not in", values, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationBetween(String value1, String value2) {
            addCriterion("apply_entrust_relation between", value1, value2, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andApplyEntrustRelationNotBetween(String value1, String value2) {
            addCriterion("apply_entrust_relation not between", value1, value2, "applyEntrustRelation");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeIsNull() {
            addCriterion("wx_live_type is null");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeIsNotNull() {
            addCriterion("wx_live_type is not null");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeEqualTo(String value) {
            addCriterion("wx_live_type =", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeNotEqualTo(String value) {
            addCriterion("wx_live_type <>", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeGreaterThan(String value) {
            addCriterion("wx_live_type >", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_live_type >=", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeLessThan(String value) {
            addCriterion("wx_live_type <", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeLessThanOrEqualTo(String value) {
            addCriterion("wx_live_type <=", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeLike(String value) {
            addCriterion("wx_live_type like", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeNotLike(String value) {
            addCriterion("wx_live_type not like", value, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeIn(List<String> values) {
            addCriterion("wx_live_type in", values, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeNotIn(List<String> values) {
            addCriterion("wx_live_type not in", values, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeBetween(String value1, String value2) {
            addCriterion("wx_live_type between", value1, value2, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andWxLiveTypeNotBetween(String value1, String value2) {
            addCriterion("wx_live_type not between", value1, value2, "wxLiveType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeIsNull() {
            addCriterion("is_leave_wx_type is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeIsNotNull() {
            addCriterion("is_leave_wx_type is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeEqualTo(String value) {
            addCriterion("is_leave_wx_type =", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeNotEqualTo(String value) {
            addCriterion("is_leave_wx_type <>", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeGreaterThan(String value) {
            addCriterion("is_leave_wx_type >", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("is_leave_wx_type >=", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeLessThan(String value) {
            addCriterion("is_leave_wx_type <", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeLessThanOrEqualTo(String value) {
            addCriterion("is_leave_wx_type <=", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeLike(String value) {
            addCriterion("is_leave_wx_type like", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeNotLike(String value) {
            addCriterion("is_leave_wx_type not like", value, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeIn(List<String> values) {
            addCriterion("is_leave_wx_type in", values, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeNotIn(List<String> values) {
            addCriterion("is_leave_wx_type not in", values, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeBetween(String value1, String value2) {
            addCriterion("is_leave_wx_type between", value1, value2, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andIsLeaveWxTypeNotBetween(String value1, String value2) {
            addCriterion("is_leave_wx_type not between", value1, value2, "isLeaveWxType");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateIsNull() {
            addCriterion("arrive_wx_date is null");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateIsNotNull() {
            addCriterion("arrive_wx_date is not null");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateEqualTo(Date value) {
            addCriterion("arrive_wx_date =", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotEqualTo(Date value) {
            addCriterion("arrive_wx_date <>", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateGreaterThan(Date value) {
            addCriterion("arrive_wx_date >", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_wx_date >=", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateLessThan(Date value) {
            addCriterion("arrive_wx_date <", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateLessThanOrEqualTo(Date value) {
            addCriterion("arrive_wx_date <=", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateIn(List<Date> values) {
            addCriterion("arrive_wx_date in", values, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotIn(List<Date> values) {
            addCriterion("arrive_wx_date not in", values, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateBetween(Date value1, Date value2) {
            addCriterion("arrive_wx_date between", value1, value2, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotBetween(Date value1, Date value2) {
            addCriterion("arrive_wx_date not between", value1, value2, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andIsFromHbIsNull() {
            addCriterion("is_from_hb is null");
            return (Criteria) this;
        }

        public Criteria andIsFromHbIsNotNull() {
            addCriterion("is_from_hb is not null");
            return (Criteria) this;
        }

        public Criteria andIsFromHbEqualTo(String value) {
            addCriterion("is_from_hb =", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbNotEqualTo(String value) {
            addCriterion("is_from_hb <>", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbGreaterThan(String value) {
            addCriterion("is_from_hb >", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbGreaterThanOrEqualTo(String value) {
            addCriterion("is_from_hb >=", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbLessThan(String value) {
            addCriterion("is_from_hb <", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbLessThanOrEqualTo(String value) {
            addCriterion("is_from_hb <=", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbLike(String value) {
            addCriterion("is_from_hb like", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbNotLike(String value) {
            addCriterion("is_from_hb not like", value, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbIn(List<String> values) {
            addCriterion("is_from_hb in", values, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbNotIn(List<String> values) {
            addCriterion("is_from_hb not in", values, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbBetween(String value1, String value2) {
            addCriterion("is_from_hb between", value1, value2, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andIsFromHbNotBetween(String value1, String value2) {
            addCriterion("is_from_hb not between", value1, value2, "isFromHb");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrIsNull() {
            addCriterion("departure_addr is null");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrIsNotNull() {
            addCriterion("departure_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrEqualTo(String value) {
            addCriterion("departure_addr =", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrNotEqualTo(String value) {
            addCriterion("departure_addr <>", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrGreaterThan(String value) {
            addCriterion("departure_addr >", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrGreaterThanOrEqualTo(String value) {
            addCriterion("departure_addr >=", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrLessThan(String value) {
            addCriterion("departure_addr <", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrLessThanOrEqualTo(String value) {
            addCriterion("departure_addr <=", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrLike(String value) {
            addCriterion("departure_addr like", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrNotLike(String value) {
            addCriterion("departure_addr not like", value, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrIn(List<String> values) {
            addCriterion("departure_addr in", values, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrNotIn(List<String> values) {
            addCriterion("departure_addr not in", values, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrBetween(String value1, String value2) {
            addCriterion("departure_addr between", value1, value2, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrNotBetween(String value1, String value2) {
            addCriterion("departure_addr not between", value1, value2, "departureAddr");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeIsNull() {
            addCriterion("departure_addr_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeIsNotNull() {
            addCriterion("departure_addr_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeEqualTo(String value) {
            addCriterion("departure_addr_code =", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeNotEqualTo(String value) {
            addCriterion("departure_addr_code <>", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeGreaterThan(String value) {
            addCriterion("departure_addr_code >", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("departure_addr_code >=", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeLessThan(String value) {
            addCriterion("departure_addr_code <", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeLessThanOrEqualTo(String value) {
            addCriterion("departure_addr_code <=", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeLike(String value) {
            addCriterion("departure_addr_code like", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeNotLike(String value) {
            addCriterion("departure_addr_code not like", value, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeIn(List<String> values) {
            addCriterion("departure_addr_code in", values, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeNotIn(List<String> values) {
            addCriterion("departure_addr_code not in", values, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeBetween(String value1, String value2) {
            addCriterion("departure_addr_code between", value1, value2, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andDepartureAddrCodeNotBetween(String value1, String value2) {
            addCriterion("departure_addr_code not between", value1, value2, "departureAddrCode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficIsNull() {
            addCriterion("arrive_wx_traffic is null");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficIsNotNull() {
            addCriterion("arrive_wx_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficEqualTo(String value) {
            addCriterion("arrive_wx_traffic =", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficNotEqualTo(String value) {
            addCriterion("arrive_wx_traffic <>", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficGreaterThan(String value) {
            addCriterion("arrive_wx_traffic >", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_wx_traffic >=", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficLessThan(String value) {
            addCriterion("arrive_wx_traffic <", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficLessThanOrEqualTo(String value) {
            addCriterion("arrive_wx_traffic <=", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficLike(String value) {
            addCriterion("arrive_wx_traffic like", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficNotLike(String value) {
            addCriterion("arrive_wx_traffic not like", value, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficIn(List<String> values) {
            addCriterion("arrive_wx_traffic in", values, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficNotIn(List<String> values) {
            addCriterion("arrive_wx_traffic not in", values, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficBetween(String value1, String value2) {
            addCriterion("arrive_wx_traffic between", value1, value2, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficNotBetween(String value1, String value2) {
            addCriterion("arrive_wx_traffic not between", value1, value2, "arriveWxTraffic");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeIsNull() {
            addCriterion("arrive_wx_trafficode is null");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeIsNotNull() {
            addCriterion("arrive_wx_trafficode is not null");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeEqualTo(String value) {
            addCriterion("arrive_wx_trafficode =", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeNotEqualTo(String value) {
            addCriterion("arrive_wx_trafficode <>", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeGreaterThan(String value) {
            addCriterion("arrive_wx_trafficode >", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_wx_trafficode >=", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeLessThan(String value) {
            addCriterion("arrive_wx_trafficode <", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeLessThanOrEqualTo(String value) {
            addCriterion("arrive_wx_trafficode <=", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeLike(String value) {
            addCriterion("arrive_wx_trafficode like", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeNotLike(String value) {
            addCriterion("arrive_wx_trafficode not like", value, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeIn(List<String> values) {
            addCriterion("arrive_wx_trafficode in", values, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeNotIn(List<String> values) {
            addCriterion("arrive_wx_trafficode not in", values, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeBetween(String value1, String value2) {
            addCriterion("arrive_wx_trafficode between", value1, value2, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andArriveWxTrafficodeNotBetween(String value1, String value2) {
            addCriterion("arrive_wx_trafficode not between", value1, value2, "arriveWxTrafficode");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusIsNull() {
            addCriterion("is_two_week_virus is null");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusIsNotNull() {
            addCriterion("is_two_week_virus is not null");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusEqualTo(String value) {
            addCriterion("is_two_week_virus =", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusNotEqualTo(String value) {
            addCriterion("is_two_week_virus <>", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusGreaterThan(String value) {
            addCriterion("is_two_week_virus >", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusGreaterThanOrEqualTo(String value) {
            addCriterion("is_two_week_virus >=", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusLessThan(String value) {
            addCriterion("is_two_week_virus <", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusLessThanOrEqualTo(String value) {
            addCriterion("is_two_week_virus <=", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusLike(String value) {
            addCriterion("is_two_week_virus like", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusNotLike(String value) {
            addCriterion("is_two_week_virus not like", value, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusIn(List<String> values) {
            addCriterion("is_two_week_virus in", values, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusNotIn(List<String> values) {
            addCriterion("is_two_week_virus not in", values, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusBetween(String value1, String value2) {
            addCriterion("is_two_week_virus between", value1, value2, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andIsTwoWeekVirusNotBetween(String value1, String value2) {
            addCriterion("is_two_week_virus not between", value1, value2, "isTwoWeekVirus");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNull() {
            addCriterion("household_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNotNull() {
            addCriterion("household_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeEqualTo(String value) {
            addCriterion("household_code =", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotEqualTo(String value) {
            addCriterion("household_code <>", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThan(String value) {
            addCriterion("household_code >", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_code >=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThan(String value) {
            addCriterion("household_code <", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThanOrEqualTo(String value) {
            addCriterion("household_code <=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLike(String value) {
            addCriterion("household_code like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotLike(String value) {
            addCriterion("household_code not like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIn(List<String> values) {
            addCriterion("household_code in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotIn(List<String> values) {
            addCriterion("household_code not in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeBetween(String value1, String value2) {
            addCriterion("household_code between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotBetween(String value1, String value2) {
            addCriterion("household_code not between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameIsNull() {
            addCriterion("household_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameIsNotNull() {
            addCriterion("household_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameEqualTo(String value) {
            addCriterion("household_name =", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotEqualTo(String value) {
            addCriterion("household_name <>", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameGreaterThan(String value) {
            addCriterion("household_name >", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameGreaterThanOrEqualTo(String value) {
            addCriterion("household_name >=", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameLessThan(String value) {
            addCriterion("household_name <", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameLessThanOrEqualTo(String value) {
            addCriterion("household_name <=", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameLike(String value) {
            addCriterion("household_name like", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotLike(String value) {
            addCriterion("household_name not like", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameIn(List<String> values) {
            addCriterion("household_name in", values, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotIn(List<String> values) {
            addCriterion("household_name not in", values, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameBetween(String value1, String value2) {
            addCriterion("household_name between", value1, value2, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotBetween(String value1, String value2) {
            addCriterion("household_name not between", value1, value2, "householdName");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonIsNull() {
            addCriterion("emergency_person is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonIsNotNull() {
            addCriterion("emergency_person is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonEqualTo(String value) {
            addCriterion("emergency_person =", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonNotEqualTo(String value) {
            addCriterion("emergency_person <>", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonGreaterThan(String value) {
            addCriterion("emergency_person >", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_person >=", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonLessThan(String value) {
            addCriterion("emergency_person <", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonLessThanOrEqualTo(String value) {
            addCriterion("emergency_person <=", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonLike(String value) {
            addCriterion("emergency_person like", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonNotLike(String value) {
            addCriterion("emergency_person not like", value, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonIn(List<String> values) {
            addCriterion("emergency_person in", values, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonNotIn(List<String> values) {
            addCriterion("emergency_person not in", values, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonBetween(String value1, String value2) {
            addCriterion("emergency_person between", value1, value2, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPersonNotBetween(String value1, String value2) {
            addCriterion("emergency_person not between", value1, value2, "emergencyPerson");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIsNull() {
            addCriterion("emergency_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIsNotNull() {
            addCriterion("emergency_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneEqualTo(String value) {
            addCriterion("emergency_phone =", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotEqualTo(String value) {
            addCriterion("emergency_phone <>", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneGreaterThan(String value) {
            addCriterion("emergency_phone >", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_phone >=", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLessThan(String value) {
            addCriterion("emergency_phone <", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLessThanOrEqualTo(String value) {
            addCriterion("emergency_phone <=", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLike(String value) {
            addCriterion("emergency_phone like", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotLike(String value) {
            addCriterion("emergency_phone not like", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIn(List<String> values) {
            addCriterion("emergency_phone in", values, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotIn(List<String> values) {
            addCriterion("emergency_phone not in", values, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneBetween(String value1, String value2) {
            addCriterion("emergency_phone between", value1, value2, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotBetween(String value1, String value2) {
            addCriterion("emergency_phone not between", value1, value2, "emergencyPhone");
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

        public Criteria andCurrentDistrictIsNull() {
            addCriterion("current_district is null");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictIsNotNull() {
            addCriterion("current_district is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictEqualTo(String value) {
            addCriterion("current_district =", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotEqualTo(String value) {
            addCriterion("current_district <>", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictGreaterThan(String value) {
            addCriterion("current_district >", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("current_district >=", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictLessThan(String value) {
            addCriterion("current_district <", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictLessThanOrEqualTo(String value) {
            addCriterion("current_district <=", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictLike(String value) {
            addCriterion("current_district like", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotLike(String value) {
            addCriterion("current_district not like", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictIn(List<String> values) {
            addCriterion("current_district in", values, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotIn(List<String> values) {
            addCriterion("current_district not in", values, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictBetween(String value1, String value2) {
            addCriterion("current_district between", value1, value2, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotBetween(String value1, String value2) {
            addCriterion("current_district not between", value1, value2, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIsNull() {
            addCriterion("street_code is null");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIsNotNull() {
            addCriterion("street_code is not null");
            return (Criteria) this;
        }

        public Criteria andStreetCodeEqualTo(String value) {
            addCriterion("street_code =", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotEqualTo(String value) {
            addCriterion("street_code <>", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeGreaterThan(String value) {
            addCriterion("street_code >", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("street_code >=", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLessThan(String value) {
            addCriterion("street_code <", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLessThanOrEqualTo(String value) {
            addCriterion("street_code <=", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLike(String value) {
            addCriterion("street_code like", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotLike(String value) {
            addCriterion("street_code not like", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIn(List<String> values) {
            addCriterion("street_code in", values, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotIn(List<String> values) {
            addCriterion("street_code not in", values, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeBetween(String value1, String value2) {
            addCriterion("street_code between", value1, value2, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotBetween(String value1, String value2) {
            addCriterion("street_code not between", value1, value2, "streetCode");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetIsNull() {
            addCriterion("current_street is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetIsNotNull() {
            addCriterion("current_street is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetEqualTo(String value) {
            addCriterion("current_street =", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetNotEqualTo(String value) {
            addCriterion("current_street <>", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetGreaterThan(String value) {
            addCriterion("current_street >", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetGreaterThanOrEqualTo(String value) {
            addCriterion("current_street >=", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetLessThan(String value) {
            addCriterion("current_street <", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetLessThanOrEqualTo(String value) {
            addCriterion("current_street <=", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetLike(String value) {
            addCriterion("current_street like", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetNotLike(String value) {
            addCriterion("current_street not like", value, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetIn(List<String> values) {
            addCriterion("current_street in", values, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetNotIn(List<String> values) {
            addCriterion("current_street not in", values, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetBetween(String value1, String value2) {
            addCriterion("current_street between", value1, value2, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCurrentStreetNotBetween(String value1, String value2) {
            addCriterion("current_street not between", value1, value2, "currentStreet");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeIsNull() {
            addCriterion("community_code is null");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeIsNotNull() {
            addCriterion("community_code is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeEqualTo(String value) {
            addCriterion("community_code =", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeNotEqualTo(String value) {
            addCriterion("community_code <>", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeGreaterThan(String value) {
            addCriterion("community_code >", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("community_code >=", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeLessThan(String value) {
            addCriterion("community_code <", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeLessThanOrEqualTo(String value) {
            addCriterion("community_code <=", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeLike(String value) {
            addCriterion("community_code like", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeNotLike(String value) {
            addCriterion("community_code not like", value, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeIn(List<String> values) {
            addCriterion("community_code in", values, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeNotIn(List<String> values) {
            addCriterion("community_code not in", values, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeBetween(String value1, String value2) {
            addCriterion("community_code between", value1, value2, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCommunityCodeNotBetween(String value1, String value2) {
            addCriterion("community_code not between", value1, value2, "communityCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityIsNull() {
            addCriterion("current_community is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityIsNotNull() {
            addCriterion("current_community is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityEqualTo(String value) {
            addCriterion("current_community =", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityNotEqualTo(String value) {
            addCriterion("current_community <>", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityGreaterThan(String value) {
            addCriterion("current_community >", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("current_community >=", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityLessThan(String value) {
            addCriterion("current_community <", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityLessThanOrEqualTo(String value) {
            addCriterion("current_community <=", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityLike(String value) {
            addCriterion("current_community like", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityNotLike(String value) {
            addCriterion("current_community not like", value, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityIn(List<String> values) {
            addCriterion("current_community in", values, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityNotIn(List<String> values) {
            addCriterion("current_community not in", values, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityBetween(String value1, String value2) {
            addCriterion("current_community between", value1, value2, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andCurrentCommunityNotBetween(String value1, String value2) {
            addCriterion("current_community not between", value1, value2, "currentCommunity");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeIsNull() {
            addCriterion("police_station_code is null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeIsNotNull() {
            addCriterion("police_station_code is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeEqualTo(String value) {
            addCriterion("police_station_code =", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeNotEqualTo(String value) {
            addCriterion("police_station_code <>", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeGreaterThan(String value) {
            addCriterion("police_station_code >", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("police_station_code >=", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeLessThan(String value) {
            addCriterion("police_station_code <", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeLessThanOrEqualTo(String value) {
            addCriterion("police_station_code <=", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeLike(String value) {
            addCriterion("police_station_code like", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeNotLike(String value) {
            addCriterion("police_station_code not like", value, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeIn(List<String> values) {
            addCriterion("police_station_code in", values, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeNotIn(List<String> values) {
            addCriterion("police_station_code not in", values, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeBetween(String value1, String value2) {
            addCriterion("police_station_code between", value1, value2, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationCodeNotBetween(String value1, String value2) {
            addCriterion("police_station_code not between", value1, value2, "policeStationCode");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIsNull() {
            addCriterion("police_station is null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIsNotNull() {
            addCriterion("police_station is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationEqualTo(String value) {
            addCriterion("police_station =", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotEqualTo(String value) {
            addCriterion("police_station <>", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationGreaterThan(String value) {
            addCriterion("police_station >", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationGreaterThanOrEqualTo(String value) {
            addCriterion("police_station >=", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLessThan(String value) {
            addCriterion("police_station <", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLessThanOrEqualTo(String value) {
            addCriterion("police_station <=", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLike(String value) {
            addCriterion("police_station like", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotLike(String value) {
            addCriterion("police_station not like", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIn(List<String> values) {
            addCriterion("police_station in", values, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotIn(List<String> values) {
            addCriterion("police_station not in", values, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationBetween(String value1, String value2) {
            addCriterion("police_station between", value1, value2, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotBetween(String value1, String value2) {
            addCriterion("police_station not between", value1, value2, "policeStation");
            return (Criteria) this;
        }

        public Criteria andHousingNameIsNull() {
            addCriterion("housing_name is null");
            return (Criteria) this;
        }

        public Criteria andHousingNameIsNotNull() {
            addCriterion("housing_name is not null");
            return (Criteria) this;
        }

        public Criteria andHousingNameEqualTo(String value) {
            addCriterion("housing_name =", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameNotEqualTo(String value) {
            addCriterion("housing_name <>", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameGreaterThan(String value) {
            addCriterion("housing_name >", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameGreaterThanOrEqualTo(String value) {
            addCriterion("housing_name >=", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameLessThan(String value) {
            addCriterion("housing_name <", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameLessThanOrEqualTo(String value) {
            addCriterion("housing_name <=", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameLike(String value) {
            addCriterion("housing_name like", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameNotLike(String value) {
            addCriterion("housing_name not like", value, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameIn(List<String> values) {
            addCriterion("housing_name in", values, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameNotIn(List<String> values) {
            addCriterion("housing_name not in", values, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameBetween(String value1, String value2) {
            addCriterion("housing_name between", value1, value2, "housingName");
            return (Criteria) this;
        }

        public Criteria andHousingNameNotBetween(String value1, String value2) {
            addCriterion("housing_name not between", value1, value2, "housingName");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeIsNull() {
            addCriterion("allopatry_code is null");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeIsNotNull() {
            addCriterion("allopatry_code is not null");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeEqualTo(String value) {
            addCriterion("allopatry_code =", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeNotEqualTo(String value) {
            addCriterion("allopatry_code <>", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeGreaterThan(String value) {
            addCriterion("allopatry_code >", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("allopatry_code >=", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeLessThan(String value) {
            addCriterion("allopatry_code <", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeLessThanOrEqualTo(String value) {
            addCriterion("allopatry_code <=", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeLike(String value) {
            addCriterion("allopatry_code like", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeNotLike(String value) {
            addCriterion("allopatry_code not like", value, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeIn(List<String> values) {
            addCriterion("allopatry_code in", values, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeNotIn(List<String> values) {
            addCriterion("allopatry_code not in", values, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeBetween(String value1, String value2) {
            addCriterion("allopatry_code between", value1, value2, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryCodeNotBetween(String value1, String value2) {
            addCriterion("allopatry_code not between", value1, value2, "allopatryCode");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameIsNull() {
            addCriterion("allopatry_name is null");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameIsNotNull() {
            addCriterion("allopatry_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameEqualTo(String value) {
            addCriterion("allopatry_name =", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameNotEqualTo(String value) {
            addCriterion("allopatry_name <>", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameGreaterThan(String value) {
            addCriterion("allopatry_name >", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameGreaterThanOrEqualTo(String value) {
            addCriterion("allopatry_name >=", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameLessThan(String value) {
            addCriterion("allopatry_name <", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameLessThanOrEqualTo(String value) {
            addCriterion("allopatry_name <=", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameLike(String value) {
            addCriterion("allopatry_name like", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameNotLike(String value) {
            addCriterion("allopatry_name not like", value, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameIn(List<String> values) {
            addCriterion("allopatry_name in", values, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameNotIn(List<String> values) {
            addCriterion("allopatry_name not in", values, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameBetween(String value1, String value2) {
            addCriterion("allopatry_name between", value1, value2, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andAllopatryNameNotBetween(String value1, String value2) {
            addCriterion("allopatry_name not between", value1, value2, "allopatryName");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("live_address is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("live_address is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("live_address =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("live_address <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("live_address >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("live_address >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("live_address <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("live_address <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("live_address like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("live_address not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("live_address in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("live_address not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("live_address between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("live_address not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLike(String value) {
            addCriterion("is_hot like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotLike(String value) {
            addCriterion("is_hot not like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<String> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<String> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String value1, String value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String value1, String value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIsNull() {
            addCriterion("is_leave is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIsNotNull() {
            addCriterion("is_leave is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveEqualTo(String value) {
            addCriterion("is_leave =", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotEqualTo(String value) {
            addCriterion("is_leave <>", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveGreaterThan(String value) {
            addCriterion("is_leave >", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveGreaterThanOrEqualTo(String value) {
            addCriterion("is_leave >=", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLessThan(String value) {
            addCriterion("is_leave <", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLessThanOrEqualTo(String value) {
            addCriterion("is_leave <=", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLike(String value) {
            addCriterion("is_leave like", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotLike(String value) {
            addCriterion("is_leave not like", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIn(List<String> values) {
            addCriterion("is_leave in", values, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotIn(List<String> values) {
            addCriterion("is_leave not in", values, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveBetween(String value1, String value2) {
            addCriterion("is_leave between", value1, value2, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotBetween(String value1, String value2) {
            addCriterion("is_leave not between", value1, value2, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsStayIsNull() {
            addCriterion("is_stay is null");
            return (Criteria) this;
        }

        public Criteria andIsStayIsNotNull() {
            addCriterion("is_stay is not null");
            return (Criteria) this;
        }

        public Criteria andIsStayEqualTo(String value) {
            addCriterion("is_stay =", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayNotEqualTo(String value) {
            addCriterion("is_stay <>", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayGreaterThan(String value) {
            addCriterion("is_stay >", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayGreaterThanOrEqualTo(String value) {
            addCriterion("is_stay >=", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayLessThan(String value) {
            addCriterion("is_stay <", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayLessThanOrEqualTo(String value) {
            addCriterion("is_stay <=", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayLike(String value) {
            addCriterion("is_stay like", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayNotLike(String value) {
            addCriterion("is_stay not like", value, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayIn(List<String> values) {
            addCriterion("is_stay in", values, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayNotIn(List<String> values) {
            addCriterion("is_stay not in", values, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayBetween(String value1, String value2) {
            addCriterion("is_stay between", value1, value2, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsStayNotBetween(String value1, String value2) {
            addCriterion("is_stay not between", value1, value2, "isStay");
            return (Criteria) this;
        }

        public Criteria andIsHealthyIsNull() {
            addCriterion("is_healthy is null");
            return (Criteria) this;
        }

        public Criteria andIsHealthyIsNotNull() {
            addCriterion("is_healthy is not null");
            return (Criteria) this;
        }

        public Criteria andIsHealthyEqualTo(String value) {
            addCriterion("is_healthy =", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyNotEqualTo(String value) {
            addCriterion("is_healthy <>", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyGreaterThan(String value) {
            addCriterion("is_healthy >", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyGreaterThanOrEqualTo(String value) {
            addCriterion("is_healthy >=", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyLessThan(String value) {
            addCriterion("is_healthy <", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyLessThanOrEqualTo(String value) {
            addCriterion("is_healthy <=", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyLike(String value) {
            addCriterion("is_healthy like", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyNotLike(String value) {
            addCriterion("is_healthy not like", value, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyIn(List<String> values) {
            addCriterion("is_healthy in", values, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyNotIn(List<String> values) {
            addCriterion("is_healthy not in", values, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyBetween(String value1, String value2) {
            addCriterion("is_healthy between", value1, value2, "isHealthy");
            return (Criteria) this;
        }

        public Criteria andIsHealthyNotBetween(String value1, String value2) {
            addCriterion("is_healthy not between", value1, value2, "isHealthy");
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

        public Criteria andCheckCodeIsNull() {
            addCriterion("check_code is null");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIsNotNull() {
            addCriterion("check_code is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCodeEqualTo(String value) {
            addCriterion("check_code =", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotEqualTo(String value) {
            addCriterion("check_code <>", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeGreaterThan(String value) {
            addCriterion("check_code >", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeGreaterThanOrEqualTo(String value) {
            addCriterion("check_code >=", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLessThan(String value) {
            addCriterion("check_code <", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLessThanOrEqualTo(String value) {
            addCriterion("check_code <=", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLike(String value) {
            addCriterion("check_code like", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotLike(String value) {
            addCriterion("check_code not like", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIn(List<String> values) {
            addCriterion("check_code in", values, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotIn(List<String> values) {
            addCriterion("check_code not in", values, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeBetween(String value1, String value2) {
            addCriterion("check_code between", value1, value2, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotBetween(String value1, String value2) {
            addCriterion("check_code not between", value1, value2, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckPersonIsNull() {
            addCriterion("check_person is null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonIsNotNull() {
            addCriterion("check_person is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonEqualTo(String value) {
            addCriterion("check_person =", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotEqualTo(String value) {
            addCriterion("check_person <>", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonGreaterThan(String value) {
            addCriterion("check_person >", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonGreaterThanOrEqualTo(String value) {
            addCriterion("check_person >=", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonLessThan(String value) {
            addCriterion("check_person <", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonLessThanOrEqualTo(String value) {
            addCriterion("check_person <=", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonLike(String value) {
            addCriterion("check_person like", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotLike(String value) {
            addCriterion("check_person not like", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonIn(List<String> values) {
            addCriterion("check_person in", values, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotIn(List<String> values) {
            addCriterion("check_person not in", values, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonBetween(String value1, String value2) {
            addCriterion("check_person between", value1, value2, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotBetween(String value1, String value2) {
            addCriterion("check_person not between", value1, value2, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andPunchDateIsNull() {
            addCriterion("punch_date is null");
            return (Criteria) this;
        }

        public Criteria andPunchDateIsNotNull() {
            addCriterion("punch_date is not null");
            return (Criteria) this;
        }

        public Criteria andPunchDateEqualTo(Date value) {
            addCriterionForJDBCDate("punch_date =", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("punch_date <>", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("punch_date >", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("punch_date >=", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateLessThan(Date value) {
            addCriterionForJDBCDate("punch_date <", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("punch_date <=", value, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateIn(List<Date> values) {
            addCriterionForJDBCDate("punch_date in", values, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("punch_date not in", values, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("punch_date between", value1, value2, "punchDate");
            return (Criteria) this;
        }

        public Criteria andPunchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("punch_date not between", value1, value2, "punchDate");
            return (Criteria) this;
        }

        public Criteria andAttenDaysIsNull() {
            addCriterion("atten_days is null");
            return (Criteria) this;
        }

        public Criteria andAttenDaysIsNotNull() {
            addCriterion("atten_days is not null");
            return (Criteria) this;
        }

        public Criteria andAttenDaysEqualTo(Integer value) {
            addCriterion("atten_days =", value, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysNotEqualTo(Integer value) {
            addCriterion("atten_days <>", value, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysGreaterThan(Integer value) {
            addCriterion("atten_days >", value, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("atten_days >=", value, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysLessThan(Integer value) {
            addCriterion("atten_days <", value, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysLessThanOrEqualTo(Integer value) {
            addCriterion("atten_days <=", value, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysIn(List<Integer> values) {
            addCriterion("atten_days in", values, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysNotIn(List<Integer> values) {
            addCriterion("atten_days not in", values, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysBetween(Integer value1, Integer value2) {
            addCriterion("atten_days between", value1, value2, "attenDays");
            return (Criteria) this;
        }

        public Criteria andAttenDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("atten_days not between", value1, value2, "attenDays");
            return (Criteria) this;
        }

        public Criteria andTipsCodeIsNull() {
            addCriterion("tips_code is null");
            return (Criteria) this;
        }

        public Criteria andTipsCodeIsNotNull() {
            addCriterion("tips_code is not null");
            return (Criteria) this;
        }

        public Criteria andTipsCodeEqualTo(String value) {
            addCriterion("tips_code =", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeNotEqualTo(String value) {
            addCriterion("tips_code <>", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeGreaterThan(String value) {
            addCriterion("tips_code >", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tips_code >=", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeLessThan(String value) {
            addCriterion("tips_code <", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeLessThanOrEqualTo(String value) {
            addCriterion("tips_code <=", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeLike(String value) {
            addCriterion("tips_code like", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeNotLike(String value) {
            addCriterion("tips_code not like", value, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeIn(List<String> values) {
            addCriterion("tips_code in", values, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeNotIn(List<String> values) {
            addCriterion("tips_code not in", values, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeBetween(String value1, String value2) {
            addCriterion("tips_code between", value1, value2, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andTipsCodeNotBetween(String value1, String value2) {
            addCriterion("tips_code not between", value1, value2, "tipsCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeIsNull() {
            addCriterion("alarm_code is null");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeIsNotNull() {
            addCriterion("alarm_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeEqualTo(String value) {
            addCriterion("alarm_code =", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeNotEqualTo(String value) {
            addCriterion("alarm_code <>", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeGreaterThan(String value) {
            addCriterion("alarm_code >", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_code >=", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeLessThan(String value) {
            addCriterion("alarm_code <", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeLessThanOrEqualTo(String value) {
            addCriterion("alarm_code <=", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeLike(String value) {
            addCriterion("alarm_code like", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeNotLike(String value) {
            addCriterion("alarm_code not like", value, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeIn(List<String> values) {
            addCriterion("alarm_code in", values, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeNotIn(List<String> values) {
            addCriterion("alarm_code not in", values, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeBetween(String value1, String value2) {
            addCriterion("alarm_code between", value1, value2, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andAlarmCodeNotBetween(String value1, String value2) {
            addCriterion("alarm_code not between", value1, value2, "alarmCode");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickIsNull() {
            addCriterion("is_respira_sick is null");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickIsNotNull() {
            addCriterion("is_respira_sick is not null");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickEqualTo(String value) {
            addCriterion("is_respira_sick =", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickNotEqualTo(String value) {
            addCriterion("is_respira_sick <>", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickGreaterThan(String value) {
            addCriterion("is_respira_sick >", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickGreaterThanOrEqualTo(String value) {
            addCriterion("is_respira_sick >=", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickLessThan(String value) {
            addCriterion("is_respira_sick <", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickLessThanOrEqualTo(String value) {
            addCriterion("is_respira_sick <=", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickLike(String value) {
            addCriterion("is_respira_sick like", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickNotLike(String value) {
            addCriterion("is_respira_sick not like", value, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickIn(List<String> values) {
            addCriterion("is_respira_sick in", values, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickNotIn(List<String> values) {
            addCriterion("is_respira_sick not in", values, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickBetween(String value1, String value2) {
            addCriterion("is_respira_sick between", value1, value2, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsRespiraSickNotBetween(String value1, String value2) {
            addCriterion("is_respira_sick not between", value1, value2, "isRespiraSick");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightIsNull() {
            addCriterion("is_address_right is null");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightIsNotNull() {
            addCriterion("is_address_right is not null");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightEqualTo(String value) {
            addCriterion("is_address_right =", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightNotEqualTo(String value) {
            addCriterion("is_address_right <>", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightGreaterThan(String value) {
            addCriterion("is_address_right >", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightGreaterThanOrEqualTo(String value) {
            addCriterion("is_address_right >=", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightLessThan(String value) {
            addCriterion("is_address_right <", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightLessThanOrEqualTo(String value) {
            addCriterion("is_address_right <=", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightLike(String value) {
            addCriterion("is_address_right like", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightNotLike(String value) {
            addCriterion("is_address_right not like", value, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightIn(List<String> values) {
            addCriterion("is_address_right in", values, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightNotIn(List<String> values) {
            addCriterion("is_address_right not in", values, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightBetween(String value1, String value2) {
            addCriterion("is_address_right between", value1, value2, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andIsAddressRightNotBetween(String value1, String value2) {
            addCriterion("is_address_right not between", value1, value2, "isAddressRight");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelIsNull() {
            addCriterion("two_week_travel is null");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelIsNotNull() {
            addCriterion("two_week_travel is not null");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelEqualTo(String value) {
            addCriterion("two_week_travel =", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelNotEqualTo(String value) {
            addCriterion("two_week_travel <>", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelGreaterThan(String value) {
            addCriterion("two_week_travel >", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelGreaterThanOrEqualTo(String value) {
            addCriterion("two_week_travel >=", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelLessThan(String value) {
            addCriterion("two_week_travel <", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelLessThanOrEqualTo(String value) {
            addCriterion("two_week_travel <=", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelLike(String value) {
            addCriterion("two_week_travel like", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelNotLike(String value) {
            addCriterion("two_week_travel not like", value, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelIn(List<String> values) {
            addCriterion("two_week_travel in", values, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelNotIn(List<String> values) {
            addCriterion("two_week_travel not in", values, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelBetween(String value1, String value2) {
            addCriterion("two_week_travel between", value1, value2, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andTwoWeekTravelNotBetween(String value1, String value2) {
            addCriterion("two_week_travel not between", value1, value2, "twoWeekTravel");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameIsNull() {
            addCriterion("pass_addr_name is null");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameIsNotNull() {
            addCriterion("pass_addr_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameEqualTo(String value) {
            addCriterion("pass_addr_name =", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameNotEqualTo(String value) {
            addCriterion("pass_addr_name <>", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameGreaterThan(String value) {
            addCriterion("pass_addr_name >", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("pass_addr_name >=", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameLessThan(String value) {
            addCriterion("pass_addr_name <", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameLessThanOrEqualTo(String value) {
            addCriterion("pass_addr_name <=", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameLike(String value) {
            addCriterion("pass_addr_name like", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameNotLike(String value) {
            addCriterion("pass_addr_name not like", value, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameIn(List<String> values) {
            addCriterion("pass_addr_name in", values, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameNotIn(List<String> values) {
            addCriterion("pass_addr_name not in", values, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameBetween(String value1, String value2) {
            addCriterion("pass_addr_name between", value1, value2, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrNameNotBetween(String value1, String value2) {
            addCriterion("pass_addr_name not between", value1, value2, "passAddrName");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeIsNull() {
            addCriterion("pass_addr_code is null");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeIsNotNull() {
            addCriterion("pass_addr_code is not null");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeEqualTo(String value) {
            addCriterion("pass_addr_code =", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeNotEqualTo(String value) {
            addCriterion("pass_addr_code <>", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeGreaterThan(String value) {
            addCriterion("pass_addr_code >", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pass_addr_code >=", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeLessThan(String value) {
            addCriterion("pass_addr_code <", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeLessThanOrEqualTo(String value) {
            addCriterion("pass_addr_code <=", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeLike(String value) {
            addCriterion("pass_addr_code like", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeNotLike(String value) {
            addCriterion("pass_addr_code not like", value, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeIn(List<String> values) {
            addCriterion("pass_addr_code in", values, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeNotIn(List<String> values) {
            addCriterion("pass_addr_code not in", values, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeBetween(String value1, String value2) {
            addCriterion("pass_addr_code between", value1, value2, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andPassAddrCodeNotBetween(String value1, String value2) {
            addCriterion("pass_addr_code not between", value1, value2, "passAddrCode");
            return (Criteria) this;
        }

        public Criteria andTranStatusIsNull() {
            addCriterion("tran_status is null");
            return (Criteria) this;
        }

        public Criteria andTranStatusIsNotNull() {
            addCriterion("tran_status is not null");
            return (Criteria) this;
        }

        public Criteria andTranStatusEqualTo(String value) {
            addCriterion("tran_status =", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotEqualTo(String value) {
            addCriterion("tran_status <>", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusGreaterThan(String value) {
            addCriterion("tran_status >", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tran_status >=", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusLessThan(String value) {
            addCriterion("tran_status <", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusLessThanOrEqualTo(String value) {
            addCriterion("tran_status <=", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusLike(String value) {
            addCriterion("tran_status like", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotLike(String value) {
            addCriterion("tran_status not like", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusIn(List<String> values) {
            addCriterion("tran_status in", values, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotIn(List<String> values) {
            addCriterion("tran_status not in", values, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusBetween(String value1, String value2) {
            addCriterion("tran_status between", value1, value2, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotBetween(String value1, String value2) {
            addCriterion("tran_status not between", value1, value2, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiIsNull() {
            addCriterion("is_return_wuxi is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiIsNotNull() {
            addCriterion("is_return_wuxi is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiEqualTo(String value) {
            addCriterion("is_return_wuxi =", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiNotEqualTo(String value) {
            addCriterion("is_return_wuxi <>", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiGreaterThan(String value) {
            addCriterion("is_return_wuxi >", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiGreaterThanOrEqualTo(String value) {
            addCriterion("is_return_wuxi >=", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiLessThan(String value) {
            addCriterion("is_return_wuxi <", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiLessThanOrEqualTo(String value) {
            addCriterion("is_return_wuxi <=", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiLike(String value) {
            addCriterion("is_return_wuxi like", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiNotLike(String value) {
            addCriterion("is_return_wuxi not like", value, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiIn(List<String> values) {
            addCriterion("is_return_wuxi in", values, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiNotIn(List<String> values) {
            addCriterion("is_return_wuxi not in", values, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiBetween(String value1, String value2) {
            addCriterion("is_return_wuxi between", value1, value2, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andIsReturnWuxiNotBetween(String value1, String value2) {
            addCriterion("is_return_wuxi not between", value1, value2, "isReturnWuxi");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagIsNull() {
            addCriterion("community_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagIsNotNull() {
            addCriterion("community_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagEqualTo(String value) {
            addCriterion("community_flag =", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagNotEqualTo(String value) {
            addCriterion("community_flag <>", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagGreaterThan(String value) {
            addCriterion("community_flag >", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagGreaterThanOrEqualTo(String value) {
            addCriterion("community_flag >=", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagLessThan(String value) {
            addCriterion("community_flag <", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagLessThanOrEqualTo(String value) {
            addCriterion("community_flag <=", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagLike(String value) {
            addCriterion("community_flag like", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagNotLike(String value) {
            addCriterion("community_flag not like", value, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagIn(List<String> values) {
            addCriterion("community_flag in", values, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagNotIn(List<String> values) {
            addCriterion("community_flag not in", values, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagBetween(String value1, String value2) {
            addCriterion("community_flag between", value1, value2, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andCommunityFlagNotBetween(String value1, String value2) {
            addCriterion("community_flag not between", value1, value2, "communityFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagIsNull() {
            addCriterion("person_auth_flag is null");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagIsNotNull() {
            addCriterion("person_auth_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagEqualTo(String value) {
            addCriterion("person_auth_flag =", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagNotEqualTo(String value) {
            addCriterion("person_auth_flag <>", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagGreaterThan(String value) {
            addCriterion("person_auth_flag >", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagGreaterThanOrEqualTo(String value) {
            addCriterion("person_auth_flag >=", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagLessThan(String value) {
            addCriterion("person_auth_flag <", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagLessThanOrEqualTo(String value) {
            addCriterion("person_auth_flag <=", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagLike(String value) {
            addCriterion("person_auth_flag like", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagNotLike(String value) {
            addCriterion("person_auth_flag not like", value, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagIn(List<String> values) {
            addCriterion("person_auth_flag in", values, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagNotIn(List<String> values) {
            addCriterion("person_auth_flag not in", values, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagBetween(String value1, String value2) {
            addCriterion("person_auth_flag between", value1, value2, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthFlagNotBetween(String value1, String value2) {
            addCriterion("person_auth_flag not between", value1, value2, "personAuthFlag");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelIsNull() {
            addCriterion("person_auth_channel is null");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelIsNotNull() {
            addCriterion("person_auth_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelEqualTo(String value) {
            addCriterion("person_auth_channel =", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelNotEqualTo(String value) {
            addCriterion("person_auth_channel <>", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelGreaterThan(String value) {
            addCriterion("person_auth_channel >", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelGreaterThanOrEqualTo(String value) {
            addCriterion("person_auth_channel >=", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelLessThan(String value) {
            addCriterion("person_auth_channel <", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelLessThanOrEqualTo(String value) {
            addCriterion("person_auth_channel <=", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelLike(String value) {
            addCriterion("person_auth_channel like", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelNotLike(String value) {
            addCriterion("person_auth_channel not like", value, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelIn(List<String> values) {
            addCriterion("person_auth_channel in", values, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelNotIn(List<String> values) {
            addCriterion("person_auth_channel not in", values, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelBetween(String value1, String value2) {
            addCriterion("person_auth_channel between", value1, value2, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthChannelNotBetween(String value1, String value2) {
            addCriterion("person_auth_channel not between", value1, value2, "personAuthChannel");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeIsNull() {
            addCriterion("person_auth_time is null");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeIsNotNull() {
            addCriterion("person_auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeEqualTo(Date value) {
            addCriterion("person_auth_time =", value, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeNotEqualTo(Date value) {
            addCriterion("person_auth_time <>", value, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeGreaterThan(Date value) {
            addCriterion("person_auth_time >", value, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("person_auth_time >=", value, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeLessThan(Date value) {
            addCriterion("person_auth_time <", value, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("person_auth_time <=", value, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeIn(List<Date> values) {
            addCriterion("person_auth_time in", values, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeNotIn(List<Date> values) {
            addCriterion("person_auth_time not in", values, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeBetween(Date value1, Date value2) {
            addCriterion("person_auth_time between", value1, value2, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andPersonAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("person_auth_time not between", value1, value2, "personAuthTime");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeIsNull() {
            addCriterion("round_trip_code is null");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeIsNotNull() {
            addCriterion("round_trip_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeEqualTo(String value) {
            addCriterion("round_trip_code =", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeNotEqualTo(String value) {
            addCriterion("round_trip_code <>", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeGreaterThan(String value) {
            addCriterion("round_trip_code >", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeGreaterThanOrEqualTo(String value) {
            addCriterion("round_trip_code >=", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeLessThan(String value) {
            addCriterion("round_trip_code <", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeLessThanOrEqualTo(String value) {
            addCriterion("round_trip_code <=", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeLike(String value) {
            addCriterion("round_trip_code like", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeNotLike(String value) {
            addCriterion("round_trip_code not like", value, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeIn(List<String> values) {
            addCriterion("round_trip_code in", values, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeNotIn(List<String> values) {
            addCriterion("round_trip_code not in", values, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeBetween(String value1, String value2) {
            addCriterion("round_trip_code between", value1, value2, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripCodeNotBetween(String value1, String value2) {
            addCriterion("round_trip_code not between", value1, value2, "roundTripCode");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameIsNull() {
            addCriterion("round_trip_name is null");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameIsNotNull() {
            addCriterion("round_trip_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameEqualTo(String value) {
            addCriterion("round_trip_name =", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameNotEqualTo(String value) {
            addCriterion("round_trip_name <>", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameGreaterThan(String value) {
            addCriterion("round_trip_name >", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameGreaterThanOrEqualTo(String value) {
            addCriterion("round_trip_name >=", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameLessThan(String value) {
            addCriterion("round_trip_name <", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameLessThanOrEqualTo(String value) {
            addCriterion("round_trip_name <=", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameLike(String value) {
            addCriterion("round_trip_name like", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameNotLike(String value) {
            addCriterion("round_trip_name not like", value, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameIn(List<String> values) {
            addCriterion("round_trip_name in", values, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameNotIn(List<String> values) {
            addCriterion("round_trip_name not in", values, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameBetween(String value1, String value2) {
            addCriterion("round_trip_name between", value1, value2, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andRoundTripNameNotBetween(String value1, String value2) {
            addCriterion("round_trip_name not between", value1, value2, "roundTripName");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNull() {
            addCriterion("work_unit is null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNotNull() {
            addCriterion("work_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitEqualTo(String value) {
            addCriterion("work_unit =", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotEqualTo(String value) {
            addCriterion("work_unit <>", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThan(String value) {
            addCriterion("work_unit >", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("work_unit >=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThan(String value) {
            addCriterion("work_unit <", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("work_unit <=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLike(String value) {
            addCriterion("work_unit like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotLike(String value) {
            addCriterion("work_unit not like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIn(List<String> values) {
            addCriterion("work_unit in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotIn(List<String> values) {
            addCriterion("work_unit not in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitBetween(String value1, String value2) {
            addCriterion("work_unit between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotBetween(String value1, String value2) {
            addCriterion("work_unit not between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNull() {
            addCriterion("school_code is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNotNull() {
            addCriterion("school_code is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeEqualTo(String value) {
            addCriterion("school_code =", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotEqualTo(String value) {
            addCriterion("school_code <>", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThan(String value) {
            addCriterion("school_code >", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("school_code >=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThan(String value) {
            addCriterion("school_code <", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThanOrEqualTo(String value) {
            addCriterion("school_code <=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLike(String value) {
            addCriterion("school_code like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotLike(String value) {
            addCriterion("school_code not like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIn(List<String> values) {
            addCriterion("school_code in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotIn(List<String> values) {
            addCriterion("school_code not in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeBetween(String value1, String value2) {
            addCriterion("school_code between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotBetween(String value1, String value2) {
            addCriterion("school_code not between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andResOneIsNull() {
            addCriterion("res_one is null");
            return (Criteria) this;
        }

        public Criteria andResOneIsNotNull() {
            addCriterion("res_one is not null");
            return (Criteria) this;
        }

        public Criteria andResOneEqualTo(String value) {
            addCriterion("res_one =", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotEqualTo(String value) {
            addCriterion("res_one <>", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThan(String value) {
            addCriterion("res_one >", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThanOrEqualTo(String value) {
            addCriterion("res_one >=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThan(String value) {
            addCriterion("res_one <", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThanOrEqualTo(String value) {
            addCriterion("res_one <=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLike(String value) {
            addCriterion("res_one like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotLike(String value) {
            addCriterion("res_one not like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneIn(List<String> values) {
            addCriterion("res_one in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotIn(List<String> values) {
            addCriterion("res_one not in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneBetween(String value1, String value2) {
            addCriterion("res_one between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotBetween(String value1, String value2) {
            addCriterion("res_one not between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNull() {
            addCriterion("res_two is null");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNotNull() {
            addCriterion("res_two is not null");
            return (Criteria) this;
        }

        public Criteria andResTwoEqualTo(String value) {
            addCriterion("res_two =", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotEqualTo(String value) {
            addCriterion("res_two <>", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThan(String value) {
            addCriterion("res_two >", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThanOrEqualTo(String value) {
            addCriterion("res_two >=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThan(String value) {
            addCriterion("res_two <", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThanOrEqualTo(String value) {
            addCriterion("res_two <=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLike(String value) {
            addCriterion("res_two like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotLike(String value) {
            addCriterion("res_two not like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoIn(List<String> values) {
            addCriterion("res_two in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotIn(List<String> values) {
            addCriterion("res_two not in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoBetween(String value1, String value2) {
            addCriterion("res_two between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotBetween(String value1, String value2) {
            addCriterion("res_two not between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResThreeIsNull() {
            addCriterion("res_three is null");
            return (Criteria) this;
        }

        public Criteria andResThreeIsNotNull() {
            addCriterion("res_three is not null");
            return (Criteria) this;
        }

        public Criteria andResThreeEqualTo(String value) {
            addCriterion("res_three =", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotEqualTo(String value) {
            addCriterion("res_three <>", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeGreaterThan(String value) {
            addCriterion("res_three >", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeGreaterThanOrEqualTo(String value) {
            addCriterion("res_three >=", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLessThan(String value) {
            addCriterion("res_three <", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLessThanOrEqualTo(String value) {
            addCriterion("res_three <=", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLike(String value) {
            addCriterion("res_three like", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotLike(String value) {
            addCriterion("res_three not like", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeIn(List<String> values) {
            addCriterion("res_three in", values, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotIn(List<String> values) {
            addCriterion("res_three not in", values, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeBetween(String value1, String value2) {
            addCriterion("res_three between", value1, value2, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotBetween(String value1, String value2) {
            addCriterion("res_three not between", value1, value2, "resThree");
            return (Criteria) this;
        }

        public Criteria andResFourIsNull() {
            addCriterion("res_four is null");
            return (Criteria) this;
        }

        public Criteria andResFourIsNotNull() {
            addCriterion("res_four is not null");
            return (Criteria) this;
        }

        public Criteria andResFourEqualTo(String value) {
            addCriterion("res_four =", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotEqualTo(String value) {
            addCriterion("res_four <>", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourGreaterThan(String value) {
            addCriterion("res_four >", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourGreaterThanOrEqualTo(String value) {
            addCriterion("res_four >=", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourLessThan(String value) {
            addCriterion("res_four <", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourLessThanOrEqualTo(String value) {
            addCriterion("res_four <=", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourLike(String value) {
            addCriterion("res_four like", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotLike(String value) {
            addCriterion("res_four not like", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourIn(List<String> values) {
            addCriterion("res_four in", values, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotIn(List<String> values) {
            addCriterion("res_four not in", values, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourBetween(String value1, String value2) {
            addCriterion("res_four between", value1, value2, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotBetween(String value1, String value2) {
            addCriterion("res_four not between", value1, value2, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFiveIsNull() {
            addCriterion("res_five is null");
            return (Criteria) this;
        }

        public Criteria andResFiveIsNotNull() {
            addCriterion("res_five is not null");
            return (Criteria) this;
        }

        public Criteria andResFiveEqualTo(String value) {
            addCriterion("res_five =", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotEqualTo(String value) {
            addCriterion("res_five <>", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveGreaterThan(String value) {
            addCriterion("res_five >", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveGreaterThanOrEqualTo(String value) {
            addCriterion("res_five >=", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveLessThan(String value) {
            addCriterion("res_five <", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveLessThanOrEqualTo(String value) {
            addCriterion("res_five <=", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveLike(String value) {
            addCriterion("res_five like", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotLike(String value) {
            addCriterion("res_five not like", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveIn(List<String> values) {
            addCriterion("res_five in", values, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotIn(List<String> values) {
            addCriterion("res_five not in", values, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveBetween(String value1, String value2) {
            addCriterion("res_five between", value1, value2, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotBetween(String value1, String value2) {
            addCriterion("res_five not between", value1, value2, "resFive");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesIsNull() {
            addCriterion("paasway_codes is null");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesIsNotNull() {
            addCriterion("paasway_codes is not null");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesEqualTo(String value) {
            addCriterion("paasway_codes =", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesNotEqualTo(String value) {
            addCriterion("paasway_codes <>", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesGreaterThan(String value) {
            addCriterion("paasway_codes >", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesGreaterThanOrEqualTo(String value) {
            addCriterion("paasway_codes >=", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesLessThan(String value) {
            addCriterion("paasway_codes <", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesLessThanOrEqualTo(String value) {
            addCriterion("paasway_codes <=", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesLike(String value) {
            addCriterion("paasway_codes like", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesNotLike(String value) {
            addCriterion("paasway_codes not like", value, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesIn(List<String> values) {
            addCriterion("paasway_codes in", values, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesNotIn(List<String> values) {
            addCriterion("paasway_codes not in", values, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesBetween(String value1, String value2) {
            addCriterion("paasway_codes between", value1, value2, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andPaaswayCodesNotBetween(String value1, String value2) {
            addCriterion("paasway_codes not between", value1, value2, "paaswayCodes");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeIsNull() {
            addCriterion("img_update_time is null");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeIsNotNull() {
            addCriterion("img_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeEqualTo(Date value) {
            addCriterion("img_update_time =", value, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeNotEqualTo(Date value) {
            addCriterion("img_update_time <>", value, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeGreaterThan(Date value) {
            addCriterion("img_update_time >", value, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("img_update_time >=", value, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeLessThan(Date value) {
            addCriterion("img_update_time <", value, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("img_update_time <=", value, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeIn(List<Date> values) {
            addCriterion("img_update_time in", values, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeNotIn(List<Date> values) {
            addCriterion("img_update_time not in", values, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("img_update_time between", value1, value2, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andImgUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("img_update_time not between", value1, value2, "imgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeIsNull() {
            addCriterion("punch_time is null");
            return (Criteria) this;
        }

        public Criteria andPunchTimeIsNotNull() {
            addCriterion("punch_time is not null");
            return (Criteria) this;
        }

        public Criteria andPunchTimeEqualTo(Date value) {
            addCriterion("punch_time =", value, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeNotEqualTo(Date value) {
            addCriterion("punch_time <>", value, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeGreaterThan(Date value) {
            addCriterion("punch_time >", value, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("punch_time >=", value, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeLessThan(Date value) {
            addCriterion("punch_time <", value, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeLessThanOrEqualTo(Date value) {
            addCriterion("punch_time <=", value, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeIn(List<Date> values) {
            addCriterion("punch_time in", values, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeNotIn(List<Date> values) {
            addCriterion("punch_time not in", values, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeBetween(Date value1, Date value2) {
            addCriterion("punch_time between", value1, value2, "punchTime");
            return (Criteria) this;
        }

        public Criteria andPunchTimeNotBetween(Date value1, Date value2) {
            addCriterion("punch_time not between", value1, value2, "punchTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNull() {
            addCriterion("response_time is null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNotNull() {
            addCriterion("response_time is not null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeEqualTo(Date value) {
            addCriterion("response_time =", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotEqualTo(Date value) {
            addCriterion("response_time <>", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThan(Date value) {
            addCriterion("response_time >", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("response_time >=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThan(Date value) {
            addCriterion("response_time <", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThanOrEqualTo(Date value) {
            addCriterion("response_time <=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIn(List<Date> values) {
            addCriterion("response_time in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotIn(List<Date> values) {
            addCriterion("response_time not in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeBetween(Date value1, Date value2) {
            addCriterion("response_time between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotBetween(Date value1, Date value2) {
            addCriterion("response_time not between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeIsNull() {
            addCriterion("flag_fresh_time is null");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeIsNotNull() {
            addCriterion("flag_fresh_time is not null");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeEqualTo(Date value) {
            addCriterion("flag_fresh_time =", value, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeNotEqualTo(Date value) {
            addCriterion("flag_fresh_time <>", value, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeGreaterThan(Date value) {
            addCriterion("flag_fresh_time >", value, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("flag_fresh_time >=", value, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeLessThan(Date value) {
            addCriterion("flag_fresh_time <", value, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeLessThanOrEqualTo(Date value) {
            addCriterion("flag_fresh_time <=", value, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeIn(List<Date> values) {
            addCriterion("flag_fresh_time in", values, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeNotIn(List<Date> values) {
            addCriterion("flag_fresh_time not in", values, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeBetween(Date value1, Date value2) {
            addCriterion("flag_fresh_time between", value1, value2, "flagFreshTime");
            return (Criteria) this;
        }

        public Criteria andFlagFreshTimeNotBetween(Date value1, Date value2) {
            addCriterion("flag_fresh_time not between", value1, value2, "flagFreshTime");
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