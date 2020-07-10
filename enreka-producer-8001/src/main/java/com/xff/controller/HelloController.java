package com.xff.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xufeng
 * @version 1.0
 * @date 2020/7/6 16:29
 **/
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping(value = "/{name}")
    public String hello(@PathVariable(value = "name")String name) {
        return "hello," + name + "!";
    }
}
