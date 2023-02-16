package org.zhangyu.sentinel.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhangyu.sentinel.domain.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static org.zhangyu.sentinel.config.FlowRulesConfig.RESOURCE_NAME;

/**
 * @author zhangyu
 * @date 2023/2/16 11:00
 */
@RestController
@RequestMapping("/user")
public class UserWithExController {


    @GetMapping("/hello_with_ex")
    public User sayHelly() {
        // 1.5.0 版本开始可以利用 try-with-resources 特性
        // 资源名可使用任意有业务语义的字符串，比如方法名、接口名或其它可唯一标识的字符串。
        try (Entry entry = SphU.entry(RESOURCE_NAME)) {
            // 被保护的业务逻辑
            // do something here...
            return new User("zhangyu");
        } catch (BlockException ex) {
            // 资源访问阻止，被限流或被降级
            // 在此处进行相应的处理操作
            return new User("限流");
        }
    }


}
