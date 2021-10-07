package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev2 {
    public static void main(String[] args) throws InterruptedException {
        //1) Yeni bir class olusturalim. (Homework)
        //2) ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook" oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        //3) Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        //4) https://www.walmart.com/ sayfasina gidin.
        //5) Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        //6) Tekrar "facebook" sayfasina donun.
        //7) Sayfayi yenileyin.
        //8) Sayfayi tam sayfa (maximize) yapin.
        //9) Browser'i kapatin.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");

        String expectedTitle= "facebook";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(actualTitle)){
            System.out.println("PASSED");

        }else {
            System.out.println("FAILED");
            driver.getTitle();
        }
        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println(driver.getCurrentUrl());
        }
        //4) https://www.walmart.com/ sayfasina gidin.
        //5) Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        //6) Tekrar "facebook" sayfasina donun.
        //7) Sayfayi yenileyin.
        //8) Sayfayi tam sayfa (maximize) yapin.
        //9) Browser'i kapatin.

        driver.navigate().to("https://www.walmart.com/");

        String expectedUrl1="Walmart.com";
        String actualUrl1= driver.getCurrentUrl();

        if (actualUrl1.contains(expectedUrl1)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println(driver.getCurrentUrl());
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.close();




    }
}
