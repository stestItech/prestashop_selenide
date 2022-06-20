package goods;

import base.BaseTests;
import header.CartDropDown;
import header.ContentMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddAddress;
import pages.Shipping;

public class BlouseTests extends BaseTests {

    @Test
    public void addAddress() {
        var login = homePage.clickSignInLink();
        login.setLoginEmailAddressField("stest.siarhei@outlook.com");
        login.setPasswordField("Test123");
        login.clickSignInButton();

        ContentMenu contentMenu = new ContentMenu();
        contentMenu.hoverOverWomenMenu();
        var cataloguePage = contentMenu.clickSubmenuLink("Blouses");

        cataloguePage.hoverOverItem(3).clickAddToCart(3);

        CartDropDown cartDropDown = new CartDropDown();
        cartDropDown.clickCartDropDown().clickProceedButton();
//        cartDropDown.hoverOverCartDropDown();
//        cartDropDown.clickCheckoutButton().clickProceedButton();

        AddAddress address = new AddAddress();
        address.setFirstName("John");
        address.setLastName("Johnson");
        address.setCompany("Google");
        address.setAddress1("Central street, 20/40");
        address.setAddress2("West District");
        address.setPostCode("55656");
        address.setCity("New York");
        address.selectCountry(1);
        address.setHomePhone("+375222555555");
        address.setMobilePhone("+375294444444");
        address.selectState(5);
        address.setAddressTitle("Some Address Title");
        address.clickSave();
    }

    @Test
    public void addItemToCart() {
        var login = homePage.clickSignInLink();
        login.setLoginEmailAddressField("stest.siarhei@outlook.com");
        login.setPasswordField("Test123");
        login.clickSignInButton();

        ContentMenu contentMenu = new ContentMenu();
        contentMenu.hoverOverWomenMenu();
        var cataloguePage = contentMenu.clickSubmenuLink("Blouses");

        cataloguePage.hoverOverItem(3).clickAddToCart(3);

        CartDropDown cartDropDown = new CartDropDown();
        cartDropDown.clickCartDropDown().clickProceedButton().clickCheckout();
//        cartDropDown.hoverOverCartDropDown();
//        cartDropDown.clickCheckoutButton().clickProceedButton().clickCheckout();

        Shipping shipping = new Shipping();
        shipping.SelectAgreeTerms();
        String a = shipping.clickCheckout().getNoPaymentModuleAlertText();
        Assert.assertTrue(a.contains("No payment modules have been installed."));
    }

    @Test
    public void checkBlouseItems() {
        var login = homePage.clickSignInLink();
        login.setLoginEmailAddressField("stest.siarhei@outlook.com");
        login.setPasswordField("Test123");
        login.clickSignInButton();

        ContentMenu contentMenu = new ContentMenu();
        contentMenu.hoverOverWomenMenu();
        var cataloguePage = contentMenu.clickSubmenuLink("Blouses");
        int numberOfItems = cataloguePage.items.size();
        int numberOfBlouseItems = 0;
        for (int i = 0; i < numberOfItems; i++) {
            String itemName = cataloguePage.items.get(i).getText();
            if (itemName.contains("Blouse") || itemName.contains("blouse") || itemName.contains("Shirt") || itemName.contains("top")) {
                numberOfBlouseItems++;
            }
        }
        Assert.assertEquals(numberOfBlouseItems, numberOfItems, "Not all items are blouses");
    }
}
