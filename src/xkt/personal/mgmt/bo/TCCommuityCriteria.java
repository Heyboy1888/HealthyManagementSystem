package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.List;

public class TCCommuityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCCommuityCriteria() {
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

        public Criteria andCommuityIdIsNull() {
            addCriterion("COMMUITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommuityIdIsNotNull() {
            addCriterion("COMMUITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommuityIdEqualTo(String value) {
            addCriterion("COMMUITY_ID =", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotEqualTo(String value) {
            addCriterion("COMMUITY_ID <>", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdGreaterThan(String value) {
            addCriterion("COMMUITY_ID >", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUITY_ID >=", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdLessThan(String value) {
            addCriterion("COMMUITY_ID <", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdLessThanOrEqualTo(String value) {
            addCriterion("COMMUITY_ID <=", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdLike(String value) {
            addCriterion("COMMUITY_ID like", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotLike(String value) {
            addCriterion("COMMUITY_ID not like", value, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdIn(List<String> values) {
            addCriterion("COMMUITY_ID in", values, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotIn(List<String> values) {
            addCriterion("COMMUITY_ID not in", values, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdBetween(String value1, String value2) {
            addCriterion("COMMUITY_ID between", value1, value2, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCommuityIdNotBetween(String value1, String value2) {
            addCriterion("COMMUITY_ID not between", value1, value2, "commuityId");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeIsNull() {
            addCriterion("CMMTY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeIsNotNull() {
            addCriterion("CMMTY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeEqualTo(String value) {
            addCriterion("CMMTY_TYPE =", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeNotEqualTo(String value) {
            addCriterion("CMMTY_TYPE <>", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeGreaterThan(String value) {
            addCriterion("CMMTY_TYPE >", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CMMTY_TYPE >=", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeLessThan(String value) {
            addCriterion("CMMTY_TYPE <", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeLessThanOrEqualTo(String value) {
            addCriterion("CMMTY_TYPE <=", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeLike(String value) {
            addCriterion("CMMTY_TYPE like", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeNotLike(String value) {
            addCriterion("CMMTY_TYPE not like", value, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeIn(List<String> values) {
            addCriterion("CMMTY_TYPE in", values, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeNotIn(List<String> values) {
            addCriterion("CMMTY_TYPE not in", values, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeBetween(String value1, String value2) {
            addCriterion("CMMTY_TYPE between", value1, value2, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCmmtyTypeNotBetween(String value1, String value2) {
            addCriterion("CMMTY_TYPE not between", value1, value2, "cmmtyType");
            return (Criteria) this;
        }

        public Criteria andCommuityNoIsNull() {
            addCriterion("COMMUITY_NO is null");
            return (Criteria) this;
        }

        public Criteria andCommuityNoIsNotNull() {
            addCriterion("COMMUITY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCommuityNoEqualTo(String value) {
            addCriterion("COMMUITY_NO =", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoNotEqualTo(String value) {
            addCriterion("COMMUITY_NO <>", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoGreaterThan(String value) {
            addCriterion("COMMUITY_NO >", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUITY_NO >=", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoLessThan(String value) {
            addCriterion("COMMUITY_NO <", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoLessThanOrEqualTo(String value) {
            addCriterion("COMMUITY_NO <=", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoLike(String value) {
            addCriterion("COMMUITY_NO like", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoNotLike(String value) {
            addCriterion("COMMUITY_NO not like", value, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoIn(List<String> values) {
            addCriterion("COMMUITY_NO in", values, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoNotIn(List<String> values) {
            addCriterion("COMMUITY_NO not in", values, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoBetween(String value1, String value2) {
            addCriterion("COMMUITY_NO between", value1, value2, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNoNotBetween(String value1, String value2) {
            addCriterion("COMMUITY_NO not between", value1, value2, "commuityNo");
            return (Criteria) this;
        }

        public Criteria andCommuityNameIsNull() {
            addCriterion("COMMUITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommuityNameIsNotNull() {
            addCriterion("COMMUITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommuityNameEqualTo(String value) {
            addCriterion("COMMUITY_NAME =", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameNotEqualTo(String value) {
            addCriterion("COMMUITY_NAME <>", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameGreaterThan(String value) {
            addCriterion("COMMUITY_NAME >", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUITY_NAME >=", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameLessThan(String value) {
            addCriterion("COMMUITY_NAME <", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameLessThanOrEqualTo(String value) {
            addCriterion("COMMUITY_NAME <=", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameLike(String value) {
            addCriterion("COMMUITY_NAME like", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameNotLike(String value) {
            addCriterion("COMMUITY_NAME not like", value, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameIn(List<String> values) {
            addCriterion("COMMUITY_NAME in", values, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameNotIn(List<String> values) {
            addCriterion("COMMUITY_NAME not in", values, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameBetween(String value1, String value2) {
            addCriterion("COMMUITY_NAME between", value1, value2, "commuityName");
            return (Criteria) this;
        }

        public Criteria andCommuityNameNotBetween(String value1, String value2) {
            addCriterion("COMMUITY_NAME not between", value1, value2, "commuityName");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNull() {
            addCriterion("COUNTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("COUNTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(String value) {
            addCriterion("COUNTY_CODE =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(String value) {
            addCriterion("COUNTY_CODE <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(String value) {
            addCriterion("COUNTY_CODE >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY_CODE >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(String value) {
            addCriterion("COUNTY_CODE <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("COUNTY_CODE <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLike(String value) {
            addCriterion("COUNTY_CODE like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotLike(String value) {
            addCriterion("COUNTY_CODE not like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(List<String> values) {
            addCriterion("COUNTY_CODE in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(List<String> values) {
            addCriterion("COUNTY_CODE not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(String value1, String value2) {
            addCriterion("COUNTY_CODE between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(String value1, String value2) {
            addCriterion("COUNTY_CODE not between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIsNull() {
            addCriterion("STREET_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIsNotNull() {
            addCriterion("STREET_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStreetCodeEqualTo(String value) {
            addCriterion("STREET_CODE =", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotEqualTo(String value) {
            addCriterion("STREET_CODE <>", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeGreaterThan(String value) {
            addCriterion("STREET_CODE >", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STREET_CODE >=", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLessThan(String value) {
            addCriterion("STREET_CODE <", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLessThanOrEqualTo(String value) {
            addCriterion("STREET_CODE <=", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLike(String value) {
            addCriterion("STREET_CODE like", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotLike(String value) {
            addCriterion("STREET_CODE not like", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIn(List<String> values) {
            addCriterion("STREET_CODE in", values, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotIn(List<String> values) {
            addCriterion("STREET_CODE not in", values, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeBetween(String value1, String value2) {
            addCriterion("STREET_CODE between", value1, value2, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotBetween(String value1, String value2) {
            addCriterion("STREET_CODE not between", value1, value2, "streetCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeIsNull() {
            addCriterion("VILLAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVillageCodeIsNotNull() {
            addCriterion("VILLAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVillageCodeEqualTo(String value) {
            addCriterion("VILLAGE_CODE =", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeNotEqualTo(String value) {
            addCriterion("VILLAGE_CODE <>", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeGreaterThan(String value) {
            addCriterion("VILLAGE_CODE >", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_CODE >=", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeLessThan(String value) {
            addCriterion("VILLAGE_CODE <", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_CODE <=", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeLike(String value) {
            addCriterion("VILLAGE_CODE like", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeNotLike(String value) {
            addCriterion("VILLAGE_CODE not like", value, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeIn(List<String> values) {
            addCriterion("VILLAGE_CODE in", values, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeNotIn(List<String> values) {
            addCriterion("VILLAGE_CODE not in", values, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeBetween(String value1, String value2) {
            addCriterion("VILLAGE_CODE between", value1, value2, "villageCode");
            return (Criteria) this;
        }

        public Criteria andVillageCodeNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_CODE not between", value1, value2, "villageCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeIsNull() {
            addCriterion("ROAD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRoadCodeIsNotNull() {
            addCriterion("ROAD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRoadCodeEqualTo(String value) {
            addCriterion("ROAD_CODE =", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeNotEqualTo(String value) {
            addCriterion("ROAD_CODE <>", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeGreaterThan(String value) {
            addCriterion("ROAD_CODE >", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROAD_CODE >=", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeLessThan(String value) {
            addCriterion("ROAD_CODE <", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeLessThanOrEqualTo(String value) {
            addCriterion("ROAD_CODE <=", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeLike(String value) {
            addCriterion("ROAD_CODE like", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeNotLike(String value) {
            addCriterion("ROAD_CODE not like", value, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeIn(List<String> values) {
            addCriterion("ROAD_CODE in", values, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeNotIn(List<String> values) {
            addCriterion("ROAD_CODE not in", values, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeBetween(String value1, String value2) {
            addCriterion("ROAD_CODE between", value1, value2, "roadCode");
            return (Criteria) this;
        }

        public Criteria andRoadCodeNotBetween(String value1, String value2) {
            addCriterion("ROAD_CODE not between", value1, value2, "roadCode");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrIsNull() {
            addCriterion("COMMUITY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrIsNotNull() {
            addCriterion("COMMUITY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrEqualTo(String value) {
            addCriterion("COMMUITY_ADDR =", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrNotEqualTo(String value) {
            addCriterion("COMMUITY_ADDR <>", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrGreaterThan(String value) {
            addCriterion("COMMUITY_ADDR >", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUITY_ADDR >=", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrLessThan(String value) {
            addCriterion("COMMUITY_ADDR <", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrLessThanOrEqualTo(String value) {
            addCriterion("COMMUITY_ADDR <=", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrLike(String value) {
            addCriterion("COMMUITY_ADDR like", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrNotLike(String value) {
            addCriterion("COMMUITY_ADDR not like", value, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrIn(List<String> values) {
            addCriterion("COMMUITY_ADDR in", values, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrNotIn(List<String> values) {
            addCriterion("COMMUITY_ADDR not in", values, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrBetween(String value1, String value2) {
            addCriterion("COMMUITY_ADDR between", value1, value2, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andCommuityAddrNotBetween(String value1, String value2) {
            addCriterion("COMMUITY_ADDR not between", value1, value2, "commuityAddr");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("ORG_NO =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("ORG_NO <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("ORG_NO >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NO >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("ORG_NO <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("ORG_NO <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("ORG_NO like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("ORG_NO not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("ORG_NO in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("ORG_NO not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("ORG_NO between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("ORG_NO not between", value1, value2, "orgNo");
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