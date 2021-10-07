package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="E-Mail-Adresse oder
        // Telefonnummer" autofocus="1" aria-label="E-Mail-Adresse oder Telefonnummer">

        driver.get("https://www.facebook.com/");

//email texbox a ali yazdiralim
        WebElement mailTextBox= driver.findElement(By.id("email"));
        //sendkeys
        mailTextBox.sendKeys("aliseleniumcu@gmail.com");

        Thread.sleep(3000);

        mailTextBox.clear();

        Thread.sleep(3000);
        //*************************************************//

        //WebElement mailKutusuTagNameIle= driver.findElement(By.tagName("input"));

        //mailKutusuTagNameIle.sendKeys("velicosar@gmail.com");

        //input tag name ile 6 adet tag oldugu icin hangisine yazacagina
        //karar veremiyor.
        //webwlwmwnt i buldugu icin nosuch element exception vermez.


        //bulamaz cunku tagname den baska da var

        //*************************************************//

        //WebElement yanlisElement=driver.findElement(By.id("emailyanlis"));
        //yanlisElement.sendKeys("yanlis eleman");

        //nosuchElement exception varsa Locator umuzde hata vardir.

        //*************************************************//

        //giris butonuna tiklayalim

        WebElement girisButonu= driver.findElement(By.tagName("button"));
        //girisButonu.click();

        //dedigimizde oraya giris yapacaktir.

//************************************************
        System.out.println(girisButonu.isEnabled());
        //ulasilip ulasilmadigini kontrol ediyor

        //giris butonu ustte tiklandigi icin yok oldu o yuzden asagi aldik.

        girisButonu.click();

        driver.close();
    }
}
