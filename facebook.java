package com.facebook.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\osman\\Desktop\\mystuff\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	System.out.println("Driver opening up the url in browser");	
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	driver.get("https://www.facebook.com/");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	System.out.println("Entering Username and Password");
    	driver.manage().window().maximize();
    	driver.findElement(By.id("email")).sendKeys("osmanbox1@gmail.com");
    	driver.findElement(By.id("pass")).sendKeys("123456");
    	Thread.sleep(9000);
    	driver.findElement(By.name("login")).click();
    	System.out.println("Logging in");
    	Thread.sleep(9000);
    
    }
}

