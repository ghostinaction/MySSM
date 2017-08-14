package com.cms.entity;

import java.util.ArrayList;
import java.util.List;

public class CpyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpyinfoExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andChuanzhengIsNull() {
            addCriterion("chuanzheng is null");
            return (Criteria) this;
        }

        public Criteria andChuanzhengIsNotNull() {
            addCriterion("chuanzheng is not null");
            return (Criteria) this;
        }

        public Criteria andChuanzhengEqualTo(String value) {
            addCriterion("chuanzheng =", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengNotEqualTo(String value) {
            addCriterion("chuanzheng <>", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengGreaterThan(String value) {
            addCriterion("chuanzheng >", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengGreaterThanOrEqualTo(String value) {
            addCriterion("chuanzheng >=", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengLessThan(String value) {
            addCriterion("chuanzheng <", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengLessThanOrEqualTo(String value) {
            addCriterion("chuanzheng <=", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengLike(String value) {
            addCriterion("chuanzheng like", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengNotLike(String value) {
            addCriterion("chuanzheng not like", value, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengIn(List<String> values) {
            addCriterion("chuanzheng in", values, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengNotIn(List<String> values) {
            addCriterion("chuanzheng not in", values, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengBetween(String value1, String value2) {
            addCriterion("chuanzheng between", value1, value2, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andChuanzhengNotBetween(String value1, String value2) {
            addCriterion("chuanzheng not between", value1, value2, "chuanzheng");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andBusEmailIsNull() {
            addCriterion("bus_email is null");
            return (Criteria) this;
        }

        public Criteria andBusEmailIsNotNull() {
            addCriterion("bus_email is not null");
            return (Criteria) this;
        }

        public Criteria andBusEmailEqualTo(String value) {
            addCriterion("bus_email =", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailNotEqualTo(String value) {
            addCriterion("bus_email <>", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailGreaterThan(String value) {
            addCriterion("bus_email >", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailGreaterThanOrEqualTo(String value) {
            addCriterion("bus_email >=", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailLessThan(String value) {
            addCriterion("bus_email <", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailLessThanOrEqualTo(String value) {
            addCriterion("bus_email <=", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailLike(String value) {
            addCriterion("bus_email like", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailNotLike(String value) {
            addCriterion("bus_email not like", value, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailIn(List<String> values) {
            addCriterion("bus_email in", values, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailNotIn(List<String> values) {
            addCriterion("bus_email not in", values, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailBetween(String value1, String value2) {
            addCriterion("bus_email between", value1, value2, "busEmail");
            return (Criteria) this;
        }

        public Criteria andBusEmailNotBetween(String value1, String value2) {
            addCriterion("bus_email not between", value1, value2, "busEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailIsNull() {
            addCriterion("tech_email is null");
            return (Criteria) this;
        }

        public Criteria andTechEmailIsNotNull() {
            addCriterion("tech_email is not null");
            return (Criteria) this;
        }

        public Criteria andTechEmailEqualTo(String value) {
            addCriterion("tech_email =", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailNotEqualTo(String value) {
            addCriterion("tech_email <>", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailGreaterThan(String value) {
            addCriterion("tech_email >", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tech_email >=", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailLessThan(String value) {
            addCriterion("tech_email <", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailLessThanOrEqualTo(String value) {
            addCriterion("tech_email <=", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailLike(String value) {
            addCriterion("tech_email like", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailNotLike(String value) {
            addCriterion("tech_email not like", value, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailIn(List<String> values) {
            addCriterion("tech_email in", values, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailNotIn(List<String> values) {
            addCriterion("tech_email not in", values, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailBetween(String value1, String value2) {
            addCriterion("tech_email between", value1, value2, "techEmail");
            return (Criteria) this;
        }

        public Criteria andTechEmailNotBetween(String value1, String value2) {
            addCriterion("tech_email not between", value1, value2, "techEmail");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(String value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(String value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(String value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(String value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(String value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(String value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLike(String value) {
            addCriterion("page like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotLike(String value) {
            addCriterion("page not like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<String> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<String> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(String value1, String value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(String value1, String value2) {
            addCriterion("page not between", value1, value2, "page");
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

        public Criteria andQqchatIsNull() {
            addCriterion("qqchat is null");
            return (Criteria) this;
        }

        public Criteria andQqchatIsNotNull() {
            addCriterion("qqchat is not null");
            return (Criteria) this;
        }

        public Criteria andQqchatEqualTo(String value) {
            addCriterion("qqchat =", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatNotEqualTo(String value) {
            addCriterion("qqchat <>", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatGreaterThan(String value) {
            addCriterion("qqchat >", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatGreaterThanOrEqualTo(String value) {
            addCriterion("qqchat >=", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatLessThan(String value) {
            addCriterion("qqchat <", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatLessThanOrEqualTo(String value) {
            addCriterion("qqchat <=", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatLike(String value) {
            addCriterion("qqchat like", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatNotLike(String value) {
            addCriterion("qqchat not like", value, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatIn(List<String> values) {
            addCriterion("qqchat in", values, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatNotIn(List<String> values) {
            addCriterion("qqchat not in", values, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatBetween(String value1, String value2) {
            addCriterion("qqchat between", value1, value2, "qqchat");
            return (Criteria) this;
        }

        public Criteria andQqchatNotBetween(String value1, String value2) {
            addCriterion("qqchat not between", value1, value2, "qqchat");
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