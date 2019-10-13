package com.house.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintExample() {
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

        public Criteria andComplaintNameIsNull() {
            addCriterion("complaint_name is null");
            return (Criteria) this;
        }

        public Criteria andComplaintNameIsNotNull() {
            addCriterion("complaint_name is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintNameEqualTo(String value) {
            addCriterion("complaint_name =", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameNotEqualTo(String value) {
            addCriterion("complaint_name <>", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameGreaterThan(String value) {
            addCriterion("complaint_name >", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_name >=", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameLessThan(String value) {
            addCriterion("complaint_name <", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameLessThanOrEqualTo(String value) {
            addCriterion("complaint_name <=", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameLike(String value) {
            addCriterion("complaint_name like", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameNotLike(String value) {
            addCriterion("complaint_name not like", value, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameIn(List<String> values) {
            addCriterion("complaint_name in", values, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameNotIn(List<String> values) {
            addCriterion("complaint_name not in", values, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameBetween(String value1, String value2) {
            addCriterion("complaint_name between", value1, value2, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintNameNotBetween(String value1, String value2) {
            addCriterion("complaint_name not between", value1, value2, "complaintName");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneIsNull() {
            addCriterion("complaint_phone is null");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneIsNotNull() {
            addCriterion("complaint_phone is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneEqualTo(String value) {
            addCriterion("complaint_phone =", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotEqualTo(String value) {
            addCriterion("complaint_phone <>", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneGreaterThan(String value) {
            addCriterion("complaint_phone >", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_phone >=", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneLessThan(String value) {
            addCriterion("complaint_phone <", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneLessThanOrEqualTo(String value) {
            addCriterion("complaint_phone <=", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneLike(String value) {
            addCriterion("complaint_phone like", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotLike(String value) {
            addCriterion("complaint_phone not like", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneIn(List<String> values) {
            addCriterion("complaint_phone in", values, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotIn(List<String> values) {
            addCriterion("complaint_phone not in", values, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneBetween(String value1, String value2) {
            addCriterion("complaint_phone between", value1, value2, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotBetween(String value1, String value2) {
            addCriterion("complaint_phone not between", value1, value2, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeIsNull() {
            addCriterion("complaint_time is null");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeIsNotNull() {
            addCriterion("complaint_time is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeEqualTo(Date value) {
            addCriterion("complaint_time =", value, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeNotEqualTo(Date value) {
            addCriterion("complaint_time <>", value, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeGreaterThan(Date value) {
            addCriterion("complaint_time >", value, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complaint_time >=", value, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeLessThan(Date value) {
            addCriterion("complaint_time <", value, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeLessThanOrEqualTo(Date value) {
            addCriterion("complaint_time <=", value, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeIn(List<Date> values) {
            addCriterion("complaint_time in", values, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeNotIn(List<Date> values) {
            addCriterion("complaint_time not in", values, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeBetween(Date value1, Date value2) {
            addCriterion("complaint_time between", value1, value2, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andComplaintTimeNotBetween(Date value1, Date value2) {
            addCriterion("complaint_time not between", value1, value2, "complaintTime");
            return (Criteria) this;
        }

        public Criteria andRoomAddressIsNull() {
            addCriterion("room_address is null");
            return (Criteria) this;
        }

        public Criteria andRoomAddressIsNotNull() {
            addCriterion("room_address is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAddressEqualTo(String value) {
            addCriterion("room_address =", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotEqualTo(String value) {
            addCriterion("room_address <>", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressGreaterThan(String value) {
            addCriterion("room_address >", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressGreaterThanOrEqualTo(String value) {
            addCriterion("room_address >=", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressLessThan(String value) {
            addCriterion("room_address <", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressLessThanOrEqualTo(String value) {
            addCriterion("room_address <=", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressLike(String value) {
            addCriterion("room_address like", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotLike(String value) {
            addCriterion("room_address not like", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressIn(List<String> values) {
            addCriterion("room_address in", values, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotIn(List<String> values) {
            addCriterion("room_address not in", values, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressBetween(String value1, String value2) {
            addCriterion("room_address between", value1, value2, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotBetween(String value1, String value2) {
            addCriterion("room_address not between", value1, value2, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andComplaintThingIsNull() {
            addCriterion("complaint_thing is null");
            return (Criteria) this;
        }

        public Criteria andComplaintThingIsNotNull() {
            addCriterion("complaint_thing is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintThingEqualTo(String value) {
            addCriterion("complaint_thing =", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingNotEqualTo(String value) {
            addCriterion("complaint_thing <>", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingGreaterThan(String value) {
            addCriterion("complaint_thing >", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_thing >=", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingLessThan(String value) {
            addCriterion("complaint_thing <", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingLessThanOrEqualTo(String value) {
            addCriterion("complaint_thing <=", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingLike(String value) {
            addCriterion("complaint_thing like", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingNotLike(String value) {
            addCriterion("complaint_thing not like", value, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingIn(List<String> values) {
            addCriterion("complaint_thing in", values, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingNotIn(List<String> values) {
            addCriterion("complaint_thing not in", values, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingBetween(String value1, String value2) {
            addCriterion("complaint_thing between", value1, value2, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andComplaintThingNotBetween(String value1, String value2) {
            addCriterion("complaint_thing not between", value1, value2, "complaintThing");
            return (Criteria) this;
        }

        public Criteria andDealPersonIsNull() {
            addCriterion("deal_person is null");
            return (Criteria) this;
        }

        public Criteria andDealPersonIsNotNull() {
            addCriterion("deal_person is not null");
            return (Criteria) this;
        }

        public Criteria andDealPersonEqualTo(String value) {
            addCriterion("deal_person =", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotEqualTo(String value) {
            addCriterion("deal_person <>", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonGreaterThan(String value) {
            addCriterion("deal_person >", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonGreaterThanOrEqualTo(String value) {
            addCriterion("deal_person >=", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLessThan(String value) {
            addCriterion("deal_person <", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLessThanOrEqualTo(String value) {
            addCriterion("deal_person <=", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLike(String value) {
            addCriterion("deal_person like", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotLike(String value) {
            addCriterion("deal_person not like", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonIn(List<String> values) {
            addCriterion("deal_person in", values, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotIn(List<String> values) {
            addCriterion("deal_person not in", values, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonBetween(String value1, String value2) {
            addCriterion("deal_person between", value1, value2, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotBetween(String value1, String value2) {
            addCriterion("deal_person not between", value1, value2, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealStatusIsNull() {
            addCriterion("deal_status is null");
            return (Criteria) this;
        }

        public Criteria andDealStatusIsNotNull() {
            addCriterion("deal_status is not null");
            return (Criteria) this;
        }

        public Criteria andDealStatusEqualTo(String value) {
            addCriterion("deal_status =", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotEqualTo(String value) {
            addCriterion("deal_status <>", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusGreaterThan(String value) {
            addCriterion("deal_status >", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusGreaterThanOrEqualTo(String value) {
            addCriterion("deal_status >=", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLessThan(String value) {
            addCriterion("deal_status <", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLessThanOrEqualTo(String value) {
            addCriterion("deal_status <=", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLike(String value) {
            addCriterion("deal_status like", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotLike(String value) {
            addCriterion("deal_status not like", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusIn(List<String> values) {
            addCriterion("deal_status in", values, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotIn(List<String> values) {
            addCriterion("deal_status not in", values, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusBetween(String value1, String value2) {
            addCriterion("deal_status between", value1, value2, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotBetween(String value1, String value2) {
            addCriterion("deal_status not between", value1, value2, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("deal_time is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("deal_time =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("deal_time <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("deal_time >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deal_time >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("deal_time <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("deal_time <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("deal_time in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("deal_time not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("deal_time between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("deal_time not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealNoteIsNull() {
            addCriterion("deal_note is null");
            return (Criteria) this;
        }

        public Criteria andDealNoteIsNotNull() {
            addCriterion("deal_note is not null");
            return (Criteria) this;
        }

        public Criteria andDealNoteEqualTo(String value) {
            addCriterion("deal_note =", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteNotEqualTo(String value) {
            addCriterion("deal_note <>", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteGreaterThan(String value) {
            addCriterion("deal_note >", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteGreaterThanOrEqualTo(String value) {
            addCriterion("deal_note >=", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteLessThan(String value) {
            addCriterion("deal_note <", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteLessThanOrEqualTo(String value) {
            addCriterion("deal_note <=", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteLike(String value) {
            addCriterion("deal_note like", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteNotLike(String value) {
            addCriterion("deal_note not like", value, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteIn(List<String> values) {
            addCriterion("deal_note in", values, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteNotIn(List<String> values) {
            addCriterion("deal_note not in", values, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteBetween(String value1, String value2) {
            addCriterion("deal_note between", value1, value2, "dealNote");
            return (Criteria) this;
        }

        public Criteria andDealNoteNotBetween(String value1, String value2) {
            addCriterion("deal_note not between", value1, value2, "dealNote");
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