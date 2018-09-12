package tests.mystore;

import org.testng.annotations.Test;
import tests.BaseTest;

public class TestSortProducts extends BaseTest {

    @Test (description = "57")
    void testSortProducts() {
        mainPageSteps.sortProductsByKey("Price: Lowest first");
    }
}
