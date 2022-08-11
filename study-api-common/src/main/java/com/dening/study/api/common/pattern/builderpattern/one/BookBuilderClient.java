package com.dening.study.api.common.pattern.builderpattern.one;

import java.util.HashSet;

public class BookBuilderClient {
    public static void main(String[] args) {
        Book book = new BookBuilder()
                .addBookTitle("三体")
                .addSellPrice(99)
                .addPublishDay("2022-08-09")
                .addPageCodeList(new HashSet<>() {{
                    add(1);
                    add(2);
                    add(3);
                }}).build();
        System.out.println("book:" + book);
    }
}
