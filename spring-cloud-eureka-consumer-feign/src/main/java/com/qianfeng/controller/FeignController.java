package com.qianfeng.controller;

import com.qianfeng.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:WANGCHAO
 * @Date:2020/3/5 22:15
 * @Introduction:
 */
@Controller
public class FeignController {

    @Autowired
    private FeignService feignService;


    @RequestMapping("q")
    @ResponseBody
    public String getMsg(@RequestParam String msg){



        return feignService.getMsg(msg);

    }





}
