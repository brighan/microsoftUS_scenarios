import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class StepDefinitions {

    WebDriver driver;
    List<WebElement> menuContent;

    @Given("Web Application URL {string}")
    public void web_Application_URL(String URL) {
        // Write code here that turns the phrase above into concrete actions
        this.driver = new ChromeDriver();
        new WindowsHomePage(driver).visit(URL);
    }

    @When("Page has fully loaded")
    public void page_has_fully_loaded() {
        // Write code here that turns the phrase above into concrete actions
        new WindowsHomePage(driver).pageFullyLoaded();
    }

    @Then("Below menu items are displayed on top of screen and displayed in console")
    public void below_menu_items_are_displayed_on_top_of_screen_and_displayed_in_console(List<String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        new WindowsHomePage(driver).getInfoFromWebElement(dataTable);
    }

    @When("Searching for {string}")
    public void searching_for(String text) {
        // Write code here that turns the phrase above into concrete actions
        new WindowsHomePage(driver).openMenu(text);
    }

    @Then("Products are listed in the Result list")
    public void products_are_listed_in_the_Result_list() {
        // Write code here that turns the phrase above into concrete actions
        new WindowsHomePage(driver).productsListing();
    }

    @Then("Price of first Product in list matches Product details page")
    public void price_of_first_Product_in_list_matches_Product_details_page() {
        // Write code here that turns the phrase above into concrete actions
        new WindowsVisualStudioPage(driver).openMenu();

    }


    @Then("Total Amount is same than Unit Price * {int}")
    public void total_Amount_is_same_than_Unit_Price(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Windows menu is selected")
    public void windowsMenuIsSelected() {
        new WindowsHomePage(driver).openMenu();
    }

    @And("Windows {int} dropdown is selected")
    public void windowsDropdownIsSelected(int arg0) {
        new WindowsWindows10Page(driver).openMenu();
    }

    @Then("Dropdown content is displayed")
    public void dropdownContentIsDisplayed() {
        new WindowsWindows10Page(driver).getInfoFromWebElement();
    }

    @When("Adding {string} Product to Cart")
    public void addingProductToCart(String text) {
        new WindowsHomePage(driver).openMenu(text);
        new WindowsHomePage(driver).productsListing();
        new WindowsVisualStudioPage(driver).openMenu();
        new WindowsVisualStudioPage(driver).addCart();
        new WindowsCart(driver).checkOut();
    }
}
