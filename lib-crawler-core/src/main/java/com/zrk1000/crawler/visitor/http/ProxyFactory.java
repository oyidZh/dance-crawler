package com.zrk1000.crawler.visitor.http;

import com.zrk1000.crawler.principal.Ticket;

/**
 * 代理工程接口
 * Created by rongkang on 2017-08-20.
 */
public interface ProxyFactory {

    Proxy getProxy(Ticket ticket);

}
