package com.rl.test.selenium;

import org.openqa.selenium.By;

public class NewProduct extends MainDriver{
	
	public static void ProductList(){
				
		driver.findElement(By.xpath("//a[contains(text(),'product list')]")).click();
		driver.findElement(By.linkText("hme")).click();
	}

}
