package com.dening.study.api.common.pattern.builderpattern.two;

import lombok.Data;

import java.util.Set;

/**
 * 书的实体类-包含一个静态内部类来构建对象
 */
@Data
public class BookItem {

    private String bookTitle;
    private String publishDay;
    private Integer sellPrice;
    private Set<Integer> pageCodeList;

    public static class Builder {
        private BookItem book = new BookItem();

        public Builder addBookTitle(String bookTitle) {
            book.setBookTitle(bookTitle);
            return this;
        }

        public Builder addPublishDay(String publishDay) {
            book.setPublishDay(publishDay);
            return this;
        }

        public Builder addSellPrice(Integer sellPrice) {
            book.setSellPrice(sellPrice);
            return this;
        }

        public Builder addPageCodeList(Set<Integer> pageCodeList) {
            book.setPageCodeList(pageCodeList);
            return this;
        }

        public BookItem build() {
            return book;
        }

    }

}
