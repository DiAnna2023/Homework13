package ui.selenium.selenide;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import ui.selenium.selenide.po.ArticlePage;
import ui.selenium.selenide.po.DragAndDropPage;
import ui.selenium.selenide.po.SearchPage;
import ui.selenium.selenide.po.SubmitAlertPage;


public class WikiTest extends BaseTest {

    @Test
    void shouldBeOpenedArticle(){


        new SearchPage()
                .historyButtonClick()
                .searchUbisoftArticle("Ubisoft")
                .clickEnter()
                .clickOnUbisoftArticle();

        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft: история изменений").isEqualTo("Ubisoft: история изменений");
    }

    @Test
    void submitAlerts() {
        open("https://demoqa.com/alerts");

        SubmitAlertPage page = new SubmitAlertPage();
        page.clickOnButton();
        page.acceptAlert();
    }

    @Test
    void dragAndDropTest() {
        open("https://demoqa.com/droppable");
        DragAndDropPage page = new DragAndDropPage();
        page.dragAndDrop();

    }

}
