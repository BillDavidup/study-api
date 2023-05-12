package com.dening.study.api.common.current.forkjoinpool.action;

import java.util.concurrent.RecursiveAction;

/**
 * 不带返回值的任务
 */
public class DoubleNumberAction extends RecursiveAction {


    final int PROCESS_THRESHOLD = 2;
    int[] array;
    int startIndex, endIndex;
    static int result;

    DoubleNumberAction(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    protected void compute() {
        if (endIndex - startIndex <= PROCESS_THRESHOLD) {
            for (int i = startIndex; i < endIndex; i++) {
                result += array[i] * 2;
            }
        } else {
            int mid = (startIndex + endIndex) / 2;
            DoubleNumberAction leftArray = new DoubleNumberAction(array, startIndex, mid);
            DoubleNumberAction rightArray = new DoubleNumberAction(array, mid, endIndex);

            // Invokes the compute method recursively
            leftArray.fork();
            rightArray.fork();

            // Joins results from recursive invocations
            leftArray.join();
            rightArray.join();
        }
    }


}
