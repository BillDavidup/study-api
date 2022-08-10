package com.dening.study.api.common.pattern.templatepattern.one;

public class CourseTemplatePatternClient {

    public static void main(String[] args) {

        System.out.println("----Java课程----");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(true);
        javaCourse.createCourse();

        System.out.println("----Go课程----");
        GoCourse goCourse = new GoCourse();
        goCourse.createCourse();

    }

}
