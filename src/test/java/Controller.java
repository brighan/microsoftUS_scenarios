import java.util.List;

public interface Controller {
    public void openMenu();
    public void openMenu(String text);
    public void getInfoFromWebElement(List<String> dataTable);
    public void getInfoFromWebElement();
    public void type();
    public void validateTexts(String expectedTextOnWabePage,
                              String actualTextOnWebPage);



}
