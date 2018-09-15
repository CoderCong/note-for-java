package com.cong.javase.design.pattern.singleton.lazy;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/3/8.
 */
public class LazyNormalThreadSafe {

    private LazyNormalThreadSafe(){}

    private static LazyNormalThreadSafe INSTANCE= null;

    public static synchronized LazyNormalThreadSafe getInstance(){
        if(null == INSTANCE){
            INSTANCE = new LazyNormalThreadSafe();
        }
        return INSTANCE;
    }
}
