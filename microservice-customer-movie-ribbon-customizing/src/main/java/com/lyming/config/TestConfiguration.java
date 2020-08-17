package com.lyming.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 *
 * @author lyming
 * @date 2020/8/17 10:57 下午
 */
@Configuration
@RibbonClient(name="microservice-provider-user",configuration = RibbonCnnfiguration.class)
public class TestConfiguration {
}
