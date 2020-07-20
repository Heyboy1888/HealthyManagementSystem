package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.List;

public class TXkmYrReasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TXkmYrReasonExample() {
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

        public Criteria andIsIsolaVirusPsnIsNull() {
            addCriterion("is_isola_virus_psn is null");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnIsNotNull() {
            addCriterion("is_isola_virus_psn is not null");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnEqualTo(String value) {
            addCriterion("is_isola_virus_psn =", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnNotEqualTo(String value) {
            addCriterion("is_isola_virus_psn <>", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnGreaterThan(String value) {
            addCriterion("is_isola_virus_psn >", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnGreaterThanOrEqualTo(String value) {
            addCriterion("is_isola_virus_psn >=", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnLessThan(String value) {
            addCriterion("is_isola_virus_psn <", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnLessThanOrEqualTo(String value) {
            addCriterion("is_isola_virus_psn <=", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnLike(String value) {
            addCriterion("is_isola_virus_psn like", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnNotLike(String value) {
            addCriterion("is_isola_virus_psn not like", value, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnIn(List<String> values) {
            addCriterion("is_isola_virus_psn in", values, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnNotIn(List<String> values) {
            addCriterion("is_isola_virus_psn not in", values, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnBetween(String value1, String value2) {
            addCriterion("is_isola_virus_psn between", value1, value2, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsIsolaVirusPsnNotBetween(String value1, String value2) {
            addCriterion("is_isola_virus_psn not between", value1, value2, "isIsolaVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnIsNull() {
            addCriterion("is_cure_virus_psn is null");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnIsNotNull() {
            addCriterion("is_cure_virus_psn is not null");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnEqualTo(String value) {
            addCriterion("is_cure_virus_psn =", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnNotEqualTo(String value) {
            addCriterion("is_cure_virus_psn <>", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnGreaterThan(String value) {
            addCriterion("is_cure_virus_psn >", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnGreaterThanOrEqualTo(String value) {
            addCriterion("is_cure_virus_psn >=", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnLessThan(String value) {
            addCriterion("is_cure_virus_psn <", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnLessThanOrEqualTo(String value) {
            addCriterion("is_cure_virus_psn <=", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnLike(String value) {
            addCriterion("is_cure_virus_psn like", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnNotLike(String value) {
            addCriterion("is_cure_virus_psn not like", value, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnIn(List<String> values) {
            addCriterion("is_cure_virus_psn in", values, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnNotIn(List<String> values) {
            addCriterion("is_cure_virus_psn not in", values, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnBetween(String value1, String value2) {
            addCriterion("is_cure_virus_psn between", value1, value2, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsCureVirusPsnNotBetween(String value1, String value2) {
            addCriterion("is_cure_virus_psn not between", value1, value2, "isCureVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnIsNull() {
            addCriterion("is_obser_virus_psn is null");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnIsNotNull() {
            addCriterion("is_obser_virus_psn is not null");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnEqualTo(String value) {
            addCriterion("is_obser_virus_psn =", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnNotEqualTo(String value) {
            addCriterion("is_obser_virus_psn <>", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnGreaterThan(String value) {
            addCriterion("is_obser_virus_psn >", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnGreaterThanOrEqualTo(String value) {
            addCriterion("is_obser_virus_psn >=", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnLessThan(String value) {
            addCriterion("is_obser_virus_psn <", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnLessThanOrEqualTo(String value) {
            addCriterion("is_obser_virus_psn <=", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnLike(String value) {
            addCriterion("is_obser_virus_psn like", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnNotLike(String value) {
            addCriterion("is_obser_virus_psn not like", value, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnIn(List<String> values) {
            addCriterion("is_obser_virus_psn in", values, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnNotIn(List<String> values) {
            addCriterion("is_obser_virus_psn not in", values, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnBetween(String value1, String value2) {
            addCriterion("is_obser_virus_psn between", value1, value2, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andIsObserVirusPsnNotBetween(String value1, String value2) {
            addCriterion("is_obser_virus_psn not between", value1, value2, "isObserVirusPsn");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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