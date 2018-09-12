package automationpracticeui.objects.navigation;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends MainPage {

    public ContactUsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy
    private Select subjectHeadingInput;

    @FindBy (id = "email")
    private WebElement emailAddressUserInput;

    @FindBy (id = "id_order")
    private WebElement orderReferenceInput;

    @FindBy (id = "fileUpload")
    private WebElement chooseFileButton;

    @FindBy (id = "message")
    private WebElement userMessageInput;

    @FindBy (id = "submitMessage")
    private WebElement submitMessageButton;

    public Select getSubjectHeadingInput() {
        subjectHeadingInput = new Select(driver.findElement(By.id("id_contact")));
        return subjectHeadingInput;
    }

    public WebElement getEmailAddressUserInput() {
        return emailAddressUserInput;
    }

    public WebElement getOrderReferenceInput() {
        return orderReferenceInput;
    }

    public WebElement getChooseFileButton() {
        return chooseFileButton;
    }

    public WebElement getUserMessageInput() {
        return userMessageInput;
    }

    public WebElement getSubmitMessageButton() {
        return submitMessageButton;
    }
}
