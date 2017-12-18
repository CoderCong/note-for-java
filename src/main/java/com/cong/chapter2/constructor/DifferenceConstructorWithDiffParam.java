package com.cong.chapter2.constructor;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/11/24.
 */
public class DifferenceConstructorWithDiffParam {
    private String name;
    private int age;

    public DifferenceConstructorWithDiffParam(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public DifferenceConstructorWithDiffParam(int age, String name) {
        this.name = name;
        this.age = age;
    }
    /**
     * 根据静态方法名可以便于阅读
     * @param name
     * @param age
     * @return
     */
    public static DifferenceConstructorWithDiffParam  getInstanceWithAgeFirst(String name, int age){
        return new DifferenceConstructorWithDiffParam(age, name);
    }
    public static DifferenceConstructorWithDiffParam  getInstanceWithNameFirst(String name, int age){
        return new DifferenceConstructorWithDiffParam(name, age);
    }

    public static void main(String[] args) {
        DifferenceConstructorWithDiffParam.getInstanceWithAgeFirst("",1);
    }
}
