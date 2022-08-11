package com.dening.study.api.common.pattern.builderpattern.classic;

public class ClassicBuilderClient {

    public static void main(String[]args){

        ClassicBuilder builder = new ClassicConcreteBuilder();
        ClassicDirector director = new ClassicDirector(builder);
        director.construct();
        ClassicProduct product = builder.build();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
        System.out.println("product: " + product);

    }

}
