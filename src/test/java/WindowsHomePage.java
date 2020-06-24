import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.URL;
import java.util.List;

public class WindowsHomePage extends SeleniumBase implements Controller {


   public WindowsHomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {

    }

    public void getInfoFromWebElement() {
       WebElement menus = findElement(By.className("js-paddle-items"));
        List<WebElement> links = menus.findElements(By.tagName("li"));
        for(int i = 1; i < links.size(); i++){
            System.out.println(links.get(i).getText());

        }
        System.out.print(menus);
    }

    public void type() {

    }

    public boolean validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {
        return false;
    }

    public void pageFullyLoaded(){
       initWait().until(ExpectedConditions.visibilityOfElementLocated(By.className(("js-paddle-items"))));
    }


    @Override
    public WebDriver initChrome() {
        return super.initChrome();
    }
}
