package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    private static final Logger logger = LogManager.getLogger();
      public static void info(String message){
          logger.info(message);
      }
    public static void warn(String message){
        logger.info(message);
    }
    public static void error(String message){
        logger.info(message);
    }
    public static void debug(String message){
        logger.info(message);
    }
}
