package com.cong.javase.design.pattern.proxy.dynamic.partterns;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class RealTicketService implements TicketService {
    @Override
    public void sellTikect() {
        System.out.println("---售票---");
    }

    @Override
    public void inquire() {
        System.out.println("---查询---");
    }

    @Override
    public void retreat() {
        System.out.println("---退票---");
    }
}
