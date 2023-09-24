package pages.base;


import static com.codeborne.selenide.Selenide.open;
import static constants.Constants.Urls.HOME_PAGE;

public class BasePage {

    public void openHomePage() {
        open(HOME_PAGE);
    }




}
