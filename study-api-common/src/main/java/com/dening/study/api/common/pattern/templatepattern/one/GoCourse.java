package com.dening.study.api.common.pattern.templatepattern.one;

public class GoCourse extends AbstractCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Go作业");
    }
}
