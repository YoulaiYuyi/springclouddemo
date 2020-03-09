package com.qianfeng.service;

import org.springframework.stereotype.Component;

/**
 * @Author:WANGCHAO
 * @Date:2020/3/7 19:39
 * @Introduction:
 */

@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String getMsg(String msg) {

        return String.format("网络出现了波动！！");
    }
}
