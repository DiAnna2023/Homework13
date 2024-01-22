import org.testng.annotations.Test;
import po.LoginPage;


public class LogPassTest extends BaseTest {

    //private static final By placeholderUserName = By.xpath("//input[@class='mr-sm-2 form-control']");
    //private static final By placeholderLogin = By.xpath("//input[@id='password']");
    //private static final By buttonLogin = By.xpath("//button[@class='btn btn-primary']");


    @Test (groups = {"Smoke"})
    void shouldBeAuthDemoqa(){
        LoginPage loginPage = new LoginPage()
                .username("LediDi")
                .password("@Autodoc1")
                .build();
        loginPage.clickEnter();
    }


    /*@Test(dataProvider = "search_true")
    void shouldBeTrue(String username, String password){

        waiter(driver,placeholderUserName).sendKeys(username);
        waiter(driver,placeholderLogin).sendKeys(password);
        waiter(driver,buttonLogin).sendKeys(Keys.ENTER);
    }
    @Test(dataProvider = "search_false")
    void shouldBeFalse(String username, String password){

        waiter(driver,placeholderUserName).sendKeys(username); // вводим имя
        waiter(driver,placeholderLogin).sendKeys(password);    // вводим пароль
        waiter(driver,buttonLogin).sendKeys(Keys.ENTER);       // нажимаем на кнопку ввойти
    }
    @DataProvider(name="search_true")
    public Object[][] search_methods() {
        return new Object[][]{
                {"LediDi", "@Autodoc1"}
        };
    }

    @DataProvider(name="search_false")
    public Object[][] search1_methods(){
        return new Object[][]{
                { "Йптл9_", "@_______j"},
                { "HBH755494", "!!!!!Jk_1"}
        };*/
    }
