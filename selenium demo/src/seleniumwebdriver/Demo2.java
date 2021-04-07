package seleniumwebdriver;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//to test the web app
		System.setProperty("webdriver.chrome.driver","E:\\chrome version\\89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//to open a website
		driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        
        //to enter the user name and password
        WebElement username=driver.findElement(By.id("txtUsername"));
        
        //if the element is enabled then we should enter the name
        if(username.isEnabled())
        {
        	//It basically clears the data that is previously available
        	username.clear();
        	username.sendKeys("Admin");
        }
        
        //if username is displayed then enter the password and click on login button
        if(username.isDisplayed())
        {
        	 WebElement password=driver.findElement(By.id("txtPassword"));
        	 
        	 //clearing the password
        	 password.clear();
        	 
        	 //sending the password
        	 password.sendKeys("admin123");
        	 
        	 //clicking the login button
        	 driver.findElement(By.id("btnLogin")).click();
        	 Thread.sleep(3000);

        	 //to find how many links are there in a website
        	 List<WebElement> link= driver.findElements(By.tagName("a"));
        	 System.out.println(link.size());
        	 
        	 //i want to print the names of the webpage
        	 for(int i=0;i<link.size();i++)
        	 {
        		 System.out.println(link.get(i).getText());
        	 }
        	 
        }
        else
        {
        	System.out.println("Not displayed");
        }
	}

}
