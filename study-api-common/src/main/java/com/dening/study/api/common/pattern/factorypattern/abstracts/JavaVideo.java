package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * Java产品族
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
