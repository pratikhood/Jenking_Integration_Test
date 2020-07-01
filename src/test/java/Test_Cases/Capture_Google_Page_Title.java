package Test_Cases;

import org.testng.annotations.Test;

import Base.Base_Class;
import junit.framework.Assert;

public class Capture_Google_Page_Title extends Base_Class
{

	@Test
	public void capture_title()
	{
		String title = driver.getTitle();
		
		System.out.println("Title is "+title);
		
		Assert.assertEquals("Google", title);
	}
}
