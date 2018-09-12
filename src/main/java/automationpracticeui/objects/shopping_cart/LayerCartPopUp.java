package automationpracticeui.objects.shopping_cart;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LayerCartPopUp extends ProductContainerPage {
    public LayerCartPopUp(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".continue")
    private WebElement continueShoppingButton;

}
