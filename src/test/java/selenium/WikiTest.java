package selenium;

import listeners.RetryAnalyzer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.po.wiki.ArticlePage;
import selenium.po.wiki.FirstGeographyPage;
import selenium.po.wiki.HistoryButtonPage;
import selenium.po.wiki.SearchPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class WikiTest extends BaseTest {

   // private static final By historyButton = By.xpath("//input[@ id='searchButton']");
   //private static final By searchInput = By.xpath("//input[@ id='ooui-php-1']");
   //private static final By article = By.xpath("//div[@class='mw-search-result-heading']/a[@data-serp-pos=\"0\"]");
   //private static final By firstHeading = By.xpath("//h1[@id='firstHeading']/span");
   //private static final By firstGeography= By.xpath("//span[@class='noviewer hauptseite-details']");
   //private static final By firstPortal= By.xpath("//span[@class='mw-page-title-main']");


    @Test(retryAnalyzer = RetryAnalyzer.class, groups = {"Regression"} )
    void shouldBeUbisoftArticle(String search){

        new HistoryButtonPage()
                .historyButtonClick();

        new SearchPage()
                .searchUbisoftArticle(search)
                .clickEnter()
                .clickOnUbisoftArticle();

        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft").isEqualTo("Ubisoft");

        //waiter(driver,historyButton).click();
        //waiter(driver, searchInput).sendKeys("Ubisoft");
        // waiter(driver,searchInput).sendKeys(Keys.ENTER);
        // waiter(driver, article).click();
        // String text = waiter(driver, firstHeading).getText();
        //  assertThat(text).as("The text must be Ubisoft").isEqualTo("Ubisoft");

    }

    @Test (groups = {"Smoke"})
    void shouldBeVisibleGeographyPage() {

        new FirstGeographyPage()
                .searchGeographyArticle();

        assertThat(new FirstGeographyPage().getFirstPortalOfArticle()).as("The text must be Inseln, Inselgruppen und Atolle").isEqualTo("Inseln, Inselgruppen und Atolle");


       //waiter(driver, firstGeography).click();
       //var text = waiter(driver,firstPortal).getText();
       //Assert.assertEquals("Inseln, Inselgruppen und Atolle", text);
    }

    @DataProvider(name = "search_provider")
    public Object[][] search_methods(){
        return new Object[][]{
                {"Ubisoft"},
                {"Bl"}
        };
    }

}

