package com.dening.study.api.common.pattern.templatepattern.two;

public abstract class TemplateInterfaceCourse {

    boolean needCheckHomework = false;

    /**
     * 1.多个抽象方法：空实现交给子类去实现的抽象方法
     */
    protected void abstractCheckHomework() {
    }

    protected void abstractCheckHomework2() {
    }


    /**
     * 2.钩子方法：控制流程
     */
    public void hookNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    /**
     * 3.具体方法簇
     */
    protected void execute() {
        postPreResoucse();
        createPPT();
        liveVideo();
        postResource();
        postHomework();
        if (needCheckHomework) {
            abstractCheckHomework();
            abstractCheckHomework2();
        }

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
