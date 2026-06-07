package Base;

import Utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static Pages.HomePage.appCokkies;
import static Utils.Helper.handleAlertIfPresent;

public class BaseClass {

    protected static WebDriver driver;

    public static void browserSetup() {

        String browser = ConfigReader.getProperty("browser");

        switch (browser.toLowerCase()) {
            case "chrome":

                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();
                System.out.println("chrome started");
break;
            case "edge":

             WebDriverManager.edgedriver().setup();

                driver = new EdgeDriver();
break;
            default:
                throw new RuntimeException("Browser Not supported:" + browser);

        }

        driver.manage().window().maximize();

        BaseClass.getDriver().get(ConfigReader.getProperty("url"));
        handleAlertIfPresent();
        appCokkies();
    }



    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }


    public static void takeScreenshot(String scenarioName) {


        String timeStamp=  String.valueOf(System.currentTimeMillis());

        File source =
                ((TakesScreenshot) BaseClass.getDriver())
                        .getScreenshotAs(OutputType.FILE);

        File destination =
                new File("Screenshots/"
                        + scenarioName + "_"
                        + timeStamp + ".png");

        try {

            Files.copy(
                    source.toPath(),
                    destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    }
