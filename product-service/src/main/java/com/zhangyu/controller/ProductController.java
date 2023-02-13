package com.zhangyu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @date 2023/2/9 11:02
 */
@RestController
@RequestMapping("/prod")
public class ProductController {
    @Value("${server.port}")
    private int port;

    @GetMapping(value = "/update")
    public String update() {
        return "product库存更新成功 - 端口号:  " + port;
    }
}
