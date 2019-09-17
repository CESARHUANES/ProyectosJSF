package com.cardif.satelite.configuracion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.cardif.satelite.model.satelite.GenDistrito;
import com.cardif.satelite.model.satelite.GenDistritoExample;

public interface GenDistritoMapper {
  final String SELECT_DIST = "SELECT * FROM GEN_DISTRITO " + "WHERE PROVINCIA = #{codProvincia}  order by NOMBRE_DISTRITO";

  @Select(SELECT_DIST)
  @ResultMap(value = "BaseResultMap")
  List<GenDistrito> selectDistrito(@Param("codProvincia") String codProvincia);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int countByExample(GenDistritoExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int deleteByExample(GenDistritoExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int deleteByPrimaryKey(String codDistrito);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int insert(GenDistrito record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int insertSelective(GenDistrito record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  List<GenDistrito> selectByExample(GenDistritoExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  GenDistrito selectByPrimaryKey(String codDistrito);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int updateByExampleSelective(@Param("record") GenDistrito record, @Param("example") GenDistritoExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int updateByExample(@Param("record") GenDistrito record, @Param("example") GenDistritoExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int updateByPrimaryKeySelective(GenDistrito record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.GEN_DISTRITO
   *
   * @mbggenerated Wed Sep 03 18:53:50 COT 2014
   */
  int updateByPrimaryKey(GenDistrito record);
}