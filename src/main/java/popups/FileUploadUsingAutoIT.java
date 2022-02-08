package popups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class FileUploadUsingAutoIT {
    WebDriver driver;

    public void uploadFile() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/unlock_pdf");
        driver.findElement(By.xpath("//span[contains(text(), 'PDF file')]/parent::a")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D:\\Learning\\FileUploadScript.exe");
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        FileUploadUsingAutoIT obj = new FileUploadUsingAutoIT();
        obj.uploadFile();
    }
}
