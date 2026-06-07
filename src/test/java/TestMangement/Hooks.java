package TestMangement;

import Base.BaseClass;
import Utils.Helper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {


    @Before
    public void setup(){

        BaseClass.browserSetup();

    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()) {

            BaseClass.takeScreenshot(scenario.getName());
        }
        BaseClass.closeBrowser();
    }
}
