package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * 抽象工厂一般写法
 */
public class AbstractFactoryClient {

    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryA();
        IProductA iProductA = factory.makeProductA();
        iProductA.doA();

        factory.makeProductB();

        factory = new ConcreteFactoryB();
        factory.makeProductA();
        factory.makeProductB();
    }

    //抽象工厂类
    public interface IFactory {
        IProductA makeProductA();

        IProductB makeProductB();
    }

    //产品A抽象
    public interface IProductA {
        void doA();
    }

    //产品B抽象
    public interface IProductB {
        void doB();
    }

    //产品族A的具体产品A
    static class ConcreteProductAWithFamilyA implements IProductA {
        public void doA() {
            System.out.println("The ProductA be part of FamilyA");
        }
    }

    //产品族A的具体产品B
    static class ConcreteProductBWithFamilyA implements IProductB {
        public void doB() {
            System.out.println("The ProductB be part of FamilyA");
        }
    }

    //产品族B的具体产品A
    static class ConcreteProductAWithFamilyB implements IProductA {
        public void doA() {
            System.out.println("The ProductA be part of FamilyB");
        }
    }

    //产品族B的具体产品B
    static class ConcreteProductBWithFamilyB implements IProductB {
        public void doB() {
            System.out.println("The ProductB be part of FamilyB");
        }
    }

    //具体工厂类A
    static class ConcreteFactoryA implements IFactory {
        public IProductA makeProductA() {
            return new ConcreteProductAWithFamilyA();
        }

        public IProductB makeProductB() {
            return new ConcreteProductBWithFamilyA();
        }
    }

    //具体工厂类B
    static class ConcreteFactoryB implements IFactory {
        public IProductA makeProductA() {
            return new ConcreteProductAWithFamilyB();
        }

        public IProductB makeProductB() {
            return new ConcreteProductBWithFamilyB();
        }
    }
}
