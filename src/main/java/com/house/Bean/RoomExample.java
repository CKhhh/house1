package com.house.Bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusDateIsNull() {
            addCriterion("status_date is null");
            return (Criteria) this;
        }

        public Criteria andStatusDateIsNotNull() {
            addCriterion("status_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDateEqualTo(Date value) {
            addCriterion("status_date =", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotEqualTo(Date value) {
            addCriterion("status_date <>", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateGreaterThan(Date value) {
            addCriterion("status_date >", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateGreaterThanOrEqualTo(Date value) {
            addCriterion("status_date >=", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateLessThan(Date value) {
            addCriterion("status_date <", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateLessThanOrEqualTo(Date value) {
            addCriterion("status_date <=", value, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateIn(List<Date> values) {
            addCriterion("status_date in", values, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotIn(List<Date> values) {
            addCriterion("status_date not in", values, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateBetween(Date value1, Date value2) {
            addCriterion("status_date between", value1, value2, "statusDate");
            return (Criteria) this;
        }

        public Criteria andStatusDateNotBetween(Date value1, Date value2) {
            addCriterion("status_date not between", value1, value2, "statusDate");
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

        public Criteria andPricingIsNull() {
            addCriterion("pricing is null");
            return (Criteria) this;
        }

        public Criteria andPricingIsNotNull() {
            addCriterion("pricing is not null");
            return (Criteria) this;
        }

        public Criteria andPricingEqualTo(String value) {
            addCriterion("pricing =", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotEqualTo(String value) {
            addCriterion("pricing <>", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThan(String value) {
            addCriterion("pricing >", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThanOrEqualTo(String value) {
            addCriterion("pricing >=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThan(String value) {
            addCriterion("pricing <", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThanOrEqualTo(String value) {
            addCriterion("pricing <=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLike(String value) {
            addCriterion("pricing like", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotLike(String value) {
            addCriterion("pricing not like", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingIn(List<String> values) {
            addCriterion("pricing in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotIn(List<String> values) {
            addCriterion("pricing not in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingBetween(String value1, String value2) {
            addCriterion("pricing between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotBetween(String value1, String value2) {
            addCriterion("pricing not between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceIsNull() {
            addCriterion("pay_room_price is null");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceIsNotNull() {
            addCriterion("pay_room_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceEqualTo(BigDecimal value) {
            addCriterion("pay_room_price =", value, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_room_price <>", value, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_room_price >", value, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_room_price >=", value, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceLessThan(BigDecimal value) {
            addCriterion("pay_room_price <", value, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_room_price <=", value, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceIn(List<BigDecimal> values) {
            addCriterion("pay_room_price in", values, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_room_price not in", values, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_room_price between", value1, value2, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andPayRoomPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_room_price not between", value1, value2, "payRoomPrice");
            return (Criteria) this;
        }

        public Criteria andDipositIsNull() {
            addCriterion("diposit is null");
            return (Criteria) this;
        }

        public Criteria andDipositIsNotNull() {
            addCriterion("diposit is not null");
            return (Criteria) this;
        }

        public Criteria andDipositEqualTo(String value) {
            addCriterion("diposit =", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositNotEqualTo(String value) {
            addCriterion("diposit <>", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositGreaterThan(String value) {
            addCriterion("diposit >", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositGreaterThanOrEqualTo(String value) {
            addCriterion("diposit >=", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositLessThan(String value) {
            addCriterion("diposit <", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositLessThanOrEqualTo(String value) {
            addCriterion("diposit <=", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositLike(String value) {
            addCriterion("diposit like", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositNotLike(String value) {
            addCriterion("diposit not like", value, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositIn(List<String> values) {
            addCriterion("diposit in", values, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositNotIn(List<String> values) {
            addCriterion("diposit not in", values, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositBetween(String value1, String value2) {
            addCriterion("diposit between", value1, value2, "diposit");
            return (Criteria) this;
        }

        public Criteria andDipositNotBetween(String value1, String value2) {
            addCriterion("diposit not between", value1, value2, "diposit");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNull() {
            addCriterion("service_price is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("service_price is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(BigDecimal value) {
            addCriterion("service_price =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(BigDecimal value) {
            addCriterion("service_price <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(BigDecimal value) {
            addCriterion("service_price >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_price >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(BigDecimal value) {
            addCriterion("service_price <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_price <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<BigDecimal> values) {
            addCriterion("service_price in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<BigDecimal> values) {
            addCriterion("service_price not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_price between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_price not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleIsNull() {
            addCriterion("payment_style is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleIsNotNull() {
            addCriterion("payment_style is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleEqualTo(String value) {
            addCriterion("payment_style =", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleNotEqualTo(String value) {
            addCriterion("payment_style <>", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleGreaterThan(String value) {
            addCriterion("payment_style >", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleGreaterThanOrEqualTo(String value) {
            addCriterion("payment_style >=", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleLessThan(String value) {
            addCriterion("payment_style <", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleLessThanOrEqualTo(String value) {
            addCriterion("payment_style <=", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleLike(String value) {
            addCriterion("payment_style like", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleNotLike(String value) {
            addCriterion("payment_style not like", value, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleIn(List<String> values) {
            addCriterion("payment_style in", values, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleNotIn(List<String> values) {
            addCriterion("payment_style not in", values, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleBetween(String value1, String value2) {
            addCriterion("payment_style between", value1, value2, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andPaymentStyleNotBetween(String value1, String value2) {
            addCriterion("payment_style not between", value1, value2, "paymentStyle");
            return (Criteria) this;
        }

        public Criteria andTenantNameIsNull() {
            addCriterion("tenant_name is null");
            return (Criteria) this;
        }

        public Criteria andTenantNameIsNotNull() {
            addCriterion("tenant_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenantNameEqualTo(String value) {
            addCriterion("tenant_name =", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotEqualTo(String value) {
            addCriterion("tenant_name <>", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameGreaterThan(String value) {
            addCriterion("tenant_name >", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_name >=", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLessThan(String value) {
            addCriterion("tenant_name <", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLessThanOrEqualTo(String value) {
            addCriterion("tenant_name <=", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameLike(String value) {
            addCriterion("tenant_name like", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotLike(String value) {
            addCriterion("tenant_name not like", value, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameIn(List<String> values) {
            addCriterion("tenant_name in", values, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotIn(List<String> values) {
            addCriterion("tenant_name not in", values, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameBetween(String value1, String value2) {
            addCriterion("tenant_name between", value1, value2, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantNameNotBetween(String value1, String value2) {
            addCriterion("tenant_name not between", value1, value2, "tenantName");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneIsNull() {
            addCriterion("tenant_phone is null");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneIsNotNull() {
            addCriterion("tenant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneEqualTo(String value) {
            addCriterion("tenant_phone =", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneNotEqualTo(String value) {
            addCriterion("tenant_phone <>", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneGreaterThan(String value) {
            addCriterion("tenant_phone >", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_phone >=", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneLessThan(String value) {
            addCriterion("tenant_phone <", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneLessThanOrEqualTo(String value) {
            addCriterion("tenant_phone <=", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneLike(String value) {
            addCriterion("tenant_phone like", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneNotLike(String value) {
            addCriterion("tenant_phone not like", value, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneIn(List<String> values) {
            addCriterion("tenant_phone in", values, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneNotIn(List<String> values) {
            addCriterion("tenant_phone not in", values, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneBetween(String value1, String value2) {
            addCriterion("tenant_phone between", value1, value2, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantPhoneNotBetween(String value1, String value2) {
            addCriterion("tenant_phone not between", value1, value2, "tenantPhone");
            return (Criteria) this;
        }

        public Criteria andTenantCardIsNull() {
            addCriterion("tenant_card is null");
            return (Criteria) this;
        }

        public Criteria andTenantCardIsNotNull() {
            addCriterion("tenant_card is not null");
            return (Criteria) this;
        }

        public Criteria andTenantCardEqualTo(String value) {
            addCriterion("tenant_card =", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardNotEqualTo(String value) {
            addCriterion("tenant_card <>", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardGreaterThan(String value) {
            addCriterion("tenant_card >", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_card >=", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardLessThan(String value) {
            addCriterion("tenant_card <", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardLessThanOrEqualTo(String value) {
            addCriterion("tenant_card <=", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardLike(String value) {
            addCriterion("tenant_card like", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardNotLike(String value) {
            addCriterion("tenant_card not like", value, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardIn(List<String> values) {
            addCriterion("tenant_card in", values, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardNotIn(List<String> values) {
            addCriterion("tenant_card not in", values, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardBetween(String value1, String value2) {
            addCriterion("tenant_card between", value1, value2, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantCardNotBetween(String value1, String value2) {
            addCriterion("tenant_card not between", value1, value2, "tenantCard");
            return (Criteria) this;
        }

        public Criteria andTenantSexIsNull() {
            addCriterion("tenant_sex is null");
            return (Criteria) this;
        }

        public Criteria andTenantSexIsNotNull() {
            addCriterion("tenant_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTenantSexEqualTo(String value) {
            addCriterion("tenant_sex =", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexNotEqualTo(String value) {
            addCriterion("tenant_sex <>", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexGreaterThan(String value) {
            addCriterion("tenant_sex >", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_sex >=", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexLessThan(String value) {
            addCriterion("tenant_sex <", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexLessThanOrEqualTo(String value) {
            addCriterion("tenant_sex <=", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexLike(String value) {
            addCriterion("tenant_sex like", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexNotLike(String value) {
            addCriterion("tenant_sex not like", value, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexIn(List<String> values) {
            addCriterion("tenant_sex in", values, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexNotIn(List<String> values) {
            addCriterion("tenant_sex not in", values, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexBetween(String value1, String value2) {
            addCriterion("tenant_sex between", value1, value2, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantSexNotBetween(String value1, String value2) {
            addCriterion("tenant_sex not between", value1, value2, "tenantSex");
            return (Criteria) this;
        }

        public Criteria andTenantImNameIsNull() {
            addCriterion("tenant_im_name is null");
            return (Criteria) this;
        }

        public Criteria andTenantImNameIsNotNull() {
            addCriterion("tenant_im_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenantImNameEqualTo(String value) {
            addCriterion("tenant_im_name =", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameNotEqualTo(String value) {
            addCriterion("tenant_im_name <>", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameGreaterThan(String value) {
            addCriterion("tenant_im_name >", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_im_name >=", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameLessThan(String value) {
            addCriterion("tenant_im_name <", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameLessThanOrEqualTo(String value) {
            addCriterion("tenant_im_name <=", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameLike(String value) {
            addCriterion("tenant_im_name like", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameNotLike(String value) {
            addCriterion("tenant_im_name not like", value, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameIn(List<String> values) {
            addCriterion("tenant_im_name in", values, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameNotIn(List<String> values) {
            addCriterion("tenant_im_name not in", values, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameBetween(String value1, String value2) {
            addCriterion("tenant_im_name between", value1, value2, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImNameNotBetween(String value1, String value2) {
            addCriterion("tenant_im_name not between", value1, value2, "tenantImName");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneIsNull() {
            addCriterion("tenant_im_phone is null");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneIsNotNull() {
            addCriterion("tenant_im_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneEqualTo(String value) {
            addCriterion("tenant_im_phone =", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneNotEqualTo(String value) {
            addCriterion("tenant_im_phone <>", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneGreaterThan(String value) {
            addCriterion("tenant_im_phone >", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_im_phone >=", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneLessThan(String value) {
            addCriterion("tenant_im_phone <", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneLessThanOrEqualTo(String value) {
            addCriterion("tenant_im_phone <=", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneLike(String value) {
            addCriterion("tenant_im_phone like", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneNotLike(String value) {
            addCriterion("tenant_im_phone not like", value, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneIn(List<String> values) {
            addCriterion("tenant_im_phone in", values, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneNotIn(List<String> values) {
            addCriterion("tenant_im_phone not in", values, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneBetween(String value1, String value2) {
            addCriterion("tenant_im_phone between", value1, value2, "tenantImPhone");
            return (Criteria) this;
        }

        public Criteria andTenantImPhoneNotBetween(String value1, String value2) {
            addCriterion("tenant_im_phone not between", value1, value2, "tenantImPhone");
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

        public Criteria andArrearsIsNull() {
            addCriterion("arrears is null");
            return (Criteria) this;
        }

        public Criteria andArrearsIsNotNull() {
            addCriterion("arrears is not null");
            return (Criteria) this;
        }

        public Criteria andArrearsEqualTo(String value) {
            addCriterion("arrears =", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsNotEqualTo(String value) {
            addCriterion("arrears <>", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsGreaterThan(String value) {
            addCriterion("arrears >", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsGreaterThanOrEqualTo(String value) {
            addCriterion("arrears >=", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsLessThan(String value) {
            addCriterion("arrears <", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsLessThanOrEqualTo(String value) {
            addCriterion("arrears <=", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsLike(String value) {
            addCriterion("arrears like", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsNotLike(String value) {
            addCriterion("arrears not like", value, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsIn(List<String> values) {
            addCriterion("arrears in", values, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsNotIn(List<String> values) {
            addCriterion("arrears not in", values, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsBetween(String value1, String value2) {
            addCriterion("arrears between", value1, value2, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsNotBetween(String value1, String value2) {
            addCriterion("arrears not between", value1, value2, "arrears");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeIsNull() {
            addCriterion("arrears_end_time is null");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeIsNotNull() {
            addCriterion("arrears_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeEqualTo(Date value) {
            addCriterion("arrears_end_time =", value, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeNotEqualTo(Date value) {
            addCriterion("arrears_end_time <>", value, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeGreaterThan(Date value) {
            addCriterion("arrears_end_time >", value, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrears_end_time >=", value, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeLessThan(Date value) {
            addCriterion("arrears_end_time <", value, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrears_end_time <=", value, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeIn(List<Date> values) {
            addCriterion("arrears_end_time in", values, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeNotIn(List<Date> values) {
            addCriterion("arrears_end_time not in", values, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeBetween(Date value1, Date value2) {
            addCriterion("arrears_end_time between", value1, value2, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andArrearsEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrears_end_time not between", value1, value2, "arrearsEndTime");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andUniBathIsNull() {
            addCriterion("Uni_bath is null");
            return (Criteria) this;
        }

        public Criteria andUniBathIsNotNull() {
            addCriterion("Uni_bath is not null");
            return (Criteria) this;
        }

        public Criteria andUniBathEqualTo(String value) {
            addCriterion("Uni_bath =", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathNotEqualTo(String value) {
            addCriterion("Uni_bath <>", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathGreaterThan(String value) {
            addCriterion("Uni_bath >", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathGreaterThanOrEqualTo(String value) {
            addCriterion("Uni_bath >=", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathLessThan(String value) {
            addCriterion("Uni_bath <", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathLessThanOrEqualTo(String value) {
            addCriterion("Uni_bath <=", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathLike(String value) {
            addCriterion("Uni_bath like", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathNotLike(String value) {
            addCriterion("Uni_bath not like", value, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathIn(List<String> values) {
            addCriterion("Uni_bath in", values, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathNotIn(List<String> values) {
            addCriterion("Uni_bath not in", values, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathBetween(String value1, String value2) {
            addCriterion("Uni_bath between", value1, value2, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBathNotBetween(String value1, String value2) {
            addCriterion("Uni_bath not between", value1, value2, "uniBath");
            return (Criteria) this;
        }

        public Criteria andUniBalconyIsNull() {
            addCriterion("Uni_balcony is null");
            return (Criteria) this;
        }

        public Criteria andUniBalconyIsNotNull() {
            addCriterion("Uni_balcony is not null");
            return (Criteria) this;
        }

        public Criteria andUniBalconyEqualTo(String value) {
            addCriterion("Uni_balcony =", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyNotEqualTo(String value) {
            addCriterion("Uni_balcony <>", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyGreaterThan(String value) {
            addCriterion("Uni_balcony >", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyGreaterThanOrEqualTo(String value) {
            addCriterion("Uni_balcony >=", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyLessThan(String value) {
            addCriterion("Uni_balcony <", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyLessThanOrEqualTo(String value) {
            addCriterion("Uni_balcony <=", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyLike(String value) {
            addCriterion("Uni_balcony like", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyNotLike(String value) {
            addCriterion("Uni_balcony not like", value, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyIn(List<String> values) {
            addCriterion("Uni_balcony in", values, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyNotIn(List<String> values) {
            addCriterion("Uni_balcony not in", values, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyBetween(String value1, String value2) {
            addCriterion("Uni_balcony between", value1, value2, "uniBalcony");
            return (Criteria) this;
        }

        public Criteria andUniBalconyNotBetween(String value1, String value2) {
            addCriterion("Uni_balcony not between", value1, value2, "uniBalcony");
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

        public Criteria andTransferBaseEleFormIsNull() {
            addCriterion("Transfer_base_ele_form is null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormIsNotNull() {
            addCriterion("Transfer_base_ele_form is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormEqualTo(String value) {
            addCriterion("Transfer_base_ele_form =", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormNotEqualTo(String value) {
            addCriterion("Transfer_base_ele_form <>", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormGreaterThan(String value) {
            addCriterion("Transfer_base_ele_form >", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormGreaterThanOrEqualTo(String value) {
            addCriterion("Transfer_base_ele_form >=", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormLessThan(String value) {
            addCriterion("Transfer_base_ele_form <", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormLessThanOrEqualTo(String value) {
            addCriterion("Transfer_base_ele_form <=", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormLike(String value) {
            addCriterion("Transfer_base_ele_form like", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormNotLike(String value) {
            addCriterion("Transfer_base_ele_form not like", value, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormIn(List<String> values) {
            addCriterion("Transfer_base_ele_form in", values, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormNotIn(List<String> values) {
            addCriterion("Transfer_base_ele_form not in", values, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormBetween(String value1, String value2) {
            addCriterion("Transfer_base_ele_form between", value1, value2, "transferBaseEleForm");
            return (Criteria) this;
        }

        public Criteria andTransferBaseEleFormNotBetween(String value1, String value2) {
            addCriterion("Transfer_base_ele_form not between", value1, value2, "transferBaseEleForm");
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

        public Criteria andRoomNoteIsNull() {
            addCriterion("room_note is null");
            return (Criteria) this;
        }

        public Criteria andRoomNoteIsNotNull() {
            addCriterion("room_note is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNoteEqualTo(String value) {
            addCriterion("room_note =", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotEqualTo(String value) {
            addCriterion("room_note <>", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteGreaterThan(String value) {
            addCriterion("room_note >", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteGreaterThanOrEqualTo(String value) {
            addCriterion("room_note >=", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteLessThan(String value) {
            addCriterion("room_note <", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteLessThanOrEqualTo(String value) {
            addCriterion("room_note <=", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteLike(String value) {
            addCriterion("room_note like", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotLike(String value) {
            addCriterion("room_note not like", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteIn(List<String> values) {
            addCriterion("room_note in", values, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotIn(List<String> values) {
            addCriterion("room_note not in", values, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteBetween(String value1, String value2) {
            addCriterion("room_note between", value1, value2, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotBetween(String value1, String value2) {
            addCriterion("room_note not between", value1, value2, "roomNote");
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

        public Criteria andTenantPicIsNull() {
            addCriterion("tenant_pic is null");
            return (Criteria) this;
        }

        public Criteria andTenantPicIsNotNull() {
            addCriterion("tenant_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTenantPicEqualTo(String value) {
            addCriterion("tenant_pic =", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicNotEqualTo(String value) {
            addCriterion("tenant_pic <>", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicGreaterThan(String value) {
            addCriterion("tenant_pic >", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_pic >=", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicLessThan(String value) {
            addCriterion("tenant_pic <", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicLessThanOrEqualTo(String value) {
            addCriterion("tenant_pic <=", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicLike(String value) {
            addCriterion("tenant_pic like", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicNotLike(String value) {
            addCriterion("tenant_pic not like", value, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicIn(List<String> values) {
            addCriterion("tenant_pic in", values, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicNotIn(List<String> values) {
            addCriterion("tenant_pic not in", values, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicBetween(String value1, String value2) {
            addCriterion("tenant_pic between", value1, value2, "tenantPic");
            return (Criteria) this;
        }

        public Criteria andTenantPicNotBetween(String value1, String value2) {
            addCriterion("tenant_pic not between", value1, value2, "tenantPic");
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

        public Criteria andFaceIsNull() {
            addCriterion("face is null");
            return (Criteria) this;
        }

        public Criteria andFaceIsNotNull() {
            addCriterion("face is not null");
            return (Criteria) this;
        }

        public Criteria andFaceEqualTo(String value) {
            addCriterion("face =", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotEqualTo(String value) {
            addCriterion("face <>", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThan(String value) {
            addCriterion("face >", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThanOrEqualTo(String value) {
            addCriterion("face >=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThan(String value) {
            addCriterion("face <", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThanOrEqualTo(String value) {
            addCriterion("face <=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLike(String value) {
            addCriterion("face like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotLike(String value) {
            addCriterion("face not like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceIn(List<String> values) {
            addCriterion("face in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotIn(List<String> values) {
            addCriterion("face not in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceBetween(String value1, String value2) {
            addCriterion("face between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotBetween(String value1, String value2) {
            addCriterion("face not between", value1, value2, "face");
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