import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;				
import org.junit.Test;

//import net.jodah.failsafe.internal.util.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cestasoft\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://spicejet.com");

		//assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
        Assertions.assertFalse(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
				
	    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//		Assertions.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected())

	}

	private static void assertTrue(boolean selected) {
		// TODO Auto-generated method stub
		
	}

	private static WebElement assertFalse(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}

}
