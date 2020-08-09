package com.lyming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author lyming
 * @date 2020/8/9 1:47 上午
 */
@SpringBootApplication
public class SimpleProviderUserApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleProviderUserApplication.class, args);
    }
}
