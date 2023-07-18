package com.app.expirytracker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//HelloController登录接口，URL访问权限控制，分别对应不同的角色方能访问
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }
    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
