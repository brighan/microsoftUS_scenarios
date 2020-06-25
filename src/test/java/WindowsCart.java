import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class WindowsCart extends SeleniumBase implements Controller{

    By priceInCart = By.cssSelector("");

    public WindowsCart(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openMenu() {

    }

    @Override
    public void openMenu(String text) {

    }

    @Override
    public void getInfoFromWebElement(List<String> dataTable) {

    }

    @Override
    public void getInfoFromWebElement() {

    }

    @Override
    public void type() {

    }

    @Override
    public void validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {
        assertEquals(expectedTextOnWabePage,actualTextOnWebPage);
    }

    public void checkOut(){
        validateTexts(WindowsHomePage.firstProduct, getText(priceInCart));

    }
}
