package selenide.po;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ArticlePage  {

    private final SelenideElement firstHeading = $x("//h1[@id='firstHeading']/span");


    public String getHeadingOfArticle(){
        return  firstHeading.shouldBe(visible).getText();
    }
}
