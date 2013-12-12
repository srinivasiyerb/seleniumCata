package com.rl.test.selenium;

import org.openqa.selenium.By;

public class Logout extends MainDriver {

	public static void logout(){
	driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
	driver.findElement(By.xpath("(//a[contains(@href, '#')])[3]")).click();
	}
}
