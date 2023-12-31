import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.*;

public class GithubLoginTest {
    @Test
    public void ChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
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

    }


    @Test
    public void loginTestNegative1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Jermuk111");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorElement = driver.findElement(By.className("flash flash-full flash-error"));

        System.out.println(errorElement.getText());

        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

    }

    @Test
    public void loginTestNegative2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("  ");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //FirefoxDriver

    @Test
    public void FirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

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

    }


    @Test
    public void loginTestNegative1Firefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Jermuk111");
        WebElement loginElement = driver.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorElement = driver.findElement(By.className("flash flash-full flash-error"));//xndiry aystexic e
        System.out.println(errorElement.getText());

        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

    }

    @Test
    public void loginTestNegative2Firefox() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Jermuk.1");
        WebElement loginElement = driver.findElement(By.name("commit"));
        WebElement firstResult = new WebDriverWait(driver, (10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        loginElement.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        WebElement emailElement = driver.findElement(By.id("login_field"));
        emailElement.sendKeys("ani-arakelyan-1997@mail.ru");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Jermuk111");
        WebElement loginElement = driver.findElement(By.name("avatar avatar-user"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        WebElement errorElement = driver.findElement(By.className("//span[@class=\"Button-label\"]/img[@class=\"avatar circle\"]");
//        System.out.println(errorElement.getText());
//
//        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");


    }
}