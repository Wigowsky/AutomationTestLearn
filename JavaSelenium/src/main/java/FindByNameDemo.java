package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FindByNameDemo
{
    public static void main( String[] args )
    {
//        Ustawienie strony
        String baseURL = "https://learn.letskodeit.com/p/practice";
        /*Zaczytanie odpowiedniego driver'a, mozna dodać go tez do PATH i ta linia wtedy nie jest wymagana*/
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      Wejscie na stronę
        driver.get(baseURL);
driver.findElement(By.name("enter-name")).sendKeys("AUTOMATION");
    }
}

