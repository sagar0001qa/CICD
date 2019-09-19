package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {

	public static WebDriver driver=null;
	
	public void setup() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Sagar\\Software\\AllDrivers\\geckodriver.exe");
		Properties p= new Properties();
		FileInputStream file=new FileInputStream("E:\\Sagar\\Selenium-master\\Selenium-master\\global.properties");
		p.load(file);
		p.getProperty("browser");
		
		
		if(p.getProperty("browser").contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(p.getProperty("browser").contains("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "E:\\Sagar\\Software\\AllDrivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else 
		{
			
		}
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}
