package com.app.expirytracker.mapper;

import com.app.expirytracker.model.TblUserRole;
import com.app.expirytracker.model.TblUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TblUserRoleMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TblUserRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TblUserRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TblUserRole row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TblUserRole row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUserRole> selectByExample(TblUserRoleExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUserRole> selectByExampleWithLock(TblUserRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUserRole> selectByExample(TblUserRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblUserRole selectByPrimaryKeyWithLock(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblUserRole selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") TblUserRole row, @Param("example") TblUserRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") TblUserRole row, @Param("example") TblUserRoleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TblUserRole row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TblUserRole row);

}