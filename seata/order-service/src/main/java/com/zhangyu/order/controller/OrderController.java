package com.zhangyu.order.controller;

import com.zhangyu.order.api.StockFeignService;
import com.zhangyu.order.domain.Order;
import com.zhangyu.order.service.OrderService;
import io.seata.core.context.RootContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 订单 controller
 *
 * @author zhangyu
 * @date 2023/2/22 23:35
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @RequestMapping("/create")
    public String createOrder() {
        Order order = new Order();
        order.setProductId(111);
        order.setTotalAmount(new BigDecimal("100.11"));
        order.setStatus(1);

        int id = orderService.createOrder(order);

        return "订单创建成功-id:[]" + id;
    }
}
