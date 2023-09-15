import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SeleniumActions {
    private WebDriver driver;

    SeleniumActions(WebDriver driver) {

        this.driver = driver;
    }

    public boolean isDisplayed(WebElement e, int timeout) {
       try {
           new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(e));

       }catch (Exception anun){
           return false;
       }
return true;
    }

    public boolean isDisplayed(By  e, int timeout) {
        try {
            new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf((WebElement)e));

        }catch (Exception anun){
            return false;
        }
        return true;
    }

    public boolean isClickabale(By  e, int timeout) {
        try {
            new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(e));

        }catch (Exception anun){
            return false;
        }
        return true;
    }

    public boolean isClickable(WebElement  e, int timeout) {
        try {
            new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(e));

        }catch (Exception anun){
            return false;
        }
        return true;
    }


}


