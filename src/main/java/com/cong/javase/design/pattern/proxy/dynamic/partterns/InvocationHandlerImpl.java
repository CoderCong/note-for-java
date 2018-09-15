package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private TicketService service;

    public InvocationHandlerImpl(TicketService service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start invoke method:" + method.getName() );
        method.invoke(service,null);
        System.out.println(method.getName() +" has bean finished");
        return null;
    }
}
