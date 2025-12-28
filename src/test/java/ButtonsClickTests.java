import Base.BaseTest;
import org.example.Config.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.Pages.ButtonsClickPage.*;

public class ButtonsClickTests extends BaseTest {

    private String pageUrl = "https://webdriveruniversity.com/Click-Buttons/index.html";

    @Test
    public void step_1() {
        driver.get(pageUrl);
        driver.findElement(buttonClick1).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(modalClose1));
        Assert.assertTrue(driver.findElement(modalResponse1).isDisplayed());
        driver.findElement(modalClose1).click();
    }

    @Test
    public void step_2() {
        driver.findElement(buttonClick2).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(modalClose2));
        Assert.assertTrue(driver.findElement(modalClose2).isDisplayed());
        driver.findElement(modalClose2).click();
    }

    @Test
    public void step_3(){
        driver.findElement(buttonClick3).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(modalClose3));
        Assert.assertTrue(driver.findElement(modalResponse3).isDisplayed());
        driver.findElement(modalClose3).click();
    }

}



