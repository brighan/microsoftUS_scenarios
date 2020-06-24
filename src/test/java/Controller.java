public interface Controller {
    public void visit(String URL);
    public void openMenu();
    public void type();
    public boolean validateTexts(String expectedTextOnWabePage,
                                 String actualTextOnWebPage);



}
