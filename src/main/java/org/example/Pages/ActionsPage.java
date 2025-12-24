package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsPage extends BasePage {
    public ActionsPage(WebDriver driver) {
        super(driver);
    }

    public static By draggableBox = By.id("draggable");
    public static By droppableBox = By.id("droppable");
    public static By dropMessage = By.xpath("//div[@id='droppable']//b[text()='Dropped!']");

    public static By doubleClickBox = By.id("double-click");

    public static By hover1 = By.xpath("//button[text()='Hover Over Me First!']");
    public static By link1 = By.xpath("//*[@id='div-hover']/div[1]/div/a");

    public static By hover2 = By.xpath("//button[text()='Hover Over Me Second!']");
    public static By link2 = By.xpath("//*[@id='div-hover']/div[2]/div/a");


    public static By hover3 = By.xpath("//button[text()='Hover Over Me Third!']");
    public static By link3_1 = By.xpath("//*[@id='div-hover']/div[3]/div/a[1]");
    public static By link3_2 = By.xpath("//*[@id='div-hover']/div[3]/div/a[2]");

}
