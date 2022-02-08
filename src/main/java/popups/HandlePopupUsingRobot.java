package popups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HandlePopupUsingRobot {
    WebDriver driver;
    Robot robot;

    public static void main(String[] args) throws AWTException, InterruptedException {
        HandlePopupUsingRobot obj = new HandlePopupUsingRobot();
        obj.handleDownloadDialog();
    }

    private void handleDownloadDialog() throws AWTException, InterruptedException {
        Robot robot = new Robot();

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://git-scm.com/book/en/v2");

        driver.findElement(By.cssSelector("img[src*='pdf']")).click();
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }
}
