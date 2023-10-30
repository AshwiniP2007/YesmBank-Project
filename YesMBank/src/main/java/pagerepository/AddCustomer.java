package pagerepository;

import org.openqa.selenium.By;

import businessfunction.BaseClass;

public class AddCustomer extends BaseClass
{
	static By customerlist=By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
	static By addcustomer=By.xpath("//*[@id=\"rightPanel\"]/div/div/button");
	static By fisrtname=By.id("customer.firstName");
	static By lastname=By.id("customer.lastName");
	static By address=By.id("customer.address.street");
	static By city=By.id("customer.address.city");
	static By State=By.id("customer.address.state");
	static By Zipcode=By.id("customer.address.zipCode");
	static By Phone=By.id("customer.phoneNumber");
	static By SSN=By.id("customer.ssn");
	static By Uname=By.xpath("//*[@id=\"customer.username\"]");
	static By pswd=By.id("customer.password");
	static By confirmpsd=By.id("repeatedPassword");
	static By register=By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
	
	
	public static void customerlist()
	{
		driver.findElement(customerlist).click();
	}
	public static void addcustomer()
	{
		driver.findElement(addcustomer).click();
	}
	public static void firstname()
	{
		driver.findElement(fisrtname).sendKeys("Mike");
	}
	public static void lastname()
	{
		driver.findElement(lastname).sendKeys("Davis");
	}
	public static void address()
	{
		driver.findElement(address).sendKeys("9841 Blue Mountain");
	}
	public static void city()
	{
		driver.findElement(city).sendKeys("Atlanta");
	}
	public static void state()
	{
		driver.findElement(State).sendKeys("Gerogia");
	}
	public static void zipcode()
	{
		driver.findElement(Zipcode).sendKeys("30034");
	}
	public static void phone()
	{
		driver.findElement(Phone).sendKeys("456 786 4598");
	}
	public static void SSN()
	{
		driver.findElement(SSN).sendKeys("4578965");
	}
	public static void uname()
	{
		driver.findElement(Uname).sendKeys("MikeDevis");
	}
	public static void pswd()
	{
		driver.findElement(pswd).sendKeys("test");
	}
	public static void cpswd()
	{
		driver.findElement(confirmpsd).sendKeys("test");
	}
	public static void register()
	{
		driver.findElement(register).click();
	}
}
