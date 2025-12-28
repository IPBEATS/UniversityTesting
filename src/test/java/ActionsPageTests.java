import Base.BaseTest;
import org.example.Config.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example.Pages.ActionsPage.*;

public class ActionsPageTests extends BaseTest {
    public static String pageUrl = "https://webdriveruniversity.com/Actions/index.html";

    @Test
    public void step_1(){
        driver.get(pageUrl);
        WebElement drag = driver.findElement(draggableBox);
        WebElement drop = driver.findElement(droppableBox);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).perform();
        Assert.assertTrue(driver.findElement(dropMessage).isDisplayed());
    }

    @Test
    public void step_2(){
        WebElement doubleClickElem = driver.findElement(doubleClickBox);
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickElem).perform();
        //При двойном нажатии меняется значение атрибута "class", ниже проверяю это
        Assert.assertEquals(doubleClickElem.getAttribute("class"), "div-double-click double");
    }

    @Test
    public void step_3(){
        WebElement hover_1 = driver.findElement(hover1);
        WebElement hover_2 = driver.findElement(hover2);
        WebElement hover_3 = driver.findElement(hover3);

        Actions actions = new Actions(driver);
        actions.moveToElement(hover_1).perform();
        Assert.assertTrue(driver.findElement(link1).isDisplayed());
        driver.findElement(link1).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        actions.moveToElement(hover_2).perform();
        Assert.assertTrue(driver.findElement(link2).isDisplayed());
        driver.findElement(link2).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();

        actions.moveToElement(hover_3).perform();
        Assert.assertTrue(driver.findElement(link3_1).isDisplayed());
        driver.findElement(link3_1).click();
        Alert alert3_1 = driver.switchTo().alert();
        alert3_1.accept();

        Assert.assertTrue(driver.findElement(link3_2).isDisplayed());
        driver.findElement(link3_2).click();
        Alert alert3_2 = driver.switchTo().alert();
        alert3_2.accept();
    }
}
