package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class RegistorPage {


    Helper helper = new Helper();

    private By registerNow = By.xpath("//a[@data-link='Register now']");

    private By login = By.xpath("//a[@aria-label='Log in']");

    private By enterEmail = By.id("registration-email_label");

    private By titile = By.id("title_label");

    private By firstName = By.id("firstname_label");

    private By lastName = By.id("lastname_label");

    private By password = By.id("password_label");

    private By birthDate=  By.id("dateofbirth-month");

    private By selectDay = By.xpath("//*[@aria-labelledby='group_country_1']//button");

    private By birthMonth=  By.id("dateofbirth-month");

    private By selectMonth = By.xpath(" //li[contains(@id,'dateofbirth-month-autocomplete')]");


    public void login(){
        helper.click(login);
    }

    public void registerNow(){
        helper.click(registerNow);
    }

    public void enterEmail(String emailId){
        helper.sendKeys(enterEmail , emailId);

    }

    public void userTitle(){
        helper.click(registerNow);
    }

    public void selectTitle(String title){

        helper.click(titile);

        By selectTitle = By.xpath("//*[text()='" + title + "']");

        helper.click(selectTitle);
    }

    public void enterFirstName(String fName){

        helper.sendKeys(firstName, fName);
    }

    public void enterLastName(String lName){

        helper.sendKeys(lastName, lName);
    }

    public void enterPassword(String pwd){

        helper.sendKeys(password, pwd);
    }

    public void selectBirthDate(String day){
        helper.click(birthDate);
        helper.selectValueFromDropdown(selectDay,day);

    }

    public void selectMonth(String month){
        helper.click(birthMonth);

       helper.selectValueFromDropdown(selectMonth, month);
    }

//    public void selectCountry(String country){
//
//       helper.selectValueFromDropdown(countryDropdown, country);
//    }
}


//Locaters
//
//Email Id : id="registration-email_label"
//Title  id =title_label
//Title drop down -//*[@class='auto-suggest__list']/button/div//*[text()='Mrs']
//
//id="firstname_label"
//id="lastname_label"
//Id =password_label/
//
//id="dateofbirth-day-label"
//
////li[contains(@id,'dateofbirth-day-autocomplete')]/li/span[text()='1']
//
//id="dateofbirth-month"
//
////li[contains(@id,'dateofbirth-month-autocomplete')]/li/span[text()='1']
//
//id="country_label"
//
//Country //*[@aria-labelledby='group_country_1']//*[text()='Canada’].  // //*[@aria-labelledby='group_country_1']/button
//
//Code — //*[@aria-labelledby='group_country-code_0']/button
