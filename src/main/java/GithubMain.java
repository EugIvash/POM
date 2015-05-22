import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Eugene on 22.05.2015.
 */
public class GithubMain
{
    WebDriver driver;
    @FindBy(linkText = "watch")
    WebElement homePageName;

    public GithubMain(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickWebElement()
    {
        homePageName.click();
    }
}
