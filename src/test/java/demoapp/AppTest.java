package demoapp;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    WebDriver d;
    @Test
    public void shouldAnswerWithTrue() throws MalformedURLException {
        d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.firefox());
        d.get("https://www.google.com");
        System.out.println(d.getTitle());

    }

    @Test
    public void shouldAnswerWithTrue1() throws MalformedURLException {
        d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
        d.get("https://www.google.com");
        System.out.println(d.getTitle());

    }
    @After
    public void m1(){
        d.quit();
    }
}
