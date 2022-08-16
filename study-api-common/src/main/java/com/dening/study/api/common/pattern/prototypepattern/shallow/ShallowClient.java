package com.dening.study.api.common.pattern.prototypepattern.shallow;

public class ShallowClient {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype type = new ConcretePrototype("original");
        System.out.println(type);
        //复制原型对象
        ConcretePrototype cloneType = type.clone();
        cloneType.desc = "clone";
        System.out.println(cloneType);

    }

    static class ConcretePrototype implements Cloneable {
        private String desc;

        public ConcretePrototype(String desc) {
            this.desc = desc;
        }

        @Override
        protected ConcretePrototype clone() {
            ConcretePrototype cloneType = null;
            try {
                cloneType = (ConcretePrototype) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return cloneType;
        }

        @Override
        public String toString() {
            return "ConcretePrototype{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }
}
