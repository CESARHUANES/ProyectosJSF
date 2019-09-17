package com.cardif.satelite.model.soatdirecto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DireccionDirectoExample implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public DireccionDirectoExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
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

    protected void addCriterionForJDBCDate(String condition, Date value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      addCriterion(condition, new java.sql.Date(value.getTime()), property);
    }

    protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
      if (values == null || values.size() == 0) {
        throw new RuntimeException("Value list for " + property + " cannot be null or empty");
      }
      List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
      Iterator<Date> iter = values.iterator();
      while (iter.hasNext()) {
        dateList.add(new java.sql.Date(iter.next().getTime()));
      }
      addCriterion(condition, dateList, property);
    }

    protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
    }

    public Criteria andIdDireccionIsNull() {
      addCriterion("ID_DIRECCION is null");
      return (Criteria) this;
    }

    public Criteria andIdDireccionIsNotNull() {
      addCriterion("ID_DIRECCION is not null");
      return (Criteria) this;
    }

    public Criteria andIdDireccionEqualTo(BigDecimal value) {
      addCriterion("ID_DIRECCION =", value, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionNotEqualTo(BigDecimal value) {
      addCriterion("ID_DIRECCION <>", value, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionGreaterThan(BigDecimal value) {
      addCriterion("ID_DIRECCION >", value, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionGreaterThanOrEqualTo(BigDecimal value) {
      addCriterion("ID_DIRECCION >=", value, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionLessThan(BigDecimal value) {
      addCriterion("ID_DIRECCION <", value, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionLessThanOrEqualTo(BigDecimal value) {
      addCriterion("ID_DIRECCION <=", value, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionIn(List<BigDecimal> values) {
      addCriterion("ID_DIRECCION in", values, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionNotIn(List<BigDecimal> values) {
      addCriterion("ID_DIRECCION not in", values, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionBetween(BigDecimal value1, BigDecimal value2) {
      addCriterion("ID_DIRECCION between", value1, value2, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andIdDireccionNotBetween(BigDecimal value1, BigDecimal value2) {
      addCriterion("ID_DIRECCION not between", value1, value2, "idDireccion");
      return (Criteria) this;
    }

    public Criteria andDireccionIsNull() {
      addCriterion("DIRECCION is null");
      return (Criteria) this;
    }

    public Criteria andDireccionIsNotNull() {
      addCriterion("DIRECCION is not null");
      return (Criteria) this;
    }

    public Criteria andDireccionEqualTo(String value) {
      addCriterion("DIRECCION =", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionNotEqualTo(String value) {
      addCriterion("DIRECCION <>", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionGreaterThan(String value) {
      addCriterion("DIRECCION >", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionGreaterThanOrEqualTo(String value) {
      addCriterion("DIRECCION >=", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionLessThan(String value) {
      addCriterion("DIRECCION <", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionLessThanOrEqualTo(String value) {
      addCriterion("DIRECCION <=", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionLike(String value) {
      addCriterion("DIRECCION like", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionNotLike(String value) {
      addCriterion("DIRECCION not like", value, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionIn(List<String> values) {
      addCriterion("DIRECCION in", values, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionNotIn(List<String> values) {
      addCriterion("DIRECCION not in", values, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionBetween(String value1, String value2) {
      addCriterion("DIRECCION between", value1, value2, "direccion");
      return (Criteria) this;
    }

    public Criteria andDireccionNotBetween(String value1, String value2) {
      addCriterion("DIRECCION not between", value1, value2, "direccion");
      return (Criteria) this;
    }

    public Criteria andEmailIsNull() {
      addCriterion("EMAIL is null");
      return (Criteria) this;
    }

    public Criteria andEmailIsNotNull() {
      addCriterion("EMAIL is not null");
      return (Criteria) this;
    }

    public Criteria andEmailEqualTo(String value) {
      addCriterion("EMAIL =", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailNotEqualTo(String value) {
      addCriterion("EMAIL <>", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailGreaterThan(String value) {
      addCriterion("EMAIL >", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailGreaterThanOrEqualTo(String value) {
      addCriterion("EMAIL >=", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailLessThan(String value) {
      addCriterion("EMAIL <", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailLessThanOrEqualTo(String value) {
      addCriterion("EMAIL <=", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailLike(String value) {
      addCriterion("EMAIL like", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailNotLike(String value) {
      addCriterion("EMAIL not like", value, "email");
      return (Criteria) this;
    }

    public Criteria andEmailIn(List<String> values) {
      addCriterion("EMAIL in", values, "email");
      return (Criteria) this;
    }

    public Criteria andEmailNotIn(List<String> values) {
      addCriterion("EMAIL not in", values, "email");
      return (Criteria) this;
    }

    public Criteria andEmailBetween(String value1, String value2) {
      addCriterion("EMAIL between", value1, value2, "email");
      return (Criteria) this;
    }

    public Criteria andEmailNotBetween(String value1, String value2) {
      addCriterion("EMAIL not between", value1, value2, "email");
      return (Criteria) this;
    }

    public Criteria andFechaIsNull() {
      addCriterion("FECHA is null");
      return (Criteria) this;
    }

    public Criteria andFechaIsNotNull() {
      addCriterion("FECHA is not null");
      return (Criteria) this;
    }

    public Criteria andFechaEqualTo(Date value) {
      addCriterionForJDBCDate("FECHA =", value, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaNotEqualTo(Date value) {
      addCriterionForJDBCDate("FECHA <>", value, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaGreaterThan(Date value) {
      addCriterionForJDBCDate("FECHA >", value, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaGreaterThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("FECHA >=", value, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaLessThan(Date value) {
      addCriterionForJDBCDate("FECHA <", value, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaLessThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("FECHA <=", value, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaIn(List<Date> values) {
      addCriterionForJDBCDate("FECHA in", values, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaNotIn(List<Date> values) {
      addCriterionForJDBCDate("FECHA not in", values, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("FECHA between", value1, value2, "fecha");
      return (Criteria) this;
    }

    public Criteria andFechaNotBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("FECHA not between", value1, value2, "fecha");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaIsNull() {
      addCriterion("FRANJA_HORARIA is null");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaIsNotNull() {
      addCriterion("FRANJA_HORARIA is not null");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaEqualTo(String value) {
      addCriterion("FRANJA_HORARIA =", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaNotEqualTo(String value) {
      addCriterion("FRANJA_HORARIA <>", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaGreaterThan(String value) {
      addCriterion("FRANJA_HORARIA >", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaGreaterThanOrEqualTo(String value) {
      addCriterion("FRANJA_HORARIA >=", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaLessThan(String value) {
      addCriterion("FRANJA_HORARIA <", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaLessThanOrEqualTo(String value) {
      addCriterion("FRANJA_HORARIA <=", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaLike(String value) {
      addCriterion("FRANJA_HORARIA like", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaNotLike(String value) {
      addCriterion("FRANJA_HORARIA not like", value, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaIn(List<String> values) {
      addCriterion("FRANJA_HORARIA in", values, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaNotIn(List<String> values) {
      addCriterion("FRANJA_HORARIA not in", values, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaBetween(String value1, String value2) {
      addCriterion("FRANJA_HORARIA between", value1, value2, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andFranjaHorariaNotBetween(String value1, String value2) {
      addCriterion("FRANJA_HORARIA not between", value1, value2, "franjaHoraria");
      return (Criteria) this;
    }

    public Criteria andReferenciaIsNull() {
      addCriterion("REFERENCIA is null");
      return (Criteria) this;
    }

    public Criteria andReferenciaIsNotNull() {
      addCriterion("REFERENCIA is not null");
      return (Criteria) this;
    }

    public Criteria andReferenciaEqualTo(String value) {
      addCriterion("REFERENCIA =", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaNotEqualTo(String value) {
      addCriterion("REFERENCIA <>", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaGreaterThan(String value) {
      addCriterion("REFERENCIA >", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaGreaterThanOrEqualTo(String value) {
      addCriterion("REFERENCIA >=", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaLessThan(String value) {
      addCriterion("REFERENCIA <", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaLessThanOrEqualTo(String value) {
      addCriterion("REFERENCIA <=", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaLike(String value) {
      addCriterion("REFERENCIA like", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaNotLike(String value) {
      addCriterion("REFERENCIA not like", value, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaIn(List<String> values) {
      addCriterion("REFERENCIA in", values, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaNotIn(List<String> values) {
      addCriterion("REFERENCIA not in", values, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaBetween(String value1, String value2) {
      addCriterion("REFERENCIA between", value1, value2, "referencia");
      return (Criteria) this;
    }

    public Criteria andReferenciaNotBetween(String value1, String value2) {
      addCriterion("REFERENCIA not between", value1, value2, "referencia");
      return (Criteria) this;
    }

    public Criteria andTelefonoIsNull() {
      addCriterion("TELEFONO is null");
      return (Criteria) this;
    }

    public Criteria andTelefonoIsNotNull() {
      addCriterion("TELEFONO is not null");
      return (Criteria) this;
    }

    public Criteria andTelefonoEqualTo(String value) {
      addCriterion("TELEFONO =", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoNotEqualTo(String value) {
      addCriterion("TELEFONO <>", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoGreaterThan(String value) {
      addCriterion("TELEFONO >", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
      addCriterion("TELEFONO >=", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoLessThan(String value) {
      addCriterion("TELEFONO <", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoLessThanOrEqualTo(String value) {
      addCriterion("TELEFONO <=", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoLike(String value) {
      addCriterion("TELEFONO like", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoNotLike(String value) {
      addCriterion("TELEFONO not like", value, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoIn(List<String> values) {
      addCriterion("TELEFONO in", values, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoNotIn(List<String> values) {
      addCriterion("TELEFONO not in", values, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoBetween(String value1, String value2) {
      addCriterion("TELEFONO between", value1, value2, "telefono");
      return (Criteria) this;
    }

    public Criteria andTelefonoNotBetween(String value1, String value2) {
      addCriterion("TELEFONO not between", value1, value2, "telefono");
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

    public Criteria andDepartamentoIsNull() {
      addCriterion("DEPARTAMENTO is null");
      return (Criteria) this;
    }

    public Criteria andDepartamentoIsNotNull() {
      addCriterion("DEPARTAMENTO is not null");
      return (Criteria) this;
    }

    public Criteria andDepartamentoEqualTo(String value) {
      addCriterion("DEPARTAMENTO =", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoNotEqualTo(String value) {
      addCriterion("DEPARTAMENTO <>", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoGreaterThan(String value) {
      addCriterion("DEPARTAMENTO >", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoGreaterThanOrEqualTo(String value) {
      addCriterion("DEPARTAMENTO >=", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoLessThan(String value) {
      addCriterion("DEPARTAMENTO <", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoLessThanOrEqualTo(String value) {
      addCriterion("DEPARTAMENTO <=", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoLike(String value) {
      addCriterion("DEPARTAMENTO like", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoNotLike(String value) {
      addCriterion("DEPARTAMENTO not like", value, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoIn(List<String> values) {
      addCriterion("DEPARTAMENTO in", values, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoNotIn(List<String> values) {
      addCriterion("DEPARTAMENTO not in", values, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoBetween(String value1, String value2) {
      addCriterion("DEPARTAMENTO between", value1, value2, "departamento");
      return (Criteria) this;
    }

    public Criteria andDepartamentoNotBetween(String value1, String value2) {
      addCriterion("DEPARTAMENTO not between", value1, value2, "departamento");
      return (Criteria) this;
    }

    public Criteria andDistritoIsNull() {
      addCriterion("DISTRITO is null");
      return (Criteria) this;
    }

    public Criteria andDistritoIsNotNull() {
      addCriterion("DISTRITO is not null");
      return (Criteria) this;
    }

    public Criteria andDistritoEqualTo(String value) {
      addCriterion("DISTRITO =", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoNotEqualTo(String value) {
      addCriterion("DISTRITO <>", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoGreaterThan(String value) {
      addCriterion("DISTRITO >", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoGreaterThanOrEqualTo(String value) {
      addCriterion("DISTRITO >=", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoLessThan(String value) {
      addCriterion("DISTRITO <", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoLessThanOrEqualTo(String value) {
      addCriterion("DISTRITO <=", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoLike(String value) {
      addCriterion("DISTRITO like", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoNotLike(String value) {
      addCriterion("DISTRITO not like", value, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoIn(List<String> values) {
      addCriterion("DISTRITO in", values, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoNotIn(List<String> values) {
      addCriterion("DISTRITO not in", values, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoBetween(String value1, String value2) {
      addCriterion("DISTRITO between", value1, value2, "distrito");
      return (Criteria) this;
    }

    public Criteria andDistritoNotBetween(String value1, String value2) {
      addCriterion("DISTRITO not between", value1, value2, "distrito");
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

    public Criteria andProvinciaLike(String value) {
      addCriterion("PROVINCIA like", value, "provincia");
      return (Criteria) this;
    }

    public Criteria andProvinciaNotLike(String value) {
      addCriterion("PROVINCIA not like", value, "provincia");
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
   * This class was generated by MyBatis Generator. This class corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated do_not_delete_during_merge Wed Mar 12 16:22:33 COT 2014
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table USER_SOAT_DIRECPROD.DIRECCION
   *
   * @mbggenerated Wed Mar 12 16:22:33 COT 2014
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