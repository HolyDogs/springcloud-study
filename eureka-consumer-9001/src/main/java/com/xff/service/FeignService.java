package com.xff.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-producer", fallbackFactory = TheHystrixFallback.class)
public interface FeignService {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name")String name);

    @RequestMapping("/bye")
    public String bye();
}
