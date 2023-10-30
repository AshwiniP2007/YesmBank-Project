package businessfunction;

import pagerepository.DeteleDetails;

public class DeleteData extends BaseClass
{
	public static void deletecustomer()
	{
		DeteleDetails.CustomerList();
		DeteleDetails.DeleteData();
		//DeteleDetails.ConfirmDelete();
	}
}
