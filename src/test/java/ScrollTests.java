import Base.BaseTest;
import org.example.Config.Browser;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.example.Pages.ScrollPage.*;

public class ScrollTests extends BaseTest {

    private String pageUrl = "https://webdriveruniversity.com/Scrolling/index.html";

    @Test
    public void step_1(){
        driver.get(pageUrl);
        WebElement zone_1 = driver.findElement(zone1);
        Actions actions = new Actions(driver);
        actions.moveToElement(zone_1).perform();
        Assert.assertTrue(driver.findElement(zone1Message).isDisplayed());
    }
}
