package automationpracticeui.steps.shopping_cart;

import automationpracticeui.objects.shopping_cart.ProductContainerPage;
import automationpracticeui.steps.MainPageSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductContainerPageSteps extends MainPageSteps {
    private ProductContainerPage productContainerPage;

    public ProductContainerPageSteps(WebDriver driver) {
        super(driver);
        productContainerPage = PageFactory.initElements(driver, ProductContainerPage.class);
    }

    public LayerCartPopUpSteps addToCartButton () {
        productContainerPage.getAddToCartButton().click();
        return new LayerCartPopUpSteps(driver);
    }
}
