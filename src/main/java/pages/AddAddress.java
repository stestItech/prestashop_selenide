package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddAddress {

    private final SelenideElement firstNameField = $(byId("firstname"));
    private final SelenideElement lastNameField = $(byId("lastname"));
    private final SelenideElement companyField = $(byId("company"));
    private final SelenideElement address1Field = $(byId("address1"));
    private final SelenideElement address2Field = $(byId("address2"));
    private final SelenideElement postCodeField = $(byId("postcode"));
    private final SelenideElement cityField = $(byId("city"));
    private final SelenideElement countryDropDown = $(byId("id_country"));
    private final SelenideElement homePhoneField = $(byId("phone"));
    private final SelenideElement mobilePhoneFiled = $(byId("phone_mobile"));
    private final SelenideElement stateDropDown = $(byId("id_state"));
    private final SelenideElement addressTitleField = $(byId("alias"));
    private final SelenideElement saveButton = $(byXpath("//span[contains(text(),'Save')]"));

    public void setFirstName(String firstName) {
        firstNameField.setValue(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.setValue(lastName);
    }

    public void setCompany(String companyName) {
        companyField.setValue(companyName);
    }

    public void setAddress1(String address1) {
        address1Field.setValue(address1);
    }

    public void setAddress2(String address2) {
        address2Field.setValue(address2);
    }

    public void setPostCode(String postCode) {
        postCodeField.setValue(postCode);
    }

    public void setCity(String city) {
        cityField.setValue(city);
    }

    public void selectCountry(int number) {
        countryDropDown.selectOption(number - 1);
    }

    public void setHomePhone(String homePhone) {
        homePhoneField.setValue(homePhone);
    }

    public void setMobilePhone(String mobilePhone) {
        mobilePhoneFiled.setValue(mobilePhone);
    }

    public void selectState(int number) {
        stateDropDown.selectOption(number - 1);
    }

    public void setAddressTitle(String addressTitle) {
        addressTitleField.setValue(addressTitle);
    }

    public Address clickSave() {
        saveButton.click();
        return new Address();
    }

//    public boolean isAddAddressPageOpened() {
//        return firstNameField.isDisplayed();
//    }
}
