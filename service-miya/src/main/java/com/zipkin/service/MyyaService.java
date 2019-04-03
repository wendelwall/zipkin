package com.zipkin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：sunrise
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/4/3 21:14
 */
@FeignClient(name = "myya-service", url = "http://localhost:8988")
public interface MyyaService {

    @GetMapping(value = "/info")
    String info();
}
