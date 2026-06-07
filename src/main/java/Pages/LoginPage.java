package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class LoginPage {


    Helper helper = new Helper();

    private By userName = By.id("username");

    private By password = By.id("password");

    private By registerNow = By.xpath("//a[@data-link='Register now']");

    private By login = By.xpath("//a[@aria-label='Log in']");


    public void enterUserName(String userNameValue){

        helper.sendKeys(userName ,userNameValue);
    }

    public void login(){
        helper.click(login);
    }
    public void password( String  passwordvalue){
        helper.sendKeys(password,passwordvalue);
    }


}
