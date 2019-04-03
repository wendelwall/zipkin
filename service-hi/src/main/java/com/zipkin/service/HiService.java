package com.zipkin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：sunrise
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/4/3 21:14
 */
@FeignClient(name = "hi-service", url = "http://localhost:8989")
public interface HiService {

    @GetMapping(value = "/miya")
    String miya();
}
