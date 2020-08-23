package net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author dreamFly
 * @date 16:24 2020/8/23
 * @className InternetAddress
 * @description
 */

public class InternetAddress {


    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("127.0.0.1");
        InetAddress localHost = InetAddress.getLocalHost();
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName.getCanonicalHostName());
        System.out.println(byName.getHostName());
        System.out.println(byName.getAddress());
        System.out.println(byName.getHostAddress());
        System.out.println(byName);
        System.out.println(localHost);
        System.out.println(localhost);
    }


    @Test
    public void InetSocket(){
        InetSocketAddress localhost = new InetSocketAddress("localhost", 8080);
        System.out.println(localhost);
        System.out.println(localhost.getAddress());
        System.out.println(localhost.getHostName());
        System.out.println(localhost.getPort());
    }

}
