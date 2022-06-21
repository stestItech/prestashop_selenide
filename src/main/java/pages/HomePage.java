package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement signInLink = $(byText("Sign in"));

    public LoginPage clickSignInLink() {
        signInLink.click();
        return new LoginPage();
    }

}
