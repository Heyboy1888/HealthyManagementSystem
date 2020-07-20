package xkt.personal.mgmt.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCHealthCompanyApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCHealthCompanyApplyExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andBrightCardCodeIsNull() {
            addCriterion("bright_card_code is null");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeIsNotNull() {
            addCriterion("bright_card_code is not null");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeEqualTo(String value) {
            addCriterion("bright_card_code =", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeNotEqualTo(String value) {
            addCriterion("bright_card_code <>", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeGreaterThan(String value) {
            addCriterion("bright_card_code >", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bright_card_code >=", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeLessThan(String value) {
            addCriterion("bright_card_code <", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeLessThanOrEqualTo(String value) {
            addCriterion("bright_card_code <=", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeLike(String value) {
            addCriterion("bright_card_code like", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeNotLike(String value) {
            addCriterion("bright_card_code not like", value, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeIn(List<String> values) {
            addCriterion("bright_card_code in", values, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeNotIn(List<String> values) {
            addCriterion("bright_card_code not in", values, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeBetween(String value1, String value2) {
            addCriterion("bright_card_code between", value1, value2, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andBrightCardCodeNotBetween(String value1, String value2) {
            addCriterion("bright_card_code not between", value1, value2, "brightCardCode");
            return (Criteria) this;
        }

        public Criteria andIsBranchIsNull() {
            addCriterion("is_branch is null");
            return (Criteria) this;
        }

        public Criteria andIsBranchIsNotNull() {
            addCriterion("is_branch is not null");
            return (Criteria) this;
        }

        public Criteria andIsBranchEqualTo(String value) {
            addCriterion("is_branch =", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotEqualTo(String value) {
            addCriterion("is_branch <>", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchGreaterThan(String value) {
            addCriterion("is_branch >", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchGreaterThanOrEqualTo(String value) {
            addCriterion("is_branch >=", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchLessThan(String value) {
            addCriterion("is_branch <", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchLessThanOrEqualTo(String value) {
            addCriterion("is_branch <=", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchLike(String value) {
            addCriterion("is_branch like", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotLike(String value) {
            addCriterion("is_branch not like", value, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchIn(List<String> values) {
            addCriterion("is_branch in", values, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotIn(List<String> values) {
            addCriterion("is_branch not in", values, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchBetween(String value1, String value2) {
            addCriterion("is_branch between", value1, value2, "isBranch");
            return (Criteria) this;
        }

        public Criteria andIsBranchNotBetween(String value1, String value2) {
            addCriterion("is_branch not between", value1, value2, "isBranch");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameIsNull() {
            addCriterion("parent_info_name is null");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameIsNotNull() {
            addCriterion("parent_info_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameEqualTo(String value) {
            addCriterion("parent_info_name =", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameNotEqualTo(String value) {
            addCriterion("parent_info_name <>", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameGreaterThan(String value) {
            addCriterion("parent_info_name >", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_info_name >=", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameLessThan(String value) {
            addCriterion("parent_info_name <", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameLessThanOrEqualTo(String value) {
            addCriterion("parent_info_name <=", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameLike(String value) {
            addCriterion("parent_info_name like", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameNotLike(String value) {
            addCriterion("parent_info_name not like", value, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameIn(List<String> values) {
            addCriterion("parent_info_name in", values, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameNotIn(List<String> values) {
            addCriterion("parent_info_name not in", values, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameBetween(String value1, String value2) {
            addCriterion("parent_info_name between", value1, value2, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoNameNotBetween(String value1, String value2) {
            addCriterion("parent_info_name not between", value1, value2, "parentInfoName");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeIsNull() {
            addCriterion("parent_info_code is null");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeIsNotNull() {
            addCriterion("parent_info_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeEqualTo(String value) {
            addCriterion("parent_info_code =", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeNotEqualTo(String value) {
            addCriterion("parent_info_code <>", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeGreaterThan(String value) {
            addCriterion("parent_info_code >", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_info_code >=", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeLessThan(String value) {
            addCriterion("parent_info_code <", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_info_code <=", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeLike(String value) {
            addCriterion("parent_info_code like", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeNotLike(String value) {
            addCriterion("parent_info_code not like", value, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeIn(List<String> values) {
            addCriterion("parent_info_code in", values, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeNotIn(List<String> values) {
            addCriterion("parent_info_code not in", values, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeBetween(String value1, String value2) {
            addCriterion("parent_info_code between", value1, value2, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andParentInfoCodeNotBetween(String value1, String value2) {
            addCriterion("parent_info_code not between", value1, value2, "parentInfoCode");
            return (Criteria) this;
        }

        public Criteria andBranchLevelIsNull() {
            addCriterion("branch_level is null");
            return (Criteria) this;
        }

        public Criteria andBranchLevelIsNotNull() {
            addCriterion("branch_level is not null");
            return (Criteria) this;
        }

        public Criteria andBranchLevelEqualTo(String value) {
            addCriterion("branch_level =", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotEqualTo(String value) {
            addCriterion("branch_level <>", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelGreaterThan(String value) {
            addCriterion("branch_level >", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelGreaterThanOrEqualTo(String value) {
            addCriterion("branch_level >=", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelLessThan(String value) {
            addCriterion("branch_level <", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelLessThanOrEqualTo(String value) {
            addCriterion("branch_level <=", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelLike(String value) {
            addCriterion("branch_level like", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotLike(String value) {
            addCriterion("branch_level not like", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelIn(List<String> values) {
            addCriterion("branch_level in", values, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotIn(List<String> values) {
            addCriterion("branch_level not in", values, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelBetween(String value1, String value2) {
            addCriterion("branch_level between", value1, value2, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotBetween(String value1, String value2) {
            addCriterion("branch_level not between", value1, value2, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andExternalNameIsNull() {
            addCriterion("external_name is null");
            return (Criteria) this;
        }

        public Criteria andExternalNameIsNotNull() {
            addCriterion("external_name is not null");
            return (Criteria) this;
        }

        public Criteria andExternalNameEqualTo(String value) {
            addCriterion("external_name =", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotEqualTo(String value) {
            addCriterion("external_name <>", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameGreaterThan(String value) {
            addCriterion("external_name >", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("external_name >=", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameLessThan(String value) {
            addCriterion("external_name <", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameLessThanOrEqualTo(String value) {
            addCriterion("external_name <=", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameLike(String value) {
            addCriterion("external_name like", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotLike(String value) {
            addCriterion("external_name not like", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameIn(List<String> values) {
            addCriterion("external_name in", values, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotIn(List<String> values) {
            addCriterion("external_name not in", values, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameBetween(String value1, String value2) {
            addCriterion("external_name between", value1, value2, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotBetween(String value1, String value2) {
            addCriterion("external_name not between", value1, value2, "externalName");
            return (Criteria) this;
        }

        public Criteria andIndustryCatIsNull() {
            addCriterion("industry_cat is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCatIsNotNull() {
            addCriterion("industry_cat is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCatEqualTo(String value) {
            addCriterion("industry_cat =", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatNotEqualTo(String value) {
            addCriterion("industry_cat <>", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatGreaterThan(String value) {
            addCriterion("industry_cat >", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatGreaterThanOrEqualTo(String value) {
            addCriterion("industry_cat >=", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatLessThan(String value) {
            addCriterion("industry_cat <", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatLessThanOrEqualTo(String value) {
            addCriterion("industry_cat <=", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatLike(String value) {
            addCriterion("industry_cat like", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatNotLike(String value) {
            addCriterion("industry_cat not like", value, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatIn(List<String> values) {
            addCriterion("industry_cat in", values, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatNotIn(List<String> values) {
            addCriterion("industry_cat not in", values, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatBetween(String value1, String value2) {
            addCriterion("industry_cat between", value1, value2, "industryCat");
            return (Criteria) this;
        }

        public Criteria andIndustryCatNotBetween(String value1, String value2) {
            addCriterion("industry_cat not between", value1, value2, "industryCat");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(String value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(String value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(String value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(String value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(String value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLike(String value) {
            addCriterion("address_id like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotLike(String value) {
            addCriterion("address_id not like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<String> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<String> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(String value1, String value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(String value1, String value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andActualNameIsNull() {
            addCriterion("actual_name is null");
            return (Criteria) this;
        }

        public Criteria andActualNameIsNotNull() {
            addCriterion("actual_name is not null");
            return (Criteria) this;
        }

        public Criteria andActualNameEqualTo(String value) {
            addCriterion("actual_name =", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotEqualTo(String value) {
            addCriterion("actual_name <>", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameGreaterThan(String value) {
            addCriterion("actual_name >", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameGreaterThanOrEqualTo(String value) {
            addCriterion("actual_name >=", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameLessThan(String value) {
            addCriterion("actual_name <", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameLessThanOrEqualTo(String value) {
            addCriterion("actual_name <=", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameLike(String value) {
            addCriterion("actual_name like", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotLike(String value) {
            addCriterion("actual_name not like", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameIn(List<String> values) {
            addCriterion("actual_name in", values, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotIn(List<String> values) {
            addCriterion("actual_name not in", values, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameBetween(String value1, String value2) {
            addCriterion("actual_name between", value1, value2, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotBetween(String value1, String value2) {
            addCriterion("actual_name not between", value1, value2, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeIsNull() {
            addCriterion("actual_cert_code is null");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeIsNotNull() {
            addCriterion("actual_cert_code is not null");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeEqualTo(String value) {
            addCriterion("actual_cert_code =", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeNotEqualTo(String value) {
            addCriterion("actual_cert_code <>", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeGreaterThan(String value) {
            addCriterion("actual_cert_code >", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_cert_code >=", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeLessThan(String value) {
            addCriterion("actual_cert_code <", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeLessThanOrEqualTo(String value) {
            addCriterion("actual_cert_code <=", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeLike(String value) {
            addCriterion("actual_cert_code like", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeNotLike(String value) {
            addCriterion("actual_cert_code not like", value, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeIn(List<String> values) {
            addCriterion("actual_cert_code in", values, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeNotIn(List<String> values) {
            addCriterion("actual_cert_code not in", values, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeBetween(String value1, String value2) {
            addCriterion("actual_cert_code between", value1, value2, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeNotBetween(String value1, String value2) {
            addCriterion("actual_cert_code not between", value1, value2, "actualCertCode");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideIsNull() {
            addCriterion("actual_cert_code_hide is null");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideIsNotNull() {
            addCriterion("actual_cert_code_hide is not null");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideEqualTo(String value) {
            addCriterion("actual_cert_code_hide =", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideNotEqualTo(String value) {
            addCriterion("actual_cert_code_hide <>", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideGreaterThan(String value) {
            addCriterion("actual_cert_code_hide >", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideGreaterThanOrEqualTo(String value) {
            addCriterion("actual_cert_code_hide >=", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideLessThan(String value) {
            addCriterion("actual_cert_code_hide <", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideLessThanOrEqualTo(String value) {
            addCriterion("actual_cert_code_hide <=", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideLike(String value) {
            addCriterion("actual_cert_code_hide like", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideNotLike(String value) {
            addCriterion("actual_cert_code_hide not like", value, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideIn(List<String> values) {
            addCriterion("actual_cert_code_hide in", values, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideNotIn(List<String> values) {
            addCriterion("actual_cert_code_hide not in", values, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideBetween(String value1, String value2) {
            addCriterion("actual_cert_code_hide between", value1, value2, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeHideNotBetween(String value1, String value2) {
            addCriterion("actual_cert_code_hide not between", value1, value2, "actualCertCodeHide");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretIsNull() {
            addCriterion("actual_cert_code_secret is null");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretIsNotNull() {
            addCriterion("actual_cert_code_secret is not null");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretEqualTo(String value) {
            addCriterion("actual_cert_code_secret =", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretNotEqualTo(String value) {
            addCriterion("actual_cert_code_secret <>", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretGreaterThan(String value) {
            addCriterion("actual_cert_code_secret >", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretGreaterThanOrEqualTo(String value) {
            addCriterion("actual_cert_code_secret >=", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretLessThan(String value) {
            addCriterion("actual_cert_code_secret <", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretLessThanOrEqualTo(String value) {
            addCriterion("actual_cert_code_secret <=", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretLike(String value) {
            addCriterion("actual_cert_code_secret like", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretNotLike(String value) {
            addCriterion("actual_cert_code_secret not like", value, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretIn(List<String> values) {
            addCriterion("actual_cert_code_secret in", values, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretNotIn(List<String> values) {
            addCriterion("actual_cert_code_secret not in", values, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretBetween(String value1, String value2) {
            addCriterion("actual_cert_code_secret between", value1, value2, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualCertCodeSecretNotBetween(String value1, String value2) {
            addCriterion("actual_cert_code_secret not between", value1, value2, "actualCertCodeSecret");
            return (Criteria) this;
        }

        public Criteria andActualMobileIsNull() {
            addCriterion("actual_mobile is null");
            return (Criteria) this;
        }

        public Criteria andActualMobileIsNotNull() {
            addCriterion("actual_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andActualMobileEqualTo(String value) {
            addCriterion("actual_mobile =", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileNotEqualTo(String value) {
            addCriterion("actual_mobile <>", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileGreaterThan(String value) {
            addCriterion("actual_mobile >", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileGreaterThanOrEqualTo(String value) {
            addCriterion("actual_mobile >=", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileLessThan(String value) {
            addCriterion("actual_mobile <", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileLessThanOrEqualTo(String value) {
            addCriterion("actual_mobile <=", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileLike(String value) {
            addCriterion("actual_mobile like", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileNotLike(String value) {
            addCriterion("actual_mobile not like", value, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileIn(List<String> values) {
            addCriterion("actual_mobile in", values, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileNotIn(List<String> values) {
            addCriterion("actual_mobile not in", values, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileBetween(String value1, String value2) {
            addCriterion("actual_mobile between", value1, value2, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andActualMobileNotBetween(String value1, String value2) {
            addCriterion("actual_mobile not between", value1, value2, "actualMobile");
            return (Criteria) this;
        }

        public Criteria andCertPicIsNull() {
            addCriterion("cert_pic is null");
            return (Criteria) this;
        }

        public Criteria andCertPicIsNotNull() {
            addCriterion("cert_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCertPicEqualTo(String value) {
            addCriterion("cert_pic =", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicNotEqualTo(String value) {
            addCriterion("cert_pic <>", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicGreaterThan(String value) {
            addCriterion("cert_pic >", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicGreaterThanOrEqualTo(String value) {
            addCriterion("cert_pic >=", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicLessThan(String value) {
            addCriterion("cert_pic <", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicLessThanOrEqualTo(String value) {
            addCriterion("cert_pic <=", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicLike(String value) {
            addCriterion("cert_pic like", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicNotLike(String value) {
            addCriterion("cert_pic not like", value, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicIn(List<String> values) {
            addCriterion("cert_pic in", values, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicNotIn(List<String> values) {
            addCriterion("cert_pic not in", values, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicBetween(String value1, String value2) {
            addCriterion("cert_pic between", value1, value2, "certPic");
            return (Criteria) this;
        }

        public Criteria andCertPicNotBetween(String value1, String value2) {
            addCriterion("cert_pic not between", value1, value2, "certPic");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNull() {
            addCriterion("store_pic is null");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNotNull() {
            addCriterion("store_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStorePicEqualTo(String value) {
            addCriterion("store_pic =", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotEqualTo(String value) {
            addCriterion("store_pic <>", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThan(String value) {
            addCriterion("store_pic >", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThanOrEqualTo(String value) {
            addCriterion("store_pic >=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThan(String value) {
            addCriterion("store_pic <", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThanOrEqualTo(String value) {
            addCriterion("store_pic <=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLike(String value) {
            addCriterion("store_pic like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotLike(String value) {
            addCriterion("store_pic not like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicIn(List<String> values) {
            addCriterion("store_pic in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotIn(List<String> values) {
            addCriterion("store_pic not in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicBetween(String value1, String value2) {
            addCriterion("store_pic between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotBetween(String value1, String value2) {
            addCriterion("store_pic not between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andBusPicIsNull() {
            addCriterion("bus_pic is null");
            return (Criteria) this;
        }

        public Criteria andBusPicIsNotNull() {
            addCriterion("bus_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBusPicEqualTo(String value) {
            addCriterion("bus_pic =", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotEqualTo(String value) {
            addCriterion("bus_pic <>", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicGreaterThan(String value) {
            addCriterion("bus_pic >", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicGreaterThanOrEqualTo(String value) {
            addCriterion("bus_pic >=", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicLessThan(String value) {
            addCriterion("bus_pic <", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicLessThanOrEqualTo(String value) {
            addCriterion("bus_pic <=", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicLike(String value) {
            addCriterion("bus_pic like", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotLike(String value) {
            addCriterion("bus_pic not like", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicIn(List<String> values) {
            addCriterion("bus_pic in", values, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotIn(List<String> values) {
            addCriterion("bus_pic not in", values, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicBetween(String value1, String value2) {
            addCriterion("bus_pic between", value1, value2, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotBetween(String value1, String value2) {
            addCriterion("bus_pic not between", value1, value2, "busPic");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("check_status like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("check_status not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckReasonIsNull() {
            addCriterion("check_reason is null");
            return (Criteria) this;
        }

        public Criteria andCheckReasonIsNotNull() {
            addCriterion("check_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCheckReasonEqualTo(String value) {
            addCriterion("check_reason =", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotEqualTo(String value) {
            addCriterion("check_reason <>", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonGreaterThan(String value) {
            addCriterion("check_reason >", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonGreaterThanOrEqualTo(String value) {
            addCriterion("check_reason >=", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonLessThan(String value) {
            addCriterion("check_reason <", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonLessThanOrEqualTo(String value) {
            addCriterion("check_reason <=", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonLike(String value) {
            addCriterion("check_reason like", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotLike(String value) {
            addCriterion("check_reason not like", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonIn(List<String> values) {
            addCriterion("check_reason in", values, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotIn(List<String> values) {
            addCriterion("check_reason not in", values, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonBetween(String value1, String value2) {
            addCriterion("check_reason between", value1, value2, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotBetween(String value1, String value2) {
            addCriterion("check_reason not between", value1, value2, "checkReason");
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