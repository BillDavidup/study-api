package com.dening.study.api.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Knife4jConfig {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("study-api")
                        .description("对外提供HTTP服务的接口文档")
                        // .termsOfServiceUrl("http://www.xx.com/")
                        .contact(new Contact("study-api模板项目", "git@github.com:BillDavidup/study-api.git", "1336038558@qq.com"))
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("all")
                .select()
                //指定Controller扫描路径。可以不具体到controller，它会扫描指定路径下的所有
                .apis(RequestHandlerSelectors.basePackage("com.dening.study.api.web.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;

    }
}