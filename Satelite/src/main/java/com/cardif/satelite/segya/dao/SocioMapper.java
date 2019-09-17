package com.cardif.satelite.segya.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.cardif.satelite.model.segya.Socio;
import com.cardif.satelite.model.segya.SocioExample;

public interface SocioMapper {
  final String SELECT_SOCIO = "SELECT * FROM SOCIO";

  @Select(SELECT_SOCIO)
  @ResultMap(value = "BaseResultMap")
  List<Socio> selectSocio();

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int countByExample(SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int deleteByExample(SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int deleteByPrimaryKey(Integer codigoSocio);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int insert(Socio record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int insertSelective(Socio record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  List<Socio> selectByExample(SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  Socio selectByPrimaryKey(Integer codigoSocio);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int updateByExampleSelective(@Param("record") Socio record, @Param("example") SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int updateByExample(@Param("record") Socio record, @Param("example") SocioExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int updateByPrimaryKeySelective(Socio record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Socio
   *
   * @mbggenerated Thu Dec 12 17:33:04 COT 2013
   */
  int updateByPrimaryKey(Socio record);
}