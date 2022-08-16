package com.dening.study.api.common.pattern.iteratorpattern;

public class MyIteratorClient {

    public static void main(String[] args) {
        MyCourse java = new MyCourse("Java架构");
        MyCourse javaBase = new MyCourse("Java入门");
        MyCourse design = new MyCourse("Java设计模式精讲");
        MyCourse ai = new MyCourse("人工智能");


        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.add(java);
        courseAggregate.add(javaBase);
        courseAggregate.add(design);
        courseAggregate.add(ai);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);

        courseAggregate.remove(ai);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }


    public static void printCourses(CourseAggregate courseAggregate){
        MyIterator<MyCourse> iterator = courseAggregate.iterator();
        while(iterator.hasNext()){
            MyCourse course = iterator.next();
            System.out.println("《" + course.getName() + "》");
        }
    }

}
