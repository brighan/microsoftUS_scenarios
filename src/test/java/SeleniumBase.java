import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase {

    private  WebDriver driver;

    public SeleniumBase(WebDriver driver){
        this.driver = driver;

    }

    public WebDriver initChrome(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
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


}
