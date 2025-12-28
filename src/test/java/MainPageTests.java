import Base.BaseTest;
import org.example.Config.Browser;
import org.example.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example.Config.Config.START_URL;
import static org.example.Pages.MainPage.headerElement;

public class MainPageTests extends BaseTest {

    @Test
    public void openPage(){
        driver.get(START_URL);;
        Assert.assertTrue(driver.findElement(headerElement).isDisplayed());
    }

}
