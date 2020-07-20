package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.List;

public class TXkmYrSweepRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TXkmYrSweepRecordExample() {
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

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(String value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(String value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(String value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(String value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(String value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLike(String value) {
            addCriterion("report_date like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotLike(String value) {
            addCriterion("report_date not like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<String> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<String> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(String value1, String value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(String value1, String value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
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

        public Criteria andArriveWxDateIsNull() {
            addCriterion("arrive_wx_date is null");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateIsNotNull() {
            addCriterion("arrive_wx_date is not null");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateEqualTo(String value) {
            addCriterion("arrive_wx_date =", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotEqualTo(String value) {
            addCriterion("arrive_wx_date <>", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateGreaterThan(String value) {
            addCriterion("arrive_wx_date >", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_wx_date >=", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateLessThan(String value) {
            addCriterion("arrive_wx_date <", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateLessThanOrEqualTo(String value) {
            addCriterion("arrive_wx_date <=", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateLike(String value) {
            addCriterion("arrive_wx_date like", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotLike(String value) {
            addCriterion("arrive_wx_date not like", value, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateIn(List<String> values) {
            addCriterion("arrive_wx_date in", values, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotIn(List<String> values) {
            addCriterion("arrive_wx_date not in", values, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateBetween(String value1, String value2) {
            addCriterion("arrive_wx_date between", value1, value2, "arriveWxDate");
            return (Criteria) this;
        }

        public Criteria andArriveWxDateNotBetween(String value1, String value2) {
            addCriterion("arrive_wx_date not between", value1, value2, "arriveWxDate");
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

        public Criteria andPaasAddrNameIsNull() {
            addCriterion("paas_addr_name is null");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameIsNotNull() {
            addCriterion("paas_addr_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameEqualTo(String value) {
            addCriterion("paas_addr_name =", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameNotEqualTo(String value) {
            addCriterion("paas_addr_name <>", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameGreaterThan(String value) {
            addCriterion("paas_addr_name >", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("paas_addr_name >=", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameLessThan(String value) {
            addCriterion("paas_addr_name <", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameLessThanOrEqualTo(String value) {
            addCriterion("paas_addr_name <=", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameLike(String value) {
            addCriterion("paas_addr_name like", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameNotLike(String value) {
            addCriterion("paas_addr_name not like", value, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameIn(List<String> values) {
            addCriterion("paas_addr_name in", values, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameNotIn(List<String> values) {
            addCriterion("paas_addr_name not in", values, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameBetween(String value1, String value2) {
            addCriterion("paas_addr_name between", value1, value2, "paasAddrName");
            return (Criteria) this;
        }

        public Criteria andPaasAddrNameNotBetween(String value1, String value2) {
            addCriterion("paas_addr_name not between", value1, value2, "paasAddrName");
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

        public Criteria andCommunityNameIsNull() {
            addCriterion("community_name is null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNotNull() {
            addCriterion("community_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameEqualTo(String value) {
            addCriterion("community_name =", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotEqualTo(String value) {
            addCriterion("community_name <>", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThan(String value) {
            addCriterion("community_name >", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThanOrEqualTo(String value) {
            addCriterion("community_name >=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThan(String value) {
            addCriterion("community_name <", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThanOrEqualTo(String value) {
            addCriterion("community_name <=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLike(String value) {
            addCriterion("community_name like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotLike(String value) {
            addCriterion("community_name not like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIn(List<String> values) {
            addCriterion("community_name in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotIn(List<String> values) {
            addCriterion("community_name not in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameBetween(String value1, String value2) {
            addCriterion("community_name between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotBetween(String value1, String value2) {
            addCriterion("community_name not between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommDistrictIsNull() {
            addCriterion("comm_district is null");
            return (Criteria) this;
        }

        public Criteria andCommDistrictIsNotNull() {
            addCriterion("comm_district is not null");
            return (Criteria) this;
        }

        public Criteria andCommDistrictEqualTo(String value) {
            addCriterion("comm_district =", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictNotEqualTo(String value) {
            addCriterion("comm_district <>", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictGreaterThan(String value) {
            addCriterion("comm_district >", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("comm_district >=", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictLessThan(String value) {
            addCriterion("comm_district <", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictLessThanOrEqualTo(String value) {
            addCriterion("comm_district <=", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictLike(String value) {
            addCriterion("comm_district like", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictNotLike(String value) {
            addCriterion("comm_district not like", value, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictIn(List<String> values) {
            addCriterion("comm_district in", values, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictNotIn(List<String> values) {
            addCriterion("comm_district not in", values, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictBetween(String value1, String value2) {
            addCriterion("comm_district between", value1, value2, "commDistrict");
            return (Criteria) this;
        }

        public Criteria andCommDistrictNotBetween(String value1, String value2) {
            addCriterion("comm_district not between", value1, value2, "commDistrict");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeIsNull() {
            addCriterion("sweep_time is null");
            return (Criteria) this;
        }

        public Criteria andSweepTimeIsNotNull() {
            addCriterion("sweep_time is not null");
            return (Criteria) this;
        }

        public Criteria andSweepTimeEqualTo(String value) {
            addCriterion("sweep_time =", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeNotEqualTo(String value) {
            addCriterion("sweep_time <>", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeGreaterThan(String value) {
            addCriterion("sweep_time >", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sweep_time >=", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeLessThan(String value) {
            addCriterion("sweep_time <", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeLessThanOrEqualTo(String value) {
            addCriterion("sweep_time <=", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeLike(String value) {
            addCriterion("sweep_time like", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeNotLike(String value) {
            addCriterion("sweep_time not like", value, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeIn(List<String> values) {
            addCriterion("sweep_time in", values, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeNotIn(List<String> values) {
            addCriterion("sweep_time not in", values, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeBetween(String value1, String value2) {
            addCriterion("sweep_time between", value1, value2, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andSweepTimeNotBetween(String value1, String value2) {
            addCriterion("sweep_time not between", value1, value2, "sweepTime");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
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