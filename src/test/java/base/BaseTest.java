package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.cart.CartPage;
import pages.checkout.CheckoutPage;
import pages.products.ProductsPage;
import pages.swaglab_home.SwagLabsHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPENED;

public class BaseTest {

    public BasePage basePage = new BasePage();
    public SwagLabsHomePage homePage = new SwagLabsHomePage();
    public ProductsPage productsPage = new ProductsPage();
    public CartPage cartPage = new CartPage();
    public CheckoutPage checkoutPage = new CheckoutPage();

    @AfterTest
    public void clearCookieAndLocalStorage () {
        if(CLEAR_COOKIES_AND_STORAGE){
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
            Selenide.executeJavaScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close (){
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPENED;
    }
}
