package po;
import base.method.BaseMethod;
import org.openqa.selenium.By;

public class HistoryButtonPage extends BaseMethod {

    private static final By historyButton = By.xpath("//input[@ id='searchButton']");

    public HistoryButtonPage historyButtonClick(){
        click(historyButton);
        return this;
    }
}
