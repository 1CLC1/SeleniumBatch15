package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        find the WebElement username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

//        to highlight the username box

//        1. declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
//        2.execute script
//        arguments[0].style.border='10px dotted pink'"    draw a box
        js.executeScript("arguments[0].style.border='5px dotted Green'",username);

//        find the WebElement
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        click the login button
        js.executeScript("arguments[0].click();",loginBtn);
    }
}
