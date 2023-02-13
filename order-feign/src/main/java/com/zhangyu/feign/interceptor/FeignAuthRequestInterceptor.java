package com.zhangyu.feign.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

/**
 * feign 的自定义拦截器
 *
 * @author zhangyu
 * @date 2023/2/13 22:15
 */
public class FeignAuthRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String accessToken = UUID.randomUUID().toString();
        requestTemplate.header("Authorization", "Basic " + accessToken);
    }
}
