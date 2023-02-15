package com.zhangyu.order.controller;

import com.zhangyu.order.feign.ProductFeignService;
import com.zhangyu.order.feign.StockFeignService;
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
    private final ProductFeignService productFeignService;

    public OrderController(StockFeignService stockFeignService, ProductFeignService productFeignService) {
        this.stockFeignService = stockFeignService;
        this.productFeignService = productFeignService;
    }


    @GetMapping(value = "/create")
    public String order() {
        String result = stockFeignService.order();

        String product = productFeignService.update();
        return "订单生成成功 By Feign - " + result + "-" + product;
    }
}
