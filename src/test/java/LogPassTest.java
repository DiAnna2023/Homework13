import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LogPassTest {

    private static final By placeholderUserName = By.xpath("//input[@class='mr-sm-2 form-control']");
    private static final By placeholderLogin = By.xpath("//input[@id='password']");

    private static final By buttonLogin = By.xpath("//button[@class='btn btn-primary']");
    private WebDriver driver = null;

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/login"); // открыла веб страницу
        driver.manage().window().setSize(new Dimension(1920, 1080)); // размер экрана

    }

    @Test(dataProvider = "search_true")
    void shouldBeTrue(String username, String password){

        waiter(driver,placeholderUserName).sendKeys(username);
        waiter(driver,placeholderLogin).sendKeys(password);
        waiter(driver,buttonLogin).sendKeys(Keys.ENTER);

    }

    @Test(dataProvider = "search_false")
    void shouldBeFalse(String username, String password){

        waiter(driver,placeholderUserName).sendKeys(username); // вводим имя
        waiter(driver,placeholderLogin).sendKeys(password);    // вводим пароль
        waiter(driver,buttonLogin).sendKeys(Keys.ENTER);       // нажимаем на кнопку ввойти

    }

    @DataProvider(name="search_true")
    public Object[][] search_methods() {
        return new Object[][]{
                {"LediDi", "@Autodoc1"}
        };
    }


    @DataProvider(name="search_false")
    public Object[][] search1_methods(){
        return new Object[][]{
                { "Йптл9_", "@_______j"},
                { "HBH755494", "!!!!!Jk_1"}
        };
    }

   @AfterMethod
     void quit () {
          driver.quit();
     }

        public static WebElement waiter(WebDriver driver, By locator) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
    }