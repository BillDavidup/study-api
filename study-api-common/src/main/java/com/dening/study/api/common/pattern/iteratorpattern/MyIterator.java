package com.dening.study.api.common.pattern.iteratorpattern;

/**
 * 自定义迭代器接口
 */
public interface MyIterator<E> {
    E next();
    boolean hasNext();
}
