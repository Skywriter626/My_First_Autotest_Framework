package automationpracticeui.steps.navigation;

import automationpracticeui.objects.navigation.ContactUsPage;
import automationpracticeui.steps.MainPageSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageSteps extends MainPageSteps {
    private ContactUsPage contactUsPage;

    public ContactUsPageSteps(WebDriver driver) {
        super(driver);
        contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
    }

    public SendAMessagePageSteps performSendingAMessage (String contact, String email, String reference, String fileAddress, String message) {
        contactUsPage.getSubjectHeadingInput().selectByVisibleText(contact);
        contactUsPage.getEmailAddressUserInput().clear();
        contactUsPage.getEmailAddressUserInput().sendKeys(email);
        contactUsPage.getOrderReferenceInput().clear();
        contactUsPage.getOrderReferenceInput().sendKeys(reference);
        contactUsPage.getChooseFileButton().clear();
        contactUsPage.getChooseFileButton().sendKeys(fileAddress);
        contactUsPage.getUserMessageInput().clear();
        contactUsPage.getUserMessageInput().sendKeys(message);
        contactUsPage.getSubmitMessageButton().click();
        return new SendAMessagePageSteps(driver);
    }
}
