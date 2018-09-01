package com.didi.datainfra.jms.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskDOExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andDemandSideIsNull() {
            addCriterion("demand_side is null");
            return (Criteria) this;
        }

        public Criteria andDemandSideIsNotNull() {
            addCriterion("demand_side is not null");
            return (Criteria) this;
        }

        public Criteria andDemandSideEqualTo(String value) {
            addCriterion("demand_side =", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideNotEqualTo(String value) {
            addCriterion("demand_side <>", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideGreaterThan(String value) {
            addCriterion("demand_side >", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideGreaterThanOrEqualTo(String value) {
            addCriterion("demand_side >=", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideLessThan(String value) {
            addCriterion("demand_side <", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideLessThanOrEqualTo(String value) {
            addCriterion("demand_side <=", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideLike(String value) {
            addCriterion("demand_side like", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideNotLike(String value) {
            addCriterion("demand_side not like", value, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideIn(List<String> values) {
            addCriterion("demand_side in", values, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideNotIn(List<String> values) {
            addCriterion("demand_side not in", values, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideBetween(String value1, String value2) {
            addCriterion("demand_side between", value1, value2, "demandSide");
            return (Criteria) this;
        }

        public Criteria andDemandSideNotBetween(String value1, String value2) {
            addCriterion("demand_side not between", value1, value2, "demandSide");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeIsNull() {
            addCriterion("task_period_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeIsNotNull() {
            addCriterion("task_period_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeEqualTo(Byte value) {
            addCriterion("task_period_type =", value, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeNotEqualTo(Byte value) {
            addCriterion("task_period_type <>", value, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeGreaterThan(Byte value) {
            addCriterion("task_period_type >", value, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("task_period_type >=", value, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeLessThan(Byte value) {
            addCriterion("task_period_type <", value, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeLessThanOrEqualTo(Byte value) {
            addCriterion("task_period_type <=", value, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeIn(List<Byte> values) {
            addCriterion("task_period_type in", values, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeNotIn(List<Byte> values) {
            addCriterion("task_period_type not in", values, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeBetween(Byte value1, Byte value2) {
            addCriterion("task_period_type between", value1, value2, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andTaskPeriodTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("task_period_type not between", value1, value2, "taskPeriodType");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Byte value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Byte value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Byte value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Byte value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Byte value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Byte> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Byte> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Byte value1, Byte value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Byte value1, Byte value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andAppPathIsNull() {
            addCriterion("app_path is null");
            return (Criteria) this;
        }

        public Criteria andAppPathIsNotNull() {
            addCriterion("app_path is not null");
            return (Criteria) this;
        }

        public Criteria andAppPathEqualTo(String value) {
            addCriterion("app_path =", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotEqualTo(String value) {
            addCriterion("app_path <>", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathGreaterThan(String value) {
            addCriterion("app_path >", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathGreaterThanOrEqualTo(String value) {
            addCriterion("app_path >=", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathLessThan(String value) {
            addCriterion("app_path <", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathLessThanOrEqualTo(String value) {
            addCriterion("app_path <=", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathLike(String value) {
            addCriterion("app_path like", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotLike(String value) {
            addCriterion("app_path not like", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathIn(List<String> values) {
            addCriterion("app_path in", values, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotIn(List<String> values) {
            addCriterion("app_path not in", values, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathBetween(String value1, String value2) {
            addCriterion("app_path between", value1, value2, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotBetween(String value1, String value2) {
            addCriterion("app_path not between", value1, value2, "appPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathIsNull() {
            addCriterion("common_app_path is null");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathIsNotNull() {
            addCriterion("common_app_path is not null");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathEqualTo(String value) {
            addCriterion("common_app_path =", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathNotEqualTo(String value) {
            addCriterion("common_app_path <>", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathGreaterThan(String value) {
            addCriterion("common_app_path >", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathGreaterThanOrEqualTo(String value) {
            addCriterion("common_app_path >=", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathLessThan(String value) {
            addCriterion("common_app_path <", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathLessThanOrEqualTo(String value) {
            addCriterion("common_app_path <=", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathLike(String value) {
            addCriterion("common_app_path like", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathNotLike(String value) {
            addCriterion("common_app_path not like", value, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathIn(List<String> values) {
            addCriterion("common_app_path in", values, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathNotIn(List<String> values) {
            addCriterion("common_app_path not in", values, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathBetween(String value1, String value2) {
            addCriterion("common_app_path between", value1, value2, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andCommonAppPathNotBetween(String value1, String value2) {
            addCriterion("common_app_path not between", value1, value2, "commonAppPath");
            return (Criteria) this;
        }

        public Criteria andMainClazzIsNull() {
            addCriterion("main_clazz is null");
            return (Criteria) this;
        }

        public Criteria andMainClazzIsNotNull() {
            addCriterion("main_clazz is not null");
            return (Criteria) this;
        }

        public Criteria andMainClazzEqualTo(String value) {
            addCriterion("main_clazz =", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzNotEqualTo(String value) {
            addCriterion("main_clazz <>", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzGreaterThan(String value) {
            addCriterion("main_clazz >", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzGreaterThanOrEqualTo(String value) {
            addCriterion("main_clazz >=", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzLessThan(String value) {
            addCriterion("main_clazz <", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzLessThanOrEqualTo(String value) {
            addCriterion("main_clazz <=", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzLike(String value) {
            addCriterion("main_clazz like", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzNotLike(String value) {
            addCriterion("main_clazz not like", value, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzIn(List<String> values) {
            addCriterion("main_clazz in", values, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzNotIn(List<String> values) {
            addCriterion("main_clazz not in", values, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzBetween(String value1, String value2) {
            addCriterion("main_clazz between", value1, value2, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andMainClazzNotBetween(String value1, String value2) {
            addCriterion("main_clazz not between", value1, value2, "mainClazz");
            return (Criteria) this;
        }

        public Criteria andProcessNoIsNull() {
            addCriterion("process_no is null");
            return (Criteria) this;
        }

        public Criteria andProcessNoIsNotNull() {
            addCriterion("process_no is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNoEqualTo(Integer value) {
            addCriterion("process_no =", value, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoNotEqualTo(Integer value) {
            addCriterion("process_no <>", value, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoGreaterThan(Integer value) {
            addCriterion("process_no >", value, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_no >=", value, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoLessThan(Integer value) {
            addCriterion("process_no <", value, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoLessThanOrEqualTo(Integer value) {
            addCriterion("process_no <=", value, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoIn(List<Integer> values) {
            addCriterion("process_no in", values, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoNotIn(List<Integer> values) {
            addCriterion("process_no not in", values, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoBetween(Integer value1, Integer value2) {
            addCriterion("process_no between", value1, value2, "processNo");
            return (Criteria) this;
        }

        public Criteria andProcessNoNotBetween(Integer value1, Integer value2) {
            addCriterion("process_no not between", value1, value2, "processNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoIsNull() {
            addCriterion("cpu_no is null");
            return (Criteria) this;
        }

        public Criteria andCpuNoIsNotNull() {
            addCriterion("cpu_no is not null");
            return (Criteria) this;
        }

        public Criteria andCpuNoEqualTo(Integer value) {
            addCriterion("cpu_no =", value, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoNotEqualTo(Integer value) {
            addCriterion("cpu_no <>", value, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoGreaterThan(Integer value) {
            addCriterion("cpu_no >", value, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpu_no >=", value, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoLessThan(Integer value) {
            addCriterion("cpu_no <", value, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoLessThanOrEqualTo(Integer value) {
            addCriterion("cpu_no <=", value, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoIn(List<Integer> values) {
            addCriterion("cpu_no in", values, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoNotIn(List<Integer> values) {
            addCriterion("cpu_no not in", values, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoBetween(Integer value1, Integer value2) {
            addCriterion("cpu_no between", value1, value2, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andCpuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cpu_no not between", value1, value2, "cpuNo");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("memory is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("memory is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(Integer value) {
            addCriterion("memory =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(Integer value) {
            addCriterion("memory <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(Integer value) {
            addCriterion("memory >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(Integer value) {
            addCriterion("memory <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(Integer value) {
            addCriterion("memory <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<Integer> values) {
            addCriterion("memory in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<Integer> values) {
            addCriterion("memory not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(Integer value1, Integer value2) {
            addCriterion("memory between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(Integer value1, Integer value2) {
            addCriterion("memory not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIsNull() {
            addCriterion("elapsed_time is null");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIsNotNull() {
            addCriterion("elapsed_time is not null");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeEqualTo(Integer value) {
            addCriterion("elapsed_time =", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotEqualTo(Integer value) {
            addCriterion("elapsed_time <>", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeGreaterThan(Integer value) {
            addCriterion("elapsed_time >", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("elapsed_time >=", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLessThan(Integer value) {
            addCriterion("elapsed_time <", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("elapsed_time <=", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIn(List<Integer> values) {
            addCriterion("elapsed_time in", values, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotIn(List<Integer> values) {
            addCriterion("elapsed_time not in", values, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeBetween(Integer value1, Integer value2) {
            addCriterion("elapsed_time between", value1, value2, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("elapsed_time not between", value1, value2, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutIsNull() {
            addCriterion("input_timeout is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutIsNotNull() {
            addCriterion("input_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutEqualTo(Integer value) {
            addCriterion("input_timeout =", value, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutNotEqualTo(Integer value) {
            addCriterion("input_timeout <>", value, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutGreaterThan(Integer value) {
            addCriterion("input_timeout >", value, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_timeout >=", value, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutLessThan(Integer value) {
            addCriterion("input_timeout <", value, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("input_timeout <=", value, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutIn(List<Integer> values) {
            addCriterion("input_timeout in", values, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutNotIn(List<Integer> values) {
            addCriterion("input_timeout not in", values, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("input_timeout between", value1, value2, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andInputTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("input_timeout not between", value1, value2, "inputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutIsNull() {
            addCriterion("output_timeout is null");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutIsNotNull() {
            addCriterion("output_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutEqualTo(Integer value) {
            addCriterion("output_timeout =", value, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutNotEqualTo(Integer value) {
            addCriterion("output_timeout <>", value, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutGreaterThan(Integer value) {
            addCriterion("output_timeout >", value, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_timeout >=", value, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutLessThan(Integer value) {
            addCriterion("output_timeout <", value, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("output_timeout <=", value, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutIn(List<Integer> values) {
            addCriterion("output_timeout in", values, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutNotIn(List<Integer> values) {
            addCriterion("output_timeout not in", values, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("output_timeout between", value1, value2, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("output_timeout not between", value1, value2, "outputTimeout");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetIsNull() {
            addCriterion("output_offset is null");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetIsNotNull() {
            addCriterion("output_offset is not null");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetEqualTo(Integer value) {
            addCriterion("output_offset =", value, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetNotEqualTo(Integer value) {
            addCriterion("output_offset <>", value, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetGreaterThan(Integer value) {
            addCriterion("output_offset >", value, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_offset >=", value, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetLessThan(Integer value) {
            addCriterion("output_offset <", value, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("output_offset <=", value, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetIn(List<Integer> values) {
            addCriterion("output_offset in", values, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetNotIn(List<Integer> values) {
            addCriterion("output_offset not in", values, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetBetween(Integer value1, Integer value2) {
            addCriterion("output_offset between", value1, value2, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andOutputOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("output_offset not between", value1, value2, "outputOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetIsNull() {
            addCriterion("begin_time_offset is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetIsNotNull() {
            addCriterion("begin_time_offset is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetEqualTo(Integer value) {
            addCriterion("begin_time_offset =", value, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetNotEqualTo(Integer value) {
            addCriterion("begin_time_offset <>", value, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetGreaterThan(Integer value) {
            addCriterion("begin_time_offset >", value, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_time_offset >=", value, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetLessThan(Integer value) {
            addCriterion("begin_time_offset <", value, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("begin_time_offset <=", value, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetIn(List<Integer> values) {
            addCriterion("begin_time_offset in", values, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetNotIn(List<Integer> values) {
            addCriterion("begin_time_offset not in", values, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetBetween(Integer value1, Integer value2) {
            addCriterion("begin_time_offset between", value1, value2, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andBeginTimeOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_time_offset not between", value1, value2, "beginTimeOffset");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(Byte value) {
            addCriterion("check_type =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(Byte value) {
            addCriterion("check_type <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(Byte value) {
            addCriterion("check_type >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_type >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(Byte value) {
            addCriterion("check_type <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(Byte value) {
            addCriterion("check_type <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<Byte> values) {
            addCriterion("check_type in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<Byte> values) {
            addCriterion("check_type not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(Byte value1, Byte value2) {
            addCriterion("check_type between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("check_type not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(Byte value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(Byte value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(Byte value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(Byte value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(Byte value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<Byte> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<Byte> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(Byte value1, Byte value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(Byte value1, Byte value2) {
            addCriterion("mode not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameIsNull() {
            addCriterion("yarn_queue_name is null");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameIsNotNull() {
            addCriterion("yarn_queue_name is not null");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameEqualTo(String value) {
            addCriterion("yarn_queue_name =", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameNotEqualTo(String value) {
            addCriterion("yarn_queue_name <>", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameGreaterThan(String value) {
            addCriterion("yarn_queue_name >", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameGreaterThanOrEqualTo(String value) {
            addCriterion("yarn_queue_name >=", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameLessThan(String value) {
            addCriterion("yarn_queue_name <", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameLessThanOrEqualTo(String value) {
            addCriterion("yarn_queue_name <=", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameLike(String value) {
            addCriterion("yarn_queue_name like", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameNotLike(String value) {
            addCriterion("yarn_queue_name not like", value, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameIn(List<String> values) {
            addCriterion("yarn_queue_name in", values, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameNotIn(List<String> values) {
            addCriterion("yarn_queue_name not in", values, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameBetween(String value1, String value2) {
            addCriterion("yarn_queue_name between", value1, value2, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andYarnQueueNameNotBetween(String value1, String value2) {
            addCriterion("yarn_queue_name not between", value1, value2, "yarnQueueName");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountIsNull() {
            addCriterion("hadoop_account is null");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountIsNotNull() {
            addCriterion("hadoop_account is not null");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountEqualTo(String value) {
            addCriterion("hadoop_account =", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountNotEqualTo(String value) {
            addCriterion("hadoop_account <>", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountGreaterThan(String value) {
            addCriterion("hadoop_account >", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountGreaterThanOrEqualTo(String value) {
            addCriterion("hadoop_account >=", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountLessThan(String value) {
            addCriterion("hadoop_account <", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountLessThanOrEqualTo(String value) {
            addCriterion("hadoop_account <=", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountLike(String value) {
            addCriterion("hadoop_account like", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountNotLike(String value) {
            addCriterion("hadoop_account not like", value, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountIn(List<String> values) {
            addCriterion("hadoop_account in", values, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountNotIn(List<String> values) {
            addCriterion("hadoop_account not in", values, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountBetween(String value1, String value2) {
            addCriterion("hadoop_account between", value1, value2, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andHadoopAccountNotBetween(String value1, String value2) {
            addCriterion("hadoop_account not between", value1, value2, "hadoopAccount");
            return (Criteria) this;
        }

        public Criteria andRetryTimesIsNull() {
            addCriterion("retry_times is null");
            return (Criteria) this;
        }

        public Criteria andRetryTimesIsNotNull() {
            addCriterion("retry_times is not null");
            return (Criteria) this;
        }

        public Criteria andRetryTimesEqualTo(Byte value) {
            addCriterion("retry_times =", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesNotEqualTo(Byte value) {
            addCriterion("retry_times <>", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesGreaterThan(Byte value) {
            addCriterion("retry_times >", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("retry_times >=", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesLessThan(Byte value) {
            addCriterion("retry_times <", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesLessThanOrEqualTo(Byte value) {
            addCriterion("retry_times <=", value, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesIn(List<Byte> values) {
            addCriterion("retry_times in", values, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesNotIn(List<Byte> values) {
            addCriterion("retry_times not in", values, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesBetween(Byte value1, Byte value2) {
            addCriterion("retry_times between", value1, value2, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andRetryTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("retry_times not between", value1, value2, "retryTimes");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerIsNull() {
            addCriterion("only_alert_owner is null");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerIsNotNull() {
            addCriterion("only_alert_owner is not null");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerEqualTo(Byte value) {
            addCriterion("only_alert_owner =", value, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerNotEqualTo(Byte value) {
            addCriterion("only_alert_owner <>", value, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerGreaterThan(Byte value) {
            addCriterion("only_alert_owner >", value, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerGreaterThanOrEqualTo(Byte value) {
            addCriterion("only_alert_owner >=", value, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerLessThan(Byte value) {
            addCriterion("only_alert_owner <", value, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerLessThanOrEqualTo(Byte value) {
            addCriterion("only_alert_owner <=", value, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerIn(List<Byte> values) {
            addCriterion("only_alert_owner in", values, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerNotIn(List<Byte> values) {
            addCriterion("only_alert_owner not in", values, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerBetween(Byte value1, Byte value2) {
            addCriterion("only_alert_owner between", value1, value2, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andOnlyAlertOwnerNotBetween(Byte value1, Byte value2) {
            addCriterion("only_alert_owner not between", value1, value2, "onlyAlertOwner");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertIsNull() {
            addCriterion("use_default_alert is null");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertIsNotNull() {
            addCriterion("use_default_alert is not null");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertEqualTo(Byte value) {
            addCriterion("use_default_alert =", value, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertNotEqualTo(Byte value) {
            addCriterion("use_default_alert <>", value, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertGreaterThan(Byte value) {
            addCriterion("use_default_alert >", value, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_default_alert >=", value, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertLessThan(Byte value) {
            addCriterion("use_default_alert <", value, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertLessThanOrEqualTo(Byte value) {
            addCriterion("use_default_alert <=", value, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertIn(List<Byte> values) {
            addCriterion("use_default_alert in", values, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertNotIn(List<Byte> values) {
            addCriterion("use_default_alert not in", values, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertBetween(Byte value1, Byte value2) {
            addCriterion("use_default_alert between", value1, value2, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUseDefaultAlertNotBetween(Byte value1, Byte value2) {
            addCriterion("use_default_alert not between", value1, value2, "useDefaultAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertIsNull() {
            addCriterion("use_phone_alert is null");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertIsNotNull() {
            addCriterion("use_phone_alert is not null");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertEqualTo(Byte value) {
            addCriterion("use_phone_alert =", value, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertNotEqualTo(Byte value) {
            addCriterion("use_phone_alert <>", value, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertGreaterThan(Byte value) {
            addCriterion("use_phone_alert >", value, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_phone_alert >=", value, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertLessThan(Byte value) {
            addCriterion("use_phone_alert <", value, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertLessThanOrEqualTo(Byte value) {
            addCriterion("use_phone_alert <=", value, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertIn(List<Byte> values) {
            addCriterion("use_phone_alert in", values, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertNotIn(List<Byte> values) {
            addCriterion("use_phone_alert not in", values, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertBetween(Byte value1, Byte value2) {
            addCriterion("use_phone_alert between", value1, value2, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUsePhoneAlertNotBetween(Byte value1, Byte value2) {
            addCriterion("use_phone_alert not between", value1, value2, "usePhoneAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertIsNull() {
            addCriterion("use_sms_alert is null");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertIsNotNull() {
            addCriterion("use_sms_alert is not null");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertEqualTo(Byte value) {
            addCriterion("use_sms_alert =", value, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertNotEqualTo(Byte value) {
            addCriterion("use_sms_alert <>", value, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertGreaterThan(Byte value) {
            addCriterion("use_sms_alert >", value, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_sms_alert >=", value, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertLessThan(Byte value) {
            addCriterion("use_sms_alert <", value, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertLessThanOrEqualTo(Byte value) {
            addCriterion("use_sms_alert <=", value, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertIn(List<Byte> values) {
            addCriterion("use_sms_alert in", values, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertNotIn(List<Byte> values) {
            addCriterion("use_sms_alert not in", values, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertBetween(Byte value1, Byte value2) {
            addCriterion("use_sms_alert between", value1, value2, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseSmsAlertNotBetween(Byte value1, Byte value2) {
            addCriterion("use_sms_alert not between", value1, value2, "useSmsAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertIsNull() {
            addCriterion("use_mail_alert is null");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertIsNotNull() {
            addCriterion("use_mail_alert is not null");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertEqualTo(Byte value) {
            addCriterion("use_mail_alert =", value, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertNotEqualTo(Byte value) {
            addCriterion("use_mail_alert <>", value, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertGreaterThan(Byte value) {
            addCriterion("use_mail_alert >", value, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_mail_alert >=", value, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertLessThan(Byte value) {
            addCriterion("use_mail_alert <", value, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertLessThanOrEqualTo(Byte value) {
            addCriterion("use_mail_alert <=", value, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertIn(List<Byte> values) {
            addCriterion("use_mail_alert in", values, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertNotIn(List<Byte> values) {
            addCriterion("use_mail_alert not in", values, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertBetween(Byte value1, Byte value2) {
            addCriterion("use_mail_alert between", value1, value2, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andUseMailAlertNotBetween(Byte value1, Byte value2) {
            addCriterion("use_mail_alert not between", value1, value2, "useMailAlert");
            return (Criteria) this;
        }

        public Criteria andAlertMailsIsNull() {
            addCriterion("alert_mails is null");
            return (Criteria) this;
        }

        public Criteria andAlertMailsIsNotNull() {
            addCriterion("alert_mails is not null");
            return (Criteria) this;
        }

        public Criteria andAlertMailsEqualTo(String value) {
            addCriterion("alert_mails =", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsNotEqualTo(String value) {
            addCriterion("alert_mails <>", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsGreaterThan(String value) {
            addCriterion("alert_mails >", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsGreaterThanOrEqualTo(String value) {
            addCriterion("alert_mails >=", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsLessThan(String value) {
            addCriterion("alert_mails <", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsLessThanOrEqualTo(String value) {
            addCriterion("alert_mails <=", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsLike(String value) {
            addCriterion("alert_mails like", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsNotLike(String value) {
            addCriterion("alert_mails not like", value, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsIn(List<String> values) {
            addCriterion("alert_mails in", values, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsNotIn(List<String> values) {
            addCriterion("alert_mails not in", values, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsBetween(String value1, String value2) {
            addCriterion("alert_mails between", value1, value2, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertMailsNotBetween(String value1, String value2) {
            addCriterion("alert_mails not between", value1, value2, "alertMails");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesIsNull() {
            addCriterion("alert_phones is null");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesIsNotNull() {
            addCriterion("alert_phones is not null");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesEqualTo(String value) {
            addCriterion("alert_phones =", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesNotEqualTo(String value) {
            addCriterion("alert_phones <>", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesGreaterThan(String value) {
            addCriterion("alert_phones >", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesGreaterThanOrEqualTo(String value) {
            addCriterion("alert_phones >=", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesLessThan(String value) {
            addCriterion("alert_phones <", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesLessThanOrEqualTo(String value) {
            addCriterion("alert_phones <=", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesLike(String value) {
            addCriterion("alert_phones like", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesNotLike(String value) {
            addCriterion("alert_phones not like", value, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesIn(List<String> values) {
            addCriterion("alert_phones in", values, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesNotIn(List<String> values) {
            addCriterion("alert_phones not in", values, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesBetween(String value1, String value2) {
            addCriterion("alert_phones between", value1, value2, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertPhonesNotBetween(String value1, String value2) {
            addCriterion("alert_phones not between", value1, value2, "alertPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesIsNull() {
            addCriterion("alert_sms_phones is null");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesIsNotNull() {
            addCriterion("alert_sms_phones is not null");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesEqualTo(String value) {
            addCriterion("alert_sms_phones =", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesNotEqualTo(String value) {
            addCriterion("alert_sms_phones <>", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesGreaterThan(String value) {
            addCriterion("alert_sms_phones >", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesGreaterThanOrEqualTo(String value) {
            addCriterion("alert_sms_phones >=", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesLessThan(String value) {
            addCriterion("alert_sms_phones <", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesLessThanOrEqualTo(String value) {
            addCriterion("alert_sms_phones <=", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesLike(String value) {
            addCriterion("alert_sms_phones like", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesNotLike(String value) {
            addCriterion("alert_sms_phones not like", value, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesIn(List<String> values) {
            addCriterion("alert_sms_phones in", values, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesNotIn(List<String> values) {
            addCriterion("alert_sms_phones not in", values, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesBetween(String value1, String value2) {
            addCriterion("alert_sms_phones between", value1, value2, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andAlertSmsPhonesNotBetween(String value1, String value2) {
            addCriterion("alert_sms_phones not between", value1, value2, "alertSmsPhones");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andProductLineIsNull() {
            addCriterion("product_line is null");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNotNull() {
            addCriterion("product_line is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineEqualTo(String value) {
            addCriterion("product_line =", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotEqualTo(String value) {
            addCriterion("product_line <>", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThan(String value) {
            addCriterion("product_line >", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThanOrEqualTo(String value) {
            addCriterion("product_line >=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThan(String value) {
            addCriterion("product_line <", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThanOrEqualTo(String value) {
            addCriterion("product_line <=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLike(String value) {
            addCriterion("product_line like", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotLike(String value) {
            addCriterion("product_line not like", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineIn(List<String> values) {
            addCriterion("product_line in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotIn(List<String> values) {
            addCriterion("product_line not in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineBetween(String value1, String value2) {
            addCriterion("product_line between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotBetween(String value1, String value2) {
            addCriterion("product_line not between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andDwLevelIsNull() {
            addCriterion("dw_level is null");
            return (Criteria) this;
        }

        public Criteria andDwLevelIsNotNull() {
            addCriterion("dw_level is not null");
            return (Criteria) this;
        }

        public Criteria andDwLevelEqualTo(String value) {
            addCriterion("dw_level =", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelNotEqualTo(String value) {
            addCriterion("dw_level <>", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelGreaterThan(String value) {
            addCriterion("dw_level >", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelGreaterThanOrEqualTo(String value) {
            addCriterion("dw_level >=", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelLessThan(String value) {
            addCriterion("dw_level <", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelLessThanOrEqualTo(String value) {
            addCriterion("dw_level <=", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelLike(String value) {
            addCriterion("dw_level like", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelNotLike(String value) {
            addCriterion("dw_level not like", value, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelIn(List<String> values) {
            addCriterion("dw_level in", values, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelNotIn(List<String> values) {
            addCriterion("dw_level not in", values, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelBetween(String value1, String value2) {
            addCriterion("dw_level between", value1, value2, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andDwLevelNotBetween(String value1, String value2) {
            addCriterion("dw_level not between", value1, value2, "dwLevel");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andModeTimeIsNull() {
            addCriterion("mode_time is null");
            return (Criteria) this;
        }

        public Criteria andModeTimeIsNotNull() {
            addCriterion("mode_time is not null");
            return (Criteria) this;
        }

        public Criteria andModeTimeEqualTo(Date value) {
            addCriterion("mode_time =", value, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeNotEqualTo(Date value) {
            addCriterion("mode_time <>", value, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeGreaterThan(Date value) {
            addCriterion("mode_time >", value, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mode_time >=", value, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeLessThan(Date value) {
            addCriterion("mode_time <", value, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeLessThanOrEqualTo(Date value) {
            addCriterion("mode_time <=", value, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeIn(List<Date> values) {
            addCriterion("mode_time in", values, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeNotIn(List<Date> values) {
            addCriterion("mode_time not in", values, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeBetween(Date value1, Date value2) {
            addCriterion("mode_time between", value1, value2, "modeTime");
            return (Criteria) this;
        }

        public Criteria andModeTimeNotBetween(Date value1, Date value2) {
            addCriterion("mode_time not between", value1, value2, "modeTime");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeIsNull() {
            addCriterion("task_exe_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeIsNotNull() {
            addCriterion("task_exe_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeEqualTo(String value) {
            addCriterion("task_exe_type =", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeNotEqualTo(String value) {
            addCriterion("task_exe_type <>", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeGreaterThan(String value) {
            addCriterion("task_exe_type >", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_exe_type >=", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeLessThan(String value) {
            addCriterion("task_exe_type <", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeLessThanOrEqualTo(String value) {
            addCriterion("task_exe_type <=", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeLike(String value) {
            addCriterion("task_exe_type like", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeNotLike(String value) {
            addCriterion("task_exe_type not like", value, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeIn(List<String> values) {
            addCriterion("task_exe_type in", values, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeNotIn(List<String> values) {
            addCriterion("task_exe_type not in", values, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeBetween(String value1, String value2) {
            addCriterion("task_exe_type between", value1, value2, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andTaskExeTypeNotBetween(String value1, String value2) {
            addCriterion("task_exe_type not between", value1, value2, "taskExeType");
            return (Criteria) this;
        }

        public Criteria andCascadeIsNull() {
            addCriterion("cascade is null");
            return (Criteria) this;
        }

        public Criteria andCascadeIsNotNull() {
            addCriterion("cascade is not null");
            return (Criteria) this;
        }

        public Criteria andCascadeEqualTo(Boolean value) {
            addCriterion("cascade =", value, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeNotEqualTo(Boolean value) {
            addCriterion("cascade <>", value, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeGreaterThan(Boolean value) {
            addCriterion("cascade >", value, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cascade >=", value, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeLessThan(Boolean value) {
            addCriterion("cascade <", value, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeLessThanOrEqualTo(Boolean value) {
            addCriterion("cascade <=", value, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeIn(List<Boolean> values) {
            addCriterion("cascade in", values, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeNotIn(List<Boolean> values) {
            addCriterion("cascade not in", values, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeBetween(Boolean value1, Boolean value2) {
            addCriterion("cascade between", value1, value2, "cascade");
            return (Criteria) this;
        }

        public Criteria andCascadeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cascade not between", value1, value2, "cascade");
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