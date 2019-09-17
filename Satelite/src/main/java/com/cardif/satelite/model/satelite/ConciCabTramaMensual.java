package com.cardif.satelite.model.satelite;

import java.io.Serializable;
import java.util.Date;

public class ConciCabTramaMensual implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.CONCI_CAB_TRAMA_MENSUAL.SEC_ARCHIVO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  
  private Long secArchivo;
  private String producto;
  private String nomArchivo;
  private Long numRegistros;
  private Date fecProceso;
  private String tipoCargo;  
  private Date fecCreacion;
  private String usuCreacion;
  private String canal;
  private String rutaArchivo;
  private String estadoConsolidado;
  private Integer correlativo;
  private String estado;
  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.SEC_ARCHIVO
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.SEC_ARCHIVO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public Long getSecArchivo() {
    return secArchivo;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.SEC_ARCHIVO
   *
   * @param secArchivo
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.SEC_ARCHIVO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setSecArchivo(Long secArchivo) {
    this.secArchivo = secArchivo;
  }
  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.PRODUCTO
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.PRODUCTO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public String getProducto() {
    return producto;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.PRODUCTO
   *
   * @param producto
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.PRODUCTO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setProducto(String producto) {
    this.producto = producto == null ? null : producto.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.NOM_ARCHIVO
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.NOM_ARCHIVO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public String getNomArchivo() {
    return nomArchivo;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.NOM_ARCHIVO
   *
   * @param nomArchivo
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.NOM_ARCHIVO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setNomArchivo(String nomArchivo) {
    this.nomArchivo = nomArchivo == null ? null : nomArchivo.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.NUM_REGISTROS
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.NUM_REGISTROS
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public Long getNumRegistros() {
    return numRegistros;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.NUM_REGISTROS
   *
   * @param numRegistros
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.NUM_REGISTROS
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setNumRegistros(Long numRegistros) {
    this.numRegistros = numRegistros;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_PROCESO
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_PROCESO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public Date getFecProceso() {
    return fecProceso;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_PROCESO
   *
   * @param fecProceso
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_PROCESO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setFecProceso(Date fecProceso) {
    this.fecProceso = fecProceso;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.ESTADO
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.ESTADO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public String getEstado() {
    return estado;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.ESTADO
   *
   * @param estado
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.ESTADO
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setEstado(String estado) {
    this.estado = estado == null ? null : estado.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_CREACION
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_CREACION
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public Date getFecCreacion() {
    return fecCreacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_CREACION
   *
   * @param fecCreacion
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.FEC_CREACION
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setFecCreacion(Date fecCreacion) {
    this.fecCreacion = fecCreacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.USU_CREACION
   *
   * @return the value of dbo.CONCI_CAB_TRAMA_MENSUAL.USU_CREACION
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public String getUsuCreacion() {
    return usuCreacion;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.CONCI_CAB_TRAMA_MENSUAL.USU_CREACION
   *
   * @param usuCreacion
   *          the value for dbo.CONCI_CAB_TRAMA_MENSUAL.USU_CREACION
   *
   * @mbggenerated Mon Jul 21 21:23:55 COT 2014
   */
  public void setUsuCreacion(String usuCreacion) {
    this.usuCreacion = usuCreacion == null ? null : usuCreacion.trim();
  }

/**
 * @return the tipoCargo
 */
public String getTipoCargo() {
	return tipoCargo;
}

/**
 * @param tipoCargo the tipoCargo to set
 */
public void setTipoCargo(String tipoCargo) {
	this.tipoCargo = tipoCargo;
}

/**
 * @return the canal
 */
public String getCanal() {
	return canal;
}

/**
 * @param canal the canal to set
 */
public void setCanal(String canal) {
	this.canal = canal;
}

/**
 * @return the rutaArchivo
 */
public String getRutaArchivo() {
	return rutaArchivo;
}

/**
 * @param rutaArchivo the rutaArchivo to set
 */
public void setRutaArchivo(String rutaArchivo) {
	this.rutaArchivo = rutaArchivo;
}

/**
 * @return the estadoConsolidado
 */
public String getEstadoConsolidado() {
	return estadoConsolidado;
}

/**
 * @param estadoConsolidado the estadoConsolidado to set
 */
public void setEstadoConsolidado(String estadoConsolidado) {
	this.estadoConsolidado = estadoConsolidado;
}

/**
 * @return the correlativo
 */
public Integer getCorrelativo() {
	return correlativo;
}

/**
 * @param correlativo the correlativo to set
 */
public void setCorrelativo(Integer correlativo) {
	this.correlativo = correlativo;
}
  
  
  
}