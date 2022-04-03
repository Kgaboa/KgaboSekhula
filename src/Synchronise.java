import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
//import junit.framework.Assert;

public class Synchronise {



public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cestasoft\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		
		//define webdriver 
		WebDriver driver=new ChromeDriver();
		
		//Implicit Wait demonstration
		//driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
		
		//Explicit wait demonstration
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		
		//array declarations and assignment
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		//Open a page
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//
		Thread.sleep(3000);
		
		//calling a method to add items to cart
		addItems(driver,itemsNeeded);
		
		//complete the checkout  
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();	
		
		//Thread.sleep(8000);
		// 
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		
		//Thread.sleep(8000);
		
		//apply the explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
				
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//apply the explicit wait		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	
		
		//check if explicit wait works
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
		System.out.println("Test Passed");

}


//Method declaration
public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0;i<products.size();i++)
	
	{
	
	//Brocolli - 1 Kg
	
	//Brocolli,    1 kg
	
	String[] name=products.get(i).getText().split("-");
	
	String formattedName=name[0].trim();
	
	
	//format it to get actual vegetable name	
	//convert array into array list for easy search	
	//check whether name you extracted is present in arrayList or not-
	
	List<String> itemsNeededList = Arrays.asList(itemsNeeded);
	
	if(itemsNeededList.contains(formattedName))
	
	{
	
		j++;
		
		//click on Add to cart	
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		if(j==itemsNeeded.length)
			
			{
			
				break;
			
			}
			
	}
	
	}
	
}	

}