import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static org.testng.Assert.assertEquals;

import java.util.List;

import java.util.stream.Collectors;


public class WindowsHomePage extends SeleniumBase implements Controller {


    By searchIcon = By.id("search");
    By searchField = By.id("cli_shellHeaderSearchInput");
    By marketButton = By.id("R1MarketRedirect-close");
    By windowsOption = By.id("shellmenu_2");
    By firstElement = By.xpath("//*[@id=\"coreui-productplacement-30l7ywa_dg7gmgf0dst3\"]/div/a");

    public static String firstProduct;


   public WindowsHomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {
        click(windowsOption);
    }

    public void productsListing(){
        initWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#coreui-productplacement-30l7ywa > div.m-channel-placement > h2 > span")));
        WebElement product = findElement(By.cssSelector("#coreui-productplacement-30l7ywa > div.m-channel-placement > div > div"));
        maxScreen();
        List<WebElement> products = product.findElements(By.xpath("//span[@itemprop=\"price\"]"));
        System.out.println("All products in search result: ");
        for (WebElement prod : products) {
            System.out.println((prod.getText()));
        }
        System.out.println("Only First 3 of the search result: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((products.get(i).getText()));
        }
        this.firstProduct = products.get(0).getText();

        click(firstElement);

    }

    public void openMenu(String text) {
        //initWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(("shellmenu_0"))));
        click(searchIcon);
        type(searchField,text);
        click(searchIcon);
        initWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("R1MarketRedirect-close")));
        click(marketButton);
    }

    public void getInfoFromWebElement(List<String> dataTable) {
        WebElement menus = findElement(By.className("js-paddle-items"));
        List<WebElement> links = menus.findElements(By.tagName("li"));
        for (WebElement link : links) {
            System.out.println((link.getText()));
        }
        //System.out.println(dataTable);
        List<String> list = links.stream().map(WebElement::getText).collect(Collectors.toList());
        //System.out.println(list);
        //System.out.println(list.equals(Arrays.asList(dataTable)));
        System.out.println("Expected: "+dataTable);
        System.out.println("Got: "+list);
        try{
            assertEquals(dataTable, links);
        }catch(java.lang.AssertionError e){
            System.out.println("I couldn't delete the extra comma ( , ) from the List<WebElement>"+e);
        }

    }

    @Override
    public void getInfoFromWebElement() {

    }

    public void type() {

    }

    public void validateTexts(String expectedTextOnWabePage, String actualTextOnWebPage) {

    }

    public void pageFullyLoaded(){
       initWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(("shellmenu_0"))));
    }


    @Override
    public WebDriver initChrome() {
        return super.initChrome();
    }
}
