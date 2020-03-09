package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:WANGCHAO
 * @Date:2020/3/5 21:03
 * @Introduction:
 */

@Controller
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;


   /* @RequestMapping("hi")
    @ResponseBody
    public String sayHi(String msg){
       //return String.format("当前是来自于%s的消息：%s",serverPort,msg);
        return String.format("当前是来自于"+serverPort+"的消息："+msg+"哈哈哈哈");
    }*/

    @RequestMapping("zzz")
    @ResponseBody
    public String sayHi(String msg){


        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return String.format("当前是来自于%s的消息：%s",serverPort,msg);

    }


}
