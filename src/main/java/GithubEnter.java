import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Eugene on 22.05.2015.
 */
public class GithubEnter
{
    WebDriver driver;
    @FindBy(id = "login_field")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "input[type=\"submit\"]")
    WebElement login;

    public GithubEnter(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setUserName(String strUserName)
    {
        userName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword)
    {
        password.sendKeys(strPassword);
    }

    public void clickLogin()
    {
        login.click();
    }

    public void signeIn(String strUserName,String strPasword)
    {
        this.setUserName(strUserName);
        this.setPassword(strPasword);
        this.clickLogin();
    }
}
