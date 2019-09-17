package com.cardif.satelite.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CargRegVentasTemp implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.PK
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long pk;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_REGISTRO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long correlativoRegistro;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.FECHAEMISION
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Date fechaemision;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.FECHAVENCIMIENTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Date fechavencimiento;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.TIPOCOMPROBANTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long tipocomprobante;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.NRO_SERIE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long nroSerie;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long correlativoSerie;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.TIPODOCCLIENTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String tipodoccliente;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.NUMERODOCCLIENTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String numerodoccliente;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.NOMBRES_RAZON_SOCIAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String nombresRazonSocial;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.VALOR_FACT_EXPORT
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal valorFactExport;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.BASE_IMPONIBLE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal baseImponible;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_EXONERADO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal importeExonerado;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_INAFECTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal importeInafecto;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.ISC
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal isc;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.IGV
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal igv;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.OTROS_IMPORTES
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal otrosImportes;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_TOTAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal importeTotal;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.TIPO_CAMBIO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private BigDecimal tipoCambio;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.FECHA_EMISION_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Date fechaEmisionRef;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.TIPO_COMPROBANTE_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long tipoComprobanteRef;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.SERIE_COMPROBANTE_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long serieComprobanteRef;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE_ORIG
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long correlativoSerieOrig;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.MODIFICABLE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String modificable;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.OPENITEM
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String openitem;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.OPENITEM_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String openitemRef;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.NUMERO_POLIZA
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String numeroPoliza;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.PRODUCTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String producto;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.ESTADO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String estado;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.OBSERVACIONES
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String observaciones;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.CORELATIVO_FINAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long corelativoFinal;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.DIRECCION
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String direccion;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.DISTRITO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String distrito;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.PROVINCIA
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String provincia;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.DEPARTAMENTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private String departamento;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.NUMERICO1
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long numerico1;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CARG_REG_VENTAS_TEMP.NUMERICO2
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  private Long numerico2;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.PK
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.PK
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getPk() {
    return pk;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.PK
   *
   * @param pk
   *          the value for dbo.CARG_REG_VENTAS_TEMP.PK
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setPk(Long pk) {
    this.pk = pk;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_REGISTRO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_REGISTRO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getCorrelativoRegistro() {
    return correlativoRegistro;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_REGISTRO
   *
   * @param correlativoRegistro
   *          the value for dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_REGISTRO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setCorrelativoRegistro(Long correlativoRegistro) {
    this.correlativoRegistro = correlativoRegistro;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.FECHAEMISION
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.FECHAEMISION
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Date getFechaemision() {
    return fechaemision;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.FECHAEMISION
   *
   * @param fechaemision
   *          the value for dbo.CARG_REG_VENTAS_TEMP.FECHAEMISION
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setFechaemision(Date fechaemision) {
    this.fechaemision = fechaemision;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.FECHAVENCIMIENTO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.FECHAVENCIMIENTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Date getFechavencimiento() {
    return fechavencimiento;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.FECHAVENCIMIENTO
   *
   * @param fechavencimiento
   *          the value for dbo.CARG_REG_VENTAS_TEMP.FECHAVENCIMIENTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setFechavencimiento(Date fechavencimiento) {
    this.fechavencimiento = fechavencimiento;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPOCOMPROBANTE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.TIPOCOMPROBANTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getTipocomprobante() {
    return tipocomprobante;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPOCOMPROBANTE
   *
   * @param tipocomprobante
   *          the value for dbo.CARG_REG_VENTAS_TEMP.TIPOCOMPROBANTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setTipocomprobante(Long tipocomprobante) {
    this.tipocomprobante = tipocomprobante;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.NRO_SERIE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.NRO_SERIE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getNroSerie() {
    return nroSerie;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.NRO_SERIE
   *
   * @param nroSerie
   *          the value for dbo.CARG_REG_VENTAS_TEMP.NRO_SERIE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setNroSerie(Long nroSerie) {
    this.nroSerie = nroSerie;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getCorrelativoSerie() {
    return correlativoSerie;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE
   *
   * @param correlativoSerie
   *          the value for dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setCorrelativoSerie(Long correlativoSerie) {
    this.correlativoSerie = correlativoSerie;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPODOCCLIENTE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.TIPODOCCLIENTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getTipodoccliente() {
    return tipodoccliente;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPODOCCLIENTE
   *
   * @param tipodoccliente
   *          the value for dbo.CARG_REG_VENTAS_TEMP.TIPODOCCLIENTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setTipodoccliente(String tipodoccliente) {
    this.tipodoccliente = tipodoccliente == null ? null : tipodoccliente.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERODOCCLIENTE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.NUMERODOCCLIENTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getNumerodoccliente() {
    return numerodoccliente;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERODOCCLIENTE
   *
   * @param numerodoccliente
   *          the value for dbo.CARG_REG_VENTAS_TEMP.NUMERODOCCLIENTE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setNumerodoccliente(String numerodoccliente) {
    this.numerodoccliente = numerodoccliente == null ? null : numerodoccliente.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * dbo.CARG_REG_VENTAS_TEMP.NOMBRES_RAZON_SOCIAL
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.NOMBRES_RAZON_SOCIAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getNombresRazonSocial() {
    return nombresRazonSocial;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.NOMBRES_RAZON_SOCIAL
   *
   * @param nombresRazonSocial
   *          the value for dbo.CARG_REG_VENTAS_TEMP.NOMBRES_RAZON_SOCIAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setNombresRazonSocial(String nombresRazonSocial) {
    this.nombresRazonSocial = nombresRazonSocial == null ? null : nombresRazonSocial.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.VALOR_FACT_EXPORT
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.VALOR_FACT_EXPORT
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getValorFactExport() {
    return valorFactExport;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.VALOR_FACT_EXPORT
   *
   * @param valorFactExport
   *          the value for dbo.CARG_REG_VENTAS_TEMP.VALOR_FACT_EXPORT
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setValorFactExport(BigDecimal valorFactExport) {
    this.valorFactExport = valorFactExport;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.BASE_IMPONIBLE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.BASE_IMPONIBLE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getBaseImponible() {
    return baseImponible;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.BASE_IMPONIBLE
   *
   * @param baseImponible
   *          the value for dbo.CARG_REG_VENTAS_TEMP.BASE_IMPONIBLE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setBaseImponible(BigDecimal baseImponible) {
    this.baseImponible = baseImponible;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_EXONERADO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.IMPORTE_EXONERADO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getImporteExonerado() {
    return importeExonerado;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_EXONERADO
   *
   * @param importeExonerado
   *          the value for dbo.CARG_REG_VENTAS_TEMP.IMPORTE_EXONERADO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setImporteExonerado(BigDecimal importeExonerado) {
    this.importeExonerado = importeExonerado;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_INAFECTO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.IMPORTE_INAFECTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getImporteInafecto() {
    return importeInafecto;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_INAFECTO
   *
   * @param importeInafecto
   *          the value for dbo.CARG_REG_VENTAS_TEMP.IMPORTE_INAFECTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setImporteInafecto(BigDecimal importeInafecto) {
    this.importeInafecto = importeInafecto;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.ISC
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.ISC
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getIsc() {
    return isc;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.ISC
   *
   * @param isc
   *          the value for dbo.CARG_REG_VENTAS_TEMP.ISC
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setIsc(BigDecimal isc) {
    this.isc = isc;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.IGV
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.IGV
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getIgv() {
    return igv;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.IGV
   *
   * @param igv
   *          the value for dbo.CARG_REG_VENTAS_TEMP.IGV
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setIgv(BigDecimal igv) {
    this.igv = igv;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.OTROS_IMPORTES
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.OTROS_IMPORTES
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getOtrosImportes() {
    return otrosImportes;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.OTROS_IMPORTES
   *
   * @param otrosImportes
   *          the value for dbo.CARG_REG_VENTAS_TEMP.OTROS_IMPORTES
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setOtrosImportes(BigDecimal otrosImportes) {
    this.otrosImportes = otrosImportes;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_TOTAL
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.IMPORTE_TOTAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getImporteTotal() {
    return importeTotal;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.IMPORTE_TOTAL
   *
   * @param importeTotal
   *          the value for dbo.CARG_REG_VENTAS_TEMP.IMPORTE_TOTAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setImporteTotal(BigDecimal importeTotal) {
    this.importeTotal = importeTotal;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPO_CAMBIO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.TIPO_CAMBIO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public BigDecimal getTipoCambio() {
    return tipoCambio;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPO_CAMBIO
   *
   * @param tipoCambio
   *          the value for dbo.CARG_REG_VENTAS_TEMP.TIPO_CAMBIO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setTipoCambio(BigDecimal tipoCambio) {
    this.tipoCambio = tipoCambio;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.FECHA_EMISION_REF
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.FECHA_EMISION_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Date getFechaEmisionRef() {
    return fechaEmisionRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.FECHA_EMISION_REF
   *
   * @param fechaEmisionRef
   *          the value for dbo.CARG_REG_VENTAS_TEMP.FECHA_EMISION_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setFechaEmisionRef(Date fechaEmisionRef) {
    this.fechaEmisionRef = fechaEmisionRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * dbo.CARG_REG_VENTAS_TEMP.TIPO_COMPROBANTE_REF
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.TIPO_COMPROBANTE_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getTipoComprobanteRef() {
    return tipoComprobanteRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.TIPO_COMPROBANTE_REF
   *
   * @param tipoComprobanteRef
   *          the value for dbo.CARG_REG_VENTAS_TEMP.TIPO_COMPROBANTE_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setTipoComprobanteRef(Long tipoComprobanteRef) {
    this.tipoComprobanteRef = tipoComprobanteRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * dbo.CARG_REG_VENTAS_TEMP.SERIE_COMPROBANTE_REF
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.SERIE_COMPROBANTE_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getSerieComprobanteRef() {
    return serieComprobanteRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.SERIE_COMPROBANTE_REF
   *
   * @param serieComprobanteRef
   *          the value for dbo.CARG_REG_VENTAS_TEMP.SERIE_COMPROBANTE_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setSerieComprobanteRef(Long serieComprobanteRef) {
    this.serieComprobanteRef = serieComprobanteRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column
   * dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE_ORIG
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE_ORIG
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getCorrelativoSerieOrig() {
    return correlativoSerieOrig;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE_ORIG
   *
   * @param correlativoSerieOrig
   *          the value for dbo.CARG_REG_VENTAS_TEMP.CORRELATIVO_SERIE_ORIG
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setCorrelativoSerieOrig(Long correlativoSerieOrig) {
    this.correlativoSerieOrig = correlativoSerieOrig;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.MODIFICABLE
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.MODIFICABLE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getModificable() {
    return modificable;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.MODIFICABLE
   *
   * @param modificable
   *          the value for dbo.CARG_REG_VENTAS_TEMP.MODIFICABLE
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setModificable(String modificable) {
    this.modificable = modificable == null ? null : modificable.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.OPENITEM
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.OPENITEM
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getOpenitem() {
    return openitem;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.OPENITEM
   *
   * @param openitem
   *          the value for dbo.CARG_REG_VENTAS_TEMP.OPENITEM
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setOpenitem(String openitem) {
    this.openitem = openitem == null ? null : openitem.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.OPENITEM_REF
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.OPENITEM_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getOpenitemRef() {
    return openitemRef;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.OPENITEM_REF
   *
   * @param openitemRef
   *          the value for dbo.CARG_REG_VENTAS_TEMP.OPENITEM_REF
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setOpenitemRef(String openitemRef) {
    this.openitemRef = openitemRef == null ? null : openitemRef.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERO_POLIZA
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.NUMERO_POLIZA
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getNumeroPoliza() {
    return numeroPoliza;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERO_POLIZA
   *
   * @param numeroPoliza
   *          the value for dbo.CARG_REG_VENTAS_TEMP.NUMERO_POLIZA
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setNumeroPoliza(String numeroPoliza) {
    this.numeroPoliza = numeroPoliza == null ? null : numeroPoliza.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.PRODUCTO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.PRODUCTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getProducto() {
    return producto;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.PRODUCTO
   *
   * @param producto
   *          the value for dbo.CARG_REG_VENTAS_TEMP.PRODUCTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setProducto(String producto) {
    this.producto = producto == null ? null : producto.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.ESTADO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.ESTADO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getEstado() {
    return estado;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.ESTADO
   *
   * @param estado
   *          the value for dbo.CARG_REG_VENTAS_TEMP.ESTADO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setEstado(String estado) {
    this.estado = estado == null ? null : estado.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.OBSERVACIONES
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.OBSERVACIONES
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getObservaciones() {
    return observaciones;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.OBSERVACIONES
   *
   * @param observaciones
   *          the value for dbo.CARG_REG_VENTAS_TEMP.OBSERVACIONES
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones == null ? null : observaciones.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.CORELATIVO_FINAL
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.CORELATIVO_FINAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getCorelativoFinal() {
    return corelativoFinal;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.CORELATIVO_FINAL
   *
   * @param corelativoFinal
   *          the value for dbo.CARG_REG_VENTAS_TEMP.CORELATIVO_FINAL
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setCorelativoFinal(Long corelativoFinal) {
    this.corelativoFinal = corelativoFinal;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.DIRECCION
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.DIRECCION
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.DIRECCION
   *
   * @param direccion
   *          the value for dbo.CARG_REG_VENTAS_TEMP.DIRECCION
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion == null ? null : direccion.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.DISTRITO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.DISTRITO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getDistrito() {
    return distrito;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.DISTRITO
   *
   * @param distrito
   *          the value for dbo.CARG_REG_VENTAS_TEMP.DISTRITO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setDistrito(String distrito) {
    this.distrito = distrito == null ? null : distrito.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.PROVINCIA
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.PROVINCIA
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getProvincia() {
    return provincia;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.PROVINCIA
   *
   * @param provincia
   *          the value for dbo.CARG_REG_VENTAS_TEMP.PROVINCIA
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setProvincia(String provincia) {
    this.provincia = provincia == null ? null : provincia.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.DEPARTAMENTO
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.DEPARTAMENTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public String getDepartamento() {
    return departamento;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.DEPARTAMENTO
   *
   * @param departamento
   *          the value for dbo.CARG_REG_VENTAS_TEMP.DEPARTAMENTO
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setDepartamento(String departamento) {
    this.departamento = departamento == null ? null : departamento.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERICO1
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.NUMERICO1
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getNumerico1() {
    return numerico1;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERICO1
   *
   * @param numerico1
   *          the value for dbo.CARG_REG_VENTAS_TEMP.NUMERICO1
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setNumerico1(Long numerico1) {
    this.numerico1 = numerico1;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERICO2
   *
   * @return the value of dbo.CARG_REG_VENTAS_TEMP.NUMERICO2
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public Long getNumerico2() {
    return numerico2;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CARG_REG_VENTAS_TEMP.NUMERICO2
   *
   * @param numerico2
   *          the value for dbo.CARG_REG_VENTAS_TEMP.NUMERICO2
   *
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  public void setNumerico2(Long numerico2) {
    this.numerico2 = numerico2;
  }
}