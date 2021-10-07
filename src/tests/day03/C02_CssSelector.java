package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {
    //1. Bir class oluşturun : Locators_css
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
    // b. Locate email textbox
    // c. Locate password textbox ve
    // d. Locate signin button
    // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
    // i. Username : testtechproed@gmail.com
    // ii. Password : Test1234!

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        // b. Locate email textbox
        // c. Locate password textbox ve
        // d. Locate signin button

        WebElement email=driver.findElement(By.cssSelector(".form-control"));
        Thread.sleep(2000);
        email.sendKeys("testtechproed@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("#session_password"));
        password.sendKeys("Test1234!");



        //WebElement signIn=driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
        signIn.click();
/*
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signIn.click();*/
    }
}
