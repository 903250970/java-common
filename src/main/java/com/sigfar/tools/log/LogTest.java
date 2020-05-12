package com.sigfar.tools.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

public class LogTest {

    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");

        System.out.println("=========================");

        Log log = LogFactory.getLog(LogTest.class);
        log.info("start process...");
        log.warn("memory is running out...");

    }
}
