package com.app.expirytracker.dao;

import com.app.expirytracker.model.TblProduct;
import com.app.expirytracker.model.TblUserProducts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    List<TblUserProducts> findProductsByUserId(int userId,int status);

    int insertUserProduct(TblUserProducts tblUserProducts);

    int updateUserProduct(TblUserProducts tblUserProducts);

    int deactivateUserProduct(TblUserProducts tblUserProducts);

    int createProduct(TblProduct tblProduct);


}
