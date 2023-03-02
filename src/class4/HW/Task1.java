package class4.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the checkbox    "click on this check box" is Selected
        if no Select the checkbox
        check again if the checkbox is Selected or not
        */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkbox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));

        boolean isSelectedCheckBox = checkbox.isSelected();
        System.out.println("the check box is selected "+isSelectedCheckBox);

        if (!isSelectedCheckBox){
            checkbox.click();
        }
        isSelectedCheckBox=checkbox.isSelected();
        System.out.println("the status of check box selection is "+isSelectedCheckBox);

        Thread.sleep(3000);

        driver.quit();
    }
}
