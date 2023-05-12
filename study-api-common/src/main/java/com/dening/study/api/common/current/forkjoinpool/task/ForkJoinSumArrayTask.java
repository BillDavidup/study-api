package com.dening.study.api.common.current.forkjoinpool.task;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * 带返回值的任务
 */
public class ForkJoinSumArrayTask extends RecursiveTask<Integer> {

    private final List<Integer> numbers;

    public ForkJoinSumArrayTask(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    protected Integer compute() {
        if (numbers.size() <= 2) {
            return numbers.stream().mapToInt(e -> e).sum();
        } else {
            int mid = numbers.size() / 2;
            List<Integer> list1 = numbers.subList(0, mid);
            List<Integer> list2 = numbers.subList(mid, numbers.size());

            ForkJoinSumArrayTask task1 = new ForkJoinSumArrayTask(list1);
            ForkJoinSumArrayTask task2 = new ForkJoinSumArrayTask(list2);

            task1.fork();

            return task1.join() + task2.compute();
        }
    }
}
