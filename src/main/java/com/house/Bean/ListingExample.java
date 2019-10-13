package com.house.Bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ListingExample() {
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

        public Criteria andListingIdIsNull() {
            addCriterion("Listing_id is null");
            return (Criteria) this;
        }

        public Criteria andListingIdIsNotNull() {
            addCriterion("Listing_id is not null");
            return (Criteria) this;
        }

        public Criteria andListingIdEqualTo(String value) {
            addCriterion("Listing_id =", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdNotEqualTo(String value) {
            addCriterion("Listing_id <>", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdGreaterThan(String value) {
            addCriterion("Listing_id >", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdGreaterThanOrEqualTo(String value) {
            addCriterion("Listing_id >=", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdLessThan(String value) {
            addCriterion("Listing_id <", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdLessThanOrEqualTo(String value) {
            addCriterion("Listing_id <=", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdLike(String value) {
            addCriterion("Listing_id like", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdNotLike(String value) {
            addCriterion("Listing_id not like", value, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdIn(List<String> values) {
            addCriterion("Listing_id in", values, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdNotIn(List<String> values) {
            addCriterion("Listing_id not in", values, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdBetween(String value1, String value2) {
            addCriterion("Listing_id between", value1, value2, "listingId");
            return (Criteria) this;
        }

        public Criteria andListingIdNotBetween(String value1, String value2) {
            addCriterion("Listing_id not between", value1, value2, "listingId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
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

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andHouseManageIsNull() {
            addCriterion("house_manage is null");
            return (Criteria) this;
        }

        public Criteria andHouseManageIsNotNull() {
            addCriterion("house_manage is not null");
            return (Criteria) this;
        }

        public Criteria andHouseManageEqualTo(String value) {
            addCriterion("house_manage =", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageNotEqualTo(String value) {
            addCriterion("house_manage <>", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageGreaterThan(String value) {
            addCriterion("house_manage >", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageGreaterThanOrEqualTo(String value) {
            addCriterion("house_manage >=", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageLessThan(String value) {
            addCriterion("house_manage <", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageLessThanOrEqualTo(String value) {
            addCriterion("house_manage <=", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageLike(String value) {
            addCriterion("house_manage like", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageNotLike(String value) {
            addCriterion("house_manage not like", value, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageIn(List<String> values) {
            addCriterion("house_manage in", values, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageNotIn(List<String> values) {
            addCriterion("house_manage not in", values, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageBetween(String value1, String value2) {
            addCriterion("house_manage between", value1, value2, "houseManage");
            return (Criteria) this;
        }

        public Criteria andHouseManageNotBetween(String value1, String value2) {
            addCriterion("house_manage not between", value1, value2, "houseManage");
            return (Criteria) this;
        }

        public Criteria andSecretarialIsNull() {
            addCriterion("Secretarial is null");
            return (Criteria) this;
        }

        public Criteria andSecretarialIsNotNull() {
            addCriterion("Secretarial is not null");
            return (Criteria) this;
        }

        public Criteria andSecretarialEqualTo(String value) {
            addCriterion("Secretarial =", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialNotEqualTo(String value) {
            addCriterion("Secretarial <>", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialGreaterThan(String value) {
            addCriterion("Secretarial >", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialGreaterThanOrEqualTo(String value) {
            addCriterion("Secretarial >=", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialLessThan(String value) {
            addCriterion("Secretarial <", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialLessThanOrEqualTo(String value) {
            addCriterion("Secretarial <=", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialLike(String value) {
            addCriterion("Secretarial like", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialNotLike(String value) {
            addCriterion("Secretarial not like", value, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialIn(List<String> values) {
            addCriterion("Secretarial in", values, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialNotIn(List<String> values) {
            addCriterion("Secretarial not in", values, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialBetween(String value1, String value2) {
            addCriterion("Secretarial between", value1, value2, "secretarial");
            return (Criteria) this;
        }

        public Criteria andSecretarialNotBetween(String value1, String value2) {
            addCriterion("Secretarial not between", value1, value2, "secretarial");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNull() {
            addCriterion("elevator is null");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNotNull() {
            addCriterion("elevator is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorEqualTo(String value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(String value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(String value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(String value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(String value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(String value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLike(String value) {
            addCriterion("elevator like", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotLike(String value) {
            addCriterion("elevator not like", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<String> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<String> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(String value1, String value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(String value1, String value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andAcreageIsNull() {
            addCriterion("acreage is null");
            return (Criteria) this;
        }

        public Criteria andAcreageIsNotNull() {
            addCriterion("acreage is not null");
            return (Criteria) this;
        }

        public Criteria andAcreageEqualTo(String value) {
            addCriterion("acreage =", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotEqualTo(String value) {
            addCriterion("acreage <>", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageGreaterThan(String value) {
            addCriterion("acreage >", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageGreaterThanOrEqualTo(String value) {
            addCriterion("acreage >=", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLessThan(String value) {
            addCriterion("acreage <", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLessThanOrEqualTo(String value) {
            addCriterion("acreage <=", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLike(String value) {
            addCriterion("acreage like", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotLike(String value) {
            addCriterion("acreage not like", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageIn(List<String> values) {
            addCriterion("acreage in", values, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotIn(List<String> values) {
            addCriterion("acreage not in", values, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageBetween(String value1, String value2) {
            addCriterion("acreage between", value1, value2, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotBetween(String value1, String value2) {
            addCriterion("acreage not between", value1, value2, "acreage");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeEqualTo(String value) {
            addCriterion("borrow_type =", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotEqualTo(String value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThan(String value) {
            addCriterion("borrow_type >", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThan(String value) {
            addCriterion("borrow_type <", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(String value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLike(String value) {
            addCriterion("borrow_type like", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotLike(String value) {
            addCriterion("borrow_type not like", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIn(List<String> values) {
            addCriterion("borrow_type in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotIn(List<String> values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeBetween(String value1, String value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotBetween(String value1, String value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgIsNull() {
            addCriterion("Free_rent_msg is null");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgIsNotNull() {
            addCriterion("Free_rent_msg is not null");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgEqualTo(String value) {
            addCriterion("Free_rent_msg =", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgNotEqualTo(String value) {
            addCriterion("Free_rent_msg <>", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgGreaterThan(String value) {
            addCriterion("Free_rent_msg >", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgGreaterThanOrEqualTo(String value) {
            addCriterion("Free_rent_msg >=", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgLessThan(String value) {
            addCriterion("Free_rent_msg <", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgLessThanOrEqualTo(String value) {
            addCriterion("Free_rent_msg <=", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgLike(String value) {
            addCriterion("Free_rent_msg like", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgNotLike(String value) {
            addCriterion("Free_rent_msg not like", value, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgIn(List<String> values) {
            addCriterion("Free_rent_msg in", values, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgNotIn(List<String> values) {
            addCriterion("Free_rent_msg not in", values, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgBetween(String value1, String value2) {
            addCriterion("Free_rent_msg between", value1, value2, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andFreeRentMsgNotBetween(String value1, String value2) {
            addCriterion("Free_rent_msg not between", value1, value2, "freeRentMsg");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(BigDecimal value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(BigDecimal value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(BigDecimal value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(BigDecimal value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<BigDecimal> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<BigDecimal> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIsNull() {
            addCriterion("owner_phone is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIsNotNull() {
            addCriterion("owner_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneEqualTo(String value) {
            addCriterion("owner_phone =", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotEqualTo(String value) {
            addCriterion("owner_phone <>", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneGreaterThan(String value) {
            addCriterion("owner_phone >", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("owner_phone >=", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLessThan(String value) {
            addCriterion("owner_phone <", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLessThanOrEqualTo(String value) {
            addCriterion("owner_phone <=", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLike(String value) {
            addCriterion("owner_phone like", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotLike(String value) {
            addCriterion("owner_phone not like", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIn(List<String> values) {
            addCriterion("owner_phone in", values, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotIn(List<String> values) {
            addCriterion("owner_phone not in", values, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneBetween(String value1, String value2) {
            addCriterion("owner_phone between", value1, value2, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotBetween(String value1, String value2) {
            addCriterion("owner_phone not between", value1, value2, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIsNull() {
            addCriterion("owner_card is null");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIsNotNull() {
            addCriterion("owner_card is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerCardEqualTo(String value) {
            addCriterion("owner_card =", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardNotEqualTo(String value) {
            addCriterion("owner_card <>", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardGreaterThan(String value) {
            addCriterion("owner_card >", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardGreaterThanOrEqualTo(String value) {
            addCriterion("owner_card >=", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardLessThan(String value) {
            addCriterion("owner_card <", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardLessThanOrEqualTo(String value) {
            addCriterion("owner_card <=", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardLike(String value) {
            addCriterion("owner_card like", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardNotLike(String value) {
            addCriterion("owner_card not like", value, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIn(List<String> values) {
            addCriterion("owner_card in", values, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardNotIn(List<String> values) {
            addCriterion("owner_card not in", values, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardBetween(String value1, String value2) {
            addCriterion("owner_card between", value1, value2, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andOwnerCardNotBetween(String value1, String value2) {
            addCriterion("owner_card not between", value1, value2, "ownerCard");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1IsNull() {
            addCriterion("payment_style1 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1IsNotNull() {
            addCriterion("payment_style1 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1EqualTo(String value) {
            addCriterion("payment_style1 =", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1NotEqualTo(String value) {
            addCriterion("payment_style1 <>", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1GreaterThan(String value) {
            addCriterion("payment_style1 >", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1GreaterThanOrEqualTo(String value) {
            addCriterion("payment_style1 >=", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1LessThan(String value) {
            addCriterion("payment_style1 <", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1LessThanOrEqualTo(String value) {
            addCriterion("payment_style1 <=", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1Like(String value) {
            addCriterion("payment_style1 like", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1NotLike(String value) {
            addCriterion("payment_style1 not like", value, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1In(List<String> values) {
            addCriterion("payment_style1 in", values, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1NotIn(List<String> values) {
            addCriterion("payment_style1 not in", values, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1Between(String value1, String value2) {
            addCriterion("payment_style1 between", value1, value2, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentStyle1NotBetween(String value1, String value2) {
            addCriterion("payment_style1 not between", value1, value2, "paymentStyle1");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgIsNull() {
            addCriterion("payment_msg is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgIsNotNull() {
            addCriterion("payment_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgEqualTo(String value) {
            addCriterion("payment_msg =", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgNotEqualTo(String value) {
            addCriterion("payment_msg <>", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgGreaterThan(String value) {
            addCriterion("payment_msg >", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgGreaterThanOrEqualTo(String value) {
            addCriterion("payment_msg >=", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgLessThan(String value) {
            addCriterion("payment_msg <", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgLessThanOrEqualTo(String value) {
            addCriterion("payment_msg <=", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgLike(String value) {
            addCriterion("payment_msg like", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgNotLike(String value) {
            addCriterion("payment_msg not like", value, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgIn(List<String> values) {
            addCriterion("payment_msg in", values, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgNotIn(List<String> values) {
            addCriterion("payment_msg not in", values, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgBetween(String value1, String value2) {
            addCriterion("payment_msg between", value1, value2, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andPaymentMsgNotBetween(String value1, String value2) {
            addCriterion("payment_msg not between", value1, value2, "paymentMsg");
            return (Criteria) this;
        }

        public Criteria andWaterCardIsNull() {
            addCriterion("water_card is null");
            return (Criteria) this;
        }

        public Criteria andWaterCardIsNotNull() {
            addCriterion("water_card is not null");
            return (Criteria) this;
        }

        public Criteria andWaterCardEqualTo(String value) {
            addCriterion("water_card =", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardNotEqualTo(String value) {
            addCriterion("water_card <>", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardGreaterThan(String value) {
            addCriterion("water_card >", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardGreaterThanOrEqualTo(String value) {
            addCriterion("water_card >=", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardLessThan(String value) {
            addCriterion("water_card <", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardLessThanOrEqualTo(String value) {
            addCriterion("water_card <=", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardLike(String value) {
            addCriterion("water_card like", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardNotLike(String value) {
            addCriterion("water_card not like", value, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardIn(List<String> values) {
            addCriterion("water_card in", values, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardNotIn(List<String> values) {
            addCriterion("water_card not in", values, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardBetween(String value1, String value2) {
            addCriterion("water_card between", value1, value2, "waterCard");
            return (Criteria) this;
        }

        public Criteria andWaterCardNotBetween(String value1, String value2) {
            addCriterion("water_card not between", value1, value2, "waterCard");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterIsNull() {
            addCriterion("payment_cycle_water is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterIsNotNull() {
            addCriterion("payment_cycle_water is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterEqualTo(String value) {
            addCriterion("payment_cycle_water =", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterNotEqualTo(String value) {
            addCriterion("payment_cycle_water <>", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterGreaterThan(String value) {
            addCriterion("payment_cycle_water >", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterGreaterThanOrEqualTo(String value) {
            addCriterion("payment_cycle_water >=", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterLessThan(String value) {
            addCriterion("payment_cycle_water <", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterLessThanOrEqualTo(String value) {
            addCriterion("payment_cycle_water <=", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterLike(String value) {
            addCriterion("payment_cycle_water like", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterNotLike(String value) {
            addCriterion("payment_cycle_water not like", value, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterIn(List<String> values) {
            addCriterion("payment_cycle_water in", values, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterNotIn(List<String> values) {
            addCriterion("payment_cycle_water not in", values, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterBetween(String value1, String value2) {
            addCriterion("payment_cycle_water between", value1, value2, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleWaterNotBetween(String value1, String value2) {
            addCriterion("payment_cycle_water not between", value1, value2, "paymentCycleWater");
            return (Criteria) this;
        }

        public Criteria andWaterDayIsNull() {
            addCriterion("water_day is null");
            return (Criteria) this;
        }

        public Criteria andWaterDayIsNotNull() {
            addCriterion("water_day is not null");
            return (Criteria) this;
        }

        public Criteria andWaterDayEqualTo(String value) {
            addCriterion("water_day =", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayNotEqualTo(String value) {
            addCriterion("water_day <>", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayGreaterThan(String value) {
            addCriterion("water_day >", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayGreaterThanOrEqualTo(String value) {
            addCriterion("water_day >=", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayLessThan(String value) {
            addCriterion("water_day <", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayLessThanOrEqualTo(String value) {
            addCriterion("water_day <=", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayLike(String value) {
            addCriterion("water_day like", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayNotLike(String value) {
            addCriterion("water_day not like", value, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayIn(List<String> values) {
            addCriterion("water_day in", values, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayNotIn(List<String> values) {
            addCriterion("water_day not in", values, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayBetween(String value1, String value2) {
            addCriterion("water_day between", value1, value2, "waterDay");
            return (Criteria) this;
        }

        public Criteria andWaterDayNotBetween(String value1, String value2) {
            addCriterion("water_day not between", value1, value2, "waterDay");
            return (Criteria) this;
        }

        public Criteria andElectricityCardIsNull() {
            addCriterion("electricity_card is null");
            return (Criteria) this;
        }

        public Criteria andElectricityCardIsNotNull() {
            addCriterion("electricity_card is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityCardEqualTo(String value) {
            addCriterion("electricity_card =", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardNotEqualTo(String value) {
            addCriterion("electricity_card <>", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardGreaterThan(String value) {
            addCriterion("electricity_card >", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardGreaterThanOrEqualTo(String value) {
            addCriterion("electricity_card >=", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardLessThan(String value) {
            addCriterion("electricity_card <", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardLessThanOrEqualTo(String value) {
            addCriterion("electricity_card <=", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardLike(String value) {
            addCriterion("electricity_card like", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardNotLike(String value) {
            addCriterion("electricity_card not like", value, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardIn(List<String> values) {
            addCriterion("electricity_card in", values, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardNotIn(List<String> values) {
            addCriterion("electricity_card not in", values, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardBetween(String value1, String value2) {
            addCriterion("electricity_card between", value1, value2, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andElectricityCardNotBetween(String value1, String value2) {
            addCriterion("electricity_card not between", value1, value2, "electricityCard");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityIsNull() {
            addCriterion("payment_cycle_electricity is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityIsNotNull() {
            addCriterion("payment_cycle_electricity is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityEqualTo(String value) {
            addCriterion("payment_cycle_electricity =", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityNotEqualTo(String value) {
            addCriterion("payment_cycle_electricity <>", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityGreaterThan(String value) {
            addCriterion("payment_cycle_electricity >", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityGreaterThanOrEqualTo(String value) {
            addCriterion("payment_cycle_electricity >=", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityLessThan(String value) {
            addCriterion("payment_cycle_electricity <", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityLessThanOrEqualTo(String value) {
            addCriterion("payment_cycle_electricity <=", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityLike(String value) {
            addCriterion("payment_cycle_electricity like", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityNotLike(String value) {
            addCriterion("payment_cycle_electricity not like", value, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityIn(List<String> values) {
            addCriterion("payment_cycle_electricity in", values, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityNotIn(List<String> values) {
            addCriterion("payment_cycle_electricity not in", values, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityBetween(String value1, String value2) {
            addCriterion("payment_cycle_electricity between", value1, value2, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleElectricityNotBetween(String value1, String value2) {
            addCriterion("payment_cycle_electricity not between", value1, value2, "paymentCycleElectricity");
            return (Criteria) this;
        }

        public Criteria andElectricityDayIsNull() {
            addCriterion("electricity_day is null");
            return (Criteria) this;
        }

        public Criteria andElectricityDayIsNotNull() {
            addCriterion("electricity_day is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityDayEqualTo(String value) {
            addCriterion("electricity_day =", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayNotEqualTo(String value) {
            addCriterion("electricity_day <>", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayGreaterThan(String value) {
            addCriterion("electricity_day >", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayGreaterThanOrEqualTo(String value) {
            addCriterion("electricity_day >=", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayLessThan(String value) {
            addCriterion("electricity_day <", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayLessThanOrEqualTo(String value) {
            addCriterion("electricity_day <=", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayLike(String value) {
            addCriterion("electricity_day like", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayNotLike(String value) {
            addCriterion("electricity_day not like", value, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayIn(List<String> values) {
            addCriterion("electricity_day in", values, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayNotIn(List<String> values) {
            addCriterion("electricity_day not in", values, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayBetween(String value1, String value2) {
            addCriterion("electricity_day between", value1, value2, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andElectricityDayNotBetween(String value1, String value2) {
            addCriterion("electricity_day not between", value1, value2, "electricityDay");
            return (Criteria) this;
        }

        public Criteria andGasCardIsNull() {
            addCriterion("gas_card is null");
            return (Criteria) this;
        }

        public Criteria andGasCardIsNotNull() {
            addCriterion("gas_card is not null");
            return (Criteria) this;
        }

        public Criteria andGasCardEqualTo(String value) {
            addCriterion("gas_card =", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardNotEqualTo(String value) {
            addCriterion("gas_card <>", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardGreaterThan(String value) {
            addCriterion("gas_card >", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardGreaterThanOrEqualTo(String value) {
            addCriterion("gas_card >=", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardLessThan(String value) {
            addCriterion("gas_card <", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardLessThanOrEqualTo(String value) {
            addCriterion("gas_card <=", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardLike(String value) {
            addCriterion("gas_card like", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardNotLike(String value) {
            addCriterion("gas_card not like", value, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardIn(List<String> values) {
            addCriterion("gas_card in", values, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardNotIn(List<String> values) {
            addCriterion("gas_card not in", values, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardBetween(String value1, String value2) {
            addCriterion("gas_card between", value1, value2, "gasCard");
            return (Criteria) this;
        }

        public Criteria andGasCardNotBetween(String value1, String value2) {
            addCriterion("gas_card not between", value1, value2, "gasCard");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasIsNull() {
            addCriterion("payment_cycle_gas is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasIsNotNull() {
            addCriterion("payment_cycle_gas is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasEqualTo(String value) {
            addCriterion("payment_cycle_gas =", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasNotEqualTo(String value) {
            addCriterion("payment_cycle_gas <>", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasGreaterThan(String value) {
            addCriterion("payment_cycle_gas >", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasGreaterThanOrEqualTo(String value) {
            addCriterion("payment_cycle_gas >=", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasLessThan(String value) {
            addCriterion("payment_cycle_gas <", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasLessThanOrEqualTo(String value) {
            addCriterion("payment_cycle_gas <=", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasLike(String value) {
            addCriterion("payment_cycle_gas like", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasNotLike(String value) {
            addCriterion("payment_cycle_gas not like", value, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasIn(List<String> values) {
            addCriterion("payment_cycle_gas in", values, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasNotIn(List<String> values) {
            addCriterion("payment_cycle_gas not in", values, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasBetween(String value1, String value2) {
            addCriterion("payment_cycle_gas between", value1, value2, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGasNotBetween(String value1, String value2) {
            addCriterion("payment_cycle_gas not between", value1, value2, "paymentCycleGas");
            return (Criteria) this;
        }

        public Criteria andGasDayIsNull() {
            addCriterion("gas_day is null");
            return (Criteria) this;
        }

        public Criteria andGasDayIsNotNull() {
            addCriterion("gas_day is not null");
            return (Criteria) this;
        }

        public Criteria andGasDayEqualTo(String value) {
            addCriterion("gas_day =", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayNotEqualTo(String value) {
            addCriterion("gas_day <>", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayGreaterThan(String value) {
            addCriterion("gas_day >", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayGreaterThanOrEqualTo(String value) {
            addCriterion("gas_day >=", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayLessThan(String value) {
            addCriterion("gas_day <", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayLessThanOrEqualTo(String value) {
            addCriterion("gas_day <=", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayLike(String value) {
            addCriterion("gas_day like", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayNotLike(String value) {
            addCriterion("gas_day not like", value, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayIn(List<String> values) {
            addCriterion("gas_day in", values, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayNotIn(List<String> values) {
            addCriterion("gas_day not in", values, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayBetween(String value1, String value2) {
            addCriterion("gas_day between", value1, value2, "gasDay");
            return (Criteria) this;
        }

        public Criteria andGasDayNotBetween(String value1, String value2) {
            addCriterion("gas_day not between", value1, value2, "gasDay");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterIsNull() {
            addCriterion("Transfer_base_water is null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterIsNotNull() {
            addCriterion("Transfer_base_water is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterEqualTo(String value) {
            addCriterion("Transfer_base_water =", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterNotEqualTo(String value) {
            addCriterion("Transfer_base_water <>", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterGreaterThan(String value) {
            addCriterion("Transfer_base_water >", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterGreaterThanOrEqualTo(String value) {
            addCriterion("Transfer_base_water >=", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterLessThan(String value) {
            addCriterion("Transfer_base_water <", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterLessThanOrEqualTo(String value) {
            addCriterion("Transfer_base_water <=", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterLike(String value) {
            addCriterion("Transfer_base_water like", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterNotLike(String value) {
            addCriterion("Transfer_base_water not like", value, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterIn(List<String> values) {
            addCriterion("Transfer_base_water in", values, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterNotIn(List<String> values) {
            addCriterion("Transfer_base_water not in", values, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterBetween(String value1, String value2) {
            addCriterion("Transfer_base_water between", value1, value2, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseWaterNotBetween(String value1, String value2) {
            addCriterion("Transfer_base_water not between", value1, value2, "transferBaseWater");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityIsNull() {
            addCriterion("Transfer_base_electricity is null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityIsNotNull() {
            addCriterion("Transfer_base_electricity is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityEqualTo(String value) {
            addCriterion("Transfer_base_electricity =", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityNotEqualTo(String value) {
            addCriterion("Transfer_base_electricity <>", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityGreaterThan(String value) {
            addCriterion("Transfer_base_electricity >", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityGreaterThanOrEqualTo(String value) {
            addCriterion("Transfer_base_electricity >=", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityLessThan(String value) {
            addCriterion("Transfer_base_electricity <", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityLessThanOrEqualTo(String value) {
            addCriterion("Transfer_base_electricity <=", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityLike(String value) {
            addCriterion("Transfer_base_electricity like", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityNotLike(String value) {
            addCriterion("Transfer_base_electricity not like", value, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityIn(List<String> values) {
            addCriterion("Transfer_base_electricity in", values, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityNotIn(List<String> values) {
            addCriterion("Transfer_base_electricity not in", values, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityBetween(String value1, String value2) {
            addCriterion("Transfer_base_electricity between", value1, value2, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseElectricityNotBetween(String value1, String value2) {
            addCriterion("Transfer_base_electricity not between", value1, value2, "transferBaseElectricity");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasIsNull() {
            addCriterion("Transfer_base_gas is null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasIsNotNull() {
            addCriterion("Transfer_base_gas is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasEqualTo(String value) {
            addCriterion("Transfer_base_gas =", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasNotEqualTo(String value) {
            addCriterion("Transfer_base_gas <>", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasGreaterThan(String value) {
            addCriterion("Transfer_base_gas >", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasGreaterThanOrEqualTo(String value) {
            addCriterion("Transfer_base_gas >=", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasLessThan(String value) {
            addCriterion("Transfer_base_gas <", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasLessThanOrEqualTo(String value) {
            addCriterion("Transfer_base_gas <=", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasLike(String value) {
            addCriterion("Transfer_base_gas like", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasNotLike(String value) {
            addCriterion("Transfer_base_gas not like", value, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasIn(List<String> values) {
            addCriterion("Transfer_base_gas in", values, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasNotIn(List<String> values) {
            addCriterion("Transfer_base_gas not in", values, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasBetween(String value1, String value2) {
            addCriterion("Transfer_base_gas between", value1, value2, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseGasNotBetween(String value1, String value2) {
            addCriterion("Transfer_base_gas not between", value1, value2, "transferBaseGas");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighIsNull() {
            addCriterion("Transfer_base_ele_high is null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighIsNotNull() {
            addCriterion("Transfer_base_ele_high is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighEqualTo(String value) {
            addCriterion("Transfer_base_ele_high =", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighNotEqualTo(String value) {
            addCriterion("Transfer_base_ele_high <>", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighGreaterThan(String value) {
            addCriterion("Transfer_base_ele_high >", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighGreaterThanOrEqualTo(String value) {
            addCriterion("Transfer_base_ele_high >=", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighLessThan(String value) {
            addCriterion("Transfer_base_ele_high <", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighLessThanOrEqualTo(String value) {
            addCriterion("Transfer_base_ele_high <=", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighLike(String value) {
            addCriterion("Transfer_base_ele_high like", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighNotLike(String value) {
            addCriterion("Transfer_base_ele_high not like", value, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighIn(List<String> values) {
            addCriterion("Transfer_base_ele_high in", values, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighNotIn(List<String> values) {
            addCriterion("Transfer_base_ele_high not in", values, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighBetween(String value1, String value2) {
            addCriterion("Transfer_base_ele_high between", value1, value2, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleHighNotBetween(String value1, String value2) {
            addCriterion("Transfer_base_ele_high not between", value1, value2, "transferBaseEleHigh");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowIsNull() {
            addCriterion("Transfer_base_ele_low is null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowIsNotNull() {
            addCriterion("Transfer_base_ele_low is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowEqualTo(String value) {
            addCriterion("Transfer_base_ele_low =", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowNotEqualTo(String value) {
            addCriterion("Transfer_base_ele_low <>", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowGreaterThan(String value) {
            addCriterion("Transfer_base_ele_low >", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowGreaterThanOrEqualTo(String value) {
            addCriterion("Transfer_base_ele_low >=", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowLessThan(String value) {
            addCriterion("Transfer_base_ele_low <", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowLessThanOrEqualTo(String value) {
            addCriterion("Transfer_base_ele_low <=", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowLike(String value) {
            addCriterion("Transfer_base_ele_low like", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowNotLike(String value) {
            addCriterion("Transfer_base_ele_low not like", value, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowIn(List<String> values) {
            addCriterion("Transfer_base_ele_low in", values, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowNotIn(List<String> values) {
            addCriterion("Transfer_base_ele_low not in", values, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowBetween(String value1, String value2) {
            addCriterion("Transfer_base_ele_low between", value1, value2, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleLowNotBetween(String value1, String value2) {
            addCriterion("Transfer_base_ele_low not between", value1, value2, "transferBaseEleLow");
            return (Criteria) this;
        }

        public Criteria andListingConfigIsNull() {
            addCriterion("Listing_config is null");
            return (Criteria) this;
        }

        public Criteria andListingConfigIsNotNull() {
            addCriterion("Listing_config is not null");
            return (Criteria) this;
        }

        public Criteria andListingConfigEqualTo(String value) {
            addCriterion("Listing_config =", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigNotEqualTo(String value) {
            addCriterion("Listing_config <>", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigGreaterThan(String value) {
            addCriterion("Listing_config >", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigGreaterThanOrEqualTo(String value) {
            addCriterion("Listing_config >=", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigLessThan(String value) {
            addCriterion("Listing_config <", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigLessThanOrEqualTo(String value) {
            addCriterion("Listing_config <=", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigLike(String value) {
            addCriterion("Listing_config like", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigNotLike(String value) {
            addCriterion("Listing_config not like", value, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigIn(List<String> values) {
            addCriterion("Listing_config in", values, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigNotIn(List<String> values) {
            addCriterion("Listing_config not in", values, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigBetween(String value1, String value2) {
            addCriterion("Listing_config between", value1, value2, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andListingConfigNotBetween(String value1, String value2) {
            addCriterion("Listing_config not between", value1, value2, "listingConfig");
            return (Criteria) this;
        }

        public Criteria andContractNoteIsNull() {
            addCriterion("contract_note is null");
            return (Criteria) this;
        }

        public Criteria andContractNoteIsNotNull() {
            addCriterion("contract_note is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoteEqualTo(String value) {
            addCriterion("contract_note =", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteNotEqualTo(String value) {
            addCriterion("contract_note <>", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteGreaterThan(String value) {
            addCriterion("contract_note >", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteGreaterThanOrEqualTo(String value) {
            addCriterion("contract_note >=", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteLessThan(String value) {
            addCriterion("contract_note <", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteLessThanOrEqualTo(String value) {
            addCriterion("contract_note <=", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteLike(String value) {
            addCriterion("contract_note like", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteNotLike(String value) {
            addCriterion("contract_note not like", value, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteIn(List<String> values) {
            addCriterion("contract_note in", values, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteNotIn(List<String> values) {
            addCriterion("contract_note not in", values, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteBetween(String value1, String value2) {
            addCriterion("contract_note between", value1, value2, "contractNote");
            return (Criteria) this;
        }

        public Criteria andContractNoteNotBetween(String value1, String value2) {
            addCriterion("contract_note not between", value1, value2, "contractNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteIsNull() {
            addCriterion("Listing_note is null");
            return (Criteria) this;
        }

        public Criteria andListingNoteIsNotNull() {
            addCriterion("Listing_note is not null");
            return (Criteria) this;
        }

        public Criteria andListingNoteEqualTo(String value) {
            addCriterion("Listing_note =", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteNotEqualTo(String value) {
            addCriterion("Listing_note <>", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteGreaterThan(String value) {
            addCriterion("Listing_note >", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Listing_note >=", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteLessThan(String value) {
            addCriterion("Listing_note <", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteLessThanOrEqualTo(String value) {
            addCriterion("Listing_note <=", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteLike(String value) {
            addCriterion("Listing_note like", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteNotLike(String value) {
            addCriterion("Listing_note not like", value, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteIn(List<String> values) {
            addCriterion("Listing_note in", values, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteNotIn(List<String> values) {
            addCriterion("Listing_note not in", values, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteBetween(String value1, String value2) {
            addCriterion("Listing_note between", value1, value2, "listingNote");
            return (Criteria) this;
        }

        public Criteria andListingNoteNotBetween(String value1, String value2) {
            addCriterion("Listing_note not between", value1, value2, "listingNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteIsNull() {
            addCriterion("finance_note is null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteIsNotNull() {
            addCriterion("finance_note is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteEqualTo(String value) {
            addCriterion("finance_note =", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotEqualTo(String value) {
            addCriterion("finance_note <>", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteGreaterThan(String value) {
            addCriterion("finance_note >", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteGreaterThanOrEqualTo(String value) {
            addCriterion("finance_note >=", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteLessThan(String value) {
            addCriterion("finance_note <", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteLessThanOrEqualTo(String value) {
            addCriterion("finance_note <=", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteLike(String value) {
            addCriterion("finance_note like", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotLike(String value) {
            addCriterion("finance_note not like", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteIn(List<String> values) {
            addCriterion("finance_note in", values, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotIn(List<String> values) {
            addCriterion("finance_note not in", values, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteBetween(String value1, String value2) {
            addCriterion("finance_note between", value1, value2, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotBetween(String value1, String value2) {
            addCriterion("finance_note not between", value1, value2, "financeNote");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionIsNull() {
            addCriterion("Listing_description is null");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionIsNotNull() {
            addCriterion("Listing_description is not null");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionEqualTo(String value) {
            addCriterion("Listing_description =", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionNotEqualTo(String value) {
            addCriterion("Listing_description <>", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionGreaterThan(String value) {
            addCriterion("Listing_description >", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Listing_description >=", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionLessThan(String value) {
            addCriterion("Listing_description <", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Listing_description <=", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionLike(String value) {
            addCriterion("Listing_description like", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionNotLike(String value) {
            addCriterion("Listing_description not like", value, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionIn(List<String> values) {
            addCriterion("Listing_description in", values, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionNotIn(List<String> values) {
            addCriterion("Listing_description not in", values, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionBetween(String value1, String value2) {
            addCriterion("Listing_description between", value1, value2, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andListingDescriptionNotBetween(String value1, String value2) {
            addCriterion("Listing_description not between", value1, value2, "listingDescription");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanIsNull() {
            addCriterion("payment_plan is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanIsNotNull() {
            addCriterion("payment_plan is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanEqualTo(String value) {
            addCriterion("payment_plan =", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanNotEqualTo(String value) {
            addCriterion("payment_plan <>", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanGreaterThan(String value) {
            addCriterion("payment_plan >", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanGreaterThanOrEqualTo(String value) {
            addCriterion("payment_plan >=", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanLessThan(String value) {
            addCriterion("payment_plan <", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanLessThanOrEqualTo(String value) {
            addCriterion("payment_plan <=", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanLike(String value) {
            addCriterion("payment_plan like", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanNotLike(String value) {
            addCriterion("payment_plan not like", value, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanIn(List<String> values) {
            addCriterion("payment_plan in", values, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanNotIn(List<String> values) {
            addCriterion("payment_plan not in", values, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanBetween(String value1, String value2) {
            addCriterion("payment_plan between", value1, value2, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanNotBetween(String value1, String value2) {
            addCriterion("payment_plan not between", value1, value2, "paymentPlan");
            return (Criteria) this;
        }

        public Criteria andListingPicIsNull() {
            addCriterion("Listing_pic is null");
            return (Criteria) this;
        }

        public Criteria andListingPicIsNotNull() {
            addCriterion("Listing_pic is not null");
            return (Criteria) this;
        }

        public Criteria andListingPicEqualTo(String value) {
            addCriterion("Listing_pic =", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicNotEqualTo(String value) {
            addCriterion("Listing_pic <>", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicGreaterThan(String value) {
            addCriterion("Listing_pic >", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicGreaterThanOrEqualTo(String value) {
            addCriterion("Listing_pic >=", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicLessThan(String value) {
            addCriterion("Listing_pic <", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicLessThanOrEqualTo(String value) {
            addCriterion("Listing_pic <=", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicLike(String value) {
            addCriterion("Listing_pic like", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicNotLike(String value) {
            addCriterion("Listing_pic not like", value, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicIn(List<String> values) {
            addCriterion("Listing_pic in", values, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicNotIn(List<String> values) {
            addCriterion("Listing_pic not in", values, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicBetween(String value1, String value2) {
            addCriterion("Listing_pic between", value1, value2, "listingPic");
            return (Criteria) this;
        }

        public Criteria andListingPicNotBetween(String value1, String value2) {
            addCriterion("Listing_pic not between", value1, value2, "listingPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicIsNull() {
            addCriterion("owner_pic is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPicIsNotNull() {
            addCriterion("owner_pic is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPicEqualTo(String value) {
            addCriterion("owner_pic =", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicNotEqualTo(String value) {
            addCriterion("owner_pic <>", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicGreaterThan(String value) {
            addCriterion("owner_pic >", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicGreaterThanOrEqualTo(String value) {
            addCriterion("owner_pic >=", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicLessThan(String value) {
            addCriterion("owner_pic <", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicLessThanOrEqualTo(String value) {
            addCriterion("owner_pic <=", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicLike(String value) {
            addCriterion("owner_pic like", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicNotLike(String value) {
            addCriterion("owner_pic not like", value, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicIn(List<String> values) {
            addCriterion("owner_pic in", values, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicNotIn(List<String> values) {
            addCriterion("owner_pic not in", values, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicBetween(String value1, String value2) {
            addCriterion("owner_pic between", value1, value2, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andOwnerPicNotBetween(String value1, String value2) {
            addCriterion("owner_pic not between", value1, value2, "ownerPic");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgIsNull() {
            addCriterion("broadband_msg is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgIsNotNull() {
            addCriterion("broadband_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgEqualTo(String value) {
            addCriterion("broadband_msg =", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgNotEqualTo(String value) {
            addCriterion("broadband_msg <>", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgGreaterThan(String value) {
            addCriterion("broadband_msg >", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgGreaterThanOrEqualTo(String value) {
            addCriterion("broadband_msg >=", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgLessThan(String value) {
            addCriterion("broadband_msg <", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgLessThanOrEqualTo(String value) {
            addCriterion("broadband_msg <=", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgLike(String value) {
            addCriterion("broadband_msg like", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgNotLike(String value) {
            addCriterion("broadband_msg not like", value, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgIn(List<String> values) {
            addCriterion("broadband_msg in", values, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgNotIn(List<String> values) {
            addCriterion("broadband_msg not in", values, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgBetween(String value1, String value2) {
            addCriterion("broadband_msg between", value1, value2, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andBroadbandMsgNotBetween(String value1, String value2) {
            addCriterion("broadband_msg not between", value1, value2, "broadbandMsg");
            return (Criteria) this;
        }

        public Criteria andListingStatusIsNull() {
            addCriterion("listing_status is null");
            return (Criteria) this;
        }

        public Criteria andListingStatusIsNotNull() {
            addCriterion("listing_status is not null");
            return (Criteria) this;
        }

        public Criteria andListingStatusEqualTo(String value) {
            addCriterion("listing_status =", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusNotEqualTo(String value) {
            addCriterion("listing_status <>", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusGreaterThan(String value) {
            addCriterion("listing_status >", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("listing_status >=", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusLessThan(String value) {
            addCriterion("listing_status <", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusLessThanOrEqualTo(String value) {
            addCriterion("listing_status <=", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusLike(String value) {
            addCriterion("listing_status like", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusNotLike(String value) {
            addCriterion("listing_status not like", value, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusIn(List<String> values) {
            addCriterion("listing_status in", values, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusNotIn(List<String> values) {
            addCriterion("listing_status not in", values, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusBetween(String value1, String value2) {
            addCriterion("listing_status between", value1, value2, "listingStatus");
            return (Criteria) this;
        }

        public Criteria andListingStatusNotBetween(String value1, String value2) {
            addCriterion("listing_status not between", value1, value2, "listingStatus");
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