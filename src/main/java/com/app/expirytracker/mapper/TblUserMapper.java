package com.app.expirytracker.mapper;

import com.app.expirytracker.model.TblUser;
import com.app.expirytracker.model.TblUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TblUserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TblUserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TblUserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TblUser row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TblUser row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUser> selectByExample(TblUserExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUser> selectByExampleWithLock(TblUserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUser> selectByExample(TblUserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblUser selectByPrimaryKeyWithLock(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblUser selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") TblUser row, @Param("example") TblUserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") TblUser row, @Param("example") TblUserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TblUser row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TblUser row);


    TblUser loadUserByUsername(String username);
}