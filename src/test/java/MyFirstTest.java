
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;


public class MyFirstTest {
    @Test
    public void testFirefox(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

//    @Test
//    public void testFirefox(){
//        System.setProperty("webdrive.gecko.driver", "src/test/resources/geckodriver.exe");
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://www.mozilla.org/en-US/firefox/?utm_medium=firefox-desktop&utm_source=bookmarks-toolbar&utm_campaign=new-users&utm_content=-global");
//    }

    @Test
    public void loginTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement emailElement=driver.findElement(By.id("email"));
        emailElement.sendKeys("ani@gmail.com");
        WebElement  password= driver.findElement(By.id("pass"));
        password.sendKeys("aaaa");
        WebElement loginElement=driver.findElement(By.name("login"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorElement=driver.findElement(By.className("_9ay7"));
        System.out.println(errorElement.getText());

        Assert.assertEquals(errorElement.getText(),"The email you entered isn’t connected to an account. Find your account and log in.");


    }

}
