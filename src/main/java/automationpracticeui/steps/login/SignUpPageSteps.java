package automationpracticeui.steps.login;

import automationpracticeui.objects.login.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageSteps extends LoginPageSteps {
    private SignUpPage signUpPage;

    public SignUpPageSteps(WebDriver driver) {
        super(driver);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    }
}
