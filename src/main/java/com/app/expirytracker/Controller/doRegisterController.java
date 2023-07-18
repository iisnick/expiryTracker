package com.app.expirytracker.Controller;


import com.app.expirytracker.model.UserRegister;
import com.app.expirytracker.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doRegisterController {
    @Resource
    UserService userService;

    @PostMapping("/doregister")
    //doRegisterController执行用户注册接口及返回注册结果
    public String doregister(UserRegister userRegister) {
        return userService.addUserByUsername(userRegister);
    }
}
