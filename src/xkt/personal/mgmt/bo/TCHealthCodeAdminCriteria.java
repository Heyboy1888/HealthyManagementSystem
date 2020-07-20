package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCHealthCodeAdminCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCHealthCodeAdminCriteria() {
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

        public Criteria andCardCodeIsNull() {
            addCriterion("card_code is null");
            return (Criteria) this;
        }

        public Criteria andCardCodeIsNotNull() {
            addCriterion("card_code is not null");
            return (Criteria) this;
        }

        public Criteria andCardCodeEqualTo(String value) {
            addCriterion("card_code =", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotEqualTo(String value) {
            addCriterion("card_code <>", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeGreaterThan(String value) {
            addCriterion("card_code >", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("card_code >=", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLessThan(String value) {
            addCriterion("card_code <", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLessThanOrEqualTo(String value) {
            addCriterion("card_code <=", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLike(String value) {
            addCriterion("card_code like", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotLike(String value) {
            addCriterion("card_code not like", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeIn(List<String> values) {
            addCriterion("card_code in", values, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotIn(List<String> values) {
            addCriterion("card_code not in", values, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeBetween(String value1, String value2) {
            addCriterion("card_code between", value1, value2, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotBetween(String value1, String value2) {
            addCriterion("card_code not between", value1, value2, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideIsNull() {
            addCriterion("card_code_hide is null");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideIsNotNull() {
            addCriterion("card_code_hide is not null");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideEqualTo(String value) {
            addCriterion("card_code_hide =", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideNotEqualTo(String value) {
            addCriterion("card_code_hide <>", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideGreaterThan(String value) {
            addCriterion("card_code_hide >", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideGreaterThanOrEqualTo(String value) {
            addCriterion("card_code_hide >=", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideLessThan(String value) {
            addCriterion("card_code_hide <", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideLessThanOrEqualTo(String value) {
            addCriterion("card_code_hide <=", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideLike(String value) {
            addCriterion("card_code_hide like", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideNotLike(String value) {
            addCriterion("card_code_hide not like", value, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideIn(List<String> values) {
            addCriterion("card_code_hide in", values, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideNotIn(List<String> values) {
            addCriterion("card_code_hide not in", values, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideBetween(String value1, String value2) {
            addCriterion("card_code_hide between", value1, value2, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeHideNotBetween(String value1, String value2) {
            addCriterion("card_code_hide not between", value1, value2, "cardCodeHide");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightIsNull() {
            addCriterion("card_code_bright is null");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightIsNotNull() {
            addCriterion("card_code_bright is not null");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightEqualTo(String value) {
            addCriterion("card_code_bright =", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightNotEqualTo(String value) {
            addCriterion("card_code_bright <>", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightGreaterThan(String value) {
            addCriterion("card_code_bright >", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightGreaterThanOrEqualTo(String value) {
            addCriterion("card_code_bright >=", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightLessThan(String value) {
            addCriterion("card_code_bright <", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightLessThanOrEqualTo(String value) {
            addCriterion("card_code_bright <=", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightLike(String value) {
            addCriterion("card_code_bright like", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightNotLike(String value) {
            addCriterion("card_code_bright not like", value, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightIn(List<String> values) {
            addCriterion("card_code_bright in", values, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightNotIn(List<String> values) {
            addCriterion("card_code_bright not in", values, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightBetween(String value1, String value2) {
            addCriterion("card_code_bright between", value1, value2, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andCardCodeBrightNotBetween(String value1, String value2) {
            addCriterion("card_code_bright not between", value1, value2, "cardCodeBright");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andCommunityIdIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(String value) {
            addCriterion("community_id =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(String value) {
            addCriterion("community_id <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(String value) {
            addCriterion("community_id >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(String value) {
            addCriterion("community_id >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(String value) {
            addCriterion("community_id <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(String value) {
            addCriterion("community_id <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLike(String value) {
            addCriterion("community_id like", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotLike(String value) {
            addCriterion("community_id not like", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<String> values) {
            addCriterion("community_id in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<String> values) {
            addCriterion("community_id not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(String value1, String value2) {
            addCriterion("community_id between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(String value1, String value2) {
            addCriterion("community_id not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdIsNull() {
            addCriterion("police_station_id is null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdIsNotNull() {
            addCriterion("police_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdEqualTo(String value) {
            addCriterion("police_station_id =", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdNotEqualTo(String value) {
            addCriterion("police_station_id <>", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdGreaterThan(String value) {
            addCriterion("police_station_id >", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("police_station_id >=", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdLessThan(String value) {
            addCriterion("police_station_id <", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdLessThanOrEqualTo(String value) {
            addCriterion("police_station_id <=", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdLike(String value) {
            addCriterion("police_station_id like", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdNotLike(String value) {
            addCriterion("police_station_id not like", value, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdIn(List<String> values) {
            addCriterion("police_station_id in", values, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdNotIn(List<String> values) {
            addCriterion("police_station_id not in", values, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdBetween(String value1, String value2) {
            addCriterion("police_station_id between", value1, value2, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIdNotBetween(String value1, String value2) {
            addCriterion("police_station_id not between", value1, value2, "policeStationId");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("is_special is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("is_special is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(String value) {
            addCriterion("is_special =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(String value) {
            addCriterion("is_special <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(String value) {
            addCriterion("is_special >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("is_special >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(String value) {
            addCriterion("is_special <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(String value) {
            addCriterion("is_special <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLike(String value) {
            addCriterion("is_special like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotLike(String value) {
            addCriterion("is_special not like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<String> values) {
            addCriterion("is_special in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<String> values) {
            addCriterion("is_special not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(String value1, String value2) {
            addCriterion("is_special between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(String value1, String value2) {
            addCriterion("is_special not between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNull() {
            addCriterion("admin_type is null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNotNull() {
            addCriterion("admin_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeEqualTo(String value) {
            addCriterion("admin_type =", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotEqualTo(String value) {
            addCriterion("admin_type <>", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThan(String value) {
            addCriterion("admin_type >", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThanOrEqualTo(String value) {
            addCriterion("admin_type >=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThan(String value) {
            addCriterion("admin_type <", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThanOrEqualTo(String value) {
            addCriterion("admin_type <=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLike(String value) {
            addCriterion("admin_type like", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotLike(String value) {
            addCriterion("admin_type not like", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIn(List<String> values) {
            addCriterion("admin_type in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotIn(List<String> values) {
            addCriterion("admin_type not in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeBetween(String value1, String value2) {
            addCriterion("admin_type between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotBetween(String value1, String value2) {
            addCriterion("admin_type not between", value1, value2, "adminType");
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

        public Criteria andPersonnelTypeIsNull() {
            addCriterion("personnel_type is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeIsNotNull() {
            addCriterion("personnel_type is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeEqualTo(String value) {
            addCriterion("personnel_type =", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeNotEqualTo(String value) {
            addCriterion("personnel_type <>", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeGreaterThan(String value) {
            addCriterion("personnel_type >", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("personnel_type >=", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeLessThan(String value) {
            addCriterion("personnel_type <", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeLessThanOrEqualTo(String value) {
            addCriterion("personnel_type <=", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeLike(String value) {
            addCriterion("personnel_type like", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeNotLike(String value) {
            addCriterion("personnel_type not like", value, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeIn(List<String> values) {
            addCriterion("personnel_type in", values, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeNotIn(List<String> values) {
            addCriterion("personnel_type not in", values, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeBetween(String value1, String value2) {
            addCriterion("personnel_type between", value1, value2, "personnelType");
            return (Criteria) this;
        }

        public Criteria andPersonnelTypeNotBetween(String value1, String value2) {
            addCriterion("personnel_type not between", value1, value2, "personnelType");
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