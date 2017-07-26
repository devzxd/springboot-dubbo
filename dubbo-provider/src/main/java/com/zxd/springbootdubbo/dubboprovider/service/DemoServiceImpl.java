package com.zxd.springbootdubbo.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxd.springbootdubbo.dubboapi.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayWord(String word) {
        return word;
    }
}
