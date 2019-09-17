package com.cardif.satelite.suscripcion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.cardif.satelite.model.SusTramaCabeceraIB;
import com.cardif.satelite.model.SusTramaCabeceraIBExample;

public interface SusTramaCabeceraIBMapper {

  final String LISTA_DOCUMENTO = "SELECT * FROM dbo.SUS_TRAMA_CABECERA_IB ORDER BY FEC_CREACION DESC ";

  @Select(LISTA_DOCUMENTO)
  @ResultMap(value = "BaseResultMap")
  List<SusTramaCabeceraIB> listar();

  final String COD_TRAMA = "SELECT * FROM dbo.SUS_TRAMA_CABECERA_IB" + " WHERE PERIODO=#{periodo} ";

  @Select(COD_TRAMA)
  @ResultMap(value = "BaseResultMap")
  SusTramaCabeceraIB obtenerCabecera(@Param("periodo") String periodo);

  final String NRO_DE_CABECERAS = "select count(*) from dbo.SUS_TRAMA_CABECERA_IB";

  @Select(NRO_DE_CABECERAS)
  int obtenerNroCabeceras();

  final String PROCESAR_TRAMA = "UPDATE dbo.SUS_TRAMA_CABECERA_IB SET ESTADO='PROCESADO' WHERE  ESTADO='PENDIENTE' AND PERIODO=#{periodo}";

  @Select(PROCESAR_TRAMA)
  @ResultMap(value = "BaseResultMap")
  SusTramaCabeceraIB procesarTrama(@Param("periodo") String periodo);

  final String PROCESAR_TRAMA_DIA = "UPDATE dbo.SUS_TRAMA_INTERBANK SET ESTADO_DOCUMENTO='CON DEVOLUCION-------' WHERE  NRO_CERTIFICADO=#{numCertificado}";

  @Select(PROCESAR_TRAMA_DIA)
  @ResultMap(value = "BaseResultMap")
  SusTramaCabeceraIB procesarTramaDia(@Param("numCertificado") String numCertificado);

  final String PROCESAR_TRAMA_DIA2 = "UPDATE dbo.SUS_TRAMA_INTERBANK SET ESTADO_DOCUMENTO='OBSERVADO' WHERE  ESTADO_DOCUMENTO='PENDIENTE'";

  @Select(PROCESAR_TRAMA_DIA2)
  @ResultMap(value = "BaseResultMap")
  SusTramaCabeceraIB procesarTramaDia2(@Param("periodo") String periodo);

  final String PROCESAR_TRAMA_MES_CERRADO = "UPDATE dbo.SUS_TRAMA_CABECERA_IB SET ESTADO='CERRADO' WHERE  ESTADO='PROCESADO' AND COD_TRAMA = #{codTrama}";

  @Select(PROCESAR_TRAMA_MES_CERRADO)
  @ResultMap(value = "BaseResultMap")
  SusTramaCabeceraIB procesarTramaMesCerrado(@Param("codTrama") Long codTrama);

  final String ACTUALIZAR_TRAMA_CABECERA = "UPDATE dbo.SUS_TRAMA_CABECERA_IB SET CAN_REGISTROS=CAN_REGISTROS+#{canRegistrados},CAN_RECHAZADOS=CAN_RECHAZADOS+#{canRechazados} WHERE   PERIODO=#{periodo}";

  @Select(ACTUALIZAR_TRAMA_CABECERA)
  @ResultMap(value = "BaseResultMap")
  SusTramaCabeceraIB actualizarCabecera(@Param("periodo") String periodo, @Param("canRechazados") int canRechazados, @Param("canRegistrados") int canRegistrados);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int countByExample(SusTramaCabeceraIBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int deleteByExample(SusTramaCabeceraIBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int deleteByPrimaryKey(Long codTrama);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int insert(SusTramaCabeceraIB record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int insertSelective(SusTramaCabeceraIB record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  List<SusTramaCabeceraIB> selectByExample(SusTramaCabeceraIBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  SusTramaCabeceraIB selectByPrimaryKey(Long codTrama);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int updateByExampleSelective(@Param("record") SusTramaCabeceraIB record, @Param("example") SusTramaCabeceraIBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int updateByExample(@Param("record") SusTramaCabeceraIB record, @Param("example") SusTramaCabeceraIBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int updateByPrimaryKeySelective(SusTramaCabeceraIB record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.SUS_TRAMA_CABECERA_IB
   *
   * @mbggenerated Fri Jun 13 11:49:15 COT 2014
   */
  int updateByPrimaryKey(SusTramaCabeceraIB record);
}