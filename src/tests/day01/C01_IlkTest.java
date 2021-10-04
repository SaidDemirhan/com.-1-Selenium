package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");//verilen adrese görurur

        System.out.println("su anki url: "+driver.getCurrentUrl()); //url adresini getirir.

        System.out.println("su anki baslik: "+driver.getTitle());//basligini getirir.

        driver.manage().window().maximize();//yönetebiliyoruz ve burda pencereyi tam ekren yaptik.

        Thread.sleep(3000);//ne kadar bekletmek istiyorsak mili saniye cinsinden yaziyoruz.

        driver.navigate().to("https://www.techproeducation.com");    //rota olusturarak yeni adrese göturur.
        Thread.sleep(3000);

        driver.navigate().back();// geldigimiz siteye geri doner
        Thread.sleep(2000);

        driver.navigate().forward();// geri gittigimiz siteden ileriye gider
        Thread.sleep(2000);

        driver.navigate().refresh();//sayfayi yeniler
        Thread.sleep(2000);

        //driver.quit();//butun acilan browser lari kapatir

        driver.close(); // secece aktif olan browser i kapatir


    }
}
