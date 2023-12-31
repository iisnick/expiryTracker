package com.app.expirytracker.Controller;


import com.app.expirytracker.model.UserRegister;
import com.app.expirytracker.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doRegisterController {
    @Resource
    UserService userService;

    @PostMapping("/doregister")

    public String doregister(UserRegister userRegister) {
        return userService.addUserByUsername(userRegister);
    }
}
