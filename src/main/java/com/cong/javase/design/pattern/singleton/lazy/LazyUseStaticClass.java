package com.cong.javase.design.pattern.singleton.lazy;

/**
 *
 * use staticed inner class
 * staticed inner class will be loaded when use it;
 *
 * @author 759329342@qq.com
 * @since created  on  2018/3/8.
 */
public class LazyUseStaticClass {

    private LazyUseStaticClass(){}

    public static LazyUseStaticClass getInstance(){
        return LazyHolder.INSTANCE;
    }

    static class LazyHolder{
        private static LazyUseStaticClass INSTANCE = new LazyUseStaticClass();
    }



}
