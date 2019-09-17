package com.cardif.satelite.model.satelite;

import java.io.Serializable;

public class GenProvincia implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.GEN_PROVINCIA.COD_PROVINCIA
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  private String codProvincia;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.GEN_PROVINCIA.NOMBRE_PROVINCIA
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  private String nombreProvincia;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.GEN_PROVINCIA.VERSION
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  private Long version;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.GEN_PROVINCIA.DEPARTAMENTO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  private String departamento;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.GEN_PROVINCIA.COD_PROVINCIA
   *
   * @return the value of dbo.GEN_PROVINCIA.COD_PROVINCIA
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public String getCodProvincia() {
    return codProvincia;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.GEN_PROVINCIA.COD_PROVINCIA
   *
   * @param codProvincia
   *          the value for dbo.GEN_PROVINCIA.COD_PROVINCIA
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void setCodProvincia(String codProvincia) {
    this.codProvincia = codProvincia == null ? null : codProvincia.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.GEN_PROVINCIA.NOMBRE_PROVINCIA
   *
   * @return the value of dbo.GEN_PROVINCIA.NOMBRE_PROVINCIA
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public String getNombreProvincia() {
    return nombreProvincia;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.GEN_PROVINCIA.NOMBRE_PROVINCIA
   *
   * @param nombreProvincia
   *          the value for dbo.GEN_PROVINCIA.NOMBRE_PROVINCIA
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void setNombreProvincia(String nombreProvincia) {
    this.nombreProvincia = nombreProvincia == null ? null : nombreProvincia.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.GEN_PROVINCIA.VERSION
   *
   * @return the value of dbo.GEN_PROVINCIA.VERSION
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public Long getVersion() {
    return version;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.GEN_PROVINCIA.VERSION
   *
   * @param version
   *          the value for dbo.GEN_PROVINCIA.VERSION
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void setVersion(Long version) {
    this.version = version;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.GEN_PROVINCIA.DEPARTAMENTO
   *
   * @return the value of dbo.GEN_PROVINCIA.DEPARTAMENTO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public String getDepartamento() {
    return departamento;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.GEN_PROVINCIA.DEPARTAMENTO
   *
   * @param departamento
   *          the value for dbo.GEN_PROVINCIA.DEPARTAMENTO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  public void setDepartamento(String departamento) {
    this.departamento = departamento == null ? null : departamento.trim();
  }
}