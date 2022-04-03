
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class XpathAxesLocators {
 
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cestasoft\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");

		//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver =new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		/**
		 * Solution 1 using Axes Locators
		 */
		WebElement e = driver.findElement(By.xpath("//a[normalize-space(text())='Thomas Cook (I)']/parent::td/following-sibling::td[2]"));
		try{
			if(e.isDisplayed())
			{
					String price =  e.getText();
					System.out.println("Stock Price" + price);
			}
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("Stock Name Not Exists"+ ex.getMessage());
		}
		
		/**
		 * Solution 2 using findElements()
		 */
		List<WebElement> trList = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]/a"));
		for(int i=0;i<trList.size();i++)
		{
			if(trList.get(i).getText().contains("Thomas Cook (I)"))
			{
				e = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"/td[3]"));
				System.out.println("Stock Price:::" + e.getText());
				break;
			}
		}
		
	}
}