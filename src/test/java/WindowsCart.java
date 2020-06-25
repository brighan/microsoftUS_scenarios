import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class WindowsCart extends SeleniumBase implements Controller{

    By priceInCart = By.xpath("//*[@id=\"store-cart-root\"]/div/div/div/section[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/span/span[2]/span");
    By dropdown = By.xpath("//*[@id=\"store-cart-root\"]/div/div/div/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/select");
    By totalAmount = By.cssSelector("#store-cart-root > div > div > div > section._3LWrsBIG > div > div > div:nth-child(4) > div > span > span:nth-child(2) > strong > span");

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
        type(dropdown,"20");
        assertEquals("$15,980.00",getText(totalAmount));
    }

    @Override
    public void type() {

    }

    @Override
    public void validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {
        assertEquals(expectedTextOnWabePage,actualTextOnWebPage);
    }

    public void checkOut(){
        initWait().until(ExpectedConditions.visibilityOfElementLocated((priceInCart)));
        System.out.println("expected: "+WindowsHomePage.firstProduct);
        System.out.println("Got: "+getText(priceInCart));
        validateTexts(WindowsHomePage.firstProduct, getText(priceInCart));
    }
}
