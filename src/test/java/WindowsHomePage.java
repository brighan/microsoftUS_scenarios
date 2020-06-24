import org.openqa.selenium.WebDriver;

import java.net.URL;

public class WindowsHomePage extends SeleniumBase implements Controller {



   public WindowsHomePage(WebDriver driver) {
        super(driver);
    }


    public void visit(String URL) {
        visit(URL);
    }

    public void openMenu() {

    }

    public void type() {

    }

    public boolean validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {
        return false;
    }

    @Override
    public WebDriver initChrome() {
        return super.initChrome();
    }
}
