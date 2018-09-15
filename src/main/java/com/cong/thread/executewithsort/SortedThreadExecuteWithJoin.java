package com.cong.thread.executewithsort;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/3/1.
 */
public class SortedThreadExecuteWithJoin {
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

    public static void main(String[] args) throws InterruptedException {
        thread1.start();
        /**
         * @see Thread#join(long)   while (isAlive())
         * 直到thread1 执行完
         *thread1.join()会阻塞主线程，
         */

        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }
}
