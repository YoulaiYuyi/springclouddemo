package com.qianfeng.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SPRINGCLOUD-EUREKAPROVIDER1",fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping("zzz")
    public String getMsg(@RequestParam String msg);


}
