package com.dening.study.api.common.pattern.builderpattern.classic;

public class ClassicDirector {

    /**
     * 持有当前需要使用的建造器对象
     */
    private ClassicBuilder builder;

    /**
     * 构造方法，传入建造器对象
     *
     * @param builder 建造器对象
     */
    public ClassicDirector(ClassicBuilder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }

}
