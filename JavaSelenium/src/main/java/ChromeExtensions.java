
import java.io.File;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeExtensions {

    public static void main(String[] args) {
        String baseURL = "http://www.google.com";
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\matts\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ocgghcnnjekfpbmafindjmijdpopafoe\\1.4.2_0.crx"));
        options.addExtensions(new File("C:\\Users\\matts\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljngjbnaijcbncmcnjfhigebomdlkcjo\\6.1.2_0.crx"));


        driver = new ChromeDriver(options);
        driver.get(baseURL);
    }
}