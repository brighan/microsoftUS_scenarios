import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.assertEquals;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WindowsHomePage extends SeleniumBase implements Controller {



   public WindowsHomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {

    }

    public void getInfoFromWebElement(List<String> dataTable) {
       WebElement menus = findElement(By.className("js-paddle-items"));
        List<WebElement> links = menus.findElements(By.tagName("li"));
        for(int i = 0; i < links.size(); i++){
            System.out.println((links.get(i).getText()));
        }
        //System.out.println(dataTable);
        List<String> list = links.stream().map(WebElement::getText).collect(Collectors.toList());
        //System.out.println(list);
        //System.out.println(list.equals(Arrays.asList(dataTable)));
        System.out.println("Expected: "+dataTable);
        System.out.println("Got: "+list);
        assertEquals(dataTable, links);
    }

    public void type() {

    }

    public boolean validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {
        return false;
    }

    public void pageFullyLoaded(){
       initWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(("shellmenu_0"))));
    }


    @Override
    public WebDriver initChrome() {
        return super.initChrome();
    }
}
