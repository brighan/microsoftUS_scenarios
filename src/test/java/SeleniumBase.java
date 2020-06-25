import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumBase {

    private  WebDriver driver;
    private WebDriverWait wait;

    public SeleniumBase(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver initChrome(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        return driver;
    }

    public WebDriverWait initWait(){
        return this.wait = new WebDriverWait(driver,30);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
       driver.findElement(locator).click();
    }

    public void visit(String URL){
        driver.get(URL);
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void maxScreen(){
        driver.manage().window().fullscreen();
    }


}
