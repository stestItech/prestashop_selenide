package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {

    private final SelenideElement accountCreatedAlert = $(byClassName("alert-success"));
    private By welcomeText = By.className("info-account");

    public SelenideElement getAccountCreatedAlert() {
        return accountCreatedAlert;
    }

    //    public String getWelcomeMessageText() {
//        return driver.findElement(welcomeText).getText();
//    }
}
