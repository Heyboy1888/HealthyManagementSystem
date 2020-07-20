package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCHealthThirdInputCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCHealthThirdInputCriteria() {
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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

        public Criteria andCommunityCheckDateIsNull() {
            addCriterion("community_check_date is null");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateIsNotNull() {
            addCriterion("community_check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateEqualTo(Date value) {
            addCriterion("community_check_date =", value, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateNotEqualTo(Date value) {
            addCriterion("community_check_date <>", value, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateGreaterThan(Date value) {
            addCriterion("community_check_date >", value, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterion("community_check_date >=", value, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateLessThan(Date value) {
            addCriterion("community_check_date <", value, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateLessThanOrEqualTo(Date value) {
            addCriterion("community_check_date <=", value, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateIn(List<Date> values) {
            addCriterion("community_check_date in", values, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateNotIn(List<Date> values) {
            addCriterion("community_check_date not in", values, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateBetween(Date value1, Date value2) {
            addCriterion("community_check_date between", value1, value2, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCommunityCheckDateNotBetween(Date value1, Date value2) {
            addCriterion("community_check_date not between", value1, value2, "communityCheckDate");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeIsNull() {
            addCriterion("current_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeIsNotNull() {
            addCriterion("current_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeEqualTo(String value) {
            addCriterion("current_type =", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeNotEqualTo(String value) {
            addCriterion("current_type <>", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeGreaterThan(String value) {
            addCriterion("current_type >", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("current_type >=", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeLessThan(String value) {
            addCriterion("current_type <", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeLessThanOrEqualTo(String value) {
            addCriterion("current_type <=", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeLike(String value) {
            addCriterion("current_type like", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeNotLike(String value) {
            addCriterion("current_type not like", value, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeIn(List<String> values) {
            addCriterion("current_type in", values, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeNotIn(List<String> values) {
            addCriterion("current_type not in", values, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeBetween(String value1, String value2) {
            addCriterion("current_type between", value1, value2, "currentType");
            return (Criteria) this;
        }

        public Criteria andCurrentTypeNotBetween(String value1, String value2) {
            addCriterion("current_type not between", value1, value2, "currentType");
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

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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