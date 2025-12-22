package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public static By headerElement = By.xpath("//a[@id='nav-title']");

    public static By contactUsForm = By.xpath("//h1[text()='CONTACT US']");
    public static By loginPortal = By.xpath("//h1[text()='LOGIN PORTAL']");



    public ContactUsPage openContactUsPage(){
        driver.findElement(contactUsForm).click();
        return new ContactUsPage(driver);
    }


}
