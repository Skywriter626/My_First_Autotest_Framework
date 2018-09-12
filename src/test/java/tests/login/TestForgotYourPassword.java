package tests.login;

import automationpracticeui.steps.login.ConfirmationMessagePageSteps;
import automationpracticeui.steps.login.ForgotYourPasswordPageSteps;
import automationpracticeui.steps.login.LoginPageSteps;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestForgotYourPassword extends BaseTest {

    @Test (description = "53")
    void testForgotYourPassword () {
        LoginPageSteps loginPageSteps = mainPageSteps.clickSignInButton();
        ForgotYourPasswordPageSteps forgotYourPasswordPageSteps = loginPageSteps.goToForgotYourPassword();
        ConfirmationMessagePageSteps confirmationMessagePageSteps =
                forgotYourPasswordPageSteps.retrievePassword("test@gmail.com");
    }
}
