package com.dening.study.api.web;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@NacosPropertySource(dataId = "study-api.yml", autoRefreshed = true, type = ConfigType.YAML)
@ComponentScan(basePackages = "com.dening.study.api")
// 配置mybatis的mapper接口扫描包路径，如果是多数据源，怎么搞
@MapperScan("com.dening.study.api.mybatis.dao")
public class StudyApiWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApiWebApplication.class, args);
    }

}


