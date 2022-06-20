package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement registerEmailAddressField = $(byId("email_create"));
    private final SelenideElement createAccountButton = $(byId("SubmitCreate"));
    private final SelenideElement loginEmailAddressField = $(byId("email"));
    private final SelenideElement passwordField = $(byId("passwd"));
    private final SelenideElement signInButton = $(byId("SubmitLogin"));

    public void setRegisterEmailAddressField(String emailAddress) {
        registerEmailAddressField.setValue(emailAddress);
    }

    public CreateAccountPage clickCreateAccountButton() {
        createAccountButton.click();
        return new CreateAccountPage();
    }

    public void setLoginEmailAddressField(String emailAddress) {
        loginEmailAddressField.setValue(emailAddress);
    }

    public void setPasswordField(String password) {
        passwordField.setValue(password);
    }

    public MyAccountPage clickSignInButton() {
        signInButton.click();
        return new MyAccountPage();
    }
}
