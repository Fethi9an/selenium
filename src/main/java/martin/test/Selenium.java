package martin.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.smhi.com/%22");
                Thread.sleep(6 * 1000);
        WebElement box = driver.findElement(By.name("query"));
        box.sendKeys("Stockholm");
        box.submit();
        Thread.sleep(4*1000);
        WebElement header = driver.findElement(By.className("mainH1"));
        System.out.println(header.getText());

        WebElement button = driver.findElement(By.className("notificationButton"));
        button.click();
    }
}
