package com.dening.study.api.common.pattern.builderpattern.one;

import java.util.Set;

public class BookBuilder {
    private Book book = new Book();

    public BookBuilder addBookTitle(String bookTitle) {
        book.setBookTitle(bookTitle);
        return this;
    }

    public BookBuilder addPublishDay(String publishDay) {
        book.setPublishDay(publishDay);
        return this;
    }

    public BookBuilder addSellPrice(Integer sellPrice) {
        book.setSellPrice(sellPrice);
        return this;
    }

    public BookBuilder addPageCodeList(Set<Integer> pageCodeList) {
        book.setPageCodeList(pageCodeList);
        return this;
    }

    public Book build() {
        return book;
    }

}
