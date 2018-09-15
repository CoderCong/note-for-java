package com.cong.javase.enumdemo;

import java.util.Arrays;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/1.
 * Description: 枚举初探
 */
public class EnumDemo {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.ordinal());
        System.out.println(Day.valueOf("MONDAY"));
        System.out.println(day.name());
        Day[] days = Day.values();
        System.out.println(Arrays.asList(days));

        for (Day day1 : Day.values()) {
            System.out.println(day1.name() + "-->" + day1.getDesc());
        }

    }
}

enum Day {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");//以分号结束

    private String desc;

    Day(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
