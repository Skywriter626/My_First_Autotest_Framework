package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestMainPage extends BaseTest {

    @Test(description = "74")
    void testSearch() {
        mainPageSteps.search("Cool dress!!!!");
        boolean result = mainPageSteps.isCoolDressIsDisplayed();
        assertEquals(result, true, "OMG!!!");

        result = mainPageSteps.isCoolDressShownTheFirst();
        assertEquals(result, true, "OMG!!!");

    }
}
