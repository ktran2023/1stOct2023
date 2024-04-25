package variousConcepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// What is Java associated with?
	//Classes
	//Objects

public class LaunchBrowser {
// What is Class associated with?

	//Statements
	//Variables //Attribute //Field
	//Methods
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scn = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[text()='About']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.get("https://www.w3schools.com/java/java_conditions.asp");
	}
}
