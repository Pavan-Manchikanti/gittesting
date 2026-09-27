import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://172.31.18.141:8080/testapp");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Login Page Displayed Successfully");
		System.out.println("Testing Passed");
		
		
		driver.close();		

	}

}
