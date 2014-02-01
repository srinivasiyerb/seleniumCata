package com.relevance.lab.My_Frst_Maven;

//import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;

public class JCatalogTest extends MainDriver{
	
	
	
	public static void openBrowser(){
		Properties prop = new Properties();
		

    	try {
               
    		prop.load(new FileInputStream("config.properties"));
    		driver = new HtmlUnitDriver();
    		//String url=prop.getProperty("url");
    		//url = url.replace("\\", "");
    		//System.out.println(url);
    		driver.get(prop.getProperty("url"));
    		
               //get the property value and print it out
               /* System.out.println(prop.getProperty("url"));
                System.out.println(prop.getProperty("username"));
                System.out.println(prop.getProperty("password"));
    	*/	
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
				
	}
	
	public static void closeBrowser(){
		driver.close();
	}
	
	public static void login(){
		
		Properties prop = new Properties();
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@id='loginForm:username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='loginForm:password']")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.xpath("//input[@name='loginForm:_id24")).click();
		driver.findElement(By.name("loginForm:_id24")).click();
		}
	 
	
	@Test(priority = 0)
	public void Testlogin(){
		
		openBrowser();
		login();
		}
		
	@Test(priority = 1)
	public void TestproductList(){
		
		NewProduct.ProductList();
		
	}
	@Test(priority = 2)
	public void TestcategoryOne(){
		try{
		
		Category.categoryOne();
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test(priority = 3)
	public void Testcategorytwo(){
		openBrowser();
		login();
		Category.categoryTwo();
		}
	
	@Test(priority = 4)
	public void Testcategorythree(){
		
		Category.categoryThree();
		
	}
	
	@Test(priority = 5)
	public void Testcategoryfour(){
		
		Category.categoryFour();
		
		}
		
	@Test(priority = 6)
	public void Testcontactus(){
		
		ContactUs.contactUs();
		
	}
	
	@Test(priority = 7)
	public void Testplaceorder(){
		
		PlaceOrder.placeOrder();
		
	}
	
	@Test(priority = 8)
	public void TestloginFailed(){
		openBrowser();
		LoginFailed.loginFailed();
		
	}
	
	
	@Test(priority = 9)
	public void Testlogout(){
		Logout.logout();
		closeBrowser();
	}
	
	 
}
