import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eugene on 21.05.2015.
 */
public class TestPageObj
{
    WebDriver driver;
    GithubEnter objLogin;
    GithubMain objHomePage;

    @BeforeClass
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.get("https://github.com/login");
    }

    @AfterClass
    public void tearDown()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test(priority = 0)
    public void test_Home_Page_Appear_Correct()
    {
        objLogin = new GithubEnter(driver);
        objLogin.signeIn("login", "password");

        objHomePage = new GithubMain(driver);
        objHomePage.clickWebElement();
    }
}
