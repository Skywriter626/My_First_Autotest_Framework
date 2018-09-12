package automationpracticeui.objects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotYourPasswordPage extends LoginPage {

    public ForgotYourPasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "email")
    private WebElement emailAddressRetrieveInput;

    @FindBy (css = "#form_forgotpassword > fieldset > p > button")
    private WebElement submitRetrievePassword;

    public WebElement getEmailAddressRetrieveInput() {
        return emailAddressRetrieveInput;
    }

    public WebElement getSubmitRetrievePassword() {
        return submitRetrievePassword;
    }
}
