package Tutorial2Page;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Page.classes.SearchPageFactory;
// zmieniła sie struktura strony testy nie dziala na tej stronie ale przedstawiona metodyka jest poprawna i można sie na niej wzorowac
public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPage;

    @Before
    public void beforeClass() {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";

        searchPage = new SearchPageFactory(driver);

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void test() throws Exception {
        searchPage.clickFlightsTab();
        searchPage.setOriginCity("New York");
        searchPage.setDestinationCity("San Francisco");

    }

    @After
    public void afterClass() {
    }
}