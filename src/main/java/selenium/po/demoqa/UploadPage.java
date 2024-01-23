package selenium.po.demoqa;
import selenium.base.method.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadPage extends BaseMethod {
    private static By uploadBtn = By.xpath("//input[@id='uploadFile']");

    public UploadPage uploadFile (){
        WebElement button = waiter(uploadBtn);
        button.sendKeys("C:\\Users\\diank\\IdeaProjects\\untitled15\\src\\file");
        return this;
    }
}
