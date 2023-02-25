package com.zhangyu.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 库存 stock 的 feign 接口
 *
 * @author zhangyu
 * @date 2023/2/23 00:08
 */
@FeignClient(value = "stock-service", path = "/stock")
public interface StockFeignService {

    @PutMapping("/reduce")
    boolean reduce(@RequestParam("productId") Integer productId);

}
