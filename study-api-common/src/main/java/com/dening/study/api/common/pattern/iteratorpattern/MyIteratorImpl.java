package com.dening.study.api.common.pattern.iteratorpattern;

import java.util.List;

/**
 * 实现迭代器接口
 * @param <E>
 */
public class MyIteratorImpl<E> implements MyIterator {
    private List<E> list;
    private int cursor;
    private E element;

    public MyIteratorImpl(List list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置" + cursor + ": ");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if (cursor > list.size() - 1) {
            return false;
        }
        return true;
    }
}
