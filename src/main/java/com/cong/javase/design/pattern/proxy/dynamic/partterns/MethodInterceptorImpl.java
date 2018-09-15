package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class MethodInterceptorImpl implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before cglib proxy method:" + method.getName());
        methodProxy.invokeSuper(o,objects);
        System.out.println("end cglib proxy method:" + method.getName());
        return null;
    }
}
