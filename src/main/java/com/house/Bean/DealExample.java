package com.house.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealExample() {
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

        public Criteria andRommAddressIsNull() {
            addCriterion("romm_address is null");
            return (Criteria) this;
        }

        public Criteria andRommAddressIsNotNull() {
            addCriterion("romm_address is not null");
            return (Criteria) this;
        }

        public Criteria andRommAddressEqualTo(String value) {
            addCriterion("romm_address =", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressNotEqualTo(String value) {
            addCriterion("romm_address <>", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressGreaterThan(String value) {
            addCriterion("romm_address >", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressGreaterThanOrEqualTo(String value) {
            addCriterion("romm_address >=", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressLessThan(String value) {
            addCriterion("romm_address <", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressLessThanOrEqualTo(String value) {
            addCriterion("romm_address <=", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressLike(String value) {
            addCriterion("romm_address like", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressNotLike(String value) {
            addCriterion("romm_address not like", value, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressIn(List<String> values) {
            addCriterion("romm_address in", values, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressNotIn(List<String> values) {
            addCriterion("romm_address not in", values, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressBetween(String value1, String value2) {
            addCriterion("romm_address between", value1, value2, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andRommAddressNotBetween(String value1, String value2) {
            addCriterion("romm_address not between", value1, value2, "rommAddress");
            return (Criteria) this;
        }

        public Criteria andThingIsNull() {
            addCriterion("thing is null");
            return (Criteria) this;
        }

        public Criteria andThingIsNotNull() {
            addCriterion("thing is not null");
            return (Criteria) this;
        }

        public Criteria andThingEqualTo(String value) {
            addCriterion("thing =", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotEqualTo(String value) {
            addCriterion("thing <>", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingGreaterThan(String value) {
            addCriterion("thing >", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingGreaterThanOrEqualTo(String value) {
            addCriterion("thing >=", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLessThan(String value) {
            addCriterion("thing <", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLessThanOrEqualTo(String value) {
            addCriterion("thing <=", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLike(String value) {
            addCriterion("thing like", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotLike(String value) {
            addCriterion("thing not like", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingIn(List<String> values) {
            addCriterion("thing in", values, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotIn(List<String> values) {
            addCriterion("thing not in", values, "thing");
            return (Criteria) this;
        }

        public Criteria andThingBetween(String value1, String value2) {
            addCriterion("thing between", value1, value2, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotBetween(String value1, String value2) {
            addCriterion("thing not between", value1, value2, "thing");
            return (Criteria) this;
        }

        public Criteria andThingTimeIsNull() {
            addCriterion("thing_time is null");
            return (Criteria) this;
        }

        public Criteria andThingTimeIsNotNull() {
            addCriterion("thing_time is not null");
            return (Criteria) this;
        }

        public Criteria andThingTimeEqualTo(Date value) {
            addCriterion("thing_time =", value, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeNotEqualTo(Date value) {
            addCriterion("thing_time <>", value, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeGreaterThan(Date value) {
            addCriterion("thing_time >", value, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("thing_time >=", value, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeLessThan(Date value) {
            addCriterion("thing_time <", value, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeLessThanOrEqualTo(Date value) {
            addCriterion("thing_time <=", value, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeIn(List<Date> values) {
            addCriterion("thing_time in", values, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeNotIn(List<Date> values) {
            addCriterion("thing_time not in", values, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeBetween(Date value1, Date value2) {
            addCriterion("thing_time between", value1, value2, "thingTime");
            return (Criteria) this;
        }

        public Criteria andThingTimeNotBetween(Date value1, Date value2) {
            addCriterion("thing_time not between", value1, value2, "thingTime");
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

        public Criteria andPersonIsNull() {
            addCriterion("person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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