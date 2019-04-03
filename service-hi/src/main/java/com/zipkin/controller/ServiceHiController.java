package com.zipkin.controller;

import com.zipkin.service.HiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：sunrise
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/4/3 21:11
 */
@Slf4j
@RestController
public class ServiceHiController {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String callHome() {
        log.info("calling trace service-hi  ");
        return hiService.miya();
    }

    @GetMapping(value = "/info")
    public String info() {
        log.info("calling trace service-hi ");

        return "i'm service-hi";

    }

}
