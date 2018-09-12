package automationpracticeui.steps.login;

import automationpracticeui.objects.login.ForgotYourPasswordPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForgotYourPasswordPageSteps extends LoginPageSteps {
    private ForgotYourPasswordPage forgotYourPasswordPage;

    public ForgotYourPasswordPageSteps(WebDriver driver) {
        super(driver);
        forgotYourPasswordPage = PageFactory.initElements(driver, ForgotYourPasswordPage.class);
    }

    public ConfirmationMessagePageSteps retrievePassword (String email) {
        forgotYourPasswordPage.getEmailAddressRetrieveInput().clear();
        forgotYourPasswordPage.getEmailAddressRetrieveInput().sendKeys(email);
        forgotYourPasswordPage.getSubmitRetrievePassword().click();
        return new ConfirmationMessagePageSteps(driver);
    }
}
