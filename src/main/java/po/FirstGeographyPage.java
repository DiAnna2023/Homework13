package po;
import base.method.BaseMethod;
import org.openqa.selenium.By;

public class FirstGeographyPage extends BaseMethod {


    private static final By firstGeography= By.xpath("//span[@class='noviewer hauptseite-details']");
    private static final By firstPortal= By.xpath("//span[@class='mw-page-title-main']");

    public FirstGeographyPage searchGeographyArticle(){
        click(firstGeography);
        return this;
    }

    public String getFirstPortalOfArticle(){
        return  getText(firstPortal);
    }

}
