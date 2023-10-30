package businessfunction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
public static WebDriver driver=null;
public static void launchApplication()
{
	driver = new ChromeDriver();
	driver.get("http://qabaguru.com/yesmbank/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100000));
}
public static void closeapplication()
{
	driver.close();
	driver.quit();
}
}
