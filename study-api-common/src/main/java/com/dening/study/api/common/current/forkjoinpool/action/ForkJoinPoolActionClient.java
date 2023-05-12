package com.dening.study.api.common.current.forkjoinpool.action;

import java.util.concurrent.ForkJoinPool;

/**
 * ForkJoinPool没有返回值类型任务演示调用客户端
 * https://www.infoworld.com/article/3693752/how-to-use-forkjoinpool-in-java.html
 */
public class ForkJoinPoolActionClient {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int[] array = {1, 5, 10, 15, 20, 25, 50};
        DoubleNumberAction doubleNumberTask = new DoubleNumberAction(array, 0, array.length);

        // Invokes compute method
        forkJoinPool.invoke(doubleNumberTask);
        System.out.println(DoubleNumberAction.result);
    }
}
