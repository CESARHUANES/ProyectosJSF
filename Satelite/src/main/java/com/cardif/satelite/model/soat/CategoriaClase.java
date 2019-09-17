package com.cardif.satelite.model.soat;

import java.io.Serializable;

public class CategoriaClase implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_SOAT.CATEGORIA_CLASE.COD_CATEGORIA_CLASE
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  private String codCategoriaClase;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * USER_SOAT.CATEGORIA_CLASE.DESCRIPCION_CATEGORIA_CLASE
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  private String descripcionCategoriaClase;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_SOAT.CATEGORIA_CLASE.VERSION
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  private Long version;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * USER_SOAT.CATEGORIA_CLASE.COD_CATEGORIA_CLASE
   *
   * @return the value of USER_SOAT.CATEGORIA_CLASE.COD_CATEGORIA_CLASE
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  public String getCodCategoriaClase() {
    return codCategoriaClase;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_SOAT.CATEGORIA_CLASE.COD_CATEGORIA_CLASE
   *
   * @param codCategoriaClase
   *          the value for USER_SOAT.CATEGORIA_CLASE.COD_CATEGORIA_CLASE
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  public void setCodCategoriaClase(String codCategoriaClase) {
    this.codCategoriaClase = codCategoriaClase == null ? null : codCategoriaClase.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * USER_SOAT.CATEGORIA_CLASE.DESCRIPCION_CATEGORIA_CLASE
   *
   * @return the value of USER_SOAT.CATEGORIA_CLASE.DESCRIPCION_CATEGORIA_CLASE
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  public String getDescripcionCategoriaClase() {
    return descripcionCategoriaClase;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column
   * USER_SOAT.CATEGORIA_CLASE.DESCRIPCION_CATEGORIA_CLASE
   *
   * @param descripcionCategoriaClase
   *          the value for USER_SOAT.CATEGORIA_CLASE.DESCRIPCION_CATEGORIA_CLASE
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  public void setDescripcionCategoriaClase(String descripcionCategoriaClase) {
    this.descripcionCategoriaClase = descripcionCategoriaClase == null ? null : descripcionCategoriaClase.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_SOAT.CATEGORIA_CLASE.VERSION
   *
   * @return the value of USER_SOAT.CATEGORIA_CLASE.VERSION
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  public Long getVersion() {
    return version;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_SOAT.CATEGORIA_CLASE.VERSION
   *
   * @param version
   *          the value for USER_SOAT.CATEGORIA_CLASE.VERSION
   *
   * @mbggenerated Mon Mar 17 19:38:27 COT 2014
   */
  public void setVersion(Long version) {
    this.version = version;
  }
}