package com.zhangyu.stock.controller;

import com.zhangyu.stock.service.StockService;
import org.aspectj.weaver.ast.Call;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库存 controller
 *
 * @author zhangyu
 * @date 2023/2/22 10:22
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PutMapping("/reduce")
    public boolean reduce(@RequestParam("productId") Integer productId) {
        return stockService.reduce(productId);
    }
}
