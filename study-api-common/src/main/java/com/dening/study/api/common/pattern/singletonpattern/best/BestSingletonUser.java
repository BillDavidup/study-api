package com.dening.study.api.common.pattern.singletonpattern.best;

/**
 * 枚举单例最佳实践，利用静态内部枚举返回BestSingleUser的对象单例
 */
public class BestSingletonUser {

    /**
     * 私有化构造方法
     */
    private BestSingletonUser() {

    }

    /**
     * 类的内部枚举是隐式静态的，可以将嵌套枚举类型显式声明为静态。
     */
    public static enum SingletonEnum {

        SINGLETON;

//        SINGLETON,
//        SINGLETON2;
        private final BestSingletonUser singletonUser;

        /**
         * 枚举的构造方法是隐式私有的，可显式指定为私有
         */
        private SingletonEnum() {
            singletonUser = new BestSingletonUser();
        }

        public BestSingletonUser getSingletonInstance() {
            return singletonUser;
        }

    }

}
