package com.dening.study.api.web.wdn;

import com.dening.study.api.web.base.RunSpringBootApplicationTestBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class WdnDemoTest extends RunSpringBootApplicationTestBase {

    @Value("${server.port}")
    String serverPortYml;

    @Test
    public void testWdnDemo() {
        System.out.println("自定义测试类，继承TestBase");
    }

    @Test
    public void getMyPropertiesTest() throws IOException {


        /**
         * 1.使用PropertiesLoaderUtils工具类
         */
        String applicationPropertiesFileName = "application.properties";
        Properties appProperties = PropertiesLoaderUtils.loadAllProperties(applicationPropertiesFileName);
        System.out.println(applicationPropertiesFileName + ':' + appProperties.getProperty("my.properties"));

        String packagePropertiesFileName = "config/package.properties";
        Properties packageProperties = PropertiesLoaderUtils.loadAllProperties(packagePropertiesFileName);
        System.out.println(packagePropertiesFileName + ':' + packageProperties.getProperty("my.package.property"));

        /**
         * 2.使用@Value注入可用于读取yml配置文件属性
         */
        System.out.println("serverPort:" + serverPortYml);

        /**
         * 3.使用ResourceBundle
         */
        ResourceBundle applicationResourceBundle = ResourceBundle.getBundle("application");
        System.out.println(applicationPropertiesFileName + " resourceBundle:" + applicationResourceBundle.getString("my.properties"));

        ResourceBundle packageResourceBundle = ResourceBundle.getBundle("config/package");
        System.out.println(packagePropertiesFileName + " resourceBundle:" + packageResourceBundle.getString("my.package.property"));

        /**
         * 4.使用InputStream
         */
        Properties properties = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(applicationPropertiesFileName);
        //inputStream = new ClassPathResource(applicationPropertiesFileName).getInputStream();
        //inputStream = this.getClass().getClassLoader().getResourceAsStream(applicationPropertiesFileName);
        properties.load(inputStream);
        System.out.println(applicationPropertiesFileName + " inputStream:" + properties.getProperty("my.properties"));

    }
}
