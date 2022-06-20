package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CataloguePage {

    private final List<SelenideElement> itemImage = $$(byXpath("//img[@itemprop='image']"));
    private final SelenideElement itemsOnPage =
            $(byXpath("//h5[@itemprop='name']/a[@class='product-name']"));
    public List<SelenideElement> items;

    public CataloguePage() {
        this.items = $$(byXpath("//h5[@itemprop='name']/a[@class='product-name']"));
    }

    public ItemHoverBlock hoverOverItem(int imageNumber) {
        itemImage.get(imageNumber - 1).hover();
        return new ItemHoverBlock();
    }

    public class ItemHoverBlock {

        private final List<SelenideElement> addToCartLink = $$(byXpath("//span[text()='Add to cart']"));

        public void clickAddToCart(int itemNumber) {
            addToCartLink.get(itemNumber - 1).click();
        }
    }
}
