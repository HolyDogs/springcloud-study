package com.xff.controller;

import com.xff.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xufeng
 * @version 1.0
 * @date 2020/7/7 09:29
 **/
@RestController
public class MyController {

    @SuppressWarnings("all")
    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/feign/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return feignService.hello(name) + "feign--";
    }

    @GetMapping(value = "/feign/bye")
    public String bye() {
        return feignService.bye() + "feign--";
    }
}
