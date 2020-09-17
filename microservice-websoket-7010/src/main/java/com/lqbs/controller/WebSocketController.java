package com.lqbs.controller;

import com.lqbs.service.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebSocketController {

    @Autowired
    private WebSocketServer webSocketServer;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/webSocket")
    public ModelAndView socket() {
        String id = "87";
        ModelAndView mav=new ModelAndView("/webSocket/"+id);
        return mav;
    }




}
