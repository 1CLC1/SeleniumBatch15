package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1896456668%3A1678243345485348&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcvtAfgutS60y1LiH9Yxoz1ljUm_T7DigcXhb6fA36HEcEF2_lkX4-wsG48T-KIz7DIkbuwGw");

//        click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
//        click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

//        get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

//        get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();
//        print all the window handles
        for (String wh:windowHandles){
            System.out.println(wh);
//            check the title of the window to which our focus is right now
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Privacy Policy - Privacy & Terms - Google")){
                break;
            }
        }
//        to verify we switched to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);
    }
}
