package businessfunction;

import pagerepository.LoginPage;
import pagerepository.LogoutPage;

public class LoginLogoutUtils extends BaseClass
{
	public static void login(String uname, String passwd)
	{
		LoginPage.enterUserName(uname);
		LoginPage.enterPassword(passwd);
		LoginPage.clickLoginButton();
	}
	
	public static void logout()
	{
		LogoutPage.clickLoutlink();
	}
}
