package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCHealthUserStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCHealthUserStatisticsExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRegisterNowIsNull() {
            addCriterion("register_now is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNowIsNotNull() {
            addCriterion("register_now is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNowEqualTo(String value) {
            addCriterion("register_now =", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowNotEqualTo(String value) {
            addCriterion("register_now <>", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowGreaterThan(String value) {
            addCriterion("register_now >", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowGreaterThanOrEqualTo(String value) {
            addCriterion("register_now >=", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowLessThan(String value) {
            addCriterion("register_now <", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowLessThanOrEqualTo(String value) {
            addCriterion("register_now <=", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowLike(String value) {
            addCriterion("register_now like", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowNotLike(String value) {
            addCriterion("register_now not like", value, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowIn(List<String> values) {
            addCriterion("register_now in", values, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowNotIn(List<String> values) {
            addCriterion("register_now not in", values, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowBetween(String value1, String value2) {
            addCriterion("register_now between", value1, value2, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterNowNotBetween(String value1, String value2) {
            addCriterion("register_now not between", value1, value2, "registerNow");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayIsNull() {
            addCriterion("register_today is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayIsNotNull() {
            addCriterion("register_today is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayEqualTo(String value) {
            addCriterion("register_today =", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayNotEqualTo(String value) {
            addCriterion("register_today <>", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayGreaterThan(String value) {
            addCriterion("register_today >", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayGreaterThanOrEqualTo(String value) {
            addCriterion("register_today >=", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayLessThan(String value) {
            addCriterion("register_today <", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayLessThanOrEqualTo(String value) {
            addCriterion("register_today <=", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayLike(String value) {
            addCriterion("register_today like", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayNotLike(String value) {
            addCriterion("register_today not like", value, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayIn(List<String> values) {
            addCriterion("register_today in", values, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayNotIn(List<String> values) {
            addCriterion("register_today not in", values, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayBetween(String value1, String value2) {
            addCriterion("register_today between", value1, value2, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterTodayNotBetween(String value1, String value2) {
            addCriterion("register_today not between", value1, value2, "registerToday");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeIsNull() {
            addCriterion("register_non_native is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeIsNotNull() {
            addCriterion("register_non_native is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeEqualTo(String value) {
            addCriterion("register_non_native =", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeNotEqualTo(String value) {
            addCriterion("register_non_native <>", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeGreaterThan(String value) {
            addCriterion("register_non_native >", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeGreaterThanOrEqualTo(String value) {
            addCriterion("register_non_native >=", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeLessThan(String value) {
            addCriterion("register_non_native <", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeLessThanOrEqualTo(String value) {
            addCriterion("register_non_native <=", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeLike(String value) {
            addCriterion("register_non_native like", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeNotLike(String value) {
            addCriterion("register_non_native not like", value, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeIn(List<String> values) {
            addCriterion("register_non_native in", values, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeNotIn(List<String> values) {
            addCriterion("register_non_native not in", values, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeBetween(String value1, String value2) {
            addCriterion("register_non_native between", value1, value2, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRegisterNonNativeNotBetween(String value1, String value2) {
            addCriterion("register_non_native not between", value1, value2, "registerNonNative");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayIsNull() {
            addCriterion("red_code_yesterday is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayIsNotNull() {
            addCriterion("red_code_yesterday is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayEqualTo(String value) {
            addCriterion("red_code_yesterday =", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayNotEqualTo(String value) {
            addCriterion("red_code_yesterday <>", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayGreaterThan(String value) {
            addCriterion("red_code_yesterday >", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_yesterday >=", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayLessThan(String value) {
            addCriterion("red_code_yesterday <", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayLessThanOrEqualTo(String value) {
            addCriterion("red_code_yesterday <=", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayLike(String value) {
            addCriterion("red_code_yesterday like", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayNotLike(String value) {
            addCriterion("red_code_yesterday not like", value, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayIn(List<String> values) {
            addCriterion("red_code_yesterday in", values, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayNotIn(List<String> values) {
            addCriterion("red_code_yesterday not in", values, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayBetween(String value1, String value2) {
            addCriterion("red_code_yesterday between", value1, value2, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeYesterdayNotBetween(String value1, String value2) {
            addCriterion("red_code_yesterday not between", value1, value2, "redCodeYesterday");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsIsNull() {
            addCriterion("red_code_modeadds is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsIsNotNull() {
            addCriterion("red_code_modeadds is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsEqualTo(String value) {
            addCriterion("red_code_modeadds =", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsNotEqualTo(String value) {
            addCriterion("red_code_modeadds <>", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsGreaterThan(String value) {
            addCriterion("red_code_modeadds >", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_modeadds >=", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsLessThan(String value) {
            addCriterion("red_code_modeadds <", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsLessThanOrEqualTo(String value) {
            addCriterion("red_code_modeadds <=", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsLike(String value) {
            addCriterion("red_code_modeadds like", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsNotLike(String value) {
            addCriterion("red_code_modeadds not like", value, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsIn(List<String> values) {
            addCriterion("red_code_modeadds in", values, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsNotIn(List<String> values) {
            addCriterion("red_code_modeadds not in", values, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsBetween(String value1, String value2) {
            addCriterion("red_code_modeadds between", value1, value2, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeModeaddsNotBetween(String value1, String value2) {
            addCriterion("red_code_modeadds not between", value1, value2, "redCodeModeadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsIsNull() {
            addCriterion("red_code_tecadds is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsIsNotNull() {
            addCriterion("red_code_tecadds is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsEqualTo(String value) {
            addCriterion("red_code_tecadds =", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsNotEqualTo(String value) {
            addCriterion("red_code_tecadds <>", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsGreaterThan(String value) {
            addCriterion("red_code_tecadds >", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_tecadds >=", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsLessThan(String value) {
            addCriterion("red_code_tecadds <", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsLessThanOrEqualTo(String value) {
            addCriterion("red_code_tecadds <=", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsLike(String value) {
            addCriterion("red_code_tecadds like", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsNotLike(String value) {
            addCriterion("red_code_tecadds not like", value, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsIn(List<String> values) {
            addCriterion("red_code_tecadds in", values, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsNotIn(List<String> values) {
            addCriterion("red_code_tecadds not in", values, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsBetween(String value1, String value2) {
            addCriterion("red_code_tecadds between", value1, value2, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeTecaddsNotBetween(String value1, String value2) {
            addCriterion("red_code_tecadds not between", value1, value2, "redCodeTecadds");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightIsNull() {
            addCriterion("red_code_hight is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightIsNotNull() {
            addCriterion("red_code_hight is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightEqualTo(String value) {
            addCriterion("red_code_hight =", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightNotEqualTo(String value) {
            addCriterion("red_code_hight <>", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightGreaterThan(String value) {
            addCriterion("red_code_hight >", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_hight >=", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightLessThan(String value) {
            addCriterion("red_code_hight <", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightLessThanOrEqualTo(String value) {
            addCriterion("red_code_hight <=", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightLike(String value) {
            addCriterion("red_code_hight like", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightNotLike(String value) {
            addCriterion("red_code_hight not like", value, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightIn(List<String> values) {
            addCriterion("red_code_hight in", values, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightNotIn(List<String> values) {
            addCriterion("red_code_hight not in", values, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightBetween(String value1, String value2) {
            addCriterion("red_code_hight between", value1, value2, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeHightNotBetween(String value1, String value2) {
            addCriterion("red_code_hight not between", value1, value2, "redCodeHight");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleIsNull() {
            addCriterion("red_code_middle is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleIsNotNull() {
            addCriterion("red_code_middle is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleEqualTo(String value) {
            addCriterion("red_code_middle =", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleNotEqualTo(String value) {
            addCriterion("red_code_middle <>", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleGreaterThan(String value) {
            addCriterion("red_code_middle >", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_middle >=", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleLessThan(String value) {
            addCriterion("red_code_middle <", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleLessThanOrEqualTo(String value) {
            addCriterion("red_code_middle <=", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleLike(String value) {
            addCriterion("red_code_middle like", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleNotLike(String value) {
            addCriterion("red_code_middle not like", value, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleIn(List<String> values) {
            addCriterion("red_code_middle in", values, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleNotIn(List<String> values) {
            addCriterion("red_code_middle not in", values, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleBetween(String value1, String value2) {
            addCriterion("red_code_middle between", value1, value2, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeMiddleNotBetween(String value1, String value2) {
            addCriterion("red_code_middle not between", value1, value2, "redCodeMiddle");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignIsNull() {
            addCriterion("red_code_foreign is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignIsNotNull() {
            addCriterion("red_code_foreign is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignEqualTo(String value) {
            addCriterion("red_code_foreign =", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignNotEqualTo(String value) {
            addCriterion("red_code_foreign <>", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignGreaterThan(String value) {
            addCriterion("red_code_foreign >", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_foreign >=", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignLessThan(String value) {
            addCriterion("red_code_foreign <", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignLessThanOrEqualTo(String value) {
            addCriterion("red_code_foreign <=", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignLike(String value) {
            addCriterion("red_code_foreign like", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignNotLike(String value) {
            addCriterion("red_code_foreign not like", value, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignIn(List<String> values) {
            addCriterion("red_code_foreign in", values, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignNotIn(List<String> values) {
            addCriterion("red_code_foreign not in", values, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignBetween(String value1, String value2) {
            addCriterion("red_code_foreign between", value1, value2, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeForeignNotBetween(String value1, String value2) {
            addCriterion("red_code_foreign not between", value1, value2, "redCodeForeign");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenIsNull() {
            addCriterion("red_code_checked_green is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenIsNotNull() {
            addCriterion("red_code_checked_green is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenEqualTo(String value) {
            addCriterion("red_code_checked_green =", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenNotEqualTo(String value) {
            addCriterion("red_code_checked_green <>", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenGreaterThan(String value) {
            addCriterion("red_code_checked_green >", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_checked_green >=", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenLessThan(String value) {
            addCriterion("red_code_checked_green <", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenLessThanOrEqualTo(String value) {
            addCriterion("red_code_checked_green <=", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenLike(String value) {
            addCriterion("red_code_checked_green like", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenNotLike(String value) {
            addCriterion("red_code_checked_green not like", value, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenIn(List<String> values) {
            addCriterion("red_code_checked_green in", values, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenNotIn(List<String> values) {
            addCriterion("red_code_checked_green not in", values, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenBetween(String value1, String value2) {
            addCriterion("red_code_checked_green between", value1, value2, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreenNotBetween(String value1, String value2) {
            addCriterion("red_code_checked_green not between", value1, value2, "redCodeCheckedGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedIsNull() {
            addCriterion("red_code_checked_red is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedIsNotNull() {
            addCriterion("red_code_checked_red is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedEqualTo(String value) {
            addCriterion("red_code_checked_red =", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedNotEqualTo(String value) {
            addCriterion("red_code_checked_red <>", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedGreaterThan(String value) {
            addCriterion("red_code_checked_red >", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_checked_red >=", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedLessThan(String value) {
            addCriterion("red_code_checked_red <", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedLessThanOrEqualTo(String value) {
            addCriterion("red_code_checked_red <=", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedLike(String value) {
            addCriterion("red_code_checked_red like", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedNotLike(String value) {
            addCriterion("red_code_checked_red not like", value, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedIn(List<String> values) {
            addCriterion("red_code_checked_red in", values, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedNotIn(List<String> values) {
            addCriterion("red_code_checked_red not in", values, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedBetween(String value1, String value2) {
            addCriterion("red_code_checked_red between", value1, value2, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedRedNotBetween(String value1, String value2) {
            addCriterion("red_code_checked_red not between", value1, value2, "redCodeCheckedRed");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowIsNull() {
            addCriterion("red_code_checked_yellow is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowIsNotNull() {
            addCriterion("red_code_checked_yellow is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowEqualTo(String value) {
            addCriterion("red_code_checked_yellow =", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowNotEqualTo(String value) {
            addCriterion("red_code_checked_yellow <>", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowGreaterThan(String value) {
            addCriterion("red_code_checked_yellow >", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_checked_yellow >=", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowLessThan(String value) {
            addCriterion("red_code_checked_yellow <", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowLessThanOrEqualTo(String value) {
            addCriterion("red_code_checked_yellow <=", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowLike(String value) {
            addCriterion("red_code_checked_yellow like", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowNotLike(String value) {
            addCriterion("red_code_checked_yellow not like", value, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowIn(List<String> values) {
            addCriterion("red_code_checked_yellow in", values, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowNotIn(List<String> values) {
            addCriterion("red_code_checked_yellow not in", values, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowBetween(String value1, String value2) {
            addCriterion("red_code_checked_yellow between", value1, value2, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedYellowNotBetween(String value1, String value2) {
            addCriterion("red_code_checked_yellow not between", value1, value2, "redCodeCheckedYellow");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckIsNull() {
            addCriterion("red_code_uncheck is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckIsNotNull() {
            addCriterion("red_code_uncheck is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckEqualTo(String value) {
            addCriterion("red_code_uncheck =", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckNotEqualTo(String value) {
            addCriterion("red_code_uncheck <>", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreaterThan(String value) {
            addCriterion("red_code_uncheck >", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_uncheck >=", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckLessThan(String value) {
            addCriterion("red_code_uncheck <", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckLessThanOrEqualTo(String value) {
            addCriterion("red_code_uncheck <=", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckLike(String value) {
            addCriterion("red_code_uncheck like", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckNotLike(String value) {
            addCriterion("red_code_uncheck not like", value, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckIn(List<String> values) {
            addCriterion("red_code_uncheck in", values, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckNotIn(List<String> values) {
            addCriterion("red_code_uncheck not in", values, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckBetween(String value1, String value2) {
            addCriterion("red_code_uncheck between", value1, value2, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckNotBetween(String value1, String value2) {
            addCriterion("red_code_uncheck not between", value1, value2, "redCodeUncheck");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenIsNull() {
            addCriterion("red_code_uncheck_green is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenIsNotNull() {
            addCriterion("red_code_uncheck_green is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenEqualTo(String value) {
            addCriterion("red_code_uncheck_green =", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenNotEqualTo(String value) {
            addCriterion("red_code_uncheck_green <>", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenGreaterThan(String value) {
            addCriterion("red_code_uncheck_green >", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_uncheck_green >=", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenLessThan(String value) {
            addCriterion("red_code_uncheck_green <", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenLessThanOrEqualTo(String value) {
            addCriterion("red_code_uncheck_green <=", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenLike(String value) {
            addCriterion("red_code_uncheck_green like", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenNotLike(String value) {
            addCriterion("red_code_uncheck_green not like", value, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenIn(List<String> values) {
            addCriterion("red_code_uncheck_green in", values, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenNotIn(List<String> values) {
            addCriterion("red_code_uncheck_green not in", values, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenBetween(String value1, String value2) {
            addCriterion("red_code_uncheck_green between", value1, value2, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeUncheckGreenNotBetween(String value1, String value2) {
            addCriterion("red_code_uncheck_green not between", value1, value2, "redCodeUncheckGreen");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowIsNull() {
            addCriterion("red_code_red_now is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowIsNotNull() {
            addCriterion("red_code_red_now is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowEqualTo(String value) {
            addCriterion("red_code_red_now =", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowNotEqualTo(String value) {
            addCriterion("red_code_red_now <>", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowGreaterThan(String value) {
            addCriterion("red_code_red_now >", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_red_now >=", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowLessThan(String value) {
            addCriterion("red_code_red_now <", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowLessThanOrEqualTo(String value) {
            addCriterion("red_code_red_now <=", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowLike(String value) {
            addCriterion("red_code_red_now like", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowNotLike(String value) {
            addCriterion("red_code_red_now not like", value, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowIn(List<String> values) {
            addCriterion("red_code_red_now in", values, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowNotIn(List<String> values) {
            addCriterion("red_code_red_now not in", values, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowBetween(String value1, String value2) {
            addCriterion("red_code_red_now between", value1, value2, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeRedNowNotBetween(String value1, String value2) {
            addCriterion("red_code_red_now not between", value1, value2, "redCodeRedNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowIsNull() {
            addCriterion("red_code_yellow_now is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowIsNotNull() {
            addCriterion("red_code_yellow_now is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowEqualTo(String value) {
            addCriterion("red_code_yellow_now =", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowNotEqualTo(String value) {
            addCriterion("red_code_yellow_now <>", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowGreaterThan(String value) {
            addCriterion("red_code_yellow_now >", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_yellow_now >=", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowLessThan(String value) {
            addCriterion("red_code_yellow_now <", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowLessThanOrEqualTo(String value) {
            addCriterion("red_code_yellow_now <=", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowLike(String value) {
            addCriterion("red_code_yellow_now like", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowNotLike(String value) {
            addCriterion("red_code_yellow_now not like", value, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowIn(List<String> values) {
            addCriterion("red_code_yellow_now in", values, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowNotIn(List<String> values) {
            addCriterion("red_code_yellow_now not in", values, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowBetween(String value1, String value2) {
            addCriterion("red_code_yellow_now between", value1, value2, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andRedCodeYellowNowNotBetween(String value1, String value2) {
            addCriterion("red_code_yellow_now not between", value1, value2, "redCodeYellowNow");
            return (Criteria) this;
        }

        public Criteria andGreenToRedIsNull() {
            addCriterion("green_to_red is null");
            return (Criteria) this;
        }

        public Criteria andGreenToRedIsNotNull() {
            addCriterion("green_to_red is not null");
            return (Criteria) this;
        }

        public Criteria andGreenToRedEqualTo(String value) {
            addCriterion("green_to_red =", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedNotEqualTo(String value) {
            addCriterion("green_to_red <>", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedGreaterThan(String value) {
            addCriterion("green_to_red >", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedGreaterThanOrEqualTo(String value) {
            addCriterion("green_to_red >=", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedLessThan(String value) {
            addCriterion("green_to_red <", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedLessThanOrEqualTo(String value) {
            addCriterion("green_to_red <=", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedLike(String value) {
            addCriterion("green_to_red like", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedNotLike(String value) {
            addCriterion("green_to_red not like", value, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedIn(List<String> values) {
            addCriterion("green_to_red in", values, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedNotIn(List<String> values) {
            addCriterion("green_to_red not in", values, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedBetween(String value1, String value2) {
            addCriterion("green_to_red between", value1, value2, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andGreenToRedNotBetween(String value1, String value2) {
            addCriterion("green_to_red not between", value1, value2, "greenToRed");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorIsNull() {
            addCriterion("accept_auditor is null");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorIsNotNull() {
            addCriterion("accept_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorEqualTo(String value) {
            addCriterion("accept_auditor =", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorNotEqualTo(String value) {
            addCriterion("accept_auditor <>", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorGreaterThan(String value) {
            addCriterion("accept_auditor >", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("accept_auditor >=", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorLessThan(String value) {
            addCriterion("accept_auditor <", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorLessThanOrEqualTo(String value) {
            addCriterion("accept_auditor <=", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorLike(String value) {
            addCriterion("accept_auditor like", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorNotLike(String value) {
            addCriterion("accept_auditor not like", value, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorIn(List<String> values) {
            addCriterion("accept_auditor in", values, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorNotIn(List<String> values) {
            addCriterion("accept_auditor not in", values, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorBetween(String value1, String value2) {
            addCriterion("accept_auditor between", value1, value2, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptAuditorNotBetween(String value1, String value2) {
            addCriterion("accept_auditor not between", value1, value2, "acceptAuditor");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierIsNull() {
            addCriterion("accept_verifier is null");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierIsNotNull() {
            addCriterion("accept_verifier is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierEqualTo(String value) {
            addCriterion("accept_verifier =", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierNotEqualTo(String value) {
            addCriterion("accept_verifier <>", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierGreaterThan(String value) {
            addCriterion("accept_verifier >", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("accept_verifier >=", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierLessThan(String value) {
            addCriterion("accept_verifier <", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierLessThanOrEqualTo(String value) {
            addCriterion("accept_verifier <=", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierLike(String value) {
            addCriterion("accept_verifier like", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierNotLike(String value) {
            addCriterion("accept_verifier not like", value, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierIn(List<String> values) {
            addCriterion("accept_verifier in", values, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierNotIn(List<String> values) {
            addCriterion("accept_verifier not in", values, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierBetween(String value1, String value2) {
            addCriterion("accept_verifier between", value1, value2, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andAcceptVerifierNotBetween(String value1, String value2) {
            addCriterion("accept_verifier not between", value1, value2, "acceptVerifier");
            return (Criteria) this;
        }

        public Criteria andVerifiAllIsNull() {
            addCriterion("verifi_all is null");
            return (Criteria) this;
        }

        public Criteria andVerifiAllIsNotNull() {
            addCriterion("verifi_all is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiAllEqualTo(String value) {
            addCriterion("verifi_all =", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllNotEqualTo(String value) {
            addCriterion("verifi_all <>", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllGreaterThan(String value) {
            addCriterion("verifi_all >", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_all >=", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllLessThan(String value) {
            addCriterion("verifi_all <", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllLessThanOrEqualTo(String value) {
            addCriterion("verifi_all <=", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllLike(String value) {
            addCriterion("verifi_all like", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllNotLike(String value) {
            addCriterion("verifi_all not like", value, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllIn(List<String> values) {
            addCriterion("verifi_all in", values, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllNotIn(List<String> values) {
            addCriterion("verifi_all not in", values, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllBetween(String value1, String value2) {
            addCriterion("verifi_all between", value1, value2, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAllNotBetween(String value1, String value2) {
            addCriterion("verifi_all not between", value1, value2, "verifiAll");
            return (Criteria) this;
        }

        public Criteria andVerifiAddIsNull() {
            addCriterion("verifi_add is null");
            return (Criteria) this;
        }

        public Criteria andVerifiAddIsNotNull() {
            addCriterion("verifi_add is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiAddEqualTo(String value) {
            addCriterion("verifi_add =", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddNotEqualTo(String value) {
            addCriterion("verifi_add <>", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddGreaterThan(String value) {
            addCriterion("verifi_add >", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_add >=", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddLessThan(String value) {
            addCriterion("verifi_add <", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddLessThanOrEqualTo(String value) {
            addCriterion("verifi_add <=", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddLike(String value) {
            addCriterion("verifi_add like", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddNotLike(String value) {
            addCriterion("verifi_add not like", value, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddIn(List<String> values) {
            addCriterion("verifi_add in", values, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddNotIn(List<String> values) {
            addCriterion("verifi_add not in", values, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddBetween(String value1, String value2) {
            addCriterion("verifi_add between", value1, value2, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiAddNotBetween(String value1, String value2) {
            addCriterion("verifi_add not between", value1, value2, "verifiAdd");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutIsNull() {
            addCriterion("verifi_red_out is null");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutIsNotNull() {
            addCriterion("verifi_red_out is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutEqualTo(String value) {
            addCriterion("verifi_red_out =", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutNotEqualTo(String value) {
            addCriterion("verifi_red_out <>", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutGreaterThan(String value) {
            addCriterion("verifi_red_out >", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_red_out >=", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutLessThan(String value) {
            addCriterion("verifi_red_out <", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutLessThanOrEqualTo(String value) {
            addCriterion("verifi_red_out <=", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutLike(String value) {
            addCriterion("verifi_red_out like", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutNotLike(String value) {
            addCriterion("verifi_red_out not like", value, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutIn(List<String> values) {
            addCriterion("verifi_red_out in", values, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutNotIn(List<String> values) {
            addCriterion("verifi_red_out not in", values, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutBetween(String value1, String value2) {
            addCriterion("verifi_red_out between", value1, value2, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiRedOutNotBetween(String value1, String value2) {
            addCriterion("verifi_red_out not between", value1, value2, "verifiRedOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutIsNull() {
            addCriterion("verifi_yellow_out is null");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutIsNotNull() {
            addCriterion("verifi_yellow_out is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutEqualTo(String value) {
            addCriterion("verifi_yellow_out =", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutNotEqualTo(String value) {
            addCriterion("verifi_yellow_out <>", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutGreaterThan(String value) {
            addCriterion("verifi_yellow_out >", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutGreaterThanOrEqualTo(String value) {
            addCriterion("verifi_yellow_out >=", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutLessThan(String value) {
            addCriterion("verifi_yellow_out <", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutLessThanOrEqualTo(String value) {
            addCriterion("verifi_yellow_out <=", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutLike(String value) {
            addCriterion("verifi_yellow_out like", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutNotLike(String value) {
            addCriterion("verifi_yellow_out not like", value, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutIn(List<String> values) {
            addCriterion("verifi_yellow_out in", values, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutNotIn(List<String> values) {
            addCriterion("verifi_yellow_out not in", values, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutBetween(String value1, String value2) {
            addCriterion("verifi_yellow_out between", value1, value2, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andVerifiYellowOutNotBetween(String value1, String value2) {
            addCriterion("verifi_yellow_out not between", value1, value2, "verifiYellowOut");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateIsNull() {
            addCriterion("statistics_date is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateIsNotNull() {
            addCriterion("statistics_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateEqualTo(Date value) {
            addCriterion("statistics_date =", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateNotEqualTo(Date value) {
            addCriterion("statistics_date <>", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateGreaterThan(Date value) {
            addCriterion("statistics_date >", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("statistics_date >=", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateLessThan(Date value) {
            addCriterion("statistics_date <", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateLessThanOrEqualTo(Date value) {
            addCriterion("statistics_date <=", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateIn(List<Date> values) {
            addCriterion("statistics_date in", values, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateNotIn(List<Date> values) {
            addCriterion("statistics_date not in", values, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateBetween(Date value1, Date value2) {
            addCriterion("statistics_date between", value1, value2, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateNotBetween(Date value1, Date value2) {
            addCriterion("statistics_date not between", value1, value2, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedIsNull() {
            addCriterion("red_code_checked is null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedIsNotNull() {
            addCriterion("red_code_checked is not null");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedEqualTo(String value) {
            addCriterion("red_code_checked =", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedNotEqualTo(String value) {
            addCriterion("red_code_checked <>", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreaterThan(String value) {
            addCriterion("red_code_checked >", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedGreaterThanOrEqualTo(String value) {
            addCriterion("red_code_checked >=", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedLessThan(String value) {
            addCriterion("red_code_checked <", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedLessThanOrEqualTo(String value) {
            addCriterion("red_code_checked <=", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedLike(String value) {
            addCriterion("red_code_checked like", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedNotLike(String value) {
            addCriterion("red_code_checked not like", value, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedIn(List<String> values) {
            addCriterion("red_code_checked in", values, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedNotIn(List<String> values) {
            addCriterion("red_code_checked not in", values, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedBetween(String value1, String value2) {
            addCriterion("red_code_checked between", value1, value2, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andRedCodeCheckedNotBetween(String value1, String value2) {
            addCriterion("red_code_checked not between", value1, value2, "redCodeChecked");
            return (Criteria) this;
        }

        public Criteria andPreAttr1IsNull() {
            addCriterion("pre_attr1 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr1IsNotNull() {
            addCriterion("pre_attr1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr1EqualTo(String value) {
            addCriterion("pre_attr1 =", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotEqualTo(String value) {
            addCriterion("pre_attr1 <>", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1GreaterThan(String value) {
            addCriterion("pre_attr1 >", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1GreaterThanOrEqualTo(String value) {
            addCriterion("pre_attr1 >=", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1LessThan(String value) {
            addCriterion("pre_attr1 <", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1LessThanOrEqualTo(String value) {
            addCriterion("pre_attr1 <=", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1Like(String value) {
            addCriterion("pre_attr1 like", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotLike(String value) {
            addCriterion("pre_attr1 not like", value, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1In(List<String> values) {
            addCriterion("pre_attr1 in", values, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotIn(List<String> values) {
            addCriterion("pre_attr1 not in", values, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1Between(String value1, String value2) {
            addCriterion("pre_attr1 between", value1, value2, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr1NotBetween(String value1, String value2) {
            addCriterion("pre_attr1 not between", value1, value2, "preAttr1");
            return (Criteria) this;
        }

        public Criteria andPreAttr2IsNull() {
            addCriterion("pre_attr2 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr2IsNotNull() {
            addCriterion("pre_attr2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr2EqualTo(String value) {
            addCriterion("pre_attr2 =", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotEqualTo(String value) {
            addCriterion("pre_attr2 <>", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2GreaterThan(String value) {
            addCriterion("pre_attr2 >", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2GreaterThanOrEqualTo(String value) {
            addCriterion("pre_attr2 >=", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2LessThan(String value) {
            addCriterion("pre_attr2 <", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2LessThanOrEqualTo(String value) {
            addCriterion("pre_attr2 <=", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2Like(String value) {
            addCriterion("pre_attr2 like", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotLike(String value) {
            addCriterion("pre_attr2 not like", value, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2In(List<String> values) {
            addCriterion("pre_attr2 in", values, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotIn(List<String> values) {
            addCriterion("pre_attr2 not in", values, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2Between(String value1, String value2) {
            addCriterion("pre_attr2 between", value1, value2, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr2NotBetween(String value1, String value2) {
            addCriterion("pre_attr2 not between", value1, value2, "preAttr2");
            return (Criteria) this;
        }

        public Criteria andPreAttr3IsNull() {
            addCriterion("pre_attr3 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr3IsNotNull() {
            addCriterion("pre_attr3 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr3EqualTo(String value) {
            addCriterion("pre_attr3 =", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotEqualTo(String value) {
            addCriterion("pre_attr3 <>", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3GreaterThan(String value) {
            addCriterion("pre_attr3 >", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3GreaterThanOrEqualTo(String value) {
            addCriterion("pre_attr3 >=", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3LessThan(String value) {
            addCriterion("pre_attr3 <", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3LessThanOrEqualTo(String value) {
            addCriterion("pre_attr3 <=", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3Like(String value) {
            addCriterion("pre_attr3 like", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotLike(String value) {
            addCriterion("pre_attr3 not like", value, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3In(List<String> values) {
            addCriterion("pre_attr3 in", values, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotIn(List<String> values) {
            addCriterion("pre_attr3 not in", values, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3Between(String value1, String value2) {
            addCriterion("pre_attr3 between", value1, value2, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr3NotBetween(String value1, String value2) {
            addCriterion("pre_attr3 not between", value1, value2, "preAttr3");
            return (Criteria) this;
        }

        public Criteria andPreAttr4IsNull() {
            addCriterion("pre_attr4 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr4IsNotNull() {
            addCriterion("pre_attr4 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr4EqualTo(String value) {
            addCriterion("pre_attr4 =", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotEqualTo(String value) {
            addCriterion("pre_attr4 <>", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4GreaterThan(String value) {
            addCriterion("pre_attr4 >", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4GreaterThanOrEqualTo(String value) {
            addCriterion("pre_attr4 >=", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4LessThan(String value) {
            addCriterion("pre_attr4 <", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4LessThanOrEqualTo(String value) {
            addCriterion("pre_attr4 <=", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4Like(String value) {
            addCriterion("pre_attr4 like", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotLike(String value) {
            addCriterion("pre_attr4 not like", value, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4In(List<String> values) {
            addCriterion("pre_attr4 in", values, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotIn(List<String> values) {
            addCriterion("pre_attr4 not in", values, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4Between(String value1, String value2) {
            addCriterion("pre_attr4 between", value1, value2, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr4NotBetween(String value1, String value2) {
            addCriterion("pre_attr4 not between", value1, value2, "preAttr4");
            return (Criteria) this;
        }

        public Criteria andPreAttr5IsNull() {
            addCriterion("pre_attr5 is null");
            return (Criteria) this;
        }

        public Criteria andPreAttr5IsNotNull() {
            addCriterion("pre_attr5 is not null");
            return (Criteria) this;
        }

        public Criteria andPreAttr5EqualTo(String value) {
            addCriterion("pre_attr5 =", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotEqualTo(String value) {
            addCriterion("pre_attr5 <>", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5GreaterThan(String value) {
            addCriterion("pre_attr5 >", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5GreaterThanOrEqualTo(String value) {
            addCriterion("pre_attr5 >=", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5LessThan(String value) {
            addCriterion("pre_attr5 <", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5LessThanOrEqualTo(String value) {
            addCriterion("pre_attr5 <=", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5Like(String value) {
            addCriterion("pre_attr5 like", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotLike(String value) {
            addCriterion("pre_attr5 not like", value, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5In(List<String> values) {
            addCriterion("pre_attr5 in", values, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotIn(List<String> values) {
            addCriterion("pre_attr5 not in", values, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5Between(String value1, String value2) {
            addCriterion("pre_attr5 between", value1, value2, "preAttr5");
            return (Criteria) this;
        }

        public Criteria andPreAttr5NotBetween(String value1, String value2) {
            addCriterion("pre_attr5 not between", value1, value2, "preAttr5");
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