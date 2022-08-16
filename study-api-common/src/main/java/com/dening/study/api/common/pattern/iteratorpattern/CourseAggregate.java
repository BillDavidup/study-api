package com.dening.study.api.common.pattern.iteratorpattern;

/**
 * 自定义的课程集合CourseAggregate接口
 */
public interface CourseAggregate {
    void add(MyCourse course);
    void remove(MyCourse course);
    MyIterator<MyCourse> iterator();
}
