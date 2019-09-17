package com.cardif.satelite.telemarketing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.cardif.satelite.model.TlmkBaseSB;
import com.cardif.satelite.model.TlmkBaseSBExample;

public interface TlmkBaseSBMapper {
  final String SELECT_MAX_COD_BASE_SB = "SELECT MAX(COD_BASE) FROM TLMK_BASE_SB";

  final String SELECT_COD_BASE = "SELECT * FROM TLMK_BASE_SB WHERE COD_BASE = #{codBase}" + " AND ESTADO = #{estado}";

  final String SELECT_CLIENTES_PROCESADOS = "SELECT COUNT(*) FROM TLMK_BASE_SB " + "WHERE ESTADO = #{estado} AND COD_BASE = #{codBase}";

  @Select(SELECT_MAX_COD_BASE_SB)
  int selectMaxCodBaseSB();

  @Select(SELECT_COD_BASE)
  @ResultMap("BaseResultMap")
  List<TlmkBaseSB> selectBase(@Param("codBase") Long codBase, @Param("estado") String estado);

  @Select(SELECT_CLIENTES_PROCESADOS)
  int selectClientesProcesados(@Param("codBase") Long codBase, @Param("estado") String estado);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int countByExample(TlmkBaseSBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int deleteByExample(TlmkBaseSBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int deleteByPrimaryKey(Long pk);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int insert(TlmkBaseSB record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int insertSelective(TlmkBaseSB record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  List<TlmkBaseSB> selectByExample(TlmkBaseSBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  TlmkBaseSB selectByPrimaryKey(Long pk);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int updateByExampleSelective(@Param("record") TlmkBaseSB record, @Param("example") TlmkBaseSBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int updateByExample(@Param("record") TlmkBaseSB record, @Param("example") TlmkBaseSBExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int updateByPrimaryKeySelective(TlmkBaseSB record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.TLMK_BASE_SB
   *
   * @mbggenerated Mon Feb 03 17:08:10 COT 2014
   */
  int updateByPrimaryKey(TlmkBaseSB record);
}