package com.dening.study.api.web.wdn;

import com.dening.study.api.mybatis.dao.TestPersonMapper;
import com.dening.study.api.mybatis.dao.model.TestPerson;
import com.dening.study.api.web.base.RunSpringBootApplicationTestBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WdnDemoTest extends RunSpringBootApplicationTestBase {

    @Autowired
    TestPersonMapper testPersonMapper;

    @Test
    public void testWdnDemo() {
        System.out.println("自定义测试类，继承TestBase");
    }

    @Test
    public void testMapper() {
        TestPerson testPerson = testPersonMapper.selectByPrimaryKey(1L);
        System.out.println("testPerson: " + testPerson);
    }
}
