package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjaxLoaderPage extends BasePage {
    public AjaxLoaderPage(WebDriver driver) {
        super(driver);
    }

    public static By clickButton = By.id("button1");
    public static By responseMessage = By.xpath("//h4[text()='Well Done For Waiting....!!!']");
    public static By closeButton = By.xpath("//button[text()='Close']");

}
