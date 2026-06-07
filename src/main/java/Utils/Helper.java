package Utils;

import Base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Helper {

    public void click(By locator){

        getElement(locator).click();
    }

    public void sendKeys(By locator, String value) {

        getElement(locator).sendKeys(value);
    }

    public WebElement getElement(By locator){

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(20000));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public List<WebElement> getElements(By locator){

        return BaseClass.getDriver()
                .findElements(locator);
    }

    public static void handleAlertIfPresent() {

        try {

            Alert alert = BaseClass.getDriver()
                    .switchTo()
                    .alert();

            alert.accept();

            System.out.println("Alert Accepted");

        } catch (NoAlertPresentException e) {

            System.out.println("No Alert Present");
        }
    }

    public  void selectValueFromDropdown(By locater , String country){

        List<WebElement> allElements = BaseClass.getDriver().findElements(locater);

        for(WebElement element : allElements){

            if(element.getText()==country){

                element.click();
            }
        }
    }
}
