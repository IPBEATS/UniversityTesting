import org.example.Config.Browser;
import org.example.Pages.SelectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example.Pages.SelectPage.*;

public class SelectPageTests {
    private WebDriver driver;
    private SelectPage selectPage;
    private String pageUrl = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";

    @BeforeTest
    public void beforeTest() {
        driver = Browser.createDriver();
        driver.manage().window().maximize();
        driver.get(pageUrl);
        selectPage = new SelectPage(driver);
    }

    @Test
    public void dropDowns(){
        Select select1 = new Select(driver.findElement(dropDownMenu1));
        select1.selectByValue("python");
        Assert.assertEquals(driver.findElement(dropDownMenu1).getAttribute("value"), "python");

        Select select2 = new Select(driver.findElement(dropDownMenu2));
        select2.selectByValue("testng");
        Assert.assertEquals(driver.findElement(dropDownMenu2).getAttribute("value"), "testng");

        Select select3 = new Select(driver.findElement(dropDownMenu3));
        select3.selectByValue("javascript");
        Assert.assertEquals(driver.findElement(dropDownMenu3).getAttribute("value"), "javascript");
    }

    //В тесте ниже с помощью методов устанавливаю нужное состояние,
    // даже в том случае если оно уже было до начала тестов, и проверяю что это работает.
    @Test
    public void checkBox(){
        selectPage.setCheckBoxState(checkBox1, true);
        Assert.assertTrue(selectPage.elementSelect(checkBox1));
        selectPage.setCheckBoxState(checkBox1, false);
        Assert.assertFalse(selectPage.elementSelect(checkBox1));

        selectPage.setCheckBoxState(checkBox2, true);
        Assert.assertTrue(selectPage.elementSelect(checkBox2));
        selectPage.setCheckBoxState(checkBox2, false);
        Assert.assertFalse(selectPage.elementSelect(checkBox2));

        selectPage.setCheckBoxState(checkBox3, true);
        Assert.assertTrue(selectPage.elementSelect(checkBox3));
        selectPage.setCheckBoxState(checkBox3, false);
        Assert.assertFalse(selectPage.elementSelect(checkBox3));

        selectPage.setCheckBoxState(checkBox4, true);
        Assert.assertTrue(selectPage.elementSelect(checkBox4));
        selectPage.setCheckBoxState(checkBox4, false);
        Assert.assertFalse(selectPage.elementSelect(checkBox4));

    }


    //Здесь я проверяю что после клика элемент выбран,
    // и так же, после клика на другой элемент,
    // предыдущий уже не является selected
    @Test
    public void radioButtons(){
        driver.findElement(greenButton).click();
        Assert.assertTrue(selectPage.elementSelect(greenButton));

        driver.findElement(blueButton).click();
        Assert.assertTrue(selectPage.elementSelect(blueButton));
        Assert.assertFalse(selectPage.elementSelect(greenButton));

        driver.findElement(yellowButton).click();
        Assert.assertTrue(selectPage.elementSelect(yellowButton));
        Assert.assertFalse(selectPage.elementSelect(blueButton));

        driver.findElement(orangeButton).click();
        Assert.assertTrue(selectPage.elementSelect(orangeButton));
        Assert.assertFalse(selectPage.elementSelect(yellowButton));

        driver.findElement(purpleButton).click();
        Assert.assertTrue(selectPage.elementSelect(purpleButton));
        Assert.assertFalse(selectPage.elementSelect(orangeButton));
    }

    @Test
    public void selectedAndDisabled(){
        Assert.assertTrue(driver.findElement(radioEnabled).isEnabled());
        Assert.assertFalse(driver.findElement(radioDisabled).isEnabled());
        Assert.assertTrue(driver.findElement(radioChecked).isEnabled());

        Assert.assertEquals(driver.findElement(disabledOption).getAttribute("disabled"), "true");
        Assert.assertEquals(driver.findElement(selectedOption).getAttribute("selected"), "true");
    }


    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
