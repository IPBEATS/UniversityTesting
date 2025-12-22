package org.example.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.example.Config.Config.BROWSER_TYPE;

public class Browser {
    public static WebDriver driver;

    public static WebDriver createDriver() {
        switch (BROWSER_TYPE) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Браузер не найден");
        }
        return driver;
    }
}
