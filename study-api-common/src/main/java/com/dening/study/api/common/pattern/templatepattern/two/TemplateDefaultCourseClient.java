package com.dening.study.api.common.pattern.templatepattern.two;

public class TemplateDefaultCourseClient {

    public static void main(String[] args) {
        System.out.println("----多实现方法 Java课程----");
        SpecificDefaultJavaCourse javaCourse = new SpecificDefaultJavaCourse();
        javaCourse.hookNeedCheckHomework(true);
        javaCourse.execute();

        System.out.println("----多实现方法 Go课程----");
        SpecificDefaultGoCourse goCourse = new SpecificDefaultGoCourse();
        goCourse.hookNeedCheckHomework(true);
        goCourse.execute();
    }

}
