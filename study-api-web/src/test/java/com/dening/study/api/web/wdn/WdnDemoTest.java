package com.dening.study.api.web.wdn;

import com.dening.study.api.mybatis.dao.LearnPersonDao;
import com.dening.study.api.mybatis.dao.TestPersonMapper;
import com.dening.study.api.mybatis.dao.model.LearnPersonModel;
import com.dening.study.api.mybatis.dao.model.TestPerson;
import com.dening.study.api.web.base.RunSpringBootApplicationTestBase;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class WdnDemoTest extends RunSpringBootApplicationTestBase {

    @Resource
    TestPersonMapper testPersonMapper;

    @Resource
    LearnPersonDao learnPersonDao;

    @Test
    public void testWdnDemo() {
        System.out.println("自定义测试类，继承TestBase");
    }

    @Test
    public void testMapper() {
        TestPerson testPerson = testPersonMapper.selectByPrimaryKey(1L);
        System.out.println("testPerson: " + testPerson);
        LearnPersonModel model = learnPersonDao.selectByPrimaryKey(2L);
        System.out.println("model: " + model);
    }
}
