package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();

            //Amazon.com a gidip java kelimesini aratip sonuc unu yazdirin,

        driver.get("https://www.amazon.com/");

        //<input type="text" id="twotabsearchtextbox" value=""
        // name="field-keywords" autocomplete="off" placeholder=""
        // class="nav-input nav-progressive-attribute"
        // dir="auto" tabindex="0" aria-label="Suche">

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));




        //iki yolla arattirabileriz.

        //aramaKutusu.sendKeys("java");

        //WebElement search=driver.findElement(By.id("nav-search-submit-button"));
        //search.click();

        //ya da


        aramaKutusu.sendKeys("java"+ Keys.ENTER);

        //seklinde de yapabiliriz.


        WebElement sonucYazisi=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());

        //web elementler obje oldugu icin direkt yazdirirlamazlar
        //elementin sahip oldugu yaziyi string olarak yazdirmak icin get.text
        // methodu kullanilir.
    }
}
