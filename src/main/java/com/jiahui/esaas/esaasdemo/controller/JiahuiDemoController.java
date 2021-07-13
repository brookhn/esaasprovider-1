package com.jiahui.esaas.esaasdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiahuiDemoController {

    @GetMapping("/esaas/demo")
    public String nacosTestDemo(){
        return "testDemo";
    }
}
