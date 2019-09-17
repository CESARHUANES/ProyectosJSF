package com.cardif.satelite.suscripcion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cardif.satelite.model.AuditCarRegVentas;
import com.cardif.satelite.model.AuditCarRegVentasExample;

public interface AuditCarRegVentasMapper {

  final String SELECT_PERIODO = "select count(*) from audit_car_reg_ventas where periodo = #{periodo}";
  final String ULTIMO_PERIODO = "select top(1) periodo from audit_car_reg_ventas order by periodo desc";

  @Select(SELECT_PERIODO)
  int consultarPeriodo(@Param("periodo") int periodo);

  @Select(ULTIMO_PERIODO)
  String ultimoPeriodo();

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int countByExample(AuditCarRegVentasExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int deleteByExample(AuditCarRegVentasExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int deleteByPrimaryKey(Long pk);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int insert(AuditCarRegVentas record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int insertSelective(AuditCarRegVentas record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  List<AuditCarRegVentas> selectByExample(AuditCarRegVentasExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  AuditCarRegVentas selectByPrimaryKey(Long pk);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByExampleSelective(@Param("record") AuditCarRegVentas record, @Param("example") AuditCarRegVentasExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByExample(@Param("record") AuditCarRegVentas record, @Param("example") AuditCarRegVentasExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByPrimaryKeySelective(AuditCarRegVentas record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.AUDIT_CAR_REG_VENTAS
   * 
   * @mbggenerated Fri Nov 29 13:00:11 COT 2013
   */
  int updateByPrimaryKey(AuditCarRegVentas record);
}