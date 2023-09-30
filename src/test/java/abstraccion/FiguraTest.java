package abstraccion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FiguraTest {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");

    }
    @Test
    public void browser() {
        WebElement element = driver.findElement(By.id("query"));

        element.sendKeys("Selenium");

        WebElement button = driver.findElement(By.cssSelector("#search > form > input.button"));
        button.click();

        WebElement result = driver.findElement(By.cssSelector("div.content > div:nth-child(3) > div.im-header > h2 > a:nth-child(2)"));

        Assert.assertTrue(result.getText().contains("Selenium"));
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void validarCalcularAreaCirculo(){
        double radio = 5;
        Circulo circulo = new Circulo(radio);

        double resultadoEsperado = Math.PI * radio * radio;

        Assert.assertEquals(circulo.calcularArea(),resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaTriangulo(){
        double base = 25;
        double altura = 50;

        Triangulo triangulo = new Triangulo(base,altura);

        double resultadoEsperado = (base * altura) / 2;

        Assert.assertEquals(triangulo.calcularArea(),resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaRectangulo(){
        double base = 36;
        double altura = 10;

        Rectangulo rectangulo = new Rectangulo(base,altura);

        double resultadoEsperado = base * altura;

        Assert.assertEquals(rectangulo.calcularArea(),resultadoEsperado);
    }
}
