package com.dening.study.api.common.pattern.componentpattern.one;

/**
 * 顶层公共父类组件：定义了被子类继承的方法，空实现抛异常
 */
public class CourseComponent {

    public void addChild(CourseComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }


    public String getName(CourseComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }


    public double getPrice(CourseComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
