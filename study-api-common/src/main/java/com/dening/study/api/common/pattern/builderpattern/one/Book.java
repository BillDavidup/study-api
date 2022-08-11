package com.dening.study.api.common.pattern.builderpattern.one;

import lombok.Data;

import java.util.Set;

@Data
public class Book {

    private String bookTitle;
    private String publishDay;
    private Integer sellPrice;
    private Set<Integer> pageCodeList;

}
