import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface Controller {
    public void openMenu();
    public void getInfoFromWebElement(List<String> dataTable);
    public void type();
    public boolean validateTexts(String expectedTextOnWabePage,
                                 String actualTextOnWebPage);



}
