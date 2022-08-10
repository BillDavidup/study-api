package com.dening.study.api.common.pattern.templatepattern.classic;

public class ClassicTemplateAbstractCourseClient {

    public static void main(String[] args) {
        System.out.println("----Classic Java课程----");
        SpecificJavaCourse javaCourse = new SpecificJavaCourse();
        javaCourse.hookNeedCheckHomework(false);
        javaCourse.execute();

        System.out.println("----Classic Go课程----");
        SpecificGoCourse goCourse = new SpecificGoCourse();
        goCourse.hookNeedCheckHomework(true);
        goCourse.execute();
    }

}
