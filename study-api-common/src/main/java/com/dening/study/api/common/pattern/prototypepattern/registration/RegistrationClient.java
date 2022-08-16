package com.dening.study.api.common.pattern.prototypepattern.registration;

public class RegistrationClient {
    public static void main(String[] args) {
        try {
            RegistrationPrototype p1 = new RegistrationConcretePrototype1();
            PrototypeManager.setPrototype("p1", p1);
            //获取原型来创建对象
            RegistrationPrototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例：" + p3);
            //有人动态的切换了实现
            RegistrationPrototype p2 = new RegistrationConcretePrototype2();
            PrototypeManager.setPrototype("p1", p2);
            //重新获取原型来创建对象
            RegistrationPrototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第二个实例：" + p4);
            //有人注销了这个原型
            // PrototypeManager.removePrototype("p1");
            //再次获取原型来创建对象
            RegistrationPrototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
