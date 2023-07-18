package com.app.expirytracker.mapper;

import com.app.expirytracker.model.TblProduct;
import com.app.expirytracker.model.TblProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblProductMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TblProductExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TblProductExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TblProduct row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TblProduct row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TblProduct> selectByExample(TblProductExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TblProduct selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") TblProduct row, @Param("example") TblProductExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") TblProduct row, @Param("example") TblProductExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TblProduct row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TblProduct row);
}