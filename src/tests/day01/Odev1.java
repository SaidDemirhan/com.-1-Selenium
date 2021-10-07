package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {

    //1) Yeni bir class olusturun. (TekrarTesti)
    //2) Youtube web sayfasina gidin ve sayfa baslıginin "youtube" olup olmadıgini doğrulayın (verify), eger degilse dogru basligi(Actual Title) konsolda yazdirin.
    //3) Sayfa URL'sinin "youtube" icerip icermedigini (contains) dogrulayin, icermiyorsa dogru URL'yi yazdirin.
    //4) Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    //5) Youtube sayfasina geri dönün.
    //6) RefrSayfayi yenileyin.
    //7) Amazon sayfasina dönün.
    //8) Sayfayi tamsayfa yapin.
    //9) Ardından sayfa basliginin "Amazon" icerip icermedigini (contains) dogrulayin, Yoksa dogru basligi(Actual Title) yazdirin.
    //10) Sayfa URL'sinin https://www.amazon.com/ olup olmadigini dogrulayin, degilse dogru URL'yi yazdirin.
    //11) Sayfayi kapatin.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");

        String expectedTitle= "youtube";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println(driver.getTitle());
        }

        String expectedUrl= "youtube";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println(driver.getCurrentUrl());
        }

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.manage().window().maximize();

        String expectedTitle1= "Amazon";
        String actualTitle1= driver.getTitle();

        if (actualTitle1.contains(expectedTitle1)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");

            System.out.println(driver.getTitle());
        }

        String expectedUrl1="https://www.amazon.com/";
        String actualUrl1= driver.getCurrentUrl();

        if (actualUrl1.equals(expectedUrl1))
        {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println(driver.getCurrentUrl());
        }
        driver.close();
    }
}
