package tests.shopping_cart;

import automationpracticeui.steps.shopping_cart.ProductContainerPageSteps;
import automationpracticeui.steps.shopping_cart.LayerCartPopUpSteps;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestRemoveFromLayerCartPopUp extends BaseTest {

    @Test
    void testRemoveFromShoppingCartBlock () {
        ProductContainerPageSteps productContainerPageSteps = mainPageSteps.selectProduct();
        LayerCartPopUpSteps layerCartPopUpSteps = productContainerPageSteps.addToCartButton();
    }
}