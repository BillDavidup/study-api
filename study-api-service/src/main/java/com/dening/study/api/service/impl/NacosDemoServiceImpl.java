package com.dening.study.api.service.impl;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.dening.study.api.service.NacosDemoService;
import org.springframework.stereotype.Service;

@Service
public class NacosDemoServiceImpl implements NacosDemoService {
    @NacosValue(value = "${myNacos.demo:899}", autoRefreshed = true)
    String myNacosDemo = "";

    public String getDemoNacosParam() {
        return myNacosDemo;
    }
}
