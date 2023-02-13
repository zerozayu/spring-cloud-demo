package com.zhangyu.controller;

import com.zhangyu.feign.StockFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @date 2023/2/9 11:02
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final StockFeignService stockFeignService;

    public OrderController(StockFeignService stockFeignService) {
        this.stockFeignService = stockFeignService;
    }


    @GetMapping(value = "/create")
    public String order() {
        String result = stockFeignService.order();
        return "订单生成成功 By Feign - " + result;
    }
}
