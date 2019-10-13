package com.house.Bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("emp_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("emp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("emp_phone =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("emp_phone <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("emp_phone >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emp_phone >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("emp_phone <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("emp_phone <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("emp_phone like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("emp_phone not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("emp_phone in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("emp_phone not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("emp_phone between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("emp_phone not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpBranchIsNull() {
            addCriterion("emp_branch is null");
            return (Criteria) this;
        }

        public Criteria andEmpBranchIsNotNull() {
            addCriterion("emp_branch is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBranchEqualTo(String value) {
            addCriterion("emp_branch =", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchNotEqualTo(String value) {
            addCriterion("emp_branch <>", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchGreaterThan(String value) {
            addCriterion("emp_branch >", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchGreaterThanOrEqualTo(String value) {
            addCriterion("emp_branch >=", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchLessThan(String value) {
            addCriterion("emp_branch <", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchLessThanOrEqualTo(String value) {
            addCriterion("emp_branch <=", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchLike(String value) {
            addCriterion("emp_branch like", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchNotLike(String value) {
            addCriterion("emp_branch not like", value, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchIn(List<String> values) {
            addCriterion("emp_branch in", values, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchNotIn(List<String> values) {
            addCriterion("emp_branch not in", values, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchBetween(String value1, String value2) {
            addCriterion("emp_branch between", value1, value2, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpBranchNotBetween(String value1, String value2) {
            addCriterion("emp_branch not between", value1, value2, "empBranch");
            return (Criteria) this;
        }

        public Criteria andEmpPartIsNull() {
            addCriterion("emp_part is null");
            return (Criteria) this;
        }

        public Criteria andEmpPartIsNotNull() {
            addCriterion("emp_part is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPartEqualTo(String value) {
            addCriterion("emp_part =", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartNotEqualTo(String value) {
            addCriterion("emp_part <>", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartGreaterThan(String value) {
            addCriterion("emp_part >", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartGreaterThanOrEqualTo(String value) {
            addCriterion("emp_part >=", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartLessThan(String value) {
            addCriterion("emp_part <", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartLessThanOrEqualTo(String value) {
            addCriterion("emp_part <=", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartLike(String value) {
            addCriterion("emp_part like", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartNotLike(String value) {
            addCriterion("emp_part not like", value, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartIn(List<String> values) {
            addCriterion("emp_part in", values, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartNotIn(List<String> values) {
            addCriterion("emp_part not in", values, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartBetween(String value1, String value2) {
            addCriterion("emp_part between", value1, value2, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpPartNotBetween(String value1, String value2) {
            addCriterion("emp_part not between", value1, value2, "empPart");
            return (Criteria) this;
        }

        public Criteria andEmpJobIsNull() {
            addCriterion("emp_job is null");
            return (Criteria) this;
        }

        public Criteria andEmpJobIsNotNull() {
            addCriterion("emp_job is not null");
            return (Criteria) this;
        }

        public Criteria andEmpJobEqualTo(String value) {
            addCriterion("emp_job =", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotEqualTo(String value) {
            addCriterion("emp_job <>", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobGreaterThan(String value) {
            addCriterion("emp_job >", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobGreaterThanOrEqualTo(String value) {
            addCriterion("emp_job >=", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLessThan(String value) {
            addCriterion("emp_job <", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLessThanOrEqualTo(String value) {
            addCriterion("emp_job <=", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLike(String value) {
            addCriterion("emp_job like", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotLike(String value) {
            addCriterion("emp_job not like", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobIn(List<String> values) {
            addCriterion("emp_job in", values, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotIn(List<String> values) {
            addCriterion("emp_job not in", values, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobBetween(String value1, String value2) {
            addCriterion("emp_job between", value1, value2, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotBetween(String value1, String value2) {
            addCriterion("emp_job not between", value1, value2, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpAreaIsNull() {
            addCriterion("emp_area is null");
            return (Criteria) this;
        }

        public Criteria andEmpAreaIsNotNull() {
            addCriterion("emp_area is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAreaEqualTo(String value) {
            addCriterion("emp_area =", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaNotEqualTo(String value) {
            addCriterion("emp_area <>", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaGreaterThan(String value) {
            addCriterion("emp_area >", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaGreaterThanOrEqualTo(String value) {
            addCriterion("emp_area >=", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaLessThan(String value) {
            addCriterion("emp_area <", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaLessThanOrEqualTo(String value) {
            addCriterion("emp_area <=", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaLike(String value) {
            addCriterion("emp_area like", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaNotLike(String value) {
            addCriterion("emp_area not like", value, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaIn(List<String> values) {
            addCriterion("emp_area in", values, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaNotIn(List<String> values) {
            addCriterion("emp_area not in", values, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaBetween(String value1, String value2) {
            addCriterion("emp_area between", value1, value2, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpAreaNotBetween(String value1, String value2) {
            addCriterion("emp_area not between", value1, value2, "empArea");
            return (Criteria) this;
        }

        public Criteria andEmpEntryIsNull() {
            addCriterion("emp_entry is null");
            return (Criteria) this;
        }

        public Criteria andEmpEntryIsNotNull() {
            addCriterion("emp_entry is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEntryEqualTo(String value) {
            addCriterion("emp_entry =", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryNotEqualTo(String value) {
            addCriterion("emp_entry <>", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryGreaterThan(String value) {
            addCriterion("emp_entry >", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryGreaterThanOrEqualTo(String value) {
            addCriterion("emp_entry >=", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryLessThan(String value) {
            addCriterion("emp_entry <", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryLessThanOrEqualTo(String value) {
            addCriterion("emp_entry <=", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryLike(String value) {
            addCriterion("emp_entry like", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryNotLike(String value) {
            addCriterion("emp_entry not like", value, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryIn(List<String> values) {
            addCriterion("emp_entry in", values, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryNotIn(List<String> values) {
            addCriterion("emp_entry not in", values, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryBetween(String value1, String value2) {
            addCriterion("emp_entry between", value1, value2, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpEntryNotBetween(String value1, String value2) {
            addCriterion("emp_entry not between", value1, value2, "empEntry");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIsNull() {
            addCriterion("emp_type is null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIsNotNull() {
            addCriterion("emp_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeEqualTo(Integer value) {
            addCriterion("emp_type =", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotEqualTo(Integer value) {
            addCriterion("emp_type <>", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeGreaterThan(Integer value) {
            addCriterion("emp_type >", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_type >=", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLessThan(Integer value) {
            addCriterion("emp_type <", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("emp_type <=", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIn(List<Integer> values) {
            addCriterion("emp_type in", values, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotIn(List<Integer> values) {
            addCriterion("emp_type not in", values, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeBetween(Integer value1, Integer value2) {
            addCriterion("emp_type between", value1, value2, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_type not between", value1, value2, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpUnameIsNull() {
            addCriterion("emp_uname is null");
            return (Criteria) this;
        }

        public Criteria andEmpUnameIsNotNull() {
            addCriterion("emp_uname is not null");
            return (Criteria) this;
        }

        public Criteria andEmpUnameEqualTo(String value) {
            addCriterion("emp_uname =", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameNotEqualTo(String value) {
            addCriterion("emp_uname <>", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameGreaterThan(String value) {
            addCriterion("emp_uname >", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_uname >=", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameLessThan(String value) {
            addCriterion("emp_uname <", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameLessThanOrEqualTo(String value) {
            addCriterion("emp_uname <=", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameLike(String value) {
            addCriterion("emp_uname like", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameNotLike(String value) {
            addCriterion("emp_uname not like", value, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameIn(List<String> values) {
            addCriterion("emp_uname in", values, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameNotIn(List<String> values) {
            addCriterion("emp_uname not in", values, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameBetween(String value1, String value2) {
            addCriterion("emp_uname between", value1, value2, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpUnameNotBetween(String value1, String value2) {
            addCriterion("emp_uname not between", value1, value2, "empUname");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNull() {
            addCriterion("emp_password is null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNotNull() {
            addCriterion("emp_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordEqualTo(String value) {
            addCriterion("emp_password =", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotEqualTo(String value) {
            addCriterion("emp_password <>", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThan(String value) {
            addCriterion("emp_password >", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("emp_password >=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThan(String value) {
            addCriterion("emp_password <", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThanOrEqualTo(String value) {
            addCriterion("emp_password <=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLike(String value) {
            addCriterion("emp_password like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotLike(String value) {
            addCriterion("emp_password not like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIn(List<String> values) {
            addCriterion("emp_password in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotIn(List<String> values) {
            addCriterion("emp_password not in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordBetween(String value1, String value2) {
            addCriterion("emp_password between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotBetween(String value1, String value2) {
            addCriterion("emp_password not between", value1, value2, "empPassword");
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