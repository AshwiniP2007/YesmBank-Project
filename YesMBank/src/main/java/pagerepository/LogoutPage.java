package pagerepository;

import org.openqa.selenium.By;

import businessfunction.BaseClass;

public class LogoutPage extends BaseClass

{
	static By logout=By.xpath("//*[@id=\"leftPanel\"]/ul/li[9]/a");

public static void clickLoutlink()
{
	driver.findElement(logout).click();
}
}