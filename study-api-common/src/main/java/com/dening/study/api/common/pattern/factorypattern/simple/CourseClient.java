package com.dening.study.api.common.pattern.factorypattern.simple;

public class CourseClient {

    public static void mainx(String[] args) {
        ICourse course = new JavaCourse();
        course.record();
    }

    /**
     * 由上面代码可知，父类ICourse指向子类JavaCourse的引用，应用层代码需要依赖JavaCourse。
     * 如果业务扩展，则继续增加PythonCourse，甚至更多，那么客户端的依赖会变得越来越臃肿。
     * 因此，我们要想办法把这种依赖减弱，把创建细节隐藏。虽然在目前的代码中，创建对象的过程并不复杂，但从代码设计角度来讲不易于扩展。
     * 因此，用简单工厂模式对代码进行优化。首先增加课程PythonCourse类。
     */

    public static void main1(String[] args) {
        CourseFactory factory = new CourseFactory();
        factory.create1("java");
    }

    public static void main2(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create2("com.dening.study.api.common.pattern.factorypattern.simple.JavaCourse");
        course.record();
    }

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }

}
