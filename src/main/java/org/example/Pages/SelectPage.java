package org.example.Pages;

import org.example.Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPage extends BasePage {
    public SelectPage(WebDriver driver) {
        super(driver);
    }

    public static By headerSelect = By.xpath("//div[@id='main-header']//h1");

    public static By dropDownMenu1 = By.id("dropdowm-menu-1");
    public static By dropDownMenu2 = By.id("dropdowm-menu-2");
    public static By dropDownMenu3 = By.id("dropdowm-menu-3");

    public static By checkBox1 = By.xpath("//input[@value='option-1']");
    public static By checkBox2 = By.xpath("//input[@value='option-2']");
    public static By checkBox3 = By.xpath("//input[@value='option-3']");
    public static By checkBox4 = By.xpath("//input[@value='option-4']");
//    public static By checkBox1 = By.xpath("");


    public static By greenButton = By.xpath("//input[@type='radio'][@value='green']");
    public static By blueButton = By.xpath("//input[@type='radio'][@value='blue']");
    public static By yellowButton = By.xpath("//input[@type='radio'][@value='yellow']");
    public static By orangeButton = By.xpath("//input[@type='radio'][@value='orange']");
    public static By purpleButton = By.xpath("//input[@type='radio'][@value='purple']");

    public static By radioEnabled = By.xpath("//input[@value='lettuce']");
    public static By radioDisabled = By.xpath("//input[@value='cabbage']");
    public static By radioChecked = By.xpath("//input[@value='pumpkin']");

    public static By selectFruits = By.id("fruit-selects");
    public static By disabledOption = By.xpath("//select//option[@value='orange']");
    public static By selectedOption = By.xpath("//select//option[@value='grape']");



    public boolean elementSelect(By xpath) {
        WebElement element = driver.findElement(xpath);
        return element.isSelected();
    }

    public void setCheckBoxState(By xpath, boolean state){
        if (elementSelect(xpath) != state){
            driver.findElement(xpath).click();
        }
    }


}
