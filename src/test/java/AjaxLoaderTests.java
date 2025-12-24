import org.example.Config.Browser;
import org.example.Pages.AjaxLoaderPage;
import org.example.Pages.SelectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.Pages.AjaxLoaderPage.*;
import static org.example.Pages.ButtonsClickPage.modalClose3;

public class AjaxLoaderTests {
    private WebDriver driver;
    private String pageUrl = "https://webdriveruniversity.com/Ajax-Loader/index.html";

    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
        driver.manage().window().maximize();
        driver.get(pageUrl);
    }

    @Test
    public void step_1(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(clickButton));
        driver.findElement(clickButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(responseMessage));
        Assert.assertTrue(driver.findElement(responseMessage).isDisplayed());
        driver.findElement(closeButton).click();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
