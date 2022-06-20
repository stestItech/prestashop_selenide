package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Address {

    private final SelenideElement proceedToCheckoutButton =
            $(byXpath("//button/span[contains(text(),'Proceed to checkout')]"));

    public void clickCheckout() {
        proceedToCheckoutButton.click();
    }
}
