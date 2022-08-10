package com.dening.study.api.common.pattern.templatepattern.classic;

public abstract class TemplateAbstractCourse {

    boolean needCheckHomework = false;

    /**
     * 1.抽象方法：交给子类去实现的抽象方法
     */
    protected abstract void abstractCheckHomework();

    /**
     * 2.钩子方法：控制流程
     */
    public void hookNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    /**
     * 3.具体方法簇
     */
    public final void execute() {
        postPreResoucse();
        createPPT();
        liveVideo();
        postResource();
        postHomework();
        if (needCheckHomework) {
            abstractCheckHomework();
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
