package com.house.Bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationExample() {
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

        public Criteria andApplicationTimeIsNull() {
            addCriterion("application_time is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNotNull() {
            addCriterion("application_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeEqualTo(Date value) {
            addCriterion("application_time =", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotEqualTo(Date value) {
            addCriterion("application_time <>", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThan(Date value) {
            addCriterion("application_time >", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("application_time >=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThan(Date value) {
            addCriterion("application_time <", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("application_time <=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIn(List<Date> values) {
            addCriterion("application_time in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotIn(List<Date> values) {
            addCriterion("application_time not in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeBetween(Date value1, Date value2) {
            addCriterion("application_time between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("application_time not between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIsNull() {
            addCriterion("application_person is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIsNotNull() {
            addCriterion("application_person is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonEqualTo(String value) {
            addCriterion("application_person =", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonNotEqualTo(String value) {
            addCriterion("application_person <>", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonGreaterThan(String value) {
            addCriterion("application_person >", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonGreaterThanOrEqualTo(String value) {
            addCriterion("application_person >=", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonLessThan(String value) {
            addCriterion("application_person <", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonLessThanOrEqualTo(String value) {
            addCriterion("application_person <=", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonLike(String value) {
            addCriterion("application_person like", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonNotLike(String value) {
            addCriterion("application_person not like", value, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIn(List<String> values) {
            addCriterion("application_person in", values, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonNotIn(List<String> values) {
            addCriterion("application_person not in", values, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonBetween(String value1, String value2) {
            addCriterion("application_person between", value1, value2, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonNotBetween(String value1, String value2) {
            addCriterion("application_person not between", value1, value2, "applicationPerson");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchIsNull() {
            addCriterion("application_branch is null");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchIsNotNull() {
            addCriterion("application_branch is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchEqualTo(String value) {
            addCriterion("application_branch =", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchNotEqualTo(String value) {
            addCriterion("application_branch <>", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchGreaterThan(String value) {
            addCriterion("application_branch >", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchGreaterThanOrEqualTo(String value) {
            addCriterion("application_branch >=", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchLessThan(String value) {
            addCriterion("application_branch <", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchLessThanOrEqualTo(String value) {
            addCriterion("application_branch <=", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchLike(String value) {
            addCriterion("application_branch like", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchNotLike(String value) {
            addCriterion("application_branch not like", value, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchIn(List<String> values) {
            addCriterion("application_branch in", values, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchNotIn(List<String> values) {
            addCriterion("application_branch not in", values, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchBetween(String value1, String value2) {
            addCriterion("application_branch between", value1, value2, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationBranchNotBetween(String value1, String value2) {
            addCriterion("application_branch not between", value1, value2, "applicationBranch");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaIsNull() {
            addCriterion("application_depa is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaIsNotNull() {
            addCriterion("application_depa is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaEqualTo(String value) {
            addCriterion("application_depa =", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaNotEqualTo(String value) {
            addCriterion("application_depa <>", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaGreaterThan(String value) {
            addCriterion("application_depa >", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaGreaterThanOrEqualTo(String value) {
            addCriterion("application_depa >=", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaLessThan(String value) {
            addCriterion("application_depa <", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaLessThanOrEqualTo(String value) {
            addCriterion("application_depa <=", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaLike(String value) {
            addCriterion("application_depa like", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaNotLike(String value) {
            addCriterion("application_depa not like", value, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaIn(List<String> values) {
            addCriterion("application_depa in", values, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaNotIn(List<String> values) {
            addCriterion("application_depa not in", values, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaBetween(String value1, String value2) {
            addCriterion("application_depa between", value1, value2, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationDepaNotBetween(String value1, String value2) {
            addCriterion("application_depa not between", value1, value2, "applicationDepa");
            return (Criteria) this;
        }

        public Criteria andApplicationJobIsNull() {
            addCriterion("application_job is null");
            return (Criteria) this;
        }

        public Criteria andApplicationJobIsNotNull() {
            addCriterion("application_job is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationJobEqualTo(String value) {
            addCriterion("application_job =", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobNotEqualTo(String value) {
            addCriterion("application_job <>", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobGreaterThan(String value) {
            addCriterion("application_job >", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobGreaterThanOrEqualTo(String value) {
            addCriterion("application_job >=", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobLessThan(String value) {
            addCriterion("application_job <", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobLessThanOrEqualTo(String value) {
            addCriterion("application_job <=", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobLike(String value) {
            addCriterion("application_job like", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobNotLike(String value) {
            addCriterion("application_job not like", value, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobIn(List<String> values) {
            addCriterion("application_job in", values, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobNotIn(List<String> values) {
            addCriterion("application_job not in", values, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobBetween(String value1, String value2) {
            addCriterion("application_job between", value1, value2, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationJobNotBetween(String value1, String value2) {
            addCriterion("application_job not between", value1, value2, "applicationJob");
            return (Criteria) this;
        }

        public Criteria andApplicationProIsNull() {
            addCriterion("application_pro is null");
            return (Criteria) this;
        }

        public Criteria andApplicationProIsNotNull() {
            addCriterion("application_pro is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationProEqualTo(String value) {
            addCriterion("application_pro =", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProNotEqualTo(String value) {
            addCriterion("application_pro <>", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProGreaterThan(String value) {
            addCriterion("application_pro >", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProGreaterThanOrEqualTo(String value) {
            addCriterion("application_pro >=", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProLessThan(String value) {
            addCriterion("application_pro <", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProLessThanOrEqualTo(String value) {
            addCriterion("application_pro <=", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProLike(String value) {
            addCriterion("application_pro like", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProNotLike(String value) {
            addCriterion("application_pro not like", value, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProIn(List<String> values) {
            addCriterion("application_pro in", values, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProNotIn(List<String> values) {
            addCriterion("application_pro not in", values, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProBetween(String value1, String value2) {
            addCriterion("application_pro between", value1, value2, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationProNotBetween(String value1, String value2) {
            addCriterion("application_pro not between", value1, value2, "applicationPro");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceIsNull() {
            addCriterion("application_price is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceIsNotNull() {
            addCriterion("application_price is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceEqualTo(BigDecimal value) {
            addCriterion("application_price =", value, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceNotEqualTo(BigDecimal value) {
            addCriterion("application_price <>", value, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceGreaterThan(BigDecimal value) {
            addCriterion("application_price >", value, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("application_price >=", value, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceLessThan(BigDecimal value) {
            addCriterion("application_price <", value, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("application_price <=", value, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceIn(List<BigDecimal> values) {
            addCriterion("application_price in", values, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceNotIn(List<BigDecimal> values) {
            addCriterion("application_price not in", values, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("application_price between", value1, value2, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("application_price not between", value1, value2, "applicationPrice");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardIsNull() {
            addCriterion("application_bankcard is null");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardIsNotNull() {
            addCriterion("application_bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardEqualTo(String value) {
            addCriterion("application_bankcard =", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardNotEqualTo(String value) {
            addCriterion("application_bankcard <>", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardGreaterThan(String value) {
            addCriterion("application_bankcard >", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("application_bankcard >=", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardLessThan(String value) {
            addCriterion("application_bankcard <", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardLessThanOrEqualTo(String value) {
            addCriterion("application_bankcard <=", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardLike(String value) {
            addCriterion("application_bankcard like", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardNotLike(String value) {
            addCriterion("application_bankcard not like", value, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardIn(List<String> values) {
            addCriterion("application_bankcard in", values, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardNotIn(List<String> values) {
            addCriterion("application_bankcard not in", values, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardBetween(String value1, String value2) {
            addCriterion("application_bankcard between", value1, value2, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationBankcardNotBetween(String value1, String value2) {
            addCriterion("application_bankcard not between", value1, value2, "applicationBankcard");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonIsNull() {
            addCriterion("application_reason is null");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonIsNotNull() {
            addCriterion("application_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonEqualTo(String value) {
            addCriterion("application_reason =", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotEqualTo(String value) {
            addCriterion("application_reason <>", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonGreaterThan(String value) {
            addCriterion("application_reason >", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("application_reason >=", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonLessThan(String value) {
            addCriterion("application_reason <", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonLessThanOrEqualTo(String value) {
            addCriterion("application_reason <=", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonLike(String value) {
            addCriterion("application_reason like", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotLike(String value) {
            addCriterion("application_reason not like", value, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonIn(List<String> values) {
            addCriterion("application_reason in", values, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotIn(List<String> values) {
            addCriterion("application_reason not in", values, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonBetween(String value1, String value2) {
            addCriterion("application_reason between", value1, value2, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationReasonNotBetween(String value1, String value2) {
            addCriterion("application_reason not between", value1, value2, "applicationReason");
            return (Criteria) this;
        }

        public Criteria andApplicationPicIsNull() {
            addCriterion("application_pic is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPicIsNotNull() {
            addCriterion("application_pic is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPicEqualTo(String value) {
            addCriterion("application_pic =", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicNotEqualTo(String value) {
            addCriterion("application_pic <>", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicGreaterThan(String value) {
            addCriterion("application_pic >", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicGreaterThanOrEqualTo(String value) {
            addCriterion("application_pic >=", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicLessThan(String value) {
            addCriterion("application_pic <", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicLessThanOrEqualTo(String value) {
            addCriterion("application_pic <=", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicLike(String value) {
            addCriterion("application_pic like", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicNotLike(String value) {
            addCriterion("application_pic not like", value, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicIn(List<String> values) {
            addCriterion("application_pic in", values, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicNotIn(List<String> values) {
            addCriterion("application_pic not in", values, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicBetween(String value1, String value2) {
            addCriterion("application_pic between", value1, value2, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationPicNotBetween(String value1, String value2) {
            addCriterion("application_pic not between", value1, value2, "applicationPic");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNull() {
            addCriterion("application_status is null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNotNull() {
            addCriterion("application_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusEqualTo(String value) {
            addCriterion("application_status =", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotEqualTo(String value) {
            addCriterion("application_status <>", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThan(String value) {
            addCriterion("application_status >", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("application_status >=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThan(String value) {
            addCriterion("application_status <", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThanOrEqualTo(String value) {
            addCriterion("application_status <=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLike(String value) {
            addCriterion("application_status like", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotLike(String value) {
            addCriterion("application_status not like", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIn(List<String> values) {
            addCriterion("application_status in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotIn(List<String> values) {
            addCriterion("application_status not in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusBetween(String value1, String value2) {
            addCriterion("application_status between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotBetween(String value1, String value2) {
            addCriterion("application_status not between", value1, value2, "applicationStatus");
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

        public Criteria andDealPicIsNull() {
            addCriterion("deal_pic is null");
            return (Criteria) this;
        }

        public Criteria andDealPicIsNotNull() {
            addCriterion("deal_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDealPicEqualTo(String value) {
            addCriterion("deal_pic =", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicNotEqualTo(String value) {
            addCriterion("deal_pic <>", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicGreaterThan(String value) {
            addCriterion("deal_pic >", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicGreaterThanOrEqualTo(String value) {
            addCriterion("deal_pic >=", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicLessThan(String value) {
            addCriterion("deal_pic <", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicLessThanOrEqualTo(String value) {
            addCriterion("deal_pic <=", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicLike(String value) {
            addCriterion("deal_pic like", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicNotLike(String value) {
            addCriterion("deal_pic not like", value, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicIn(List<String> values) {
            addCriterion("deal_pic in", values, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicNotIn(List<String> values) {
            addCriterion("deal_pic not in", values, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicBetween(String value1, String value2) {
            addCriterion("deal_pic between", value1, value2, "dealPic");
            return (Criteria) this;
        }

        public Criteria andDealPicNotBetween(String value1, String value2) {
            addCriterion("deal_pic not between", value1, value2, "dealPic");
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

        public Criteria andApplicationPersonIdIsNull() {
            addCriterion("application_person_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdIsNotNull() {
            addCriterion("application_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdEqualTo(Integer value) {
            addCriterion("application_person_id =", value, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdNotEqualTo(Integer value) {
            addCriterion("application_person_id <>", value, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdGreaterThan(Integer value) {
            addCriterion("application_person_id >", value, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_person_id >=", value, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdLessThan(Integer value) {
            addCriterion("application_person_id <", value, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("application_person_id <=", value, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdIn(List<Integer> values) {
            addCriterion("application_person_id in", values, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdNotIn(List<Integer> values) {
            addCriterion("application_person_id not in", values, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("application_person_id between", value1, value2, "applicationPersonId");
            return (Criteria) this;
        }

        public Criteria andApplicationPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("application_person_id not between", value1, value2, "applicationPersonId");
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