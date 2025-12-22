import org.example.Config.Browser;
import org.example.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example.Config.Config.START_URL;
import static org.example.Pages.MainPage.headerElement;

public class MainPageTests {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void openPage(){
        driver.get(START_URL);;
        Assert.assertTrue(driver.findElement(headerElement).isDisplayed());
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
