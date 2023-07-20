package com.app.expirytracker.dao.impl;

import com.app.expirytracker.dao.ProductDao;
import com.app.expirytracker.mapper.TblProductMapper;
import com.app.expirytracker.mapper.TblUserProductsMapper;
import com.app.expirytracker.model.TblProduct;
import com.app.expirytracker.model.TblUserProducts;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Resource
    TblUserProductsMapper tblUserProductsMapper;

    @Resource
    TblProductMapper tblProductMapper;

    public List<TblUserProducts> findProductsByUserId(int userId,int status) {
        return tblUserProductsMapper.findProductsByUserId(userId,status);
    }

    public int insertUserProduct(TblUserProducts tblUserProducts) {
        return tblUserProductsMapper.insert(tblUserProducts);
    }

    @Override
    public int updateUserProduct(TblUserProducts tblUserProducts) {
        return tblUserProductsMapper.updateByPrimaryKey(tblUserProducts);
    }

    @Override
    public int deactivateUserProduct(TblUserProducts tblUserProducts) {
        return tblUserProductsMapper.deactivateUserProduct(tblUserProducts);
    }

    @Override
    public int createProduct(TblProduct tblProduct) {
        return tblProductMapper.insert(tblProduct);
    }
}