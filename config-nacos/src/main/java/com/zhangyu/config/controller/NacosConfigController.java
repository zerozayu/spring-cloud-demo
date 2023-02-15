package com.zhangyu.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @date 2023/2/14 10:26
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class NacosConfigController {
    @Value("${user.name}")
    private String name;

    @GetMapping("value")
    public String config() {
        return name;
    }
}
