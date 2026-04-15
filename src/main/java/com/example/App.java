package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.manage().window().maximize();

            Thread.sleep(2000); // wait 2 seconds after page load

            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");

            Thread.sleep(2000); // wait before clicking login

            driver.findElement(By.id("submit")).click();

            Thread.sleep(2000); // wait after login

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // closes browser
        }
    }
}
