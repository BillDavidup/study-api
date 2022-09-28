package com.dening.study.api.web;

import com.dening.study.api.common.pattern.statepattern.order.Order;
import com.dening.study.api.service.IOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderStateTest {

    public static void main(String[] args) {

        Thread.currentThread().setName("主线程");

        ConfigurableApplicationContext context = SpringApplication.run(OrderStateTest.class, args);

        IOrderService orderService = (IOrderService) context.getBean("orderService");

        Order order1 = orderService.create();
        Order order2 = orderService.create();
        System.out.println("order1:" + order1);
        System.out.println("order2:" + order2);

        orderService.pay(1);

        new Thread("客户线程") {
            @Override
            public void run() {
                orderService.deliver(1);
                orderService.receive(1);
            }
        }.start();

        orderService.pay(2);
        orderService.deliver(2);
        orderService.receive(2);

        System.out.println("全部订单状态：" + orderService.getOrders());

    }


}
