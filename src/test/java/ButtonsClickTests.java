import org.example.Config.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.Pages.ButtonsClickPage.*;

public class ButtonsClickTests {
    private WebDriver driver;
    private String pageUrl = "https://webdriveruniversity.com/Click-Buttons/index.html";

    @BeforeTest
    public void beforeTest() {
        driver = Browser.createDriver();
        driver.manage().window().maximize();
        driver.get(pageUrl);

//        WebElement element = driver.findElement(buttonClick1);
//        WebElement btn2 = driver.findElement(buttonClick2);
//        WebElement btn3 = driver.findElement(buttonClick3);
    }

    @Test
    public void step_1() {
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
        WebElement btn3 = driver.findElement(buttonClick3);
        Actions actions = new Actions(driver);
        actions.moveToElement(btn3).click().perform();
    }




//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
}



