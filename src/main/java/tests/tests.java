package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class tests extends testing {
    @Test
    public static void test() {
        appium.get("https://google.com");
        //appium.findElement(By.xpath("//input[@name='q']")).sendKeys("testng");
        //appium.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        appium.findElement(By.cssSelector("[name='q']")).sendKeys("testng");
        appium.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);

    }

    @Test
    public static void wing() {
        appium.get("https://google.com");
        //appium.findElement(By.xpath("//input[@name='q']")).sendKeys("testng");
        //appium.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        appium.findElement(By.cssSelector("[name='q']")).sendKeys("automation");
        appium.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);

    }
}
