import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.get("https://de.wikipedia.org/wiki/Wikipedia:Hauptseite"); // открыла веб страницу
        //driver.manage().window().setSize(new Dimension(1920, 1080)); // размер экрана
        // driver.findElement(By.cssSelector("#ca-viewsource")).click();
        // driver.findElement(By.cssSelector("#n-Neuerartikel")).click();
        // driver.findElement(By.cssSelector("#pt-login")).click();

        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Amazon");
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);

        driver.quit();  // close- закрывает только браузер.  quit - закрывает браузер и драйвер

    }
}
