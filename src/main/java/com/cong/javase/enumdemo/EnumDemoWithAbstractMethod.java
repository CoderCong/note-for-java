package com.cong.javase.enumdemo;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/1.
 * Description: 枚举中有抽象方法
 */
public class EnumDemoWithAbstractMethod {
    public static void main(String[] args) {
      Color.RED.print();
      Color.GREEN.print();
      Color.YELLOW.print();
    }


}

enum Color{



    RED{
        @Override
        public void print() {
            System.out.println("红色");
        }
    },
    GREEN{
        @Override
        public void print() {
            System.out.println("绿色");
        }
    },
    YELLOW{
        @Override
        public void print() {
            System.out.println("黄色");
        }
    };

    public abstract void print();
}
