package com.dening.study.api.common.pattern.builderpattern.two;

import java.util.HashSet;

/**
 * 一般情况下，我们更习惯使用静态内部类的方式实现建造者模式，即一个产品类内部自动带有一个具体建造者，由它负责该产品的组装创建，
 * 不再需要Builder和Director，这样，产品表示与创建之间的联系更加紧密，结构更加紧凑，同时使得建造者模式的形式更加简洁。
 */
public class BookItemInnerBuilderClient {

    public static void main(String[] args) {
        BookItem book = new BookItem.Builder() // 调用实体类的静态内部建造者
                .addBookTitle("三体")
                .addSellPrice(99)
                .addPublishDay("2022-08-09")
                .addPageCodeList(new HashSet<>() {{
                    add(1);
                    add(2);
                    add(3);
                }})
                .build(); // 返回静态内部类构建好的对象
        System.out.println("book:" + book);

    }
}
