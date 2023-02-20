package com.zhangyu.feign;

import org.springframework.stereotype.Service;

@Service
public class StockFeignServiceImpl implements StockFeignService {
    @Override
    public String order() {
        return "服务降级";
    }

    @Override
    public String order1() {
        return "服务降级";
    }
}
