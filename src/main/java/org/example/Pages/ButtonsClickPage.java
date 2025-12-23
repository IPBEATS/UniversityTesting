package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsClickPage extends BasePage {
    public ButtonsClickPage(WebDriver driver) {
        super(driver);
    }

    public static By buttonClick1 = By.id("button1");
    public static By modalClose1 = By.xpath("(//button[@class='btn btn-default'])[1]");
    public static By modalResponse1 = By.xpath("//h4[text()='Congratulations!']");

    public static By buttonClick2 = By.id("button2");
    public static By modalClose2 = By.xpath("(//button[@class='btn btn-default'])[2]");

    public static By buttonClick3 = By.id("button3");
    public static By modalResponse3 = By.xpath("//b[text()='Action Move & Click']");
    public static By modalClose3 = By.xpath("(//button[@class='btn btn-default'])[3]");

}
