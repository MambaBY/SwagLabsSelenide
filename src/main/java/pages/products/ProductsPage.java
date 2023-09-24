package pages.products;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage extends BasePage {

    private final SelenideElement productPageTitle = $x("//span[@class='title']");
    public final SelenideElement addToCartBackpack = $x("//button[@id='add-to-cart-sauce-labs-backpack']");
    public final SelenideElement addToCartBikeLight= $x("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public final SelenideElement addToCartJacket = $x("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public final SelenideElement productCounter = $x("//span[@class='shopping_cart_badge']");
    public final SelenideElement productCartLink = $x("//a[@class='shopping_cart_link']");

    public ProductsPage checkProductPageTitle() {
        productPageTitle.shouldBe(Condition.visible);
        Assert.assertEquals(productPageTitle.text(), "Products");
        return this;
    }

    public ProductsPage addProductsToCart() {
        addToCartBackpack.click();
        addToCartBikeLight.click();
        addToCartJacket.click();
        return this;
    }

    public ProductsPage checkCountAddedProducts(){
        productCounter.shouldBe(Condition.visible);
        Assert.assertEquals(productCounter.text(), "3");
        return this;
    }

    public ProductsPage clickOnProdactCartLink() {
        productCartLink.click();
        return this;
    }
}