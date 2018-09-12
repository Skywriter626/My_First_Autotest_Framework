package automationpracticeui.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "search_query_top")
    private WebElement searchInput;

    @FindBy(name = "submit_search")
    private WebElement searchSubmitButton;

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(css = "[src = 'http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
    private WebElement coolDress;

    @FindBy(id = "contact-link")
    private WebElement contactUsButton;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1)")
    private WebElement womenCatalogButton;

    @FindBy
    private Select sortByList;

    @FindBy (id = "list")
    private WebElement displayByListIcon;

    public WebElement getCoolDress() {
        return coolDress;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getWomenCatalogButton() {
        return womenCatalogButton;
    }

    public Select getSortByList() {
        sortByList = new Select(driver.findElement(By.id("selectProductSort")));
        return sortByList;
    }

    public WebElement getDisplayByListIcon() {
        return displayByListIcon;
    }
}
