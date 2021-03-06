package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartSummary {

    private final SelenideElement proceedToCheckoutButton =
            $(byXpath("//span[text()='Proceed to checkout']"));

    public Address clickProceedButton() {
        proceedToCheckoutButton.click();
        return new Address();
    }
}
