import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WindowsWindows10Page extends SeleniumBase implements Controller {

    By windows10DropDown = By.id("c-shellmenu_50");

    public WindowsWindows10Page(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openMenu() {
        initWait().until(ExpectedConditions.visibilityOfElementLocated(By.className("blue-banner-cta")));
        click(windows10DropDown);
    }

    @Override
    public void openMenu(String text) {

    }

    @Override
    public void getInfoFromWebElement(List<String> dataTable) {

    }

    @Override
    public void getInfoFromWebElement() {
        WebElement content = findElement(By.cssSelector("#uhf-g-nav > ul > li:nth-child(2) > div > ul"));
        List<WebElement> contents = content.findElements(By.className("js-subm-uhf-nav-link"));
        for (WebElement cont : contents) {
            System.out.println((cont.getText()));
        }
    }

    @Override
    public void type() {

    }

    @Override
    public void validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {

    }
}
