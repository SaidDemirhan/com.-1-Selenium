package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    //Yeni bir class olusturalim : (VerifyURLTest)
    // Techpro ana sayfasina gidelim https://www.techproeducation.com/
    //Sayfa URL’inin www.techproeducation.com oldugunu dogrulayin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.techproeducation.com");

        String expectedUrl= "www.techproeducation.com";
        System.out.println("Gecerli url: "+driver.getCurrentUrl());

        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
     driver.close();
    }

}
