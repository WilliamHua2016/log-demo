package org.william;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huawai on 2017/8/7.
 * Description:
 */
public class Bootstrap {

    private static final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public static void main(String[] args) {
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.error("error message", new RuntimeException("mock error"));
    }
}
