package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected static final String BASE_URL = "http://automationpractice.pl/index.php";

    protected WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
