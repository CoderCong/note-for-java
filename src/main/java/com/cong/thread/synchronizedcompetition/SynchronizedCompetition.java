package com.cong.thread.synchronizedcompetition;

import java.util.concurrent.CountDownLatch;

/**
 * synchronized锁竞争
 * @author 759329342@qq.com
 * @since created  on  2018/3/2.
 */
public class SynchronizedCompetition {

    private static final Object obj = new Object();

    private static int countNum = 5;

    private static CountDownLatch count = new CountDownLatch(countNum);

    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread1 ready");
            count.countDown();
            synchronized (obj){
                while (true){
                    if(true == flag){
                        System.out.println("thread1 exit");
                        break;
                    }
                }
            }
        }
    });

    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread2 ready");
            count.countDown();
            synchronized (obj){
                while (true){
                    if(true == flag){
                        System.out.println("thread2 exit");
                        break;
                    }
                }
            }
        }
    });

    static Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread3 ready");
            count.countDown();
            synchronized (obj){
                while (true){
                    if(true == flag){
                        System.out.println("thread3 exit");
                        break;
                    }
                }
            }
        }
    });

    static Thread thread4 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread4 ready");
            count.countDown();
            synchronized (obj){
                while (true){
                    if(true == flag){
                        System.out.println("thread4 exit");
                        break;
                    }
                }
            }
        }
    });

    static Thread thread5 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread5 ready");
            count.countDown();
            synchronized (obj){
                while (true){
                    if(true == flag){
                        System.out.println("thread5 exit");
                        break;
                    }
                }
            }
        }
    });

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("begin test synchronized execute");
        thread1.start();
        //主线程休眠一会,确保子线程启动成功,进入锁竞争
        Thread.sleep(1000);
        thread2.start();
        Thread.sleep(1000);
        thread3.start();
        Thread.sleep(1000);
        thread4.start();
        Thread.sleep(1000);
        thread5.start();
        count.await();
        flag = true;
    }
}
