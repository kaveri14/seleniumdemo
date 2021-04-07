package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//the first in selenium //i want to open the browser//i can open any browser//first i will start with chrome
		System.setProperty("webdriver.chrome.driver","E:\\chrome version\\89\\chromedriver_win32\\chromedriver.exe");
		//webdriver is an interface which contains the library of all the browsers
		//driver is a varibale 
		//new chromedriver : i am trying to open a new instance of chrome browser
		WebDriver driver = new ChromeDriver();
		//now i want to open a web site //https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//i want to maximize my screen 
		driver.manage().window().maximize();
		//before i login i want to capture the title of the web page 
		String beforetitle = driver.getTitle();
		//if i want to print the tile 
		System.out.println(beforetitle);
		
		//Enter the username 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//i want you guys to click on login button//please try
		driver.findElement(By.id("btnLogin")).click();
		//i am checking is the title of my page is same in all screen.
		String aftertitle = driver.getTitle();
		System.out.println(aftertitle);
		//when i want to comapre before and after in this case i should use if condition
		if(beforetitle.equals(aftertitle))
		{
			System.out.println("Title is same please logout");
			driver.findElement(By.id("welcome")).click();
			//i want to wait between two clicks
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			Thread.sleep(3000);
			//if i want to close the browser
			driver.close();
		}
		else
		{
			System.out.println("Title is not same");
			driver.close();
		}
		
	}

}
