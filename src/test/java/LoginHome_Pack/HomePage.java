package LoginHome_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    @FindBy(xpath = "//*[@id='logoutForm']/ul/li/a")
    private WebElement verificationText;

    @FindBy(xpath = "//a[contains(text(),'Log off')]")
    private WebElement logOut;

    public WebElement verificationText() {
        return verificationText;
    }
    public WebElement logOut(){return logOut;
    }
}
