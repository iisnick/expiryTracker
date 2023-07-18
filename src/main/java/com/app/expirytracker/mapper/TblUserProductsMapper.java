package com.app.expirytracker.mapper;

import com.app.expirytracker.model.TblUserProducts;
import com.app.expirytracker.model.TblUserProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserProductsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TblUserProductsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TblUserProductsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TblUserProducts row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TblUserProducts row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblUserProducts> selectByExample(TblUserProductsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblUserProducts selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") TblUserProducts row, @Param("example") TblUserProductsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") TblUserProducts row, @Param("example") TblUserProductsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TblUserProducts row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TblUserProducts row);

    List<TblUserProducts> findProductsByUserId(int userId);

}