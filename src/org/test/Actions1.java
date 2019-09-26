package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\Actions\\drivers\\chromedriver_1.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement src1= driver.findElement(By.id("credit2"));
		WebElement dest1= driver.findElement(By.id("bank"));

		Actions act=new Actions(driver);
		act.dragAndDrop(src1, dest1).perform();
		
		WebElement src2= driver.findElement(By.id("fourth"));
		WebElement dest2= driver.findElement(By.id("amt7"));
		act.dragAndDrop(src2, dest2).perform();
		
		WebElement src3= driver.findElement(By.id("credit1"));
		WebElement dest3= driver.findElement(By.id("loan"));
		act.dragAndDrop(src3, dest3).perform();
		
		WebElement src4= driver.findElement(By.id("fourth"));
		WebElement dest4= driver.findElement(By.id("amt8"));
		act.dragAndDrop(src4, dest4).perform();
}
}