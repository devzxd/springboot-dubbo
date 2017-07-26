package com.zxd.springbootdubbo.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxd.springbootdubbo.dubboapi.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {
    @Reference
    private DemoService demoService;
    @GetMapping("/{word}")
    public String test(@PathVariable String word){
        return demoService.sayWord(word);
    }
}
