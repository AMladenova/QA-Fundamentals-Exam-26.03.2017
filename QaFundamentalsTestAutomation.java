import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mlade on 24/03/2017.
 */
public class QaFundamentalsTestAutomation {
    private WebDriver driver;

//before
    @Before
    public void SetUp(){

        this.driver = new FirefoxDriver();
    }

    @Test
    public void testLogIn_validCredentials_expectedNavigationToProfile(){
        this.driver.get("http://store.demoqa.com");

        WebElement loginLink = this.driver.findElement(By.xpath("/html/body/div[2]/div/div/header/div[2]/a"));
        loginLink.click();

        WebElement registrationField = this.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/aside/ul/li[1]/a"));
        registrationField.click();

        WebElement userName = this.driver.findElement(By.id("user_login"));
        userName.sendKeys("AMladenova");

        WebElement password = this.driver.findElement(By.id("user_email"));
        password.sendKeys("mladenova.anna@gmail.com");

        // I will quit with this code now as I don't know what "keys to send" in the "Please enter an answer in digits:" field.

        Assert.assertEquals();

    }
    @After
    public void tearDown(){
        this.driver.quit();
    }
}
