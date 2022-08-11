package com.dening.study.api.common.pattern.builderpattern.classic;

public class ClassicConcreteBuilder implements ClassicBuilder {
    private ClassicProduct classicProduct = new ClassicProduct();

    @Override
    public void buildPart1() {
        //构建产品的第一个零件
        classicProduct.setPart1("编号：9527");
    }

    @Override
    public void buildPart2() {
        //构建产品的第二个零件
        classicProduct.setPart2("歌曲：9426");
    }

    @Override
    public ClassicProduct build() {
        return classicProduct;
    }
}
