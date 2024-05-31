package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserConfig {
	
	public RemoteWebDriver driver;
	
	@BeforeTest
	public void browserSetup() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("browserVersion", "124");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "aaswal346");
		ltOptions.put("accessKey", "SOrCctaSHNnXNUPotfCN8AQv0mvkcUuHky9TPCSfyB6p45bVAb");
		ltOptions.put("visual", true);
		ltOptions.put("video", true);
		ltOptions.put("platformName", "Windows 10");
		ltOptions.put("network", true);
		ltOptions.put("build", "Demo");
		ltOptions.put("project", "LambdaTestPractice");
		System.out.println("hello world");
		capabilities.setCapability("LT:Options", ltOptions);
		System.out.println("hello world2");
		
		try {
			driver=new RemoteWebDriver(new URL("https://" + ltOptions.get("username") + ":" + ltOptions.get("accessKey") + "@hub.lambdatest.com/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello world3");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
