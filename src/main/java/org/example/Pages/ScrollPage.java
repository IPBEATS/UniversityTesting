package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollPage extends BasePage {
    public ScrollPage(WebDriver driver) {
        super(driver);
    }

    public static By zone1 = By.id("zone1");
    public static By zone1Message = By.xpath("//div[text()='Well done for scrolling to me!']");

    public static By zone2 = By.id("zone2");
    public static By zone3 = By.id("zone3-entries");

}
