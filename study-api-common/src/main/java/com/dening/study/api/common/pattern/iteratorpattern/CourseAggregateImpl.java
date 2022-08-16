package com.dening.study.api.common.pattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程集合CourseAggregateImpl实现类
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void add(MyCourse course) {
        courseList.add(course);
    }

    @Override
    public void remove(MyCourse course) {
        courseList.remove(course);
    }

    @Override
    public MyIterator<MyCourse> iterator() {
        return new MyIteratorImpl(courseList);
    }
}
