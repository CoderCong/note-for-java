package com.cong.annotation;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/12/11.
 */
@FirstAnnotation(name = "ClassNameDefine")
public class MethodAnnotation {

    @FirstAnnotation(name = "METHOD1")
    public void method1(){

    }

    @FirstAnnotation(name = "METHOD2")
    public void method2(){

    }


}
