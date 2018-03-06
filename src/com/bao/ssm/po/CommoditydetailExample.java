package com.bao.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommoditydetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommoditydetailExample() {
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

        public Criteria andCommoditydetailIdIsNull() {
            addCriterion("commodityDetail_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdIsNotNull() {
            addCriterion("commodityDetail_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdEqualTo(Integer value) {
            addCriterion("commodityDetail_ID =", value, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdNotEqualTo(Integer value) {
            addCriterion("commodityDetail_ID <>", value, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdGreaterThan(Integer value) {
            addCriterion("commodityDetail_ID >", value, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityDetail_ID >=", value, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdLessThan(Integer value) {
            addCriterion("commodityDetail_ID <", value, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodityDetail_ID <=", value, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdIn(List<Integer> values) {
            addCriterion("commodityDetail_ID in", values, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdNotIn(List<Integer> values) {
            addCriterion("commodityDetail_ID not in", values, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdBetween(Integer value1, Integer value2) {
            addCriterion("commodityDetail_ID between", value1, value2, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityDetail_ID not between", value1, value2, "commoditydetailId");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameIsNull() {
            addCriterion("commodityDetail_name is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameIsNotNull() {
            addCriterion("commodityDetail_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameEqualTo(String value) {
            addCriterion("commodityDetail_name =", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameNotEqualTo(String value) {
            addCriterion("commodityDetail_name <>", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameGreaterThan(String value) {
            addCriterion("commodityDetail_name >", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityDetail_name >=", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameLessThan(String value) {
            addCriterion("commodityDetail_name <", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameLessThanOrEqualTo(String value) {
            addCriterion("commodityDetail_name <=", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameLike(String value) {
            addCriterion("commodityDetail_name like", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameNotLike(String value) {
            addCriterion("commodityDetail_name not like", value, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameIn(List<String> values) {
            addCriterion("commodityDetail_name in", values, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameNotIn(List<String> values) {
            addCriterion("commodityDetail_name not in", values, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameBetween(String value1, String value2) {
            addCriterion("commodityDetail_name between", value1, value2, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNameNotBetween(String value1, String value2) {
            addCriterion("commodityDetail_name not between", value1, value2, "commoditydetailName");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceIsNull() {
            addCriterion("commodityDetail_pice is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceIsNotNull() {
            addCriterion("commodityDetail_pice is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceEqualTo(Double value) {
            addCriterion("commodityDetail_pice =", value, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceNotEqualTo(Double value) {
            addCriterion("commodityDetail_pice <>", value, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceGreaterThan(Double value) {
            addCriterion("commodityDetail_pice >", value, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceGreaterThanOrEqualTo(Double value) {
            addCriterion("commodityDetail_pice >=", value, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceLessThan(Double value) {
            addCriterion("commodityDetail_pice <", value, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceLessThanOrEqualTo(Double value) {
            addCriterion("commodityDetail_pice <=", value, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceIn(List<Double> values) {
            addCriterion("commodityDetail_pice in", values, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceNotIn(List<Double> values) {
            addCriterion("commodityDetail_pice not in", values, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceBetween(Double value1, Double value2) {
            addCriterion("commodityDetail_pice between", value1, value2, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailPiceNotBetween(Double value1, Double value2) {
            addCriterion("commodityDetail_pice not between", value1, value2, "commoditydetailPice");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeIsNull() {
            addCriterion("commodityDetail_time is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeIsNotNull() {
            addCriterion("commodityDetail_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeEqualTo(Date value) {
            addCriterion("commodityDetail_time =", value, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeNotEqualTo(Date value) {
            addCriterion("commodityDetail_time <>", value, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeGreaterThan(Date value) {
            addCriterion("commodityDetail_time >", value, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commodityDetail_time >=", value, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeLessThan(Date value) {
            addCriterion("commodityDetail_time <", value, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeLessThanOrEqualTo(Date value) {
            addCriterion("commodityDetail_time <=", value, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeIn(List<Date> values) {
            addCriterion("commodityDetail_time in", values, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeNotIn(List<Date> values) {
            addCriterion("commodityDetail_time not in", values, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeBetween(Date value1, Date value2) {
            addCriterion("commodityDetail_time between", value1, value2, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTimeNotBetween(Date value1, Date value2) {
            addCriterion("commodityDetail_time not between", value1, value2, "commoditydetailTime");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameIsNull() {
            addCriterion("commodityDetail_homeName is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameIsNotNull() {
            addCriterion("commodityDetail_homeName is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameEqualTo(String value) {
            addCriterion("commodityDetail_homeName =", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameNotEqualTo(String value) {
            addCriterion("commodityDetail_homeName <>", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameGreaterThan(String value) {
            addCriterion("commodityDetail_homeName >", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityDetail_homeName >=", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameLessThan(String value) {
            addCriterion("commodityDetail_homeName <", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameLessThanOrEqualTo(String value) {
            addCriterion("commodityDetail_homeName <=", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameLike(String value) {
            addCriterion("commodityDetail_homeName like", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameNotLike(String value) {
            addCriterion("commodityDetail_homeName not like", value, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameIn(List<String> values) {
            addCriterion("commodityDetail_homeName in", values, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameNotIn(List<String> values) {
            addCriterion("commodityDetail_homeName not in", values, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameBetween(String value1, String value2) {
            addCriterion("commodityDetail_homeName between", value1, value2, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailHomenameNotBetween(String value1, String value2) {
            addCriterion("commodityDetail_homeName not between", value1, value2, "commoditydetailHomename");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteIsNull() {
            addCriterion("commodityDetail_bewrite is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteIsNotNull() {
            addCriterion("commodityDetail_bewrite is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteEqualTo(String value) {
            addCriterion("commodityDetail_bewrite =", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteNotEqualTo(String value) {
            addCriterion("commodityDetail_bewrite <>", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteGreaterThan(String value) {
            addCriterion("commodityDetail_bewrite >", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteGreaterThanOrEqualTo(String value) {
            addCriterion("commodityDetail_bewrite >=", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteLessThan(String value) {
            addCriterion("commodityDetail_bewrite <", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteLessThanOrEqualTo(String value) {
            addCriterion("commodityDetail_bewrite <=", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteLike(String value) {
            addCriterion("commodityDetail_bewrite like", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteNotLike(String value) {
            addCriterion("commodityDetail_bewrite not like", value, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteIn(List<String> values) {
            addCriterion("commodityDetail_bewrite in", values, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteNotIn(List<String> values) {
            addCriterion("commodityDetail_bewrite not in", values, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteBetween(String value1, String value2) {
            addCriterion("commodityDetail_bewrite between", value1, value2, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBewriteNotBetween(String value1, String value2) {
            addCriterion("commodityDetail_bewrite not between", value1, value2, "commoditydetailBewrite");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeIsNull() {
            addCriterion("commodityDetail_type is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeIsNotNull() {
            addCriterion("commodityDetail_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeEqualTo(String value) {
            addCriterion("commodityDetail_type =", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeNotEqualTo(String value) {
            addCriterion("commodityDetail_type <>", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeGreaterThan(String value) {
            addCriterion("commodityDetail_type >", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("commodityDetail_type >=", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeLessThan(String value) {
            addCriterion("commodityDetail_type <", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeLessThanOrEqualTo(String value) {
            addCriterion("commodityDetail_type <=", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeLike(String value) {
            addCriterion("commodityDetail_type like", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeNotLike(String value) {
            addCriterion("commodityDetail_type not like", value, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeIn(List<String> values) {
            addCriterion("commodityDetail_type in", values, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeNotIn(List<String> values) {
            addCriterion("commodityDetail_type not in", values, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeBetween(String value1, String value2) {
            addCriterion("commodityDetail_type between", value1, value2, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailTypeNotBetween(String value1, String value2) {
            addCriterion("commodityDetail_type not between", value1, value2, "commoditydetailType");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNull() {
            addCriterion("Transaction_status is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNotNull() {
            addCriterion("Transaction_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusEqualTo(Integer value) {
            addCriterion("Transaction_status =", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotEqualTo(Integer value) {
            addCriterion("Transaction_status <>", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThan(Integer value) {
            addCriterion("Transaction_status >", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Transaction_status >=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThan(Integer value) {
            addCriterion("Transaction_status <", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Transaction_status <=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIn(List<Integer> values) {
            addCriterion("Transaction_status in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotIn(List<Integer> values) {
            addCriterion("Transaction_status not in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusBetween(Integer value1, Integer value2) {
            addCriterion("Transaction_status between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Transaction_status not between", value1, value2, "transactionStatus");
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