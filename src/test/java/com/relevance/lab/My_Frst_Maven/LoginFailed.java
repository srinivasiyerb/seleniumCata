package com.relevance.lab.My_Frst_Maven;

import org.openqa.selenium.By;

public class LoginFailed extends MainDriver {

	public static void loginFailed(){
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
                driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@id='loginForm:username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginForm:password']")).sendKeys("pass");
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
	}
}
