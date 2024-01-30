package Test_Pack;

import LoginHome_Pack.HomePage;
import LoginHome_Pack.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginHome_Test
{
    WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;
        driver.get("http://horse.industryconnect.io/Account/Login?ReturnUrl=%2f");

        LoginPage login = new LoginPage(driver);  //To access LoginPage
        login.username().sendKeys("Hari");
        login.password().sendKeys("123123");
        login.submitButton().click();
        System.out.println("The page contains : " + driver.findElement(By.xpath("//*[@id='logoutForm']/ul/li/a")).getText());

        HomePage home = new HomePage(driver);
        home.verificationText().click();
        home.logOut().click();
        System.out.println(driver.getCurrentUrl());



    }
    @AfterTest
    public void tearDown(){
        driver.close();

    }


}
