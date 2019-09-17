package com.cardif.satelite.model.satelite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenDistritoExample implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public GenDistritoExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
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

    public Criteria andCodDistritoIsNull() {
      addCriterion("COD_DISTRITO is null");
      return (Criteria) this;
    }

    public Criteria andCodDistritoIsNotNull() {
      addCriterion("COD_DISTRITO is not null");
      return (Criteria) this;
    }

    public Criteria andCodDistritoEqualTo(String value) {
      addCriterion("COD_DISTRITO =", value, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoNotEqualTo(String value) {
      addCriterion("COD_DISTRITO <>", value, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoGreaterThan(String value) {
      addCriterion("COD_DISTRITO >", value, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoGreaterThanOrEqualTo(String value) {
      addCriterion("COD_DISTRITO >=", value, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoLessThan(String value) {
      addCriterion("COD_DISTRITO <", value, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoLessThanOrEqualTo(String value) {
      addCriterion("COD_DISTRITO <=", value, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoIn(List<String> values) {
      addCriterion("COD_DISTRITO in", values, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoNotIn(List<String> values) {
      addCriterion("COD_DISTRITO not in", values, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoBetween(String value1, String value2) {
      addCriterion("COD_DISTRITO between", value1, value2, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andCodDistritoNotBetween(String value1, String value2) {
      addCriterion("COD_DISTRITO not between", value1, value2, "codDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoIsNull() {
      addCriterion("NOMBRE_DISTRITO is null");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoIsNotNull() {
      addCriterion("NOMBRE_DISTRITO is not null");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoEqualTo(String value) {
      addCriterion("NOMBRE_DISTRITO =", value, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoNotEqualTo(String value) {
      addCriterion("NOMBRE_DISTRITO <>", value, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoGreaterThan(String value) {
      addCriterion("NOMBRE_DISTRITO >", value, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoGreaterThanOrEqualTo(String value) {
      addCriterion("NOMBRE_DISTRITO >=", value, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoLessThan(String value) {
      addCriterion("NOMBRE_DISTRITO <", value, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoLessThanOrEqualTo(String value) {
      addCriterion("NOMBRE_DISTRITO <=", value, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoIn(List<String> values) {
      addCriterion("NOMBRE_DISTRITO in", values, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoNotIn(List<String> values) {
      addCriterion("NOMBRE_DISTRITO not in", values, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoBetween(String value1, String value2) {
      addCriterion("NOMBRE_DISTRITO between", value1, value2, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andNombreDistritoNotBetween(String value1, String value2) {
      addCriterion("NOMBRE_DISTRITO not between", value1, value2, "nombreDistrito");
      return (Criteria) this;
    }

    public Criteria andVersionIsNull() {
      addCriterion("VERSION is null");
      return (Criteria) this;
    }

    public Criteria andVersionIsNotNull() {
      addCriterion("VERSION is not null");
      return (Criteria) this;
    }

    public Criteria andVersionEqualTo(Long value) {
      addCriterion("VERSION =", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionNotEqualTo(Long value) {
      addCriterion("VERSION <>", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionGreaterThan(Long value) {
      addCriterion("VERSION >", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionGreaterThanOrEqualTo(Long value) {
      addCriterion("VERSION >=", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionLessThan(Long value) {
      addCriterion("VERSION <", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionLessThanOrEqualTo(Long value) {
      addCriterion("VERSION <=", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionIn(List<Long> values) {
      addCriterion("VERSION in", values, "version");
      return (Criteria) this;
    }

    public Criteria andVersionNotIn(List<Long> values) {
      addCriterion("VERSION not in", values, "version");
      return (Criteria) this;
    }

    public Criteria andVersionBetween(Long value1, Long value2) {
      addCriterion("VERSION between", value1, value2, "version");
      return (Criteria) this;
    }

    public Criteria andVersionNotBetween(Long value1, Long value2) {
      addCriterion("VERSION not between", value1, value2, "version");
      return (Criteria) this;
    }

    public Criteria andProvinciaIsNull() {
      addCriterion("PROVINCIA is null");
      return (Criteria) this;
    }

    public Criteria andProvinciaIsNotNull() {
      addCriterion("PROVINCIA is not null");
      return (Criteria) this;
    }

    public Criteria andProvinciaEqualTo(String value) {
      addCriterion("PROVINCIA =", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaNotEqualTo(String value) {
      addCriterion("PROVINCIA <>", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaGreaterThan(String value) {
      addCriterion("PROVINCIA >", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaGreaterThanOrEqualTo(String value) {
      addCriterion("PROVINCIA >=", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaLessThan(String value) {
      addCriterion("PROVINCIA <", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaLessThanOrEqualTo(String value) {
      addCriterion("PROVINCIA <=", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaIn(List<String> values) {
      addCriterion("PROVINCIA in", values, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaNotIn(List<String> values) {
      addCriterion("PROVINCIA not in", values, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaBetween(String value1, String value2) {
      addCriterion("PROVINCIA between", value1, value2, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaNotBetween(String value1, String value2) {
      addCriterion("PROVINCIA not between", value1, value2, "provincia");
      return (Criteria) this;
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated do_not_delete_during_merge Wed Sep 03 18:53:50 COT 2014
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
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