package com.csdn.test;

import java.util.Date;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.Logger; 

public class Say {

    /**
     *      * @param args
     *           */

    private static final Logger logger = Logger.getLogger(Say.class);  
    public static void main(String[] args) {  
        System.out.println("hello world");
        BasicConfigurator.configure();  
        logger.info("Hello World, This is an information message.");  
        logger.error("Hello World, This is a error message.");  
        logger.warn("Hello World, This is a warning message.");  
        logger.debug("Hello World, This is a debugging message.");  
        logger.fatal("Hello World, This is a fatal message.");  
        System.exit(0);  
    }  
    //public static void main(String[] args) {
    //    Person p = new Person();
    //    String strName = p.GetName();
    //    System.out.println(strName);
    //}

}
