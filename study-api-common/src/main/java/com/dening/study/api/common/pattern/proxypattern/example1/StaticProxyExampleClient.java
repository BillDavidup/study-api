package com.dening.study.api.common.pattern.proxypattern.example1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticProxyExampleClient {

    public static void main(String[] args) {

        Order order = new Order();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;

        try {
            date = format.parse("2022-08-24");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
            orderService.createOrder(order);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
