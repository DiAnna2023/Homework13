package selenium.po.demoqa;
import selenium.base.driver.DriverInit;
import selenium.base.method.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends BaseMethod {
    private static By rightClickBtn = By.xpath("//button[@id='rightClickBtn']");
    private static By doubleClickBtn = By.xpath("//button[@id='doubleClickBtn']");

    public ButtonsPage doubleClick(){
        WebElement button = waiter(doubleClickBtn);
        new Actions(DriverInit.getDriver()).doubleClick(button).build().perform();
        return this;
    }

    public  ButtonsPage callContextMenu(){
        WebElement button = waiter(rightClickBtn);
        new Actions(DriverInit.getDriver()).moveToElement(button).build().perform();
        new Actions(DriverInit.getDriver()).contextClick(button).build().perform();
        return this;
    }
}
