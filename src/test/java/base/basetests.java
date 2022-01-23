package base;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basetests{
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ve/");
        }

@Test
    public void Open(){
        setUp();

        By elemento = By.className("nav-search-input");
                      By.className("nav-search-btn");
        By elementos = By.className("nav-search-btn");
                        By.className("andes-dropdown__trigger");

    WebElement element = driver.findElement(elemento);

        driver.findElement(elemento).click();
        driver.findElement(elemento).sendKeys("Rompecabezas");
        driver.findElement(elementos).click();

}
@After
public void close(){
        driver.quit();
}


}
