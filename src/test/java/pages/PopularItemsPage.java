package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class PopularItemsPage extends BasePage {

    public PopularItemsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#homefeatured .product-name")
    List<WebElement> productNames;

    public List<String> getProductNames() {
        return productNames.stream()
                .map(el -> el.getText().trim())
                .collect(Collectors.toList());
    }
}
