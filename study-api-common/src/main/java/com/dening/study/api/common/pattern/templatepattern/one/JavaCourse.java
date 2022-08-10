package com.dening.study.api.common.pattern.templatepattern.one;

/**
 * 实现子类
 */
public class JavaCourse extends AbstractCourse {


    private boolean needCheckHomework = false;

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }

    protected void checkHomework() {
        System.out.println("检查Java作业");
    }

}
