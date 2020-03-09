package com.qianfeng.service.Impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qianfeng.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:WANGCHAO
 * @Date:2020/3/5 19:55
 * @Introduction:
 */
@Service
public class RibbonServiceImpl implements IRibbonService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "msgError")
    @Override
    public String getMsg(String msg) {

        String url = "http://SPRINGCLOUD-EUREKAPROVIDER1/zzz?msg="+msg;

        return  restTemplate.getForObject(url,String.class);
    }


    public String msgError(String msg){

        return String.format("当前页面连接发生错误，原因：%s",msg);
    }
}
