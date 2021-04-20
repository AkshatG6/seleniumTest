import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 Thread.sleep(2000);
		 
		 WebElement txtbox_email = driver.findElement(By.id("identifierId"));
		 txtbox_email.sendKeys("akshatgandhi6")
		 Thread.sleep(2000);
		 driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		 String at = driver.getTitle();
		 String et = "Gmail";
		 if(at.equals(et)) {
			 System.out.println("Test successful");
			 
		 }
		 else 
			 System.out.println("Test failed");
		 Thread.sleep(2000);
		 driver.close();		 
	}
}
