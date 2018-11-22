package com.example.servicefeign.controller;


import com.example.servicefeign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/20 0020
 */
@RestController
public class HiController {

    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){

        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
