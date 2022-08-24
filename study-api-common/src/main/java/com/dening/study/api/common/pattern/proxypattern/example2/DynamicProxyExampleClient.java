package com.dening.study.api.common.pattern.proxypattern.example2;

import com.dening.study.api.common.pattern.proxypattern.example1.IOrderService;
import com.dening.study.api.common.pattern.proxypattern.example1.Order;
import com.dening.study.api.common.pattern.proxypattern.example1.OrderServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicProxyExampleClient {
    public static void main(String[] args) {

        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2022/09/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().
                    getInstance(new OrderServiceImpl());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
