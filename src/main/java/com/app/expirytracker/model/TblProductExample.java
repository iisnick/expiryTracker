package com.app.expirytracker.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblProductExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public TblProductExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andDscIsNull() {
            addCriterion("dsc is null");
            return (Criteria) this;
        }

        public Criteria andDscIsNotNull() {
            addCriterion("dsc is not null");
            return (Criteria) this;
        }

        public Criteria andDscEqualTo(String value) {
            addCriterion("dsc =", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotEqualTo(String value) {
            addCriterion("dsc <>", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscGreaterThan(String value) {
            addCriterion("dsc >", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscGreaterThanOrEqualTo(String value) {
            addCriterion("dsc >=", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscLessThan(String value) {
            addCriterion("dsc <", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscLessThanOrEqualTo(String value) {
            addCriterion("dsc <=", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscLike(String value) {
            addCriterion("dsc like", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotLike(String value) {
            addCriterion("dsc not like", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscIn(List<String> values) {
            addCriterion("dsc in", values, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotIn(List<String> values) {
            addCriterion("dsc not in", values, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscBetween(String value1, String value2) {
            addCriterion("dsc between", value1, value2, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotBetween(String value1, String value2) {
            addCriterion("dsc not between", value1, value2, "dsc");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodIsNull() {
            addCriterion("prd_typ_cod is null");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodIsNotNull() {
            addCriterion("prd_typ_cod is not null");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodEqualTo(String value) {
            addCriterion("prd_typ_cod =", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodNotEqualTo(String value) {
            addCriterion("prd_typ_cod <>", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodGreaterThan(String value) {
            addCriterion("prd_typ_cod >", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodGreaterThanOrEqualTo(String value) {
            addCriterion("prd_typ_cod >=", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodLessThan(String value) {
            addCriterion("prd_typ_cod <", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodLessThanOrEqualTo(String value) {
            addCriterion("prd_typ_cod <=", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodLike(String value) {
            addCriterion("prd_typ_cod like", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodNotLike(String value) {
            addCriterion("prd_typ_cod not like", value, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodIn(List<String> values) {
            addCriterion("prd_typ_cod in", values, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodNotIn(List<String> values) {
            addCriterion("prd_typ_cod not in", values, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodBetween(String value1, String value2) {
            addCriterion("prd_typ_cod between", value1, value2, "prdTypCod");
            return (Criteria) this;
        }

        public Criteria andPrdTypCodNotBetween(String value1, String value2) {
            addCriterion("prd_typ_cod not between", value1, value2, "prdTypCod");
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

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNull() {
            addCriterion("last_mod_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNotNull() {
            addCriterion("last_mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeEqualTo(Date value) {
            addCriterion("last_mod_time =", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotEqualTo(Date value) {
            addCriterion("last_mod_time <>", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThan(Date value) {
            addCriterion("last_mod_time >", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_mod_time >=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThan(Date value) {
            addCriterion("last_mod_time <", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_mod_time <=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIn(List<Date> values) {
            addCriterion("last_mod_time in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotIn(List<Date> values) {
            addCriterion("last_mod_time not in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeBetween(Date value1, Date value2) {
            addCriterion("last_mod_time between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_mod_time not between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModByIsNull() {
            addCriterion("last_mod_by is null");
            return (Criteria) this;
        }

        public Criteria andLastModByIsNotNull() {
            addCriterion("last_mod_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastModByEqualTo(Integer value) {
            addCriterion("last_mod_by =", value, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByNotEqualTo(Integer value) {
            addCriterion("last_mod_by <>", value, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByGreaterThan(Integer value) {
            addCriterion("last_mod_by >", value, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_mod_by >=", value, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByLessThan(Integer value) {
            addCriterion("last_mod_by <", value, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByLessThanOrEqualTo(Integer value) {
            addCriterion("last_mod_by <=", value, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByIn(List<Integer> values) {
            addCriterion("last_mod_by in", values, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByNotIn(List<Integer> values) {
            addCriterion("last_mod_by not in", values, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByBetween(Integer value1, Integer value2) {
            addCriterion("last_mod_by between", value1, value2, "lastModBy");
            return (Criteria) this;
        }

        public Criteria andLastModByNotBetween(Integer value1, Integer value2) {
            addCriterion("last_mod_by not between", value1, value2, "lastModBy");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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