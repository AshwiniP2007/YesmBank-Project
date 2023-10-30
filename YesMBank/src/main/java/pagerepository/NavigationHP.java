package pagerepository;

import org.openqa.selenium.By;

import businessfunction.BaseClass;

public class NavigationHP extends BaseClass
{
	static By usernName=By.name("username");
	static By password=By.name("password");
	static By loginbtn=By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	static By opennewAcc=By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
	static By customerlist=By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
	static By AccOverView=By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a");
	static By FundTransfer=By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a");
	static By BillPay=By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a");
	static By FindTrans=By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a");
	static By UpdateInfo=By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a");
	static By RequestLoan=By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a");
	
	public static void enterUserName(String Username)
	{
		driver.findElement(usernName).sendKeys("yesmbank");
	}
	public static void enterPassword (String Password)
	{
		driver.findElement(password).sendKeys("demo");
	}
	public static void clickLoginButton()
	{
		driver.findElement(loginbtn).click();
	}
	public static void OpenNewAcc()
	{
		driver.findElement(opennewAcc).click();
	}
	public static void mangCust()
	{
		driver.findElement(customerlist).click();
	}
	public static void AccOverView()
	{
		driver.findElement(AccOverView).click();
	}
	public static void FundTrans()
	{
		driver.findElement(FundTransfer).click();
	}
	public static void BillPay()
	{
		driver.findElement(BillPay).click();
	}
	public static void FindTrans()
	{
		driver.findElement(FindTrans).click();
	}
	public static void UpdateInfo()
	{
		driver.findElement(UpdateInfo).click();
	}
	public static void LoanRequest()
	{
		driver.findElement(RequestLoan).click();
	}
	
	
}
