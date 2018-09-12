package automationpracticeui.objects.shopping_cart;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductContainerPage extends MainPage {
    public ProductContainerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "Submit")
    private WebElement addToCartButton;

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}