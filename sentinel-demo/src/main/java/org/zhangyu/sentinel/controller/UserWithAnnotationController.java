package org.zhangyu.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhangyu.sentinel.domain.User;

import static org.zhangyu.sentinel.config.FlowRulesConfig.RESOURCE_TEST_WITH_ANNOTATION;

/**
 * @author zhangyu
 * @date 2023/2/16 15:02
 */
@RestController
@RequestMapping("/user")
public class UserWithAnnotationController {


    @GetMapping("/hello_with_anno")
    @SentinelResource(value = RESOURCE_TEST_WITH_ANNOTATION, blockHandler = "blockHandler4GetUser",
            fallback = "fallback4GetUser")
    public User getUser() {
        int a = 1 / 0;
        return new User("normal");
    }

    public User blockHandler4GetUser(BlockException e) {
        return new User("blockHandler: " + e.getLocalizedMessage());
    }

    public User fallback4GetUser(Throwable e) {
        return new User("fallback: " + e.getMessage());
    }



}
