package com.cardif.satelite.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MasterPreciosSoat implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.COD_SOCIO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String codSocio;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.DEPARTAMENTO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String departamento;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.USO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String uso;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.CATEGORIA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String categoria;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.NRO_ASIENTOS
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private Short nroAsientos;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.MARCA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String marca;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.MODELO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String modelo;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.PRIMA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private BigDecimal prima;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.PRIMA_TECNICA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private BigDecimal primaTecnica;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.EXCLUIDO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private Short excluido;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.FEC_CREACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private Date fecCreacion;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.USU_CREACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String usuCreacion;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.FEC_MODIFICACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private Date fecModificacion;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.MASTER_PRECIOS_SOAT.USU_MODIFICACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  private String usuModificacion;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.COD_SOCIO
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.COD_SOCIO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getCodSocio() {
    return codSocio;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.COD_SOCIO
   *
   * @param codSocio
   *          the value for dbo.MASTER_PRECIOS_SOAT.COD_SOCIO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setCodSocio(String codSocio) {
    this.codSocio = codSocio == null ? null : codSocio.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.DEPARTAMENTO
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.DEPARTAMENTO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getDepartamento() {
    return departamento;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.DEPARTAMENTO
   *
   * @param departamento
   *          the value for dbo.MASTER_PRECIOS_SOAT.DEPARTAMENTO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setDepartamento(String departamento) {
    this.departamento = departamento == null ? null : departamento.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.USO
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.USO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getUso() {
    return uso;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.USO
   *
   * @param uso
   *          the value for dbo.MASTER_PRECIOS_SOAT.USO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setUso(String uso) {
    this.uso = uso == null ? null : uso.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.CATEGORIA
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.CATEGORIA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getCategoria() {
    return categoria;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.CATEGORIA
   *
   * @param categoria
   *          the value for dbo.MASTER_PRECIOS_SOAT.CATEGORIA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setCategoria(String categoria) {
    this.categoria = categoria == null ? null : categoria.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.NRO_ASIENTOS
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.NRO_ASIENTOS
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public Short getNroAsientos() {
    return nroAsientos;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.NRO_ASIENTOS
   *
   * @param nroAsientos
   *          the value for dbo.MASTER_PRECIOS_SOAT.NRO_ASIENTOS
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setNroAsientos(Short nroAsientos) {
    this.nroAsientos = nroAsientos;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.MARCA
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.MARCA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getMarca() {
    return marca;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.MARCA
   *
   * @param marca
   *          the value for dbo.MASTER_PRECIOS_SOAT.MARCA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setMarca(String marca) {
    this.marca = marca == null ? null : marca.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.MODELO
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.MODELO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getModelo() {
    return modelo;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.MODELO
   *
   * @param modelo
   *          the value for dbo.MASTER_PRECIOS_SOAT.MODELO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setModelo(String modelo) {
    this.modelo = modelo == null ? null : modelo.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.PRIMA
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.PRIMA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public BigDecimal getPrima() {
    return prima;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.PRIMA
   *
   * @param prima
   *          the value for dbo.MASTER_PRECIOS_SOAT.PRIMA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setPrima(BigDecimal prima) {
    this.prima = prima;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.PRIMA_TECNICA
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.PRIMA_TECNICA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public BigDecimal getPrimaTecnica() {
    return primaTecnica;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.PRIMA_TECNICA
   *
   * @param primaTecnica
   *          the value for dbo.MASTER_PRECIOS_SOAT.PRIMA_TECNICA
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setPrimaTecnica(BigDecimal primaTecnica) {
    this.primaTecnica = primaTecnica;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.EXCLUIDO
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.EXCLUIDO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public Short getExcluido() {
    return excluido;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.EXCLUIDO
   *
   * @param excluido
   *          the value for dbo.MASTER_PRECIOS_SOAT.EXCLUIDO
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setExcluido(Short excluido) {
    this.excluido = excluido;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.FEC_CREACION
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.FEC_CREACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public Date getFecCreacion() {
    return fecCreacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.FEC_CREACION
   *
   * @param fecCreacion
   *          the value for dbo.MASTER_PRECIOS_SOAT.FEC_CREACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setFecCreacion(Date fecCreacion) {
    this.fecCreacion = fecCreacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.USU_CREACION
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.USU_CREACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getUsuCreacion() {
    return usuCreacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.USU_CREACION
   *
   * @param usuCreacion
   *          the value for dbo.MASTER_PRECIOS_SOAT.USU_CREACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setUsuCreacion(String usuCreacion) {
    this.usuCreacion = usuCreacion == null ? null : usuCreacion.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.FEC_MODIFICACION
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.FEC_MODIFICACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public Date getFecModificacion() {
    return fecModificacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.FEC_MODIFICACION
   *
   * @param fecModificacion
   *          the value for dbo.MASTER_PRECIOS_SOAT.FEC_MODIFICACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setFecModificacion(Date fecModificacion) {
    this.fecModificacion = fecModificacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.MASTER_PRECIOS_SOAT.USU_MODIFICACION
   *
   * @return the value of dbo.MASTER_PRECIOS_SOAT.USU_MODIFICACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public String getUsuModificacion() {
    return usuModificacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.MASTER_PRECIOS_SOAT.USU_MODIFICACION
   *
   * @param usuModificacion
   *          the value for dbo.MASTER_PRECIOS_SOAT.USU_MODIFICACION
   *
   * @mbggenerated Fri Nov 08 15:48:13 COT 2013
   */
  public void setUsuModificacion(String usuModificacion) {
    this.usuModificacion = usuModificacion == null ? null : usuModificacion.trim();
  }
}