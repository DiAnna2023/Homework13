package po;
import base.method.BaseMethod;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethod {


    private String username;
    private String password;

    private static final By usernameField = By.xpath("//input[@class='mr-sm-2 form-control']");
    private static final By passwordField = By.xpath("//input[@id='password']");
    private static final By enter = By.xpath("//button[@class='btn btn-primary']");

    public LoginPage enterUsername(String username){
        this.username = username;
        send(usernameField, username);
        return  this;
    }
    public LoginPage enterPassword(String password){
        this.password = password;
        send(passwordField, password);
        return  this;
    }

    public void clickEnter(){
        click(enter);
    }

}
