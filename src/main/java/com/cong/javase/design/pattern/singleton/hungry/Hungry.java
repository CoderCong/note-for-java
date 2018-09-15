package com.cong.javase.design.pattern.singleton.hungry;

/**
 *
 * 饿汉式
 * @author 759329342@qq.com
 * @since created  on  2018/3/8.
 */
public class Hungry {

    /**
     * 私有化构造器
     */
    private Hungry(){}

    private static Hungry HUNGRY = new Hungry();


    public static  Hungry getInstance(){
        return HUNGRY;
    }
}
