package com.dening.study.api.common.pattern.proxypattern.example1;

public class OrderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public OrderServiceImpl(){
        //如果使用Spring，则应该是自动注入的
        //为了使用方便，我们在构造方法中直接将orderDao初始化
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
