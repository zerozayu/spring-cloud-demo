package com.zhangyu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangyu
 * @date 2023/2/13 11:04
 */
@FeignClient(name = "stock-nacos", path = "/stock")
public interface StockFeignService {

    @GetMapping(value = "/update")
    String order();
}
