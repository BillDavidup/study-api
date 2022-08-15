package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * Python视频PythonVideo类
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
