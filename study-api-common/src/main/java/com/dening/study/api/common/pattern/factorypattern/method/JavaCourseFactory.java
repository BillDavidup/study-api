package com.dening.study.api.common.pattern.factorypattern.method;

import com.dening.study.api.common.pattern.factorypattern.simple.ICourse;
import com.dening.study.api.common.pattern.factorypattern.simple.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
