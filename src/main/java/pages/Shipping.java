package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Shipping {

    private final SelenideElement agreeTermsCheckBox = $(byXpath("//span/input[@id='cgv']"));
    private final SelenideElement proceedToCheckoutButton =
            $(byXpath("//button/span[contains(text(),'Proceed to checkout')]"));

    public void SelectAgreeTerms() {
        agreeTermsCheckBox.click();
    }

    public Payment clickCheckout() {
        proceedToCheckoutButton.click();
        return new Payment();
    }
}
