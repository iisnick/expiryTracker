package com.app.expirytracker.Controller;

import com.app.expirytracker.model.TblProduct;
import com.app.expirytracker.model.TblUser;
import com.app.expirytracker.model.TblUserProducts;
import com.app.expirytracker.service.ProductService;
import com.app.expirytracker.utils.SessionManager;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class ProductController {

    @Resource
    ProductService productService;

    @PostMapping("/admin/getProdListByUserId")
    @ResponseBody
    public List<TblUserProducts> getProdListByUserId(@RequestParam("userId") int userId) {
        return productService.findProductsByUserId(userId);
    }

    @PostMapping("/getCurrentUserProdList")
    @ResponseBody
    public List<TblUserProducts> getCurrentUserProdList() {
        TblUser user = SessionManager.getCurrentUser();
        List<TblUserProducts> tblUserProducts = productService.findProductsByUserId(user.getId());
        return tblUserProducts;
    }

    @PostMapping("/insertProduct")
    @ResponseBody
    public String insertProduct(@RequestBody TblUserProducts tblUserProducts) {
        TblUser user = SessionManager.getCurrentUser();
        tblUserProducts.setUserId(user.getId());
        tblUserProducts.setCreatedBy(user.getId());
        tblUserProducts.setStatus(0);
        tblUserProducts.setCreateTime(new Date());
        tblUserProducts.setLastModBy(user.getId());
        tblUserProducts.setLastModTime(new Date());
        int result = productService.insertUserProduct(tblUserProducts);
        if (result==1)
            return "success";
        else
            return "error";
    }

    @PostMapping("/createProduct")
    @ResponseBody
    public String createProduct(@RequestBody TblProduct tblProducts) {
        TblUser user = SessionManager.getCurrentUser();
        tblProducts.setCreatedBy(user.getId());
        tblProducts.setStatus(0);
        tblProducts.setCreateTime(new Date());
        tblProducts.setLastModBy(user.getId());
        tblProducts.setLastModTime(new Date());
        int result = productService.createProduct(tblProducts);
        if (result==1)
            return "success";
        else
            return "error";
    }
}
