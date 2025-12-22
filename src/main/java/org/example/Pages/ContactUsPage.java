package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public static By headerContact = By.xpath("//h2[text()='CONTACT US']");

    public static By firstName = By.xpath("//input[@name='first_name']");
    public static By lastName  = By.xpath("//input[@name='last_name']");
    public static By emailAddress  = By.xpath("//input[@name='email']");
    public static By textComments = By.xpath("//textarea[@name='message']");

    public static By buttonReset = By.xpath("//input[@type='reset']");
    public static By buttonSubmit = By.xpath("//input[@type='submit']");

    public static By resultMessage = By.xpath("//h1[text()='Thank You for your Message!']");

    public void setAllValues(String name, String last_name, String email, String message){
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(lastName).sendKeys(last_name);
        driver.findElement(emailAddress).sendKeys(email);
        driver.findElement(textComments).sendKeys(message);
    }

}
