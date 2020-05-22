package org.study.commomlogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author zls
 * create time:  2020.05.21.
 * description:
 */
public class Test {


    public static void main(String[] args) {
        Log logger = LogFactory.getLog(Test.class);
        System.out.println("out");
        logger.info("commonlogging----------info");
        logger.debug("commonlogging----------debug");
    }
}
