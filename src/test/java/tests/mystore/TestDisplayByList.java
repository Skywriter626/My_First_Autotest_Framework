package tests.mystore;

import org.testng.annotations.Test;
import tests.BaseTest;

public class TestDisplayByList extends BaseTest {

    @Test (description = "59")
    void testDisplayByList () {
        mainPageSteps.displayProductsByList();
    }
}
