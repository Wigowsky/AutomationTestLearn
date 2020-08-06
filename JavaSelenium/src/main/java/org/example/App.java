package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class App 
{
    public static void main( String[] args ) throws Exception {
//        Ustawienie strony
        String baseURL = "https://learn.letskodeit.com/";
 /*Zaczytanie odpowiedniego driver'a, mozna dodać go tez do PATH i ta linia wtedy nie jest wymagana*/
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      Wejscie na stronę
        driver.get(baseURL);
//        Szukanie po nazwie linku
        driver.findElement(By.linkText("Login")).click();
//        Sleep
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".header-logo.navbar-brand > img[alt='Let\\27s Kode It']")).click();
        Thread.sleep(3000);
//        Znalezienie guzika po xpath oraz kliknięcie
        driver.findElement(By.xpath("//div[@id='navbar']//div[@class='navbar-header navbar-header-courses']/div/ul[@class='nav navbar-nav navbar-right']//a[@href='/sign_in']")).click();
//Znalezie pola dla email po id oraz wpisanie wartości
        driver.findElement(By.id("user_email")).sendKeys("1.1@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("pozdrozudemy");
        driver.findElement(By.xpath("//form[@id='new_user']//input[@name='commit']")).click();
    }
}

