package com.xff.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author xufeng
 * @version 1.0
 * @date 2020/7/7 09:48
 **/
@Component
public class TheHystrixFallback implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public String hello(String name) {
                return "hello fallback";
            }

            @Override
            public String bye() {
                return "bye fallback";
            }
        };
    }
}
