package Libraries;


public class Common extends Driver 
{
	public static void openbw()
	{
		try
		{
			
			Browser.OpenBrowser("firefox", "https://www.google.co.in/");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
	
}
