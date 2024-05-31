package demo;

import org.testng.annotations.Test;

public class FrameHandling extends BrowserConfig{
	
	
	
	@Test
	public void frameInteraction()
	{
		driver.get("https://letcode.in/frame");
		
		System.out.println("Page Title is: "+driver.getTitle());
		
	}

}
