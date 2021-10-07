package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- Delete butonunun gorunur olmadigini test edin
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\OneDrive\\Dokumente\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin

        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(2000);
        addButonu.click();

        //bes farkli sekilde calistirabildik

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASS");
        }else
        {
            System.out.println("delete butonu testi FAILED");
        }
        //4- Delete tusuna basin
        Thread.sleep(2000);
        deleteButonu.click();
        //5- Delete butonunun gorunur olmadigini test edin

        //Eger butona bastigimizda html deki satir da siliniyorsa
        //driver in o elemente ulasmasi imkansiz oldugundan varligin test etmemiz mumkun olmaz.

        //Var olan bir elemnt bu sekilde silindikten sonra locate etmeye calisirsak
        //StaleElementReferenceException verir

        /*if (!deleteButonu.isDisplayed()){
            System.out.println("delete butonu gorunmuyor testi PASS");
        } else {
            System.out.println("delete butonu gorunmuyor testi FAILED");
        }*/

        driver.close();
    }
}
