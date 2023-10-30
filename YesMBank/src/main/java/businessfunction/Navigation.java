package businessfunction;

import pagerepository.LoginPage;
import pagerepository.NavigationHP;

public class Navigation extends BaseClass
{
	public static void login(String uname, String passwd)
	{
		LoginPage.enterUserName("yesmbank");
		LoginPage.enterPassword("demo");
		LoginPage.clickLoginButton();
	}
	
	public static void navigation()
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
}
