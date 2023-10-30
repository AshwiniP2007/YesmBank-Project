package pagerepository;

import org.openqa.selenium.By;

import businessfunction.BaseClass;

public class DeteleDetails extends BaseClass 
{
	static By customerlist=By.xpath("<a href=\"/managecustomer.htm\">Customer List</a>");
	static By delete=By.xpath("//*[@id=\"Managecustomers\"]/tbody/tr[5]/td[4]/button");
	
	public static void CustomerList()
	{
		driver.findElement(customerlist).click();
	}
	public static void DeleteData()
	{
		driver.findElement(delete).click();
	}
}
