package com.lyming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author lyming
 * @date 2020/8/9 2:02 上午
 */
@SpringBootApplication
@EnableFeignClients
public class SimpleCustomerMovieApplication {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleCustomerMovieApplication.class, args);
    }
}
