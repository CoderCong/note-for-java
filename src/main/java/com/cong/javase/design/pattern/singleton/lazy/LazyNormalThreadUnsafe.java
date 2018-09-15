package com.cong.javase.design.pattern.singleton.lazy;

/**
 * 无锁,懒汉式
 * 会有线程安全问题
 *
 * @author 759329342@qq.com
 * @since created  on  2018/3/8.
 */
public class LazyNormalThreadUnsafe {

    private LazyNormalThreadUnsafe(){}

    private static LazyNormalThreadUnsafe INSTANCE;

    public static LazyNormalThreadUnsafe getInstance(){
        if (null == INSTANCE){
            INSTANCE = new LazyNormalThreadUnsafe();
        }
        return INSTANCE;
    }
}
