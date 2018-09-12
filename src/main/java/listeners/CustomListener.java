package listeners;

import com.gurock.testrail.TestRailConnector;
import deflogger.TestsLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        TestsLogger.startTestCase(iTestResult.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        int resultId = 1;
        String comment = "TEST PASSED:" + iTestResult.getName() + "\n";
        String testCaseId = iTestResult.getMethod().getDescription();

        long duration = (iTestResult.getEndMillis()-iTestResult.getStartMillis())/1000;

        TestRailConnector testRailConnector = new TestRailConnector("https://itstep092018.testrail.io", "capella1067@gmail.com", "Mazda-626");

        testRailConnector.sentTestResult(testCaseId, resultId, comment, duration, "9");
    }

    public void onTestFailure(ITestResult iTestResult) {
        int resultId = 5;
        String comment = "TEST FAILED:" + iTestResult.getName() + "\n";
        String testCaseId = iTestResult.getMethod().getDescription();

        long duration = (iTestResult.getEndMillis()-iTestResult.getStartMillis())/1000;

        TestRailConnector testRailConnector = new TestRailConnector("https://itstep092018.testrail.io", "capella1067@gmail.com", "Mazda-626");

        testRailConnector.sentTestResult(testCaseId, resultId, comment, duration, "");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        int resultId = 2;
        String comment = "TEST BLOCKED:" + iTestResult.getName() + "\n";
        String testCaseId = iTestResult.getMethod().getDescription();

        long duration = (iTestResult.getEndMillis()-iTestResult.getStartMillis())/1000;

        TestRailConnector testRailConnector = new TestRailConnector("https://itstep092018.testrail.io", "capella1067@gmail.com", "Mazda-626");

        testRailConnector.sentTestResult(testCaseId, resultId, comment, duration, "");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
