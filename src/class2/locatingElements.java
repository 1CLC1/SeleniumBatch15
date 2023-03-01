package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Daryl",Keys.TAB,"Johns",Keys.TAB,"DarylJohns178@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("DarylJohns178@gmail.com", Keys.TAB,"DJ782JD",Keys.TAB,Keys.TAB,"Mar",Keys.TAB,"7",Keys.TAB,"1977");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.xpath("//[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
    }
}
