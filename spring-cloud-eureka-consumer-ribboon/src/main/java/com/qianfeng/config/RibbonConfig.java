package com.qianfeng.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:WANGCHAO
 * @Date:2020/3/5 19:52
 * @Introduction:
 */
@Configuration
public class RibbonConfig {



    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }


    @Bean
    public IRule iRule(){

        return new RetryRule();
    }


}
