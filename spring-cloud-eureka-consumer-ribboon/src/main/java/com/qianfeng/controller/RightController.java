package com.qianfeng.controller;

import com.qianfeng.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:WANGCHAO
 * @Date:2020/3/5 20:50
 * @Introduction:
 */

@Controller
public class RightController {




    @Autowired
    private IRibbonService iRibbonService;


    @RequestMapping("/q")
    @ResponseBody
    public String getString(String msg){



        return iRibbonService.getMsg(msg);

    }

}
