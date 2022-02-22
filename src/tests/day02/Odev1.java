package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Odev1 {
    //1. Bir class oluşturun : AmazonSearchTest

    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

    // a.google web sayfasına gidin. https://www. amazon.com/
    // b. Search(ara) “city bike”
    // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    // d. “Shopping” e tıklayın.
    // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");
        // b. Search(ara) “city bike”
        WebElement arama= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        arama.sendKeys("city bike"+ Keys.ENTER);
        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        Thread.sleep(2000);
        WebElement sonucSayisi= driver.findElement(By.xpath("//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("sonuc sayisi: "+ sonucSayisi.getText());

        // d. “Shopping” e tıklayın.
        Thread.sleep(2000);
        WebElement cityRad =driver.findElement(By.xpath("//*[@id=\"n/3403981\"]/span/a/span"));
        cityRad.click();

        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebElement secilen=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
        Thread.sleep(2000);
        secilen.click();

        Thread.sleep(3000);

        driver.close();
    }
}
