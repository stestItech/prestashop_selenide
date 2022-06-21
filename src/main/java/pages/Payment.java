package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Payment {

    private final SelenideElement noPaymentModulesAlert = $(byXpath("//p[text()='No payment modules have been installed.']"));

     public String getNoPaymentModuleAlertText() {

         return noPaymentModulesAlert.getText();
    }
}
