package com.dening.study.api.common.thread;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.concurrent.Executors;

/**
 * 虚拟线程
 * https://blog.csdn.net/lewyu521/article/details/127649776
 */
public class VirtualThread {

    public static void testVirtualAndPlatformThreadApi() {
        //output thread ID including virtual threads and system threads Thread.getId() deprecated from jdk19
        Runnable runnable = () -> System.out.println(Thread.currentThread().threadId());
        // Create virtual threads
        Thread testVT = Thread.ofVirtual().name("testVT").unstarted(runnable);
        testVT.start();
        // Create virtual platform threads
        Thread testPT = Thread.ofPlatform().name("testPT").unstarted(runnable);
        testPT.start();
        // Output thread IDs including virtual threads and system threads
        Runnable r = () -> System.out.println(Thread.currentThread().threadId());
        Thread t = Thread.startVirtualThread(r);
        // Is Virtual Thread
        Runnable r1 = () -> System.out.println(Thread.currentThread().isVirtual());
        Thread t1 = Thread.startVirtualThread(r1);

        try {
            Runnable r2 = () -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread t2 = Thread.startVirtualThread(r2);
            // Wait for the virtual thread to finish
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("virtual thread error:" + ExceptionUtils.getStackTrace(e));
        }

        /**
         * 线程池-> 虚拟线程
         */
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.print("hello"));
            executor.submit(() -> System.out.println(" world!"));
        }



    }

    public static void main(String[] args) {
        testVirtualAndPlatformThreadApi();
    }

}
