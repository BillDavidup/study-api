package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * 扩展产品等级Java课堂笔记JavaNote类
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
