package selenium.base.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Table {

    WebElement elementTable;

    public Table(WebElement elementTable) {
        this.elementTable = elementTable;
    }

    // метод получает все строки в таблице

    public List<WebElement> getRows(){
        List<WebElement> rows = elementTable.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
        rows.remove(0); // удаление первой строки где обычно находятся название строк
        return rows;
    }
    //метод которы будет вытаскивать строки из таблицы, этим и получаться будут колонки
    public List<List<WebElement>>getRowsAndColumns(){
        List<WebElement> rows= getRows();
        List<List<WebElement>> rowsAndColumns = new ArrayList<>();
        for (WebElement row: rows){
            List<WebElement> rowWithColumn = row.findElements(By.xpath("./td"));
            rowsAndColumns.add(rowWithColumn);
        }
        return  rowsAndColumns;

    }

    public String getValue(int rowNumber, int columnNumber){
        List<List<WebElement>> rowWithColumns = getRowsAndColumns();
        return rowWithColumns.get(rowNumber -1).get(columnNumber -1 ).getText();
    }


}
