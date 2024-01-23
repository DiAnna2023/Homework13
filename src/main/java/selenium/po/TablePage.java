package selenium.po;
import selenium.base.table.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static selenium.base.driver.DriverInit.getDriver;


public class TablePage {

    private final By table = By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']");

    public String tableValue(int rowIndex, int columnIndex){
        WebElement elementTable = (WebElement) getDriver().findElement(table);
        return  new Table(elementTable).getValue(rowIndex,columnIndex);
    }
}
