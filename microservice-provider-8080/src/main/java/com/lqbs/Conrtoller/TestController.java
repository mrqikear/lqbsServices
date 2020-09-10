package com.lqbs.Conrtoller;

import com.lqbs.entity.User;
import com.lqbs.serverImp.UserServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TestController {
    @Autowired
    UserServer userServer;
    @GetMapping("/test")
    public String Test(){

        log.info("这是log4j2的日志测试，info级别");
        log.warn("这是log4j2的日志测试，warn级别");
        log.error("这是log4j2的日志测试，error级别");

        //如果在日志输出中想携带参数的化，可以这样设置
        String bug = "约翰·冯·诺依曼 保佑，永无BUG";
        log.info("这是带参数的输出格式:{}",bug);
        return  "Hello springboot Test2";
    }




    @GetMapping("/getall/user")
    public List<User> getAll(){
        return userServer.getAllUser();
    }



}



