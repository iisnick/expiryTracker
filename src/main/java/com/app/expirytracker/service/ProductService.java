package com.app.expirytracker.service;

import com.app.expirytracker.dao.ProductDao;
import com.app.expirytracker.model.TblProduct;
import com.app.expirytracker.model.TblUserProducts;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Resource
    ProductDao productDao;

    public List<TblUserProducts> findProductsByUserId(int userId) {
        return productDao.findProductsByUserId(userId);
    }

    public int insertUserProduct(TblUserProducts tblUserProducts) {
        return productDao.insertUserProduct(tblUserProducts);
    }

    public int createProduct(TblProduct tblProduct) {
        return productDao.createProduct(tblProduct);
    }
}
