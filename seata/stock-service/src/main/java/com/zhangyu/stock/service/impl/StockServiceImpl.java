package com.zhangyu.stock.service.impl;

import com.zhangyu.stock.mapper.StockMapper;
import com.zhangyu.stock.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 库存 svc
 *
 * @author zhangyu
 * @date 2023/2/22 10:36
 */
@Service
public class StockServiceImpl implements StockService {
    private final StockMapper stockMapper;

    public StockServiceImpl(StockMapper stockMapper) {
        this.stockMapper = stockMapper;
    }

    @Override
    public boolean reduce(Integer productId) {
        return stockMapper.reduce(productId);
    }
}
