package testng.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JDemo {

    public static Logger logger = LogManager.getLogger(Log4JDemo.class);

    @Test
    public void checkLog(){
        System.out.println("Hello Word......");
        logger.trace("This is trace message");
        logger.info("This is information message");
        logger.error("This is an error message");
        logger.warn("warning message");
        logger.fatal("This is fatal message");

        System.out.println("Completed");
    }
}
