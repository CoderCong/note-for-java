package com.cong.javase.design.pattern.singleton;

import com.cong.javase.design.pattern.singleton.lazy.LazyNormalThreadSafe;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/3/8.
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception{
        int countNum = 2000;
//        CountDownLatch count = new CountDownLatch(countNum);
        long start = System.currentTimeMillis();
        for (int i = 0; i < countNum; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
                    Object object = LazyNormalThreadSafe.getInstance();
//                    System.out.println(object);
//                    count.countDown();
                }
//            }).start();
//        }

//        count.await();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
