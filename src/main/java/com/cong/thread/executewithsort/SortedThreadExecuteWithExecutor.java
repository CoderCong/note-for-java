package com.cong.thread.executewithsort;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 顺序执行线程
 * 使用 newSingleThreadExecutor
 * 原理:单线程的线程池,添加任务到先进先出的队列中,顺序执行
 * (也可以使用flag来标志是否执行)
 * @author 759329342@qq.com
 * @since created  on  2018/3/1.
 */
public class SortedThreadExecuteWithExecutor {
    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread1");
        }
    });

    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread2");
        }
    });

    static Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread3");
        }
    });

    private static  ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws InterruptedException {
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();
    }
}
