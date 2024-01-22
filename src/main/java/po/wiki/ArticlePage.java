package po.wiki;
import base.method.BaseMethod;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethod {

    private static final By firstHeading = By.xpath("//h1[@id='firstHeading']/span");


    public String getHeadingOfArticle(){
        return  getText(firstHeading);
    }
}
