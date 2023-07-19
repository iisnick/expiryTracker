package com.app.expirytracker.Controller;

import com.app.expirytracker.base.RestResponse;
import com.app.expirytracker.base.SystemCode;
import com.app.expirytracker.model.TblProduct;
import com.app.expirytracker.model.TblUser;
import com.app.expirytracker.model.TblUserProducts;
import com.app.expirytracker.service.ProductService;
import com.app.expirytracker.utils.ResponseUtils;
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
    public RestResponse<List<TblUserProducts>> getCurrentUserProdList() {
        TblUser user = SessionManager.getCurrentUser();
        List<TblUserProducts> tblUserProducts = productService.findProductsByUserId(user.getId());
        return RestResponse.ok(tblUserProducts);
    }

    @PostMapping("/insertProduct")
    @ResponseBody
    public RestResponse<String> insertProduct(@RequestBody TblUserProducts tblUserProducts) {
        TblUser user = SessionManager.getCurrentUser();
        tblUserProducts.setUserId(user.getId());
        tblUserProducts.setCreatedBy(user.getId());
        tblUserProducts.setStatus(0);
        tblUserProducts.setCreateTime(new Date());
        tblUserProducts.setLastModBy(user.getId());
        tblUserProducts.setLastModTime(new Date());
        int result = productService.insertUserProduct(tblUserProducts);
        if (result==1)
            return RestResponse.ok(ResponseUtils.RESPONSE_SUCCESS);
        else
            return RestResponse.fail(SystemCode.ParameterValidError.getCode(),ResponseUtils.RESPONSE_ERROR);
    }

    @PostMapping("/updateUserProduct")
    @ResponseBody
    public RestResponse<String> updateProduct(@RequestBody TblUserProducts tblUserProducts) {
        TblUser user = SessionManager.getCurrentUser();
        tblUserProducts.setUserId(user.getId());
        if (tblUserProducts.getUserId().equals(user.getId())) {
            return RestResponse.fail(SystemCode.UNAUTHORIZED.getCode(),ResponseUtils.RESPONSE_INVALID_USER);
        }
        tblUserProducts.setLastModBy(user.getId());
        tblUserProducts.setLastModTime(new Date());
        int result = productService.updateUserProduct(tblUserProducts);
        if (result==1)
            return RestResponse.ok(ResponseUtils.RESPONSE_SUCCESS);
        else
            return RestResponse.fail(SystemCode.ParameterValidError.getCode(),ResponseUtils.RESPONSE_ERROR);
    }

    @PostMapping("/createProduct")
    @ResponseBody
    public RestResponse<String> createProduct(@RequestBody TblProduct tblProducts) {
        TblUser user = SessionManager.getCurrentUser();
        tblProducts.setCreatedBy(user.getId());
        tblProducts.setStatus(0);
        tblProducts.setCreateTime(new Date());
        tblProducts.setLastModBy(user.getId());
        tblProducts.setLastModTime(new Date());
        int result = productService.createProduct(tblProducts);
        if (result==1)
            return RestResponse.ok(ResponseUtils.RESPONSE_SUCCESS);
        else
            return RestResponse.fail(SystemCode.ParameterValidError.getCode(),ResponseUtils.RESPONSE_ERROR);
    }
}
