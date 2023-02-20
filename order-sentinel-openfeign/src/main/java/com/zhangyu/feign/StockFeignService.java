package com.zhangyu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangyu
 * @date 2023/2/20 11:29
 */
@FeignClient(name = "stock-nacos", path = "/stock", fallback = StockFeignServiceImpl.class)
public interface StockFeignService {

    @GetMapping(value = "/update")
    String order();

    @GetMapping(value = "/update1")
    String order1();
}
