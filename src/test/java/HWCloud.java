import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class HWCloud {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "oauth-salimbahouth-41726");
        capabilities.setCapability("accessKey", "31ac2bf2-e169-4dd7-acd6-047da18f76b9");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "97.0");
        capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
        capabilities.setCapability("name", "homework-test");
        driver = new RemoteWebDriver(new URL("https://oauth-salimbahouth-41726:31ac2bf2-e169-4dd7-acd6-047da18f76b9@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
    }

    @Test
    public void simpleTest(){
        driver.get("https://translate.google.com");
        driver.findElement(By.tagName("textarea")).sendKeys("שלום עולם");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}