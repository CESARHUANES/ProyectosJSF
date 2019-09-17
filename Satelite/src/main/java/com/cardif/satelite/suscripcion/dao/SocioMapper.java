package com.cardif.satelite.suscripcion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.cardif.satelite.model.soatsucursal.Socio;
import com.cardif.satelite.model.soatsucursal.SocioExample;

public interface SocioMapper {
  final String LISTASOCIOS = "SELECT * FROM user_ventas_sucursal.SOCIO WHERE COD_SOCIO NOT IN ('1')";

  @Select(LISTASOCIOS)
  @ResultMap(value = "BaseResultMap")
  List<Socio> listaSocios();

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int countByExample(SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int deleteByExample(SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int deleteByPrimaryKey(String codSocio);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int insert(Socio record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int insertSelective(Socio record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  List<Socio> selectByExample(SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  Socio selectByPrimaryKey(String codSocio);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int updateByExampleSelective(@Param("record") Socio record, @Param("example") SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int updateByExample(@Param("record") Socio record, @Param("example") SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int updateByPrimaryKeySelective(Socio record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table USER_VENTAS_SUCURSAL.SOCIO
   *
   * @mbggenerated Fri Sep 05 15:00:58 COT 2014
   */
  int updateByPrimaryKey(Socio record);
}