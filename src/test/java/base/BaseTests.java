package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTests {

    protected HomePage homePage;

//    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.screenshots = false;
//        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        goHome();
        homePage = new HomePage();
    }

    @BeforeTest
    public void goHome() {
        setUp();
        open("http://prestashop.qatestlab.com.ua/en/");
//        driver.manage().window().maximize();
//        driver.get("http://prestashop.qatestlab.com.ua/en/");
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
