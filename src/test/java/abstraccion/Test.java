package abstraccion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test {
    public void openBrowser(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.navigate().to("https://mvnrepository.com/");

        driver.quit();
    }

    @org.testng.annotations.Test
    public void openBrowserTest(){
        openBrowser();
    }
}
