package js;
import base.driver.DriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

    public class JavaScriptMethods {
        public JavaScriptMethods() {
        }

        public static void jsClick(WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor)DriverInit.getDriver();
            js.executeScript("arguments[0].click();", new Object[]{element});
        }

        public static void jsScroll(WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor)DriverInit.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
        }
    }
