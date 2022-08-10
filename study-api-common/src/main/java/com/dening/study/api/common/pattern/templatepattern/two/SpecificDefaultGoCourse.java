package com.dening.study.api.common.pattern.templatepattern.two;

public class SpecificDefaultGoCourse extends TemplateInterfaceCourse {

    @Override
    public void abstractCheckHomework() {
        System.out.println("第一次检查Go作业");
    }

    @Override
    public void abstractCheckHomework2() {
        System.out.println("第二次检查Go作业");
    }
}
