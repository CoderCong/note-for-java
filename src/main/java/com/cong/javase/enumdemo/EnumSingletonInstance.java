package com.cong.javase.enumdemo;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/15.
 * Description:  enum有且仅有private的构造器
 *
 * 每次返回的是同一个对象
 */
public class EnumSingletonInstance {
    public static void main(String[] args) {
        Computer computer = Computer.SMALL;
        Computer computer1 = Computer.SMALL;
        //true
        System.out.println(computer == computer1);


    }
}

enum Computer{
    SMALL(1),MIDDING(2),BIG(3);
    private Integer i;
    Computer(Integer i) {
        this.i = i;
    }
}
