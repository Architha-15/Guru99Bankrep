package com.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.qa.utils.TestUtils;
import com.qa.utils.WebEventListener;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fip = new FileInputStream("C:\\Users\\Annangi\\eclipse-workspace\\Guru99Bank\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fip);
			
		} catch (FileSystemNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void intialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Annangi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (browserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
			
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.Implicitly_TimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

}
