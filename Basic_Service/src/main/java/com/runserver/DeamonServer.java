package com.runserver;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asd on 17-10-19.
 */
public class DeamonServer {
    //protected Log logger = LogFactory.getLog(getClass());

    protected AbstractXmlApplicationContext context;

    public DeamonServer() {
        super();
    }

    public DeamonServer(String fileName) {
        context = new ClassPathXmlApplicationContext(fileName);
        context.start();
    }

    public void loadClassPathXmlContext(String fileName) {
        context = new ClassPathXmlApplicationContext(fileName);
        context.start();
    }

    public void start(){
        if(context == null){
            //logger.error("no spring context start,quit.");
            return;
        }
        if(true) {
            while(true){
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
