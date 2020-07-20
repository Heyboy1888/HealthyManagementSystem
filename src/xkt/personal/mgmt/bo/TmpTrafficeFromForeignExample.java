package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmpTrafficeFromForeignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmpTrafficeFromForeignExample() {
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