package selenide.po;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {

    public SelenideElement historyButton(){return $x("//input[@ id='searchButton']");}

    public SelenideElement searchInput(){
        return $x("//input[@ id='ooui-php-1']");
    }

    public SelenideElement article(){
        return $x("//div[@class='mw-search-result-heading']/a[@data-serp-pos=\"0\"]");
    }

    public SearchPage historyButtonClick(){
        historyButton().shouldBe(visible).click();
        return page(SearchPage.class);
    }
    public SearchPage searchUbisoftArticle(String text){
        searchInput().shouldBe(visible).sendKeys(text);
        return page(SearchPage.class);
    }
    public SearchPage clickEnter(){
        searchInput().shouldBe(visible).sendKeys(Keys.ENTER);
        return page(SearchPage.class);
    }
    public void clickOnUbisoftArticle(){
        article().shouldBe(visible, enabled).click();
    }

}
