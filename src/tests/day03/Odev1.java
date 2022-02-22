package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {
    //amazon a git
    //java kelimesini arat
    //kac sonuc geldi
    //gelen sonuclardan 4. ve
    //7. nin isimlerini yazdirin.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //amazon a git
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        //java kelimesini arat
        WebElement aramaKutusu = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        aramaKutusu.sendKeys("java"+ Keys.ENTER);
        //kac sonuc geldi
        Thread.sleep(2000);
        WebElement sonucSayisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Bulunan eleman sayisi: "+sonucSayisi.getText()+" java");
        //gelen sonuclardan 4. ve

        WebElement kitap4= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[1]/h2/a/span"));
        System.out.println("Dorduncu kitap : "+kitap4.getText());
        //7. nin isimlerini yazdirin
        WebElement kitap7= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[7]/div/span/div/div/div[2]/div[1]/h2/a/span"));
        System.out.println("Yedinci Kitap"+kitap7.getText());

        driver.close();
    }
}
