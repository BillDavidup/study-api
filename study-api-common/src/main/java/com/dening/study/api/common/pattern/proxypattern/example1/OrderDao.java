package com.dening.study.api.common.pattern.proxypattern.example1;

public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
