package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com/");

        Thread.sleep(2000);

        // b. Sign in butonuna basin
        WebElement secenek=driver.findElement(By.className("navbar-toggler-icon"));
        secenek.click();

        Thread.sleep(3000);

        WebElement giris=driver.findElement(By.id("sign-in"));
//<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        // c. email textbox,password textbox, and signin button
        // elementlerini locate ediniz..
        giris.click();
        Thread.sleep(3000);

        WebElement emailtextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTexBox=driver.findElement(By.id("session_password"));
        WebElement signInButonu= driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç
        // (sign in)buttonunu tıklayın:

        emailtextBox.sendKeys("testtechproed@gmail.com");
        // i. Username : testtechproed@gmail.com
        passwordTexBox.sendKeys("Test1234!"+ Keys.ENTER);
        // ii. Password : Test1234!
        //signInButonu.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu
        // dogrulayin(verify).

        WebElement secenek2=driver.findElement(By.className("navbar-toggler-icon"));
        secenek2.click();

        Thread.sleep(2000);

        WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));

        if (dogruKullanici.equals("testtechproed@gmail.com")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini
        // ( displayed) doğrulayin(verify).


        Thread.sleep(3000);
        WebElement adresesLinki= driver.findElement(By.linkText("Addresses"));
        WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));

        if (adresesLinki.isDisplayed()){
            System.out.println("adrsss linki görünüyor,test PASS");
        }else {
            System.out.println("adrsss linki görünmüyor,test FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linkAdedi= driver.findElements(By.tagName("a"));
        System.out.println(linkAdedi.size());

        //linklerin yazilarini yazdiralim
        //elimizdeki listedeki webelemnleri forloop veya for each loop ile yazdirabiliriz.
        //forloop un basi sonu belli
        //tüm elementler yazdirilacaksa bu durumda for each loop daha kullanislidir.

        int sira=1;
        for (WebElement each:linkAdedi
             ) {
            System.out.println(sira+each.getText());
            sira++;
        }

        driver.close();
    }
}
