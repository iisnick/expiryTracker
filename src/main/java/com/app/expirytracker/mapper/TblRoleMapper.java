package com.app.expirytracker.mapper;

import com.app.expirytracker.model.TblRole;
import com.app.expirytracker.model.TblRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TblRoleMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TblRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TblRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TblRole row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TblRole row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblRole> selectByExample(TblRoleExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblRole> selectByExampleWithLock(TblRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblRole> selectByExample(TblRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblRole selectByPrimaryKeyWithLock(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblRole selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") TblRole row, @Param("example") TblRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") TblRole row, @Param("example") TblRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TblRole row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TblRole row);

    List<TblRole> selectAllRole();

    List<TblRole> getRoleByUsername(String username);

    List<TblRole> getRoleByUserId(int userId);

}