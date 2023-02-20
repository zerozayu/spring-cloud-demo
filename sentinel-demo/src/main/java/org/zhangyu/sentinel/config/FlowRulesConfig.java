package org.zhangyu.sentinel.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyu
 * @date 2023/2/16 16:00
 */
@Configuration
public class FlowRulesConfig {
    public static final String RESOURCE_NAME = "zhangyu";
    public final static String RESOURCE_TEST_WITH_ANNOTATION = "zhangyu1";


    @PostConstruct
    public void initFlowRules() {
        // 流控规则
        List<FlowRule> rules = new ArrayList<>();

        // 流控
        FlowRule rule = new FlowRule();
        // 设置受保护的资源
        rule.setResource(RESOURCE_TEST_WITH_ANNOTATION);
        // 设置流控规则 QPS(每秒查询数)
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);

        // 设置受保护的资源阈值
        rule.setCount(1);
        rules.add(rule);

        // 流控
        FlowRule rule1 = new FlowRule();
        // 设置受保护的资源
        rule1.setResource(RESOURCE_NAME);
        // 设置流控规则 QPS(每秒查询数)
        rule1.setGrade(RuleConstant.FLOW_GRADE_QPS);

        // 设置受保护的资源阈值
        rule1.setCount(1);
        rules.add(rule1);

        FlowRuleManager.loadRules(rules);

        System.out.println(FlowRuleManager.getRules());
    }

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
}
