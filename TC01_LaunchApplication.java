package day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TC01_LaunchApplication {

	public static void main(String[] args)
		
		{
			/*
			Test case
			---------
			1) Launch Chrome browser
			2) Open URL: https://cloudberrystore.services/
			3) Validate page title = "Your store of fun"
			4) Close browser
			*/

		// 1) Launch Chrome browser
		
		WebDriver driver = new ChromeDriver(); //Launch Browser
		
		// 2) Open URL: https://cloudberrystore.services/
		driver.get("https://cloudberrystore.services/"); // open your application
		driver.manage().window().maximize(); // maximize the window
		
		// 3) Validate page title = "Your store of fun"
		
		String title = driver.getTitle();
		// System.out.println(title);
		
		if (title.equals("Your store of fun"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// 4) Close browser
		driver.quit();
	}

}
