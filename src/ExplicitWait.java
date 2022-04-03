
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class ExplicitWait {
 
   /*
    * Scenario 3:
      ==========
      Upload the JarFile : C:\\SeleniumArtifacts\\SeleniumLatestVersion\\selenium-java-3.141.59\\client-combined-3.141.59.jar
      wait for alert is Present
    */
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, AWTException
	{
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cestasoft\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		//driver.get("https://www.zamzar.com/");
		driver.get("https://www.twitter.com");
		driver.manage().window().maximize();
		
		//fileUpload("C:\\Users\\Cestasoft\\Downloads\\dropdown.txt");
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50, 1));
	    System.out.println("done waiting");
	  //  Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2")).click();
		
		//Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
	//	String alertMsgText = alrt.getText();
		
	//	System.out.println("Alert Msg::" + alertMsgText);
		
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
			
		    System.out.println("alert was not present");
		else
		    System.out.println("alert was present");
		//alrt.dismiss();

	}
	
	/*public static void fileUpload(String filePath) throws InterruptedException, AWTException
	{
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		StringSelection clipBoardPath = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);
		Thread.sleep(5000);
		//Robot Class
		Robot robot = new Robot();
		//Keyboard Action : CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		//Keyboard Action : Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	}*/
}