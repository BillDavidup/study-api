package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * 客户端调用代码
 */
public class AbstractMultiConcreteFactoryClient {
    public static void main(String[] args) {
        JavaConcreteCourseFactory javaConcreteCourseFactory = new JavaConcreteCourseFactory();
        javaConcreteCourseFactory.createNote().edit();
        javaConcreteCourseFactory.createVideo().record();

        PythonConcreteCourseFactory pythonConcreteCourseFactory = new PythonConcreteCourseFactory();
        pythonConcreteCourseFactory.createNote().edit();
        pythonConcreteCourseFactory.createVideo().record();
    }

}
