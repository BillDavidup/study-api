package com.dening.study.api.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;

/**
 * 使用nacos配置的注解的服务
 */
public interface NacosDemoService {


    String getDemoNacosParam();


}
