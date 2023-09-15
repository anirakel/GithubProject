import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class HomeworkforLesson22 {
    private WebDriver driver;

    @Test
    // GitHub login Test

    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Jermuk.1");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);
        driver.quit();

    }

    @Test
    // This method is validating that user cannot log in with empty password.
    public void EmptyPassword() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();
        WebElement errorElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);
        driver.quit();
    }

    // This method is validating that user cannot log in with wrong password.
    @Test
    public void WrongPassword() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("wrongpassword");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();
        WebElement errorElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);
        driver.quit();
    }
    //GitHub login with Firefox

    @Test
    public void loginTestFirefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Jermuk.1");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);

    }
    //This method is validating that user cannot log in with empty password.

    @Test
    public void loginTestEmptyPasswordFirefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorElement = driver.findElement(By.className("js-flash-alert"));//xndiry aystexic e
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);

    }

    //This method is validating that user cannot log in with wrong password.
    @Test
    public void loginTestWrongPassword() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("wrongpassword");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorElement = driver.findElement(By.className("js-flash-alert"));//xndiry aystexic e
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);
    }
}





