package Libraries;

public class Common extends Driver {
	
	public static void openbrw()
	{
		try
		{
			Browser.OpenBrowser("chrome", "https://www.google.co.in/");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
