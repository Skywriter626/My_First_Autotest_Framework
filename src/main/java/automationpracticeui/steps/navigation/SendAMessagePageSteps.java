package automationpracticeui.steps.navigation;

import automationpracticeui.objects.navigation.ContactUsPage;
import automationpracticeui.objects.navigation.SendAMessagePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SendAMessagePageSteps extends ContactUsPageSteps {
    private SendAMessagePage sendAMessagePage;

    public SendAMessagePageSteps(WebDriver driver) {
        super(driver);
        sendAMessagePage = PageFactory.initElements(driver, SendAMessagePage.class);
    }
}