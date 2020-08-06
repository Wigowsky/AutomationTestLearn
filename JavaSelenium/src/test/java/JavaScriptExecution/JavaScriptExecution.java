package JavaScriptExecution;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecution {
    private WebDriver driver;
    String baseUrl;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        js = (JavascriptExecutor) driver;

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testJavaScriptExecution() throws Exception {
        // Navigation
        // driver.get(baseUrl);
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");

        // driver.get() method waits for the page to load completely before going to the next statement
        // Adding Thread.sleep() because we are opening URL using js.executeScript() and it does not wait for the page to load completely
        // If we do not add wait, then Selenium WebDriver will immediately try to find the element and it might have issues with just a little slow connection
        Thread.sleep(3000);
        // Finding element
        // WebElement textBox = driver.findElement(By.id("name"));
        WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
        textBox.sendKeys("test");
    }

    @Test
    public void test1JavaScriptExecution() throws Exception {
        // Navigation
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
        Thread.sleep(3000);

        // Size of window
        long height = (Long) js.executeScript("return window.innerHeight;");
        long width = (Long) js.executeScript("return window.innerWidth;");

        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);
    }

    @Test
    public void test2JavaScriptExecution() throws Exception {
        // Navigation
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
        Thread.sleep(3000);

        // Scroll Down
        js.executeScript("window.scrollBy(0, 1900);");
        Thread.sleep(2000);

        // Scroll Up
        js.executeScript("window.scrollBy(0, -1900);");
        Thread.sleep(2000);

        // Scroll Element Into View
        WebElement element = driver.findElement(By.id("mousehover"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -190);");
    }

    @Test
	public void testJSClick1() throws Exception {
	driver.get("https://letskodeit.teachable.com/pages/practice");
	Thread.sleep(3000);

	WebElement checkBoxElement = driver.findElement(By.id("bmwcheck"));
        js.executeScript("arguments[0].click();", checkBoxElement);
}

//Strona zmieniła strukture tak ze obejscie kodem jest niemozliwe do odtworzenia test bedzie failowal
    @Test
    public void testJSClick2() throws Exception {
        driver.get("https://www.retailmenot.com/");
        driver.findElement(By.xpath("//div[text()='Log In / Sign up']")).click();
        Thread.sleep(3000);

        WebElement checkBoxElement = driver.findElement(By.id("subscribe"));
        System.out.println("Displayed: " + checkBoxElement.isDisplayed());
        System.out.println("Selected: " + checkBoxElement.isSelected());

        //checkBoxElement.click();
        js.executeScript("arguments[0].click();", checkBoxElement);
    }



    @After
    public void tearDown() throws Exception {
    }
}