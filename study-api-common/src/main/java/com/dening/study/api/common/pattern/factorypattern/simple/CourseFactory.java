package com.dening.study.api.common.pattern.factorypattern.simple;

public class CourseFactory {
    public static ICourse create1(String name) {

        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    /**
     * 客户端调用虽然简单了，但如果业务继续扩展，要增加前端课程，
     * 则工厂中的create()方法就要随着产品链的丰富每次都要修改代码逻辑，这不符合开闭原则。
     * 因此，我们可以采用反射技术继续对简单工厂模式进行优化，代码如下。
     */
    public ICourse create2(String className) {
        try {
            /**
             * Class clazz = Person.class;
             *     // 1.获取指定的构造器：
             *     Constructor con1 = clazz.getDeclaredConstructor(String.class);
             *     // 2.保证此构造器是可访问的：
             *     con1.setAccessible(true);
             *     // 3.调用此构造器创建运行时类的对象（两种方法）：
             *     // 方法一：jdk8以及8之前
             *     // Person p1= (Person)clazz.newInstance();
             *     // 方法二：jdk9以及9之后：
             *     Person p2 =(Person)con1.newInstance("Tom");

             */
            if (!(null == className || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 优化之后，产品不断丰富，不需要修改CourseFactory中的代码。
     * 但问题是，方法参数是字符串，可控性有待提升，而且还需要强制转型。继续修改代码。
     */
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
