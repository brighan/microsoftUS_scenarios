import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class WindowsVisualStudioPage extends SeleniumBase implements Controller {

    By popUpNewsletter = By.cssSelector("#email-newsletter-dialog > div.sfw-dialog > div.c-glyph.glyph-cancel");
    By priceDetails = By.cssSelector("#ProductPrice_productPrice_PriceContainer > span");
    By addCart = By.id("buttonPanel_AddToCartButton");

    public WindowsVisualStudioPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void openMenu() {
        initWait().until(ExpectedConditions.visibilityOfElementLocated(popUpNewsletter));
        click(popUpNewsletter);
        String price = getText(priceDetails);
        System.out.println("Expected"+WindowsHomePage.firstProduct);
        System.out.println("Got:"+price);
        validateTexts(WindowsHomePage.firstProduct, price);
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

    public void addCart(){
        click(addCart);
    }
}
