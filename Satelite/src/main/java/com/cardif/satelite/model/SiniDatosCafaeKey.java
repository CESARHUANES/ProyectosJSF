package com.cardif.satelite.model;

import java.io.Serializable;

public class SiniDatosCafaeKey implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.SINI_DATOS_CAFAE.NRO_SINIESTRO
   *
   * @mbggenerated Thu Jul 17 19:07:03 COT 2014
   */
  private String nroSiniestro;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.SINI_DATOS_CAFAE.NRO_DOC_BENEFICIARIO
   *
   * @mbggenerated Thu Jul 17 19:07:03 COT 2014
   */
  private String nroDocBeneficiario;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.SINI_DATOS_CAFAE.NRO_SINIESTRO
   *
   * @return the value of dbo.SINI_DATOS_CAFAE.NRO_SINIESTRO
   *
   * @mbggenerated Thu Jul 17 19:07:03 COT 2014
   */
  public String getNroSiniestro() {
    return nroSiniestro;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.SINI_DATOS_CAFAE.NRO_SINIESTRO
   *
   * @param nroSiniestro
   *          the value for dbo.SINI_DATOS_CAFAE.NRO_SINIESTRO
   *
   * @mbggenerated Thu Jul 17 19:07:03 COT 2014
   */
  public void setNroSiniestro(String nroSiniestro) {
    this.nroSiniestro = nroSiniestro == null ? null : nroSiniestro.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.SINI_DATOS_CAFAE.NRO_DOC_BENEFICIARIO
   *
   * @return the value of dbo.SINI_DATOS_CAFAE.NRO_DOC_BENEFICIARIO
   *
   * @mbggenerated Thu Jul 17 19:07:03 COT 2014
   */
  public String getNroDocBeneficiario() {
    return nroDocBeneficiario;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.SINI_DATOS_CAFAE.NRO_DOC_BENEFICIARIO
   *
   * @param nroDocBeneficiario
   *          the value for dbo.SINI_DATOS_CAFAE.NRO_DOC_BENEFICIARIO
   *
   * @mbggenerated Thu Jul 17 19:07:03 COT 2014
   */
  public void setNroDocBeneficiario(String nroDocBeneficiario) {
    this.nroDocBeneficiario = nroDocBeneficiario == null ? null : nroDocBeneficiario.trim();
  }
}