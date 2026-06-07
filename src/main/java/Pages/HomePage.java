package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class HomePage {

    static Helper helper = new Helper();

    private static By appCookies = By.id("onetrust-accept-btn-handler");


    public  static void appCokkies(){

        helper.click(appCookies);
    }

}
