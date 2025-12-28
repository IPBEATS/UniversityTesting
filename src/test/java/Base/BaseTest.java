package Base;

import org.example.Config.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
        driver.manage().window().maximize();;
    }

    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }

}
