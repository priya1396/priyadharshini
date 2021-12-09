package org.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AdactinHotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARI\\eclipse-workspace\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("priyadharshini13");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Priya@1303");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement loc = driver.findElement(By.name("location"));
		Select s=new Select(loc);
		s.selectByIndex(5);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomtype);
		s1.selectByIndex(2);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s3=new Select(roomno);
		s3.selectByIndex(4);
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult);
		s4.selectByIndex(3);
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5=new Select(child);
		s5.selectByIndex(1);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement selecthotel = driver.findElement(By.id("radiobutton_2"));
		selecthotel.click();
		WebElement contin =driver.findElement(By.id("continue"));
	    contin.click();
	    WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("priyadharshini");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("mahalingam");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("226 mainroad","kannapanagar","chennai");
		WebElement creditno = driver.findElement(By.id("cc_num"));
		creditno.sendKeys("4929145632891568");
		WebElement credittype= driver.findElement(By.id("cc_type"));
		Select s6=new Select(credittype);
		s6.selectByIndex(2);
		WebElement expmonth= driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(expmonth);
		s7.selectByIndex(3);
		WebElement expyear= driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(expyear);
		s8.selectByIndex(5);
		WebElement cvvnumber = driver.findElement(By.id("cc_cvv"));
		cvvnumber.sendKeys("4561");
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(7000);
		WebElement orderno = driver.findElement(By.name("order_no"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object obj=js.executeScript("return arguments[0].getAttribute('value')",orderno);
		String ss=(String)obj;
		System.out.println(ss);
		
		
		
		
		
		
		
		
	}

}
