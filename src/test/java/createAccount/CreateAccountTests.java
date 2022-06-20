package createAccount;

import base.BaseTests;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class CreateAccountTests extends BaseTests {

    @Test
    public void createAccount() {
        var loginPage = homePage.clickSignInLink();
        loginPage.setRegisterEmailAddressField("stest.siarhei@outlook.com");
        var createAccount = loginPage.clickCreateAccountButton();
        createAccount.setFirstName("Siarhei");
        createAccount.setLastName("Filimonau");
        createAccount.setPassword("Test123");
        var myAccount = createAccount.clickRegisterButton();
        myAccount.getAccountCreatedAlert().shouldHave(text("Your account has been created"));
    }

}
