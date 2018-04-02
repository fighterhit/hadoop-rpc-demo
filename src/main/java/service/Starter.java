package service;

import common.LoginServiceInterface;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.Server;

import java.io.IOException;


/**
 * @auther Fighter Created on 2018/4/2.
 */
public class Starter {
    public static void main(String[] args) throws IOException {
        RPC.Builder builder = new RPC.Builder(new Configuration());
        builder.setBindAddress("localhost").setPort(20000).setProtocol(LoginServiceInterface.class).setInstance(new LoginServiceImpl());
        Server server = builder.build();
        server.start();
    }
}
