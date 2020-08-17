package com.lyming.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 *
 * @author lyming
 * @date 2020/8/17 10:50 下午
 */
@Configuration
public class RibbonCnnfiguration {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
