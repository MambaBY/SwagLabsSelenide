package pages.swaglab_home;

import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;
import static constants.Constants.UserCredentials.LOGIN;
import static constants.Constants.UserCredentials.PASSWORD;

public class SwagLabsHomePage extends BasePage {

    public final SelenideElement loginInputField = $x("//input[@id='user-name']");
    public final SelenideElement passwordInputField = $x("//input[@id='password']");
    public final SelenideElement loginButton = $x("//input[@id='login-button']");

    public SwagLabsHomePage enterUserCredentials (){
        loginInputField.setValue(LOGIN);
        passwordInputField.setValue(PASSWORD);
        return this;
    }

    public SwagLabsHomePage clickLoginButton (){
        loginButton.click();
        return this;
    }
}
