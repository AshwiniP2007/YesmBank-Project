package pagerepository;

import org.openqa.selenium.By;

import businessfunction.BaseClass;

public class LoginPage extends BaseClass
{
	static By usernName=By.name("username");
	static By password=By.name("password");
	static By loginbtn=By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	
	public static void enterUserName(String Username)
	{
		driver.findElement(usernName).sendKeys(Username);
	}
	public static void enterPassword (String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	public static void clickLoginButton()
	{
		driver.findElement(loginbtn).click();
	}
}
