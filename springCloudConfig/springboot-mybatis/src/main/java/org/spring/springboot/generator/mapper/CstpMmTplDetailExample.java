package org.spring.springboot.generator.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CstpMmTplDetailExample {
    /**
     * TTRD_XCC_CFETS_MM_TPL_DETAIL
     */
    protected String orderByClause;

    /**
     * TTRD_XCC_CFETS_MM_TPL_DETAIL
     */
    protected boolean distinct;

    /**
     * TTRD_XCC_CFETS_MM_TPL_DETAIL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public CstpMmTplDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-21
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * TTRD_XCC_CFETS_MM_TPL_DETAIL 2018-09-21
     */
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

        public Criteria andICodeIsNull() {
            addCriterion("I_CODE is null");
            return (Criteria) this;
        }

        public Criteria andICodeIsNotNull() {
            addCriterion("I_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andICodeEqualTo(String value) {
            addCriterion("I_CODE =", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeNotEqualTo(String value) {
            addCriterion("I_CODE <>", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeGreaterThan(String value) {
            addCriterion("I_CODE >", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeGreaterThanOrEqualTo(String value) {
            addCriterion("I_CODE >=", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeLessThan(String value) {
            addCriterion("I_CODE <", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeLessThanOrEqualTo(String value) {
            addCriterion("I_CODE <=", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeLike(String value) {
            addCriterion("I_CODE like", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeNotLike(String value) {
            addCriterion("I_CODE not like", value, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeIn(List<String> values) {
            addCriterion("I_CODE in", values, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeNotIn(List<String> values) {
            addCriterion("I_CODE not in", values, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeBetween(String value1, String value2) {
            addCriterion("I_CODE between", value1, value2, "iCode");
            return (Criteria) this;
        }

        public Criteria andICodeNotBetween(String value1, String value2) {
            addCriterion("I_CODE not between", value1, value2, "iCode");
            return (Criteria) this;
        }

        public Criteria andTplIdIsNull() {
            addCriterion("TPL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTplIdIsNotNull() {
            addCriterion("TPL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTplIdEqualTo(BigDecimal value) {
            addCriterion("TPL_ID =", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotEqualTo(BigDecimal value) {
            addCriterion("TPL_ID <>", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdGreaterThan(BigDecimal value) {
            addCriterion("TPL_ID >", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TPL_ID >=", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdLessThan(BigDecimal value) {
            addCriterion("TPL_ID <", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TPL_ID <=", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdIn(List<BigDecimal> values) {
            addCriterion("TPL_ID in", values, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotIn(List<BigDecimal> values) {
            addCriterion("TPL_ID not in", values, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TPL_ID between", value1, value2, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TPL_ID not between", value1, value2, "tplId");
            return (Criteria) this;
        }

        public Criteria andINameIsNull() {
            addCriterion("I_NAME is null");
            return (Criteria) this;
        }

        public Criteria andINameIsNotNull() {
            addCriterion("I_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andINameEqualTo(String value) {
            addCriterion("I_NAME =", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotEqualTo(String value) {
            addCriterion("I_NAME <>", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThan(String value) {
            addCriterion("I_NAME >", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThanOrEqualTo(String value) {
            addCriterion("I_NAME >=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThan(String value) {
            addCriterion("I_NAME <", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThanOrEqualTo(String value) {
            addCriterion("I_NAME <=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLike(String value) {
            addCriterion("I_NAME like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotLike(String value) {
            addCriterion("I_NAME not like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameIn(List<String> values) {
            addCriterion("I_NAME in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotIn(List<String> values) {
            addCriterion("I_NAME not in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameBetween(String value1, String value2) {
            addCriterion("I_NAME between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotBetween(String value1, String value2) {
            addCriterion("I_NAME not between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andATypeIsNull() {
            addCriterion("A_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andATypeIsNotNull() {
            addCriterion("A_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andATypeEqualTo(String value) {
            addCriterion("A_TYPE =", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotEqualTo(String value) {
            addCriterion("A_TYPE <>", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThan(String value) {
            addCriterion("A_TYPE >", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThanOrEqualTo(String value) {
            addCriterion("A_TYPE >=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThan(String value) {
            addCriterion("A_TYPE <", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThanOrEqualTo(String value) {
            addCriterion("A_TYPE <=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLike(String value) {
            addCriterion("A_TYPE like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotLike(String value) {
            addCriterion("A_TYPE not like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeIn(List<String> values) {
            addCriterion("A_TYPE in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotIn(List<String> values) {
            addCriterion("A_TYPE not in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeBetween(String value1, String value2) {
            addCriterion("A_TYPE between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotBetween(String value1, String value2) {
            addCriterion("A_TYPE not between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("M_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("M_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(String value) {
            addCriterion("M_TYPE =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(String value) {
            addCriterion("M_TYPE <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(String value) {
            addCriterion("M_TYPE >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(String value) {
            addCriterion("M_TYPE >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(String value) {
            addCriterion("M_TYPE <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(String value) {
            addCriterion("M_TYPE <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLike(String value) {
            addCriterion("M_TYPE like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotLike(String value) {
            addCriterion("M_TYPE not like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<String> values) {
            addCriterion("M_TYPE in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<String> values) {
            addCriterion("M_TYPE not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(String value1, String value2) {
            addCriterion("M_TYPE between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(String value1, String value2) {
            addCriterion("M_TYPE not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsIsNull() {
            addCriterion("BASIC_QUOTATIONS is null");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsIsNotNull() {
            addCriterion("BASIC_QUOTATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsEqualTo(Long value) {
            addCriterion("BASIC_QUOTATIONS =", value, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsNotEqualTo(Long value) {
            addCriterion("BASIC_QUOTATIONS <>", value, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsGreaterThan(Long value) {
            addCriterion("BASIC_QUOTATIONS >", value, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsGreaterThanOrEqualTo(Long value) {
            addCriterion("BASIC_QUOTATIONS >=", value, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsLessThan(Long value) {
            addCriterion("BASIC_QUOTATIONS <", value, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsLessThanOrEqualTo(Long value) {
            addCriterion("BASIC_QUOTATIONS <=", value, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsIn(List<Long> values) {
            addCriterion("BASIC_QUOTATIONS in", values, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsNotIn(List<Long> values) {
            addCriterion("BASIC_QUOTATIONS not in", values, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsBetween(Long value1, Long value2) {
            addCriterion("BASIC_QUOTATIONS between", value1, value2, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andBasicQuotationsNotBetween(Long value1, Long value2) {
            addCriterion("BASIC_QUOTATIONS not between", value1, value2, "basicQuotations");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkIsNull() {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK is null");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkIsNotNull() {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkEqualTo(Short value) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK =", value, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkNotEqualTo(Short value) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK <>", value, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkGreaterThan(Short value) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK >", value, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkGreaterThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK >=", value, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkLessThan(Short value) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK <", value, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkLessThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK <=", value, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkIn(List<Short> values) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK in", values, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkNotIn(List<Short> values) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK not in", values, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK between", value1, value2, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andDefaultQuotationBenchmarkNotBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_QUOTATION_BENCHMARK not between", value1, value2, "defaultQuotationBenchmark");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyIsNull() {
            addCriterion("SETDAYS_BUY is null");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyIsNotNull() {
            addCriterion("SETDAYS_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyEqualTo(Short value) {
            addCriterion("SETDAYS_BUY =", value, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyNotEqualTo(Short value) {
            addCriterion("SETDAYS_BUY <>", value, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyGreaterThan(Short value) {
            addCriterion("SETDAYS_BUY >", value, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyGreaterThanOrEqualTo(Short value) {
            addCriterion("SETDAYS_BUY >=", value, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyLessThan(Short value) {
            addCriterion("SETDAYS_BUY <", value, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyLessThanOrEqualTo(Short value) {
            addCriterion("SETDAYS_BUY <=", value, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyIn(List<Short> values) {
            addCriterion("SETDAYS_BUY in", values, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyNotIn(List<Short> values) {
            addCriterion("SETDAYS_BUY not in", values, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyBetween(Short value1, Short value2) {
            addCriterion("SETDAYS_BUY between", value1, value2, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysBuyNotBetween(Short value1, Short value2) {
            addCriterion("SETDAYS_BUY not between", value1, value2, "setdaysBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyIsNull() {
            addCriterion("DELIVERYTYPE_BUY is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyIsNotNull() {
            addCriterion("DELIVERYTYPE_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyEqualTo(String value) {
            addCriterion("DELIVERYTYPE_BUY =", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyNotEqualTo(String value) {
            addCriterion("DELIVERYTYPE_BUY <>", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyGreaterThan(String value) {
            addCriterion("DELIVERYTYPE_BUY >", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERYTYPE_BUY >=", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyLessThan(String value) {
            addCriterion("DELIVERYTYPE_BUY <", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyLessThanOrEqualTo(String value) {
            addCriterion("DELIVERYTYPE_BUY <=", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyLike(String value) {
            addCriterion("DELIVERYTYPE_BUY like", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyNotLike(String value) {
            addCriterion("DELIVERYTYPE_BUY not like", value, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyIn(List<String> values) {
            addCriterion("DELIVERYTYPE_BUY in", values, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyNotIn(List<String> values) {
            addCriterion("DELIVERYTYPE_BUY not in", values, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyBetween(String value1, String value2) {
            addCriterion("DELIVERYTYPE_BUY between", value1, value2, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBuyNotBetween(String value1, String value2) {
            addCriterion("DELIVERYTYPE_BUY not between", value1, value2, "deliverytypeBuy");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellIsNull() {
            addCriterion("SETDAYS_SELL is null");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellIsNotNull() {
            addCriterion("SETDAYS_SELL is not null");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellEqualTo(Short value) {
            addCriterion("SETDAYS_SELL =", value, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellNotEqualTo(Short value) {
            addCriterion("SETDAYS_SELL <>", value, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellGreaterThan(Short value) {
            addCriterion("SETDAYS_SELL >", value, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellGreaterThanOrEqualTo(Short value) {
            addCriterion("SETDAYS_SELL >=", value, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellLessThan(Short value) {
            addCriterion("SETDAYS_SELL <", value, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellLessThanOrEqualTo(Short value) {
            addCriterion("SETDAYS_SELL <=", value, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellIn(List<Short> values) {
            addCriterion("SETDAYS_SELL in", values, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellNotIn(List<Short> values) {
            addCriterion("SETDAYS_SELL not in", values, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellBetween(Short value1, Short value2) {
            addCriterion("SETDAYS_SELL between", value1, value2, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andSetdaysSellNotBetween(Short value1, Short value2) {
            addCriterion("SETDAYS_SELL not between", value1, value2, "setdaysSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellIsNull() {
            addCriterion("DELIVERYTYPE_SELL is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellIsNotNull() {
            addCriterion("DELIVERYTYPE_SELL is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellEqualTo(String value) {
            addCriterion("DELIVERYTYPE_SELL =", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellNotEqualTo(String value) {
            addCriterion("DELIVERYTYPE_SELL <>", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellGreaterThan(String value) {
            addCriterion("DELIVERYTYPE_SELL >", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERYTYPE_SELL >=", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellLessThan(String value) {
            addCriterion("DELIVERYTYPE_SELL <", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellLessThanOrEqualTo(String value) {
            addCriterion("DELIVERYTYPE_SELL <=", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellLike(String value) {
            addCriterion("DELIVERYTYPE_SELL like", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellNotLike(String value) {
            addCriterion("DELIVERYTYPE_SELL not like", value, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellIn(List<String> values) {
            addCriterion("DELIVERYTYPE_SELL in", values, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellNotIn(List<String> values) {
            addCriterion("DELIVERYTYPE_SELL not in", values, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellBetween(String value1, String value2) {
            addCriterion("DELIVERYTYPE_SELL between", value1, value2, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeSellNotBetween(String value1, String value2) {
            addCriterion("DELIVERYTYPE_SELL not between", value1, value2, "deliverytypeSell");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountIsNull() {
            addCriterion("MAX_DISPALY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountIsNotNull() {
            addCriterion("MAX_DISPALY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountEqualTo(Long value) {
            addCriterion("MAX_DISPALY_AMOUNT =", value, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountNotEqualTo(Long value) {
            addCriterion("MAX_DISPALY_AMOUNT <>", value, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountGreaterThan(Long value) {
            addCriterion("MAX_DISPALY_AMOUNT >", value, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_DISPALY_AMOUNT >=", value, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountLessThan(Long value) {
            addCriterion("MAX_DISPALY_AMOUNT <", value, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountLessThanOrEqualTo(Long value) {
            addCriterion("MAX_DISPALY_AMOUNT <=", value, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountIn(List<Long> values) {
            addCriterion("MAX_DISPALY_AMOUNT in", values, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountNotIn(List<Long> values) {
            addCriterion("MAX_DISPALY_AMOUNT not in", values, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountBetween(Long value1, Long value2) {
            addCriterion("MAX_DISPALY_AMOUNT between", value1, value2, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andMaxDispalyAmountNotBetween(Long value1, Long value2) {
            addCriterion("MAX_DISPALY_AMOUNT not between", value1, value2, "maxDispalyAmount");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitIsNull() {
            addCriterion("DEAL_CHANGE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitIsNotNull() {
            addCriterion("DEAL_CHANGE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitEqualTo(Long value) {
            addCriterion("DEAL_CHANGE_UNIT =", value, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitNotEqualTo(Long value) {
            addCriterion("DEAL_CHANGE_UNIT <>", value, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitGreaterThan(Long value) {
            addCriterion("DEAL_CHANGE_UNIT >", value, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitGreaterThanOrEqualTo(Long value) {
            addCriterion("DEAL_CHANGE_UNIT >=", value, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitLessThan(Long value) {
            addCriterion("DEAL_CHANGE_UNIT <", value, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitLessThanOrEqualTo(Long value) {
            addCriterion("DEAL_CHANGE_UNIT <=", value, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitIn(List<Long> values) {
            addCriterion("DEAL_CHANGE_UNIT in", values, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitNotIn(List<Long> values) {
            addCriterion("DEAL_CHANGE_UNIT not in", values, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitBetween(Long value1, Long value2) {
            addCriterion("DEAL_CHANGE_UNIT between", value1, value2, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andDealChangeUnitNotBetween(Long value1, Long value2) {
            addCriterion("DEAL_CHANGE_UNIT not between", value1, value2, "dealChangeUnit");
            return (Criteria) this;
        }

        public Criteria andYtmTypeIsNull() {
            addCriterion("YTM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andYtmTypeIsNotNull() {
            addCriterion("YTM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andYtmTypeEqualTo(Short value) {
            addCriterion("YTM_TYPE =", value, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeNotEqualTo(Short value) {
            addCriterion("YTM_TYPE <>", value, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeGreaterThan(Short value) {
            addCriterion("YTM_TYPE >", value, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("YTM_TYPE >=", value, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeLessThan(Short value) {
            addCriterion("YTM_TYPE <", value, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeLessThanOrEqualTo(Short value) {
            addCriterion("YTM_TYPE <=", value, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeIn(List<Short> values) {
            addCriterion("YTM_TYPE in", values, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeNotIn(List<Short> values) {
            addCriterion("YTM_TYPE not in", values, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeBetween(Short value1, Short value2) {
            addCriterion("YTM_TYPE between", value1, value2, "ytmType");
            return (Criteria) this;
        }

        public Criteria andYtmTypeNotBetween(Short value1, Short value2) {
            addCriterion("YTM_TYPE not between", value1, value2, "ytmType");
            return (Criteria) this;
        }

        public Criteria andGroupingIsNull() {
            addCriterion("GROUPING is null");
            return (Criteria) this;
        }

        public Criteria andGroupingIsNotNull() {
            addCriterion("GROUPING is not null");
            return (Criteria) this;
        }

        public Criteria andGroupingEqualTo(String value) {
            addCriterion("GROUPING =", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotEqualTo(String value) {
            addCriterion("GROUPING <>", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingGreaterThan(String value) {
            addCriterion("GROUPING >", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPING >=", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingLessThan(String value) {
            addCriterion("GROUPING <", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingLessThanOrEqualTo(String value) {
            addCriterion("GROUPING <=", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingLike(String value) {
            addCriterion("GROUPING like", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotLike(String value) {
            addCriterion("GROUPING not like", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingIn(List<String> values) {
            addCriterion("GROUPING in", values, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotIn(List<String> values) {
            addCriterion("GROUPING not in", values, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingBetween(String value1, String value2) {
            addCriterion("GROUPING between", value1, value2, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotBetween(String value1, String value2) {
            addCriterion("GROUPING not between", value1, value2, "grouping");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("UNIT_ID like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("UNIT_ID not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andTraderIdIsNull() {
            addCriterion("TRADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTraderIdIsNotNull() {
            addCriterion("TRADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTraderIdEqualTo(String value) {
            addCriterion("TRADER_ID =", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdNotEqualTo(String value) {
            addCriterion("TRADER_ID <>", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdGreaterThan(String value) {
            addCriterion("TRADER_ID >", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRADER_ID >=", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdLessThan(String value) {
            addCriterion("TRADER_ID <", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdLessThanOrEqualTo(String value) {
            addCriterion("TRADER_ID <=", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdLike(String value) {
            addCriterion("TRADER_ID like", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdNotLike(String value) {
            addCriterion("TRADER_ID not like", value, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdIn(List<String> values) {
            addCriterion("TRADER_ID in", values, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdNotIn(List<String> values) {
            addCriterion("TRADER_ID not in", values, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdBetween(String value1, String value2) {
            addCriterion("TRADER_ID between", value1, value2, "traderId");
            return (Criteria) this;
        }

        public Criteria andTraderIdNotBetween(String value1, String value2) {
            addCriterion("TRADER_ID not between", value1, value2, "traderId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdIsNull() {
            addCriterion("TPL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTplUserIdIsNotNull() {
            addCriterion("TPL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTplUserIdEqualTo(String value) {
            addCriterion("TPL_USER_ID =", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdNotEqualTo(String value) {
            addCriterion("TPL_USER_ID <>", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdGreaterThan(String value) {
            addCriterion("TPL_USER_ID >", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPL_USER_ID >=", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdLessThan(String value) {
            addCriterion("TPL_USER_ID <", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdLessThanOrEqualTo(String value) {
            addCriterion("TPL_USER_ID <=", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdLike(String value) {
            addCriterion("TPL_USER_ID like", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdNotLike(String value) {
            addCriterion("TPL_USER_ID not like", value, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdIn(List<String> values) {
            addCriterion("TPL_USER_ID in", values, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdNotIn(List<String> values) {
            addCriterion("TPL_USER_ID not in", values, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdBetween(String value1, String value2) {
            addCriterion("TPL_USER_ID between", value1, value2, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andTplUserIdNotBetween(String value1, String value2) {
            addCriterion("TPL_USER_ID not between", value1, value2, "tplUserId");
            return (Criteria) this;
        }

        public Criteria andSecuAccidIsNull() {
            addCriterion("SECU_ACCID is null");
            return (Criteria) this;
        }

        public Criteria andSecuAccidIsNotNull() {
            addCriterion("SECU_ACCID is not null");
            return (Criteria) this;
        }

        public Criteria andSecuAccidEqualTo(String value) {
            addCriterion("SECU_ACCID =", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidNotEqualTo(String value) {
            addCriterion("SECU_ACCID <>", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidGreaterThan(String value) {
            addCriterion("SECU_ACCID >", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidGreaterThanOrEqualTo(String value) {
            addCriterion("SECU_ACCID >=", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidLessThan(String value) {
            addCriterion("SECU_ACCID <", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidLessThanOrEqualTo(String value) {
            addCriterion("SECU_ACCID <=", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidLike(String value) {
            addCriterion("SECU_ACCID like", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidNotLike(String value) {
            addCriterion("SECU_ACCID not like", value, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidIn(List<String> values) {
            addCriterion("SECU_ACCID in", values, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidNotIn(List<String> values) {
            addCriterion("SECU_ACCID not in", values, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidBetween(String value1, String value2) {
            addCriterion("SECU_ACCID between", value1, value2, "secuAccid");
            return (Criteria) this;
        }

        public Criteria andSecuAccidNotBetween(String value1, String value2) {
            addCriterion("SECU_ACCID not between", value1, value2, "secuAccid");
            return (Criteria) this;
        }
    }

    /**
     * TTRD_XCC_CFETS_MM_TPL_DETAIL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * TTRD_XCC_CFETS_MM_TPL_DETAIL 2018-09-21
     */
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