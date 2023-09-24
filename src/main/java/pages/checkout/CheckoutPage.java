package pages.checkout;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage extends BasePage {


    public final SelenideElement checkoutPageTitle = $x("//span[@class='title']");

    public CheckoutPage checCheckoutPageTitle() {
        checkoutPageTitle.shouldBe(Condition.visible);
        Assert.assertEquals(checkoutPageTitle.text(), "Checkout: Your Information");
        return this;
    }
}
