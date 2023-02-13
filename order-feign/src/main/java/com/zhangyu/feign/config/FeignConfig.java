package com.zhangyu.feign.config;

import com.zhangyu.feign.interceptor.FeignAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyu
 * @date 2023/2/13 22:12
 */
// 全局配置
@Configuration
public class FeignConfig {

    // 这里添加对接口的授权校验，添加实现FeignAuthRequestInterceptor接口
    @Bean
    public FeignAuthRequestInterceptor feignAuthRequestInterceptor() {
        return new FeignAuthRequestInterceptor();
    }
}
