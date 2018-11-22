package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/20 0020
 */
@FeignClient(value = "eureka-client",fallback = ScheduleServiceHiHystrix.class)
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
