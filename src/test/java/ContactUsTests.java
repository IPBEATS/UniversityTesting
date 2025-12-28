import Base.BaseTest;
import org.example.Config.Browser;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.example.Pages.ContactUsPage.*;

public class ContactUsTests extends BaseTest {

    private String pageUrl = "https://webdriveruniversity.com/Contact-Us/contactus.html";

    private String nameValue = "Vito";
    private String lastNameValue = "Scaletta";
    private String emailValue = "scaletta1221@mail.ru";
    private String commentsValue = "\"My name is Vito Scaletta." +
            " I was born in Sicily, in the 25th year." +
            " This is our family. I'm standing with my parents and sister Francesca." +
            " I don't remember much about those times, except that life was hard, and then my father decided it was time for us to leave." +
            " Cross the ocean and start a new life. I've never seen anything like Empire Bay in my life. He was beautiful." +
            " However, it's hard to imagine anything more nasty and disgusting than our new kennel. The American dream..." +
            " It's more like a nightmare. My father started working at the port for the man who brought us here." +
            " He worked like hell, earned pennies and spent almost everything in a pub. Eventually, I was sent to school." +
            " I needed English, but like hell I would have spoken it to Italians. That's where I met Joe. Gradually, we became best friends." +
            " Since both of us had whistling in our pockets, and there was no decent work, we started our own modest business." +
            " Well, then we're out of luck. It was the 43rd year. There was a war going on. Landing in Sicily, Italian-speaking soldiers were needed." +
            " I was 18, and I didn't want to go to jail. Who says you can't go back to your homeland?..\"";


    @Test
    public void openPage(){
        driver.get(pageUrl);
        Assert.assertTrue(driver.findElement(headerContact).isDisplayed());
    }

    @Test
    public void sendFormAndReset(){
        driver.findElement(firstName).sendKeys(nameValue);
        driver.findElement(lastName).sendKeys(lastNameValue);
        driver.findElement(emailAddress).sendKeys(emailValue);
        driver.findElement(textComments).sendKeys(commentsValue);
        driver.findElement(buttonReset).click();
        Assert.assertEquals(driver.findElement(firstName).getDomProperty("value"), "");
        Assert.assertEquals(driver.findElement(lastName).getDomProperty("value"), "");
        Assert.assertEquals(driver.findElement(emailAddress).getDomProperty("value"), "");
        Assert.assertEquals(driver.findElement(textComments).getDomProperty("value"), "");
    }

    @Test
    public void sendFormAndSubmit(){
        driver.findElement(firstName).sendKeys(nameValue);
        driver.findElement(lastName).sendKeys(lastNameValue);
        driver.findElement(emailAddress).sendKeys(emailValue);
        driver.findElement(textComments).sendKeys(commentsValue);
        driver.findElement(buttonSubmit).click();
        Assert.assertTrue(driver.findElement(resultMessage).isDisplayed());
    }

}
