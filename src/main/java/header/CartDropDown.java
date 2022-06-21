package header;

import com.codeborne.selenide.SelenideElement;
import pages.ShoppingCartSummary;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartDropDown {

    private final SelenideElement cartDropDown = $(byXpath("//a[@title='View my shopping cart']"));
    private final SelenideElement checkoutButton =
            $(byXpath("//a[@id='button_order_cart']/span[contains(text(),'Proceed to checkout')]"));

    public void hoverOverCartDropDown() {
        cartDropDown.hover();
    }

    public ShoppingCartSummary clickCartDropDown() {
        cartDropDown.click();
        return new ShoppingCartSummary();
    }

    public ShoppingCartSummary clickCheckoutButton() {
        checkoutButton.click();
        return new ShoppingCartSummary();
    }
}
