package com.dening.study.api.common.pattern.strategypattern.one;

/**
 * 顶层会员策略抽象类
 * 如果有通用的方法字段，可以使用抽象类（具体策略类继承它），或者实现公共的default方法
 *
 * 假设现在要设计一个贩卖各类书籍的电子商务网站的购物车系统。一个最简单的情况就是把所有货品的单价乘上数量，但是实际情况肯定比这要复杂。
 * 比如，本网站可能对所有的高级会员提供每本20%的促销折扣；对中级会员提供每本10%的促销折扣；对初级会员没有折扣。
 * 根据描述，折扣是根据以下的几个算法中的一个进行的：
 * 算法一：对初级会员没有折扣。
 * 算法二：对中级会员提供10%的促销折扣。
 * 算法三：对高级会员提供20%的促销折扣。
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
