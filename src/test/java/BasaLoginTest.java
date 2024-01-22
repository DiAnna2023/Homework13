import base.method.BaseMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasaLoginTest extends BaseMethod {

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver getDriver = null;
        getDriver.get("https://demoqa.com/login"); // открыла веб страницу
        getDriver.manage().window().setSize(new Dimension(1920, 1080)); // размер экрана

    }

    @AfterMethod
    void quit () {
        WebDriver getDriver=null;
        getDriver.manage().window().setSize(new Dimension(1920, 1080)); // размер экрана.quit();
    }

    public static WebElement waiter(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
