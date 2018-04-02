package client;

import common.LoginServiceInterface;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @auther Fighter Created on 2018/4/2.
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        LoginServiceInterface proxy = RPC.getProxy(LoginServiceInterface.class, 1L, new InetSocketAddress("127.0.0.1", 20000), new Configuration());
        String res= proxy.login("fighter", "mima");
        System.out.println(res);
    }
}
