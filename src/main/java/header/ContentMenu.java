package header;

import com.codeborne.selenide.SelenideElement;
import pages.CataloguePage;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ContentMenu {

    private final SelenideElement womenMenuLink = $(byXpath("//a[text()='Women']"));

    public void hoverOverWomenMenu() {
        womenMenuLink.hover();
    }

    public CataloguePage clickSubmenuLink(String linkTitle) {
        $(byLinkText(linkTitle)).click();
        return new CataloguePage();
    }
}
