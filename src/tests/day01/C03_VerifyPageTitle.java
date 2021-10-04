package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    //Yeni bir Class olusturalim. (VerifyTitle)
    //Amazon ana sayfasina gidelim . https://www.amazon.com/
    //Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();

        System.out.println("aktuel title : "+driver.getTitle());


        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title beklenen deger ile ayni, test PASS");
        }else {
            System.out.println("Title beklenenden farkli test FAILED");

        }

        driver.close();


    }
}
