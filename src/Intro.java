
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Intro {
	 
	private static final String NoOfPassengers = "2";
	private static final String BookingDay = "22";

	public static void main(String[] args) throws InterruptedException {
	
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cestasoft\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cestasoft\\eclipse-workspace\\SeleniumTraining\\Driver\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
      /*  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities); */
			
		
		driver.get("https://www.spicejet.com/#sourceautocomplete");
		//Thread.sleep(30);
		
		
		driver.findElement(By.cssSelector("div[placeholder='Enter airport code/city']")).click();
		driver.findElement(By.xpath("//div[contains(.,'BOM - Mumbai, India')]")).click();
		System.out.println("From selected");
		driver.findElement(By.xpath("//div[text()='BOM - Mumbai, India'] [1]")).click();

		//click on date element
        driver.findElement(By.xpath("//div[@class = \"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-13qz1uu\"] //div[@data-testid='search-renderDatesText'])[1]")).click();
        
        //click on actual day element 
		driver.findElement(By.xpath("(//div[starts-with(@class,'css-1dbjc4n r-1awozwy')])[22]")).click();
		
		
		//driver.findElement(By.xpath("(//div[starts-with(@class,'css-1dbjc4n r-1awozwy')])["+ day +"]")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-"+ BookingDay +"']")).click();
		
		//click on 1 Traveler drop down button
		driver.findElement(By.xpath("//div[contains(text(),'1 Traveller')]")).click();
		//selecting the number of passengers
		driver.findElement(By.cssSelector("div[data-testid='home-travellers-adult-"+ NoOfPassengers +"']")).click();
		
		//click on 'Done' button 
		driver.findElement(By.cssSelector("div[data-testid = 'home-travellers-action-btn']")).click();
		
		
		

 
        
		
    // WebElement element = driver.findElement(By.ID(//*[@id="app"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]		));
     // String elementText = element.getText ;
     
	}
	


















































































}