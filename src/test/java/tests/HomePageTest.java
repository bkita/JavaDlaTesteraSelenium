package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BestsellersItemsPage;
import utils.PageTitleUtils;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class HomePageTest extends BaseTest {

    private BestsellersItemsPage bestsellersItemsPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.HOME_PAGE_TITLE);

        bestsellersItemsPage = new BestsellersItemsPage(driver);
    }

    @Test
    public void shouldSeeItemsOnBestsellersPage() {
        bestsellersItemsPage.clickOnBestsellersButton();
        List<String> productNames = bestsellersItemsPage.getBestsellersNames();

        List<String> productsWithEmptyName = productNames.stream()
                .filter(el -> el.isEmpty())
                .collect(Collectors.toList());

        assertThat(productsWithEmptyName).isEmpty();
    }
}
