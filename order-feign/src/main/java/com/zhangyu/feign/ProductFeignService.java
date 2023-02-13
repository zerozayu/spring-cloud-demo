package com.zhangyu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangyu
 * @date 2023/2/13 21:51
 */
@FeignClient(name = "product-service", path = "/prod")
public interface ProductFeignService {

    @GetMapping("/update")
    String update();
}
