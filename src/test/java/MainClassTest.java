import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MainClassTest {

   private static final By historyButton = By.xpath("//input[@ id='searchButton']");
   private static final By searchInput = By.xpath("//input[@ id='ooui-php-1']");
   private static final By article = By.xpath("//div[@class='mw-search-result-heading']/a[@data-serp-pos=\"0\"]");
   private static final By firstHeading = By.xpath("//h1[@id='firstHeading']/span");
   private static final By firstGeography= By.xpath("//span[@class='noviewer hauptseite-details']");
   private static final By firstPortal= By.xpath("//span[@class='mw-page-title-main']");
   private WebDriver driver = null;

   @BeforeMethod
   void setUp() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();

       driver.get("https://de.wikipedia.org/wiki/Wikipedia:Hauptseite"); // открыла веб страницу
       driver.manage().window().setSize(new Dimension(1920, 1080)); // размер экрана

   }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    void shouldBeUbisoftArticle(){


        waiter(driver,historyButton).click();
        waiter(driver, searchInput).sendKeys("Ubisoft");
        waiter(driver,searchInput).sendKeys(Keys.ENTER);
        waiter(driver, article).click();
        String text = waiter(driver, firstHeading).getText();

        Assert.assertEquals("Ubisoft", text);



    }
    @Test
    void shouldBeVisibleGeographyPage() {
       waiter(driver, firstGeography).click();
       var text = waiter(driver,firstPortal).getText();
       Assert.assertEquals("Inseln, Inselgruppen und Atolle", text);
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

