package com.dening.study.api.common.pattern.factorypattern.method;

import com.dening.study.api.common.pattern.factorypattern.simple.ICourse;

public class MethodConcreteFactoryClient {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }

}
