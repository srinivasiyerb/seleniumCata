package com.rl.test.selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class JCatalogTest extends MainDriver{
	
	public static void openBrowser(){
		File file = new File("src/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.get("http://tstjacalog.srinivasiyerb.cloudbees.net/");		
	}
	public static void closeBrowser(){
		driver.close();
	}
	public static void login(){
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@id='loginForm:username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginForm:password']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='loginForm:_id24")).click();
		driver.findElement(By.name("loginForm:_id24")).click();
		
	}
	 
	@Test
	public void categoryOne(){
		try{
		openBrowser();
		login();
		Category.categoryOne();
		closeBrowser();
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test
	public void categorytwo(){
		openBrowser();
		login();
		Category.categoryTwo();
		closeBrowser();
	}
	
	@Test
	public void categorythree(){
		openBrowser();
		login();
		Category.categoryThree();
		closeBrowser();
	}
	
	@Test
	public void categoryfour(){
		openBrowser();
		login();
		Category.categoryFour();
		closeBrowser();
		}
	
	@Test
	public void productList(){
		openBrowser();
		login();
		NewProduct.ProductList();
		closeBrowser();
	}
	
	@Test
	public void newProduct(){
		try{
		openBrowser();
		login();
		NewProduct.newproduct();
		closeBrowser();
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test
	public void contactus(){
		openBrowser();
		ContactUs.contactUs();
		closeBrowser();
	}
	
	@Test
	public void placeorder(){
		openBrowser();
		login();
		PlaceOrder.placeOrder();
		closeBrowser();
	}
	/*public static void main(String []args){
		JCatalogTest jct = new JCatalogTest();
		jct.categoryOne();
		jct.categorytwo();
		jct.categorythree();
		jct.categoryfour();
		jct.placeorder();
		jct.productList();
		jct.contactus();
		
	}*/
}
