package com.xff.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xufeng
 * @version 1.0
 * @date 2020/7/7 09:22
 **/
@RestController
public class ByeController {

    @RequestMapping(value = "/bye")
    public String bye() {
        return "bye" + "!";
    }
}
