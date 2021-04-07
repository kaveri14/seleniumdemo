package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome version\\89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
                               driver.manage().window().maximize();

                               WebElement username=driver.findElement(By.id("userName"));
                               username.sendKeys("sunil");
		
                                WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("sunil");
        
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		
		WebElement DD=driver.findElement(By.name("fromPort"));
		Select sel=new Select(DD);
		sel.selectByValue("Paris");
		List<WebElement> DDvalue = sel.getOptions();
		System.out.println(DDvalue.size());
		for(int i=0;i<DDvalue.size();i++)
		{
			String value=DDvalue.get(i).getText();
			System.out.println(value);
		}
		
		WebElement DD1=driver.findElement(By.name("toPort"));
		Select sel1=new Select(DD1);
		sel1.selectByValue("London");
		driver.findElement(By.name("findFlights")).click();
		driver.close();
	}

}
