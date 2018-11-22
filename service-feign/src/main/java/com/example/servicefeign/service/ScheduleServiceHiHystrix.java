package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/20 0020
 */
@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name+"error!";
    }
}
