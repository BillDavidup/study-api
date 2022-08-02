package com.dening.study.api.web;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@NacosPropertySource(dataId = "study-api.yml", autoRefreshed = true, type = ConfigType.YAML)
@ComponentScan(basePackages = "com.dening.study.api")
public class StudyApiWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApiWebApplication.class, args);
    }

}
