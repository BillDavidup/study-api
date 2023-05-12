package com.dening.study.api.common.current.forkjoinpool.task;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * ForkJoinPool有返回值类型任务演示调用客户端
 * https://www.infoworld.com/article/3693752/how-to-use-forkjoinpool-in-java.html
 */
public class ForkJoinPoolTaskClient {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        int output = forkJoinPool.invoke(new ForkJoinSumArrayTask(numbers));

        System.out.println(output);
    }

}
