package moveToElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse1{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
WebElement e = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
	Actions act = new Actions(driver);	
		act.moveToElement(e).perform();
		
	Thread.sleep(4000);	
WebElement e2 = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));		
	act.moveToElement(e2).perform();

	}
}
