package com.dening.study.api.common.pattern.templatepattern.two;

public class SpecificDefaultJavaCourse extends TemplateInterfaceCourse {
    @Override
    protected void abstractCheckHomework() {
        System.out.println("检查Java作业");
    }
}
