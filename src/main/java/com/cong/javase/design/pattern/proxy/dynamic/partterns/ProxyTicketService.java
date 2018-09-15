package com.cong.javase.design.pattern.proxy.dynamic.partterns;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class ProxyTicketService implements TicketService {

    private RealTicketService service;

    public ProxyTicketService(RealTicketService service) {
        this.service = service;
    }

    @Override
    public void sellTikect() {
        System.out.println("start");
        service.sellTikect();
        System.out.println("end");
    }

    @Override
    public void inquire() {

    }

    @Override
    public void retreat() {

    }
}
