package com.dening.study.api.common.pattern.templatepattern.one;

/**
 * 顶层抽象类: 定义流程方法，具体方法，需要子类实现的抽象方法，钩子方法
 */
public abstract class AbstractCourse {

    /**
     * 整体流程方法
     */
    public final void createCourse() {
        //1.发布预习资料
        postPreResoucse();

        //2.制作课件PPT
        createPPT();

        //3.在线直播
        liveVideo();

        //4.上传课后资料
        postResource();

        //5.布置作业
        postHomework();

        if (needCheckHomework()) {
            checkHomework();
        }
    }

    /**
     * 抽象方法：交给子类去实现的抽象方法
     */
    protected abstract void checkHomework();

    /**
     * 钩子方法：控制流程
     */
    protected boolean needCheckHomework() {
        return false;
    }

    protected void postHomework() {
        System.out.println("STEP:5 布置作业");
    }

    protected void postResource() {
        System.out.println("STEP:4 上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("STEP:3 直播授课");
    }

    protected void createPPT() {
        System.out.println("STEP:2 制作课件");
    }

    protected void postPreResoucse() {
        System.out.println("STEP:1 发布预习资料");
    }

}
