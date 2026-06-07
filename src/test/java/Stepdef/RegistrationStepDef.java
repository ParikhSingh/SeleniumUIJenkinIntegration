package Stepdef;

import Pages.RegistorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegistrationStepDef {

RegistorPage registorPage = new RegistorPage();

    @Given("I click On Join Now button")
    public void iClickOnJoinNowButton() {

        registorPage.registerNow();

         }

    @Given("User Enter the Register Now details")
    public void userEnterTheRegisterNowDetails(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String, String> userData = data.get(0);

        registorPage.enterEmail(userData.get("email"));
        registorPage.selectTitle(userData.get("title"));
        registorPage.enterFirstName(userData.get("firstName"));
        registorPage.enterLastName(userData.get("lastName"));
        registorPage.enterPassword(userData.get("password"));
        registorPage.selectBirthDate("day");
        registorPage.selectMonth(userData.get("month"));
//        registorPage.selectYear(userData.get("year"));
//        registorPage.selectCountry(userData.get("country"));
//        registorPage.selectLanguage(userData.get("language"));
//        registorPage.selectCountryCode(userData.get("code"));

    }
}
