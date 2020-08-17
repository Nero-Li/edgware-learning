package com.lyming.openapi;

import com.lyming.user.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lyming
 * @since 2020年08月17日23:25:27
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);
}
