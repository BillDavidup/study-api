package com.dening.study.api.person;

import com.dening.study.api.mybatis.dao.TestPersonMapper;
import com.dening.study.api.mybatis.dao.model.TestPerson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestPersonService {

    @Resource
    TestPersonMapper testPersonMapper;

    public void testGet() {
        TestPerson testPerson = testPersonMapper.selectByPrimaryKey(1L);
        System.out.println("person:" + testPerson);
    }

}
