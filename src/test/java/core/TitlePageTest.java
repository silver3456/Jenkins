package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TitlePageTest {

    WebDriver driver;

    @BeforeClass
    public void beforeSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void login() throws Exception{
        driver.get("https://www.expedia.com");
        System.out.println("Title is: " + driver.getTitle());
        driver.quit();
    }


}
