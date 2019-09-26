package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\Actions\\drivers\\chromedriver_1.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement categ= driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	categ.click();

}
}//i[@class='hm-icon nav-sprite']