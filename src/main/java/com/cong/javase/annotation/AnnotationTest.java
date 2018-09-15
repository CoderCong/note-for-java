package com.cong.javase.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/12/11.
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Class clz = MethodAnnotation.class;

        boolean isAnnotation = clz.isAnnotationPresent(FirstAnnotation.class);
        if(isAnnotation){
            FirstAnnotation firstAnnotation = (FirstAnnotation) clz.getAnnotation(FirstAnnotation.class);
            System.out.println(firstAnnotation.name());
        }

        //解析method上的注解
        Method[] methods = clz.getMethods();
        /**
         * 有2中解析的方式
         * No.1
         */
        for (Method method : methods) {
            boolean methodHasAnnotation = method.isAnnotationPresent(FirstAnnotation.class);
            if(methodHasAnnotation){
                FirstAnnotation methodAnnotation = method.getAnnotation(FirstAnnotation.class);
                System.out.println("name=" + methodAnnotation.name());
            }
        }

        /**
         * No.2
         */
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation instanceof FirstAnnotation){

                }
            }
        }

    }
}
