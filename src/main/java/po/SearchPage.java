package po;
import base.method.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends BaseMethod {

    private static final By searchInput = By.xpath("//input[@ id='ooui-php-1']");
    private static final By article = By.xpath("//div[@class='mw-search-result-heading']/a[@data-serp-pos=\"0\"]");

    public SearchPage searchUbisoftArticle (String text){
        send(searchInput, text);
        return this;
    }
    public SearchPage clickEnter(){
        send( searchInput, Keys.ENTER);
        return this;
    }
    public SearchPage clickOnUbisoftArticle(){
        click(article);
        return this;
    }

}
