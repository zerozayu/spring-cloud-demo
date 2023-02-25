package com.zhangyu.order.service.impl;

import com.zhangyu.order.api.StockFeignService;
import com.zhangyu.order.domain.Order;
import com.zhangyu.order.mapper.OrderMapper;
import com.zhangyu.order.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

/**
 * 订单 svc 实现类
 *
 * @author zhangyu
 * @date 2023/2/22 23:46
 */
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;
    private final StockFeignService stockFeignService;

    public OrderServiceImpl(OrderMapper orderMapper, StockFeignService stockFeignService) {
        this.orderMapper = orderMapper;
        this.stockFeignService = stockFeignService;
    }

    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public int createOrder(Order order) {
        String xid = RootContext.getXID();
        orderMapper.create(order);
        int id = order.getId();


        boolean reduceStockResult = stockFeignService.reduce(111);
        int a = 1 / 0;
        System.out.println(id);
        return id > 0 && reduceStockResult ? id : 0;
    }
}
