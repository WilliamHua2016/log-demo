package org.william;

import org.apache.log4j.Logger;

/**
 * Created by huawai on 2017/8/7. Description:
 */
public class Bootstrap {

    private static Logger logger = Logger.getLogger(Bootstrap.class);

    public static void main(String[] args) {
        logger.debug("### debug message");
        logger.info("### info message");
        logger.warn("### warn message");
        logger.error("### error message");
        logger.error("### error message", new RuntimeException("errorMessage"));
    }

}
