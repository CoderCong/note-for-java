package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        MethodInterceptorImpl methodInterceptor = new MethodInterceptorImpl();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(programmer.getClass());
        enhancer.setCallback(methodInterceptor);
        Programmer proxy = (Programmer) enhancer.create();
        proxy.code();
    }
}
