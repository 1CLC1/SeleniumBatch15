package class3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

    /*
    HW
    use xpath to complete this
    goto http://practice.syntaxtechs.net/basic-first-form-demo.php
    enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL
    */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(" http://practice.syntaxtechs.net/basic-first-form-demo.php ");

        WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));

        message.sendKeys("Message entered using xpath");

        driver.findElement(By.xpath("//button[@type='button']")).click();

        WebElement valueA = driver.findElement(By.xpath("//input[@id='sum1']"));

        valueA.sendKeys("77");

        WebElement valueB = driver.findElement(By.xpath("//input[@id='sum2']"));

        valueB.sendKeys("53");

        WebElement getTotal = driver.findElement(By.xpath("//button[@onclick='return total()']"));

        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();

        System.out.println(getTotal.getAttribute("type"));

    }
}
