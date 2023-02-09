package com.zhangyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyu
 * @date 2023/2/9 11:02
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final RestTemplate restTemplate;

    @Autowired
    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/create")
    public String order() {
        String result = restTemplate.getForObject("http://stock-nacos/stock/update", String.class);
        return "订单生成成功" + result;
    }
}
