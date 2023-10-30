package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import businessfunction.BaseClass;
import pagerepository.AddCustomer;
import pagerepository.LoginPage;
import pagerepository.LogoutPage;
import pagerepository.NavigationHP;
import pagerepository.DeteleDetails;

public class NavigationAddCustomer
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
		@BeforeMethod
		public void login()
		{
			LoginPage.enterUserName("yesmbank");
			LoginPage.enterPassword("demo");
			LoginPage.clickLoginButton();
		}
		@AfterMethod
		public void logout()
		{
			LogoutPage.clickLoutlink();
		}
		@Test
		public void Navigation()
		{
			NavigationHP.OpenNewAcc();
			NavigationHP.mangCust();
			NavigationHP.AccOverView();
			NavigationHP.FundTrans();
			NavigationHP.BillPay();
			NavigationHP.FindTrans();
			NavigationHP.UpdateInfo();
			NavigationHP.LoanRequest();
		}
		@Test
		public void NewCustomer()
		{
			AddCustomer.customerlist();
			AddCustomer.addcustomer();
			AddCustomer.firstname();
			AddCustomer.lastname();
			AddCustomer.address();
			AddCustomer.city();
			AddCustomer.state();
			AddCustomer.zipcode();
			AddCustomer.phone();
			AddCustomer.SSN();
			AddCustomer.uname();
			AddCustomer.pswd();
			AddCustomer.cpswd();
			AddCustomer.register();
		}
		/*@Test
		public void DeleteCustomer()
		{
			DeteleDetails.CustomerList();
			DeteleDetails.DeleteData();
			DeteleDetails.ConfirmDelete();
			
		}*/
}
