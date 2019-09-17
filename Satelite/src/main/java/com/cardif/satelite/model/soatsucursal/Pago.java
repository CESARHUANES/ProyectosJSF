package com.cardif.satelite.model.soatsucursal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Pago implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.ID
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private BigDecimal id;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.FECHA
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private Date fecha;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.HORA
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private String hora;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.MEDIO_PAGO
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private String medioPago;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.MONTO
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private Double monto;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.RUT_PAGADOR
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private String rutPagador;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column USER_VENTAS_SUCURSAL.PAGO.VERSION
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  private Long version;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.ID
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.ID
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public BigDecimal getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.ID
   *
   * @param id
   *          the value for USER_VENTAS_SUCURSAL.PAGO.ID
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.FECHA
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.FECHA
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public Date getFecha() {
    return fecha;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.FECHA
   *
   * @param fecha
   *          the value for USER_VENTAS_SUCURSAL.PAGO.FECHA
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.HORA
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.HORA
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public String getHora() {
    return hora;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.HORA
   *
   * @param hora
   *          the value for USER_VENTAS_SUCURSAL.PAGO.HORA
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setHora(String hora) {
    this.hora = hora == null ? null : hora.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.MEDIO_PAGO
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.MEDIO_PAGO
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public String getMedioPago() {
    return medioPago;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.MEDIO_PAGO
   *
   * @param medioPago
   *          the value for USER_VENTAS_SUCURSAL.PAGO.MEDIO_PAGO
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setMedioPago(String medioPago) {
    this.medioPago = medioPago == null ? null : medioPago.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.MONTO
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.MONTO
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public Double getMonto() {
    return monto;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.MONTO
   *
   * @param monto
   *          the value for USER_VENTAS_SUCURSAL.PAGO.MONTO
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setMonto(Double monto) {
    this.monto = monto;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.RUT_PAGADOR
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.RUT_PAGADOR
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public String getRutPagador() {
    return rutPagador;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.RUT_PAGADOR
   *
   * @param rutPagador
   *          the value for USER_VENTAS_SUCURSAL.PAGO.RUT_PAGADOR
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setRutPagador(String rutPagador) {
    this.rutPagador = rutPagador == null ? null : rutPagador.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column USER_VENTAS_SUCURSAL.PAGO.VERSION
   *
   * @return the value of USER_VENTAS_SUCURSAL.PAGO.VERSION
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public Long getVersion() {
    return version;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column USER_VENTAS_SUCURSAL.PAGO.VERSION
   *
   * @param version
   *          the value for USER_VENTAS_SUCURSAL.PAGO.VERSION
   *
   * @mbggenerated Thu Sep 04 11:10:14 COT 2014
   */
  public void setVersion(Long version) {
    this.version = version;
  }
}