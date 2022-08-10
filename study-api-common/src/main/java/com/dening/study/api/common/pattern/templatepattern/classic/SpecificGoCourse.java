package com.dening.study.api.common.pattern.templatepattern.classic;

public class SpecificGoCourse extends TemplateAbstractCourse {
    @Override
    protected void abstractCheckHomework() {
        System.out.println("检查Go作业");
    }
}
