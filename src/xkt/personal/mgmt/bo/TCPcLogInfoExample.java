package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCPcLogInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCPcLogInfoExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeIsNull() {
            addCriterion("CHECKED_CARD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeIsNotNull() {
            addCriterion("CHECKED_CARD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeEqualTo(String value) {
            addCriterion("CHECKED_CARD_CODE =", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeNotEqualTo(String value) {
            addCriterion("CHECKED_CARD_CODE <>", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeGreaterThan(String value) {
            addCriterion("CHECKED_CARD_CODE >", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_CARD_CODE >=", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeLessThan(String value) {
            addCriterion("CHECKED_CARD_CODE <", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_CARD_CODE <=", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeLike(String value) {
            addCriterion("CHECKED_CARD_CODE like", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeNotLike(String value) {
            addCriterion("CHECKED_CARD_CODE not like", value, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeIn(List<String> values) {
            addCriterion("CHECKED_CARD_CODE in", values, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeNotIn(List<String> values) {
            addCriterion("CHECKED_CARD_CODE not in", values, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeBetween(String value1, String value2) {
            addCriterion("CHECKED_CARD_CODE between", value1, value2, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCardCodeNotBetween(String value1, String value2) {
            addCriterion("CHECKED_CARD_CODE not between", value1, value2, "checkedCardCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLoginNoIsNull() {
            addCriterion("LOGIN_NO is null");
            return (Criteria) this;
        }

        public Criteria andLoginNoIsNotNull() {
            addCriterion("LOGIN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNoEqualTo(String value) {
            addCriterion("LOGIN_NO =", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotEqualTo(String value) {
            addCriterion("LOGIN_NO <>", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoGreaterThan(String value) {
            addCriterion("LOGIN_NO >", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NO >=", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLessThan(String value) {
            addCriterion("LOGIN_NO <", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NO <=", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLike(String value) {
            addCriterion("LOGIN_NO like", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotLike(String value) {
            addCriterion("LOGIN_NO not like", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoIn(List<String> values) {
            addCriterion("LOGIN_NO in", values, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotIn(List<String> values) {
            addCriterion("LOGIN_NO not in", values, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoBetween(String value1, String value2) {
            addCriterion("LOGIN_NO between", value1, value2, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NO not between", value1, value2, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNull() {
            addCriterion("USER_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNotNull() {
            addCriterion("USER_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgentEqualTo(String value) {
            addCriterion("USER_AGENT =", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotEqualTo(String value) {
            addCriterion("USER_AGENT <>", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThan(String value) {
            addCriterion("USER_AGENT >", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThanOrEqualTo(String value) {
            addCriterion("USER_AGENT >=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThan(String value) {
            addCriterion("USER_AGENT <", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThanOrEqualTo(String value) {
            addCriterion("USER_AGENT <=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLike(String value) {
            addCriterion("USER_AGENT like", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotLike(String value) {
            addCriterion("USER_AGENT not like", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentIn(List<String> values) {
            addCriterion("USER_AGENT in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotIn(List<String> values) {
            addCriterion("USER_AGENT not in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentBetween(String value1, String value2) {
            addCriterion("USER_AGENT between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotBetween(String value1, String value2) {
            addCriterion("USER_AGENT not between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeIsNull() {
            addCriterion("MOUDLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeIsNotNull() {
            addCriterion("MOUDLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeEqualTo(String value) {
            addCriterion("MOUDLE_TYPE =", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeNotEqualTo(String value) {
            addCriterion("MOUDLE_TYPE <>", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeGreaterThan(String value) {
            addCriterion("MOUDLE_TYPE >", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MOUDLE_TYPE >=", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeLessThan(String value) {
            addCriterion("MOUDLE_TYPE <", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeLessThanOrEqualTo(String value) {
            addCriterion("MOUDLE_TYPE <=", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeLike(String value) {
            addCriterion("MOUDLE_TYPE like", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeNotLike(String value) {
            addCriterion("MOUDLE_TYPE not like", value, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeIn(List<String> values) {
            addCriterion("MOUDLE_TYPE in", values, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeNotIn(List<String> values) {
            addCriterion("MOUDLE_TYPE not in", values, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeBetween(String value1, String value2) {
            addCriterion("MOUDLE_TYPE between", value1, value2, "moudleType");
            return (Criteria) this;
        }

        public Criteria andMoudleTypeNotBetween(String value1, String value2) {
            addCriterion("MOUDLE_TYPE not between", value1, value2, "moudleType");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNull() {
            addCriterion("REQUEST_URL is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("REQUEST_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("REQUEST_URL =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("REQUEST_URL <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("REQUEST_URL >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_URL >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("REQUEST_URL <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_URL <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("REQUEST_URL like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("REQUEST_URL not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("REQUEST_URL in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("REQUEST_URL not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("REQUEST_URL between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("REQUEST_URL not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrIsNull() {
            addCriterion("REMOTE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrIsNotNull() {
            addCriterion("REMOTE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrEqualTo(String value) {
            addCriterion("REMOTE_ADDR =", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotEqualTo(String value) {
            addCriterion("REMOTE_ADDR <>", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrGreaterThan(String value) {
            addCriterion("REMOTE_ADDR >", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_ADDR >=", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrLessThan(String value) {
            addCriterion("REMOTE_ADDR <", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_ADDR <=", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrLike(String value) {
            addCriterion("REMOTE_ADDR like", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotLike(String value) {
            addCriterion("REMOTE_ADDR not like", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrIn(List<String> values) {
            addCriterion("REMOTE_ADDR in", values, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotIn(List<String> values) {
            addCriterion("REMOTE_ADDR not in", values, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrBetween(String value1, String value2) {
            addCriterion("REMOTE_ADDR between", value1, value2, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotBetween(String value1, String value2) {
            addCriterion("REMOTE_ADDR not between", value1, value2, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRequestArgsIsNull() {
            addCriterion("REQUEST_ARGS is null");
            return (Criteria) this;
        }

        public Criteria andRequestArgsIsNotNull() {
            addCriterion("REQUEST_ARGS is not null");
            return (Criteria) this;
        }

        public Criteria andRequestArgsEqualTo(String value) {
            addCriterion("REQUEST_ARGS =", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotEqualTo(String value) {
            addCriterion("REQUEST_ARGS <>", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsGreaterThan(String value) {
            addCriterion("REQUEST_ARGS >", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_ARGS >=", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsLessThan(String value) {
            addCriterion("REQUEST_ARGS <", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_ARGS <=", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsLike(String value) {
            addCriterion("REQUEST_ARGS like", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotLike(String value) {
            addCriterion("REQUEST_ARGS not like", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsIn(List<String> values) {
            addCriterion("REQUEST_ARGS in", values, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotIn(List<String> values) {
            addCriterion("REQUEST_ARGS not in", values, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsBetween(String value1, String value2) {
            addCriterion("REQUEST_ARGS between", value1, value2, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotBetween(String value1, String value2) {
            addCriterion("REQUEST_ARGS not between", value1, value2, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIsNull() {
            addCriterion("REQUEST_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIsNotNull() {
            addCriterion("REQUEST_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodEqualTo(String value) {
            addCriterion("REQUEST_METHOD =", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotEqualTo(String value) {
            addCriterion("REQUEST_METHOD <>", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodGreaterThan(String value) {
            addCriterion("REQUEST_METHOD >", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_METHOD >=", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLessThan(String value) {
            addCriterion("REQUEST_METHOD <", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_METHOD <=", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLike(String value) {
            addCriterion("REQUEST_METHOD like", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotLike(String value) {
            addCriterion("REQUEST_METHOD not like", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIn(List<String> values) {
            addCriterion("REQUEST_METHOD in", values, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotIn(List<String> values) {
            addCriterion("REQUEST_METHOD not in", values, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodBetween(String value1, String value2) {
            addCriterion("REQUEST_METHOD between", value1, value2, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotBetween(String value1, String value2) {
            addCriterion("REQUEST_METHOD not between", value1, value2, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPreAttr1IsNull() {
            addCriterion("PRE_ATTR1 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr1IsNotNull() {
            addCriterion("PRE_ATTR1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr1EqualTo(String value) {
            addCriterion("PRE_ATTR1 =", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotEqualTo(String value) {
            addCriterion("PRE_ATTR1 <>", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1GreaterThan(String value) {
            addCriterion("PRE_ATTR1 >", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1GreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR1 >=", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1LessThan(String value) {
            addCriterion("PRE_ATTR1 <", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1LessThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR1 <=", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1Like(String value) {
            addCriterion("PRE_ATTR1 like", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotLike(String value) {
            addCriterion("PRE_ATTR1 not like", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1In(List<String> values) {
            addCriterion("PRE_ATTR1 in", values, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotIn(List<String> values) {
            addCriterion("PRE_ATTR1 not in", values, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1Between(String value1, String value2) {
            addCriterion("PRE_ATTR1 between", value1, value2, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotBetween(String value1, String value2) {
            addCriterion("PRE_ATTR1 not between", value1, value2, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr2IsNull() {
            addCriterion("PRE_ATTR2 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr2IsNotNull() {
            addCriterion("PRE_ATTR2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr2EqualTo(String value) {
            addCriterion("PRE_ATTR2 =", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotEqualTo(String value) {
            addCriterion("PRE_ATTR2 <>", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2GreaterThan(String value) {
            addCriterion("PRE_ATTR2 >", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2GreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR2 >=", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2LessThan(String value) {
            addCriterion("PRE_ATTR2 <", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2LessThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR2 <=", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2Like(String value) {
            addCriterion("PRE_ATTR2 like", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotLike(String value) {
            addCriterion("PRE_ATTR2 not like", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2In(List<String> values) {
            addCriterion("PRE_ATTR2 in", values, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotIn(List<String> values) {
            addCriterion("PRE_ATTR2 not in", values, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2Between(String value1, String value2) {
            addCriterion("PRE_ATTR2 between", value1, value2, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotBetween(String value1, String value2) {
            addCriterion("PRE_ATTR2 not between", value1, value2, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr3IsNull() {
            addCriterion("PRE_ATTR3 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr3IsNotNull() {
            addCriterion("PRE_ATTR3 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr3EqualTo(String value) {
            addCriterion("PRE_ATTR3 =", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotEqualTo(String value) {
            addCriterion("PRE_ATTR3 <>", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3GreaterThan(String value) {
            addCriterion("PRE_ATTR3 >", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3GreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR3 >=", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3LessThan(String value) {
            addCriterion("PRE_ATTR3 <", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3LessThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR3 <=", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3Like(String value) {
            addCriterion("PRE_ATTR3 like", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotLike(String value) {
            addCriterion("PRE_ATTR3 not like", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3In(List<String> values) {
            addCriterion("PRE_ATTR3 in", values, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotIn(List<String> values) {
            addCriterion("PRE_ATTR3 not in", values, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3Between(String value1, String value2) {
            addCriterion("PRE_ATTR3 between", value1, value2, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotBetween(String value1, String value2) {
            addCriterion("PRE_ATTR3 not between", value1, value2, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr4IsNull() {
            addCriterion("PRE_ATTR4 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr4IsNotNull() {
            addCriterion("PRE_ATTR4 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr4EqualTo(String value) {
            addCriterion("PRE_ATTR4 =", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotEqualTo(String value) {
            addCriterion("PRE_ATTR4 <>", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4GreaterThan(String value) {
            addCriterion("PRE_ATTR4 >", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4GreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR4 >=", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4LessThan(String value) {
            addCriterion("PRE_ATTR4 <", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4LessThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR4 <=", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4Like(String value) {
            addCriterion("PRE_ATTR4 like", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotLike(String value) {
            addCriterion("PRE_ATTR4 not like", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4In(List<String> values) {
            addCriterion("PRE_ATTR4 in", values, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotIn(List<String> values) {
            addCriterion("PRE_ATTR4 not in", values, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4Between(String value1, String value2) {
            addCriterion("PRE_ATTR4 between", value1, value2, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotBetween(String value1, String value2) {
            addCriterion("PRE_ATTR4 not between", value1, value2, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr5IsNull() {
            addCriterion("PRE_ATTR5 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr5IsNotNull() {
            addCriterion("PRE_ATTR5 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr5EqualTo(String value) {
            addCriterion("PRE_ATTR5 =", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotEqualTo(String value) {
            addCriterion("PRE_ATTR5 <>", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5GreaterThan(String value) {
            addCriterion("PRE_ATTR5 >", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5GreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR5 >=", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5LessThan(String value) {
            addCriterion("PRE_ATTR5 <", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5LessThanOrEqualTo(String value) {
            addCriterion("PRE_ATTR5 <=", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5Like(String value) {
            addCriterion("PRE_ATTR5 like", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotLike(String value) {
            addCriterion("PRE_ATTR5 not like", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5In(List<String> values) {
            addCriterion("PRE_ATTR5 in", values, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotIn(List<String> values) {
            addCriterion("PRE_ATTR5 not in", values, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5Between(String value1, String value2) {
            addCriterion("PRE_ATTR5 between", value1, value2, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotBetween(String value1, String value2) {
            addCriterion("PRE_ATTR5 not between", value1, value2, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
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