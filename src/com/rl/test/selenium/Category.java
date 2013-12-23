package com.rl.test.selenium;

import org.openqa.selenium.By;

public class Category extends MainDriver{
	
	public static void categoryOne(){
		driver.findElement(By.xpath("//form[@id='selectCategoryForm']/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/p/a")).click();
		driver.findElement(By.xpath("//form[@id='productListCustomerViewForm']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/a/img")).click();
		driver.findElement(By.xpath("//form[@id='productListCustomerViewForm']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[3]/a/img")).click();
		/*driver.findElement(By.linkText("Category Two")).click();
		driver.findElement(By.linkText("Category Three")).click();
		driver.findElement(By.linkText("Category Four")).click();
		driver.findElement(By.linkText("logout")).click();*/
	
	}

	public static void categoryTwo(){
		driver.findElement(By.xpath("//form[@id='selectCategoryForm']/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/p[2]/a")).click();
		driver.findElement(By.xpath("//form[@id='productListCustomerViewForm']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/a/img")).click();
		driver.findElement(By.xpath("//form[@id='productListCustomerViewForm']/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		
	}
	
	public static void categoryThree(){
		driver.findElement(By.xpath("//form[@id='selectCategoryForm']/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/p[3]/a")).click();
		driver.findElement(By.xpath("//form[@id='productListCustomerViewForm']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[3]/a/img")).click();
		driver.findElement(By.xpath("//form[@id='productListCustomerViewForm']/table/tbody/tr[2]/td/table/tbody/tr[3]/td/a/img")).click();
		
	}
	
	public static void categoryFour(){
		driver.findElement(By.xpath("//form[@id='selectCategoryForm']/table/tbody/tr[3]/td/table/tbody/tr/td[4]/div/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr/td/a[3]")).click();
		
	}
}
