package TestMangement;

import Base.BaseClass;

public class RunTest

{

    public static void main(String[] args) {

        BaseClass.browserSetup();

        BaseClass.getDriver()
                .get("https://www.emirates.com/");

        System.out.println(
                BaseClass.getDriver().getTitle());

        BaseClass.closeBrowser();
    }
}
