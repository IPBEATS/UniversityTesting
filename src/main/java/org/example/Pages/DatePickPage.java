package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickPage extends BasePage {
    public DatePickPage(WebDriver driver) {
        super(driver);
    }

    public static By datePicker  = By.xpath("//span[@class='input-group-addon']");
    public static By monthYear = By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]");
//    public static By  = By.xpath("");
//    public static By  = By.xpath("");
//    public static By  = By.xpath("");
//    public static By  = By.xpath("");
}
