package com.zhangyu.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @date 2023/2/9 11:02
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    /**
     * 配置规则在注解定义的资源名配置，且注解定义的资源名不要和 API path 重复。你这个应该是配的 API path 的规则，走的自带的 Spring Web 埋点。
     *
     * 注意：在 Controller 上面配置的注解，资源名请不要与 URL 重合；因 Sentinel 自带 Web adapter 也会将 URL pattern 作为资源名，这会导致重复统计+注解 blockHandler 不生效。
     * @return
     */
    @GetMapping(value = "/create")
    @SentinelResource(value = "order/create", blockHandler = "blockHandler4Order", fallback = "fallback4Order")
    public String order() {
        // int a = 1/0;
        return "订单生成成功";
    }

    public String blockHandler4Order(BlockException e){
        return "blockHandler4Order()";
    }

    public String fallback4Order(Throwable throwable){
        return "fallback4Order()";
    }
}
