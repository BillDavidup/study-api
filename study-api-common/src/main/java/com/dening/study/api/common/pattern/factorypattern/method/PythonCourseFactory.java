package com.dening.study.api.common.pattern.factorypattern.method;

import com.dening.study.api.common.pattern.factorypattern.simple.ICourse;
import com.dening.study.api.common.pattern.factorypattern.simple.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}