package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myProject.MappingTest;

public class NewTest {
	private WebDriver driver;	
	public MappingTest mapfile;
	public String workingDir;
	public String browserName;
	
	  @BeforeTest
	  public void beforeTest() throws Exception  {
		  workingDir = System.getProperty("user.dir");	
		  browserName = System.getProperty("browser");
			System.out.println(browserName);
			if(browserName.equals("chrome")){
				System.out.println("Starting chrome driver");
				driver = new ChromeDriver();
			}
			else if (browserName.equals("firefox")) {
				 driver = new FirefoxDriver();  
			}
			else {
				  driver = new FirefoxDriver();  
			}
		  //mapfile = new MappingTest(workingDir + "\\web.properties");		  
	  }

  @Test
  public void firsttest()  throws Exception  {
	  	driver.get("http://www.google.com");  
		String title = driver.getTitle();
		
		//System.out.println(mapfile.getData("environment"));
		Assert.assertTrue(title.contains("Google")); 	
  }

  @AfterTest
  public void afterTest() {
		driver.quit();		
  }

}
