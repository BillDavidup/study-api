package com.dening.study.api.common.pattern.builderpattern.example;

import java.util.Arrays;

/**
 * 下面来看一个实战案例，这个案例参考了开源框架JPA的SQL构造模式。
 * 我们在构造SQL查询条件的时候，需要根据不同的条件来拼接SQL字符串。
 * 如果查询条件复杂，则SQL拼接的过程也会变得非常复杂，从而给代码维护带来非常大的困难。
 * 因此，我们用建造者类QueryRuleSqlBuilder将复杂的SQL构造过程进行封装，
 * 用QueryRule对象专门保存SQL查询时的条件，最后根据查询条件，自动生成SQL语句。
 */
public class QueryRuleSqlBuilderClient {

    public static void main(String[] args) {
        QueryRule queryRule = QueryRule.getInstance();
        queryRule.addAscOrder("age");
        queryRule.andEqual("addr", "Changsha");
        queryRule.andLike("name", "Tom");
        queryRule.andLessThan("score", "5");
        QueryRuleSqlBuilder builder = new QueryRuleSqlBuilder(queryRule);

        System.out.println(builder.build("t_member"));

        System.out.println("Params: " + Arrays.toString(builder.getValues()));
    }

}
