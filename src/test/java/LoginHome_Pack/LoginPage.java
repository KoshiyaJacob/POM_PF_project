package LoginHome_Pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage
{
    WebDriver driver;
    public LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    @FindBy(id = "UserName")
    private WebElement username;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public WebElement username(){return username;
    }
    public WebElement password(){return password;
    }

    public WebElement submitButton(){return submitButton;
    }
}
