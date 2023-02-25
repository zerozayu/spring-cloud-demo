package com.zhangyu.order.service;

import com.zhangyu.order.domain.Order;

/**
 * 订单 svc
 *
 * @author zhangyu
 * @date 2023/2/22 23:46
 */
public interface OrderService {

    int createOrder(Order order);
}
