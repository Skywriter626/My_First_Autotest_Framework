package deflogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestsLogger {
    protected static Logger log = LogManager.getLogger();

    public static void startTestCase (String testCase) {
        log.info("**********************************");
        log.info(String.format("TEST CASE %S STARTED", testCase));
        log.info("**********************************");
     }

     public static void logStep (String step) {
        log.info(String.format("#########PERFORMING STEP %s.", step));
     }

     public static void logStep() {
        int j = 1;
        Throwable t = new Throwable();
        StackTraceElement[] ste = t.getStackTrace();
        String fullClassPath = ste[j].getClassName();
        String[] path = fullClassPath.split("\\.");
        String className = path[path.length-1];
        log.info(String.format("##### STEP %s.%s STARTED",
                className, ste[j].getMethodName()));
     }
}
