package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    private final SelenideElement firstNameField = $(byId("customer_firstname"));
    private final SelenideElement lastNameField = $(byId("customer_lastname"));
    private final SelenideElement passwordField = $(byId("passwd"));
    private final SelenideElement registerButton = $(byId("submitAccount"));

    public void setFirstName(String firstName) {
        firstNameField.setValue(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.setValue(lastName);
    }

    public void setPassword(String password) {
        passwordField.setValue(password);
    }

    public MyAccountPage clickRegisterButton() {
        registerButton.click();
        return new MyAccountPage();
    }
}
