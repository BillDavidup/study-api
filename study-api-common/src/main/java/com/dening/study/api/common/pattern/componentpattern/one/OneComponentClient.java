package com.dening.study.api.common.pattern.componentpattern.one;

/**
 * 透明组合模式把所有公共方法都定义在 Component 中，这样客户端就不需要区分操作对象是叶子节点还是树枝节点；
 * 但是，叶子节点会继承一些它不需要（管理子类操作的方法）的方法，这与设计模式的接口隔离原则相违背。
 */
public class OneComponentClient {

    public static void main(String[] args) {

        System.out.println("============透明组合模式===========");

        CourseComponent javaBase = new Course("Java入门课程", 8280);
        CourseComponent ai = new Course("人工智能", 5000);

        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent design = new Course("Java设计模式", 1500);
        CourseComponent source = new Course("源码分析", 2000);
        CourseComponent softSkill = new Course("软技能", 3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        CourseComponent catalog = new CoursePackage("课程主目录", 1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();

    }

}
