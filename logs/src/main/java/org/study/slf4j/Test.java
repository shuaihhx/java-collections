package org.study.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zls
 * create time:  2020.05.21.
 * description:
 */
public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        System.out.println("out");
        logger.info("slf4j----------info");
        logger.debug("slf4j----------debug");
    }
}
