package tests;

import automationpracticeui.objects.MainPage;
import automationpracticeui.objects.navigation.SendAMessagePage;
import automationpracticeui.steps.MainPageSteps;
import automationpracticeui.steps.navigation.ContactUsPageSteps;
import automationpracticeui.steps.navigation.SendAMessagePageSteps;
import listeners.CustomListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners (CustomListener.class)
public class BaseTest {
    public MainPageSteps mainPageSteps;
    public SendAMessagePage sendAMessagePage;
    private WebDriver driver;



    @BeforeMethod
    public void prepareEnv() {
        System.out.println("Preparing environment!");
        System.setProperty("webdriver.gecko.driver",
                "D:\\QA1818\\autotestid\\src\\main\\resources\\geckodriver.exe");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);

        this.driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");

        mainPageSteps = new MainPageSteps(driver);
    }

    @AfterMethod
    public void cleanUpEnv() {
        System.out.println("Clean up environment!");
//        driver.quit();
    }
}
