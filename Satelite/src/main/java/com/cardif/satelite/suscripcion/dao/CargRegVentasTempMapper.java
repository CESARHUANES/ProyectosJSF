package com.cardif.satelite.suscripcion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.cardif.satelite.model.CargRegVentasTemp;
import com.cardif.satelite.model.CargRegVentasTempExample;

public interface CargRegVentasTempMapper {

  final String DELETE_ROWS = "delete from carg_reg_ventas_temp";

  @Delete(DELETE_ROWS)
  int deleteRows();

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int countByExample(CargRegVentasTempExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int deleteByExample(CargRegVentasTempExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int deleteByPrimaryKey(Long pk);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int insert(CargRegVentasTemp record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int insertSelective(CargRegVentasTemp record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  List<CargRegVentasTemp> selectByExample(CargRegVentasTempExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  CargRegVentasTemp selectByPrimaryKey(Long pk);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByExampleSelective(@Param("record") CargRegVentasTemp record, @Param("example") CargRegVentasTempExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByExample(@Param("record") CargRegVentasTemp record, @Param("example") CargRegVentasTempExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByPrimaryKeySelective(CargRegVentasTemp record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.CARG_REG_VENTAS_TEMP
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByPrimaryKey(CargRegVentasTemp record);
}