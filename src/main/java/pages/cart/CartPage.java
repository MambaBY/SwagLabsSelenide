package pages.cart;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class CartPage extends BasePage {


    private final SelenideElement cartPageTitle = $x("//span[@class='title']");
    private final SelenideElement removeBikeLightButton = $x("//button[@id='remove-sauce-labs-bike-light']");
    private final SelenideElement checkoutButton = $x("//button[@id='checkout']");

    public CartPage checkCartPageTitle() {
        cartPageTitle.shouldBe(Condition.visible);
        Assert.assertEquals(cartPageTitle.text(), "Your Cart");
        return this;
    }

    public CartPage removeProductFromCart() {
        removeBikeLightButton.click();
        return this;
    }

    public CartPage checkout() {
        checkoutButton.click();
        return this;
    }
}
