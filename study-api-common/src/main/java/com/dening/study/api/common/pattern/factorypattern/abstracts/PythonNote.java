package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * Python视频PythonNOte类
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
