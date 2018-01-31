package com.runServer;

/**
 * Created by asd on 17-10-19.
 */
public class runServer {
    public static void main(String[] args) {
        DeamonServer server = new DeamonServer("spring/spring-context.xml");
        server.start();
    }
}
