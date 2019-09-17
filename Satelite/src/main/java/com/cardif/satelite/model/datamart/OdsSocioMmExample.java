package com.cardif.satelite.model.datamart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OdsSocioMmExample implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public OdsSocioMmExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
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

    public Criteria andCodSocioIsNull() {
      addCriterion("COD_SOCIO is null");
      return (Criteria) this;
    }

    public Criteria andCodSocioIsNotNull() {
      addCriterion("COD_SOCIO is not null");
      return (Criteria) this;
    }

    public Criteria andCodSocioEqualTo(String value) {
      addCriterion("COD_SOCIO =", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioNotEqualTo(String value) {
      addCriterion("COD_SOCIO <>", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioGreaterThan(String value) {
      addCriterion("COD_SOCIO >", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioGreaterThanOrEqualTo(String value) {
      addCriterion("COD_SOCIO >=", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioLessThan(String value) {
      addCriterion("COD_SOCIO <", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioLessThanOrEqualTo(String value) {
      addCriterion("COD_SOCIO <=", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioLike(String value) {
      addCriterion("COD_SOCIO like", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioNotLike(String value) {
      addCriterion("COD_SOCIO not like", value, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioIn(List<String> values) {
      addCriterion("COD_SOCIO in", values, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioNotIn(List<String> values) {
      addCriterion("COD_SOCIO not in", values, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioBetween(String value1, String value2) {
      addCriterion("COD_SOCIO between", value1, value2, "codSocio");
      return (Criteria) this;
    }

    public Criteria andCodSocioNotBetween(String value1, String value2) {
      addCriterion("COD_SOCIO not between", value1, value2, "codSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioIsNull() {
      addCriterion("NBR_SOCIO is null");
      return (Criteria) this;
    }

    public Criteria andNbrSocioIsNotNull() {
      addCriterion("NBR_SOCIO is not null");
      return (Criteria) this;
    }

    public Criteria andNbrSocioEqualTo(String value) {
      addCriterion("NBR_SOCIO =", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioNotEqualTo(String value) {
      addCriterion("NBR_SOCIO <>", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioGreaterThan(String value) {
      addCriterion("NBR_SOCIO >", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioGreaterThanOrEqualTo(String value) {
      addCriterion("NBR_SOCIO >=", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioLessThan(String value) {
      addCriterion("NBR_SOCIO <", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioLessThanOrEqualTo(String value) {
      addCriterion("NBR_SOCIO <=", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioLike(String value) {
      addCriterion("NBR_SOCIO like", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioNotLike(String value) {
      addCriterion("NBR_SOCIO not like", value, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioIn(List<String> values) {
      addCriterion("NBR_SOCIO in", values, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioNotIn(List<String> values) {
      addCriterion("NBR_SOCIO not in", values, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioBetween(String value1, String value2) {
      addCriterion("NBR_SOCIO between", value1, value2, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andNbrSocioNotBetween(String value1, String value2) {
      addCriterion("NBR_SOCIO not between", value1, value2, "nbrSocio");
      return (Criteria) this;
    }

    public Criteria andRucIsNull() {
      addCriterion("RUC is null");
      return (Criteria) this;
    }

    public Criteria andRucIsNotNull() {
      addCriterion("RUC is not null");
      return (Criteria) this;
    }

    public Criteria andRucEqualTo(String value) {
      addCriterion("RUC =", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucNotEqualTo(String value) {
      addCriterion("RUC <>", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucGreaterThan(String value) {
      addCriterion("RUC >", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucGreaterThanOrEqualTo(String value) {
      addCriterion("RUC >=", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucLessThan(String value) {
      addCriterion("RUC <", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucLessThanOrEqualTo(String value) {
      addCriterion("RUC <=", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucLike(String value) {
      addCriterion("RUC like", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucNotLike(String value) {
      addCriterion("RUC not like", value, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucIn(List<String> values) {
      addCriterion("RUC in", values, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucNotIn(List<String> values) {
      addCriterion("RUC not in", values, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucBetween(String value1, String value2) {
      addCriterion("RUC between", value1, value2, "ruc");
      return (Criteria) this;
    }

    public Criteria andRucNotBetween(String value1, String value2) {
      addCriterion("RUC not between", value1, value2, "ruc");
      return (Criteria) this;
    }

    public Criteria andIndustriaIsNull() {
      addCriterion("INDUSTRIA is null");
      return (Criteria) this;
    }

    public Criteria andIndustriaIsNotNull() {
      addCriterion("INDUSTRIA is not null");
      return (Criteria) this;
    }

    public Criteria andIndustriaEqualTo(String value) {
      addCriterion("INDUSTRIA =", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaNotEqualTo(String value) {
      addCriterion("INDUSTRIA <>", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaGreaterThan(String value) {
      addCriterion("INDUSTRIA >", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaGreaterThanOrEqualTo(String value) {
      addCriterion("INDUSTRIA >=", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaLessThan(String value) {
      addCriterion("INDUSTRIA <", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaLessThanOrEqualTo(String value) {
      addCriterion("INDUSTRIA <=", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaLike(String value) {
      addCriterion("INDUSTRIA like", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaNotLike(String value) {
      addCriterion("INDUSTRIA not like", value, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaIn(List<String> values) {
      addCriterion("INDUSTRIA in", values, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaNotIn(List<String> values) {
      addCriterion("INDUSTRIA not in", values, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaBetween(String value1, String value2) {
      addCriterion("INDUSTRIA between", value1, value2, "industria");
      return (Criteria) this;
    }

    public Criteria andIndustriaNotBetween(String value1, String value2) {
      addCriterion("INDUSTRIA not between", value1, value2, "industria");
      return (Criteria) this;
    }

    public Criteria andDirSocioIsNull() {
      addCriterion("DIR_SOCIO is null");
      return (Criteria) this;
    }

    public Criteria andDirSocioIsNotNull() {
      addCriterion("DIR_SOCIO is not null");
      return (Criteria) this;
    }

    public Criteria andDirSocioEqualTo(String value) {
      addCriterion("DIR_SOCIO =", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioNotEqualTo(String value) {
      addCriterion("DIR_SOCIO <>", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioGreaterThan(String value) {
      addCriterion("DIR_SOCIO >", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioGreaterThanOrEqualTo(String value) {
      addCriterion("DIR_SOCIO >=", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioLessThan(String value) {
      addCriterion("DIR_SOCIO <", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioLessThanOrEqualTo(String value) {
      addCriterion("DIR_SOCIO <=", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioLike(String value) {
      addCriterion("DIR_SOCIO like", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioNotLike(String value) {
      addCriterion("DIR_SOCIO not like", value, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioIn(List<String> values) {
      addCriterion("DIR_SOCIO in", values, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioNotIn(List<String> values) {
      addCriterion("DIR_SOCIO not in", values, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioBetween(String value1, String value2) {
      addCriterion("DIR_SOCIO between", value1, value2, "dirSocio");
      return (Criteria) this;
    }

    public Criteria andDirSocioNotBetween(String value1, String value2) {
      addCriterion("DIR_SOCIO not between", value1, value2, "dirSocio");
      return (Criteria) this;
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated do_not_delete_during_merge Tue Feb 04 14:23:56 COT 2014
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table USER_DM_ODS.ODS_SOCIO_MM
   *
   * @mbggenerated Tue Feb 04 14:23:56 COT 2014
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