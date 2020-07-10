package com.xff.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xufeng
 * @version 1.0
 * @date 2020/7/7 11:43
 **/
@RestController
@RefreshScope
public class GetController {

    @Value("${info.profile:error}")
    private String profile;

    @GetMapping(value = "/xxx")
    public String hello() {
        return  profile + "CCCCCCCCCCCCCCCCC";
    }
}
