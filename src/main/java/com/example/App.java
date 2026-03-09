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
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            Thread.sleep(2000); // wait 2 seconds after page load

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            Thread.sleep(2000); // wait before clicking login

            driver.findElement(By.id("login-button")).click();

            Thread.sleep(2000); // wait after login

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // closes browser
        }
    }
}
