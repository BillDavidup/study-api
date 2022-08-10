package com.dening.study.api.common.pattern.templatepattern.classic;

public class SpecificJavaCourse extends TemplateAbstractCourse {

    @Override
    protected void abstractCheckHomework() {
        System.out.println("检查Java作业");
    }

}
