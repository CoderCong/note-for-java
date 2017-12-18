package com.cong.annotation;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/12/11.
 */
public class MyAnnotation {
    private static MyAnnotation ourInstance = new MyAnnotation();

    public static MyAnnotation getInstance() {
        return ourInstance;
    }

    private MyAnnotation() {
    }
}
