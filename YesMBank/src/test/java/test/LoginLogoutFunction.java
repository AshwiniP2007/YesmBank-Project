package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import businessfunction.BaseClass;
import businessfunction.LoginLogoutUtils;
import utilityfunctions.Excelutil;

public class LoginLogoutFunction 
{
	@BeforeSuite
	public void initialize()
	{
		BaseClass.launchApplication();
	}
	@AfterSuite
	public void finlize()
	{
		BaseClass.closeapplication();
	}
	
	@Test
	public void loginTest()
	{
		int rowcount=Excelutil.getRowCount();
		
		for(int i=1; i<=rowcount-1; i++)
		{
			LoginLogoutUtils.login(Excelutil.getCellValue(i, 0), Excelutil.getCellValue(i, 1));
			LoginLogoutUtils.logout();
		}
			
	}
}
