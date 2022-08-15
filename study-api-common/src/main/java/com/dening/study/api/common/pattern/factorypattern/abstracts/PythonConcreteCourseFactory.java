package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * Python产品族的具体工厂PythonConcreteCourseFactory
 */
public class PythonConcreteCourseFactory extends AbstractCourseFactory {
    @Override
    protected INote createNote() {
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        return new PythonVideo();
    }
}
