package com.house.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andRepairTimeIsNull() {
            addCriterion("repair_time is null");
            return (Criteria) this;
        }

        public Criteria andRepairTimeIsNotNull() {
            addCriterion("repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTimeEqualTo(Date value) {
            addCriterion("repair_time =", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeNotEqualTo(Date value) {
            addCriterion("repair_time <>", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeGreaterThan(Date value) {
            addCriterion("repair_time >", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repair_time >=", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeLessThan(Date value) {
            addCriterion("repair_time <", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeLessThanOrEqualTo(Date value) {
            addCriterion("repair_time <=", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeIn(List<Date> values) {
            addCriterion("repair_time in", values, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeNotIn(List<Date> values) {
            addCriterion("repair_time not in", values, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeBetween(Date value1, Date value2) {
            addCriterion("repair_time between", value1, value2, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeNotBetween(Date value1, Date value2) {
            addCriterion("repair_time not between", value1, value2, "repairTime");
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

        public Criteria andRepairThingIsNull() {
            addCriterion("repair_thing is null");
            return (Criteria) this;
        }

        public Criteria andRepairThingIsNotNull() {
            addCriterion("repair_thing is not null");
            return (Criteria) this;
        }

        public Criteria andRepairThingEqualTo(String value) {
            addCriterion("repair_thing =", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingNotEqualTo(String value) {
            addCriterion("repair_thing <>", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingGreaterThan(String value) {
            addCriterion("repair_thing >", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingGreaterThanOrEqualTo(String value) {
            addCriterion("repair_thing >=", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingLessThan(String value) {
            addCriterion("repair_thing <", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingLessThanOrEqualTo(String value) {
            addCriterion("repair_thing <=", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingLike(String value) {
            addCriterion("repair_thing like", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingNotLike(String value) {
            addCriterion("repair_thing not like", value, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingIn(List<String> values) {
            addCriterion("repair_thing in", values, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingNotIn(List<String> values) {
            addCriterion("repair_thing not in", values, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingBetween(String value1, String value2) {
            addCriterion("repair_thing between", value1, value2, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairThingNotBetween(String value1, String value2) {
            addCriterion("repair_thing not between", value1, value2, "repairThing");
            return (Criteria) this;
        }

        public Criteria andRepairDescrIsNull() {
            addCriterion("repair_descr is null");
            return (Criteria) this;
        }

        public Criteria andRepairDescrIsNotNull() {
            addCriterion("repair_descr is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDescrEqualTo(String value) {
            addCriterion("repair_descr =", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrNotEqualTo(String value) {
            addCriterion("repair_descr <>", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrGreaterThan(String value) {
            addCriterion("repair_descr >", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrGreaterThanOrEqualTo(String value) {
            addCriterion("repair_descr >=", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrLessThan(String value) {
            addCriterion("repair_descr <", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrLessThanOrEqualTo(String value) {
            addCriterion("repair_descr <=", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrLike(String value) {
            addCriterion("repair_descr like", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrNotLike(String value) {
            addCriterion("repair_descr not like", value, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrIn(List<String> values) {
            addCriterion("repair_descr in", values, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrNotIn(List<String> values) {
            addCriterion("repair_descr not in", values, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrBetween(String value1, String value2) {
            addCriterion("repair_descr between", value1, value2, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairDescrNotBetween(String value1, String value2) {
            addCriterion("repair_descr not between", value1, value2, "repairDescr");
            return (Criteria) this;
        }

        public Criteria andRepairPicIsNull() {
            addCriterion("repair_pic is null");
            return (Criteria) this;
        }

        public Criteria andRepairPicIsNotNull() {
            addCriterion("repair_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPicEqualTo(String value) {
            addCriterion("repair_pic =", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicNotEqualTo(String value) {
            addCriterion("repair_pic <>", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicGreaterThan(String value) {
            addCriterion("repair_pic >", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicGreaterThanOrEqualTo(String value) {
            addCriterion("repair_pic >=", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicLessThan(String value) {
            addCriterion("repair_pic <", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicLessThanOrEqualTo(String value) {
            addCriterion("repair_pic <=", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicLike(String value) {
            addCriterion("repair_pic like", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicNotLike(String value) {
            addCriterion("repair_pic not like", value, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicIn(List<String> values) {
            addCriterion("repair_pic in", values, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicNotIn(List<String> values) {
            addCriterion("repair_pic not in", values, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicBetween(String value1, String value2) {
            addCriterion("repair_pic between", value1, value2, "repairPic");
            return (Criteria) this;
        }

        public Criteria andRepairPicNotBetween(String value1, String value2) {
            addCriterion("repair_pic not between", value1, value2, "repairPic");
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