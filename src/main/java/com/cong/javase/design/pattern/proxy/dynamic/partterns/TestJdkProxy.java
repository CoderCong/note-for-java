package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class TestJdkProxy {
    public static void main(String[] args) {

        TicketService service = new RealTicketService();

        ClassLoader classLoader = RealTicketService.class.getClassLoader();

        Class<?>[] interfaces = RealTicketService.class.getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandlerImpl(service);

        Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        TicketService ticketService = (TicketService) o;

        ticketService.inquire();
        ticketService.retreat();
        ticketService.retreat();
    }
}
