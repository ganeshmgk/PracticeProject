import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class TeachMeSelenium {
	
	public static void flash(WebElement element, WebDriver driver) {
		JavaScriptExecutor js=(JavaScriptExecutor)driver;
		String bgColor=element.getCssValue("background-color");
		String borderColor=element.getCssValue("border-color");
		String color=element.getCssValue("color");
		System.out.println(bgColor);
		System.out.println(borderColor);
		System.out.println(color);
	}
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "D://JarsDrivers//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://cosmocode.io/");
		driver.get("https://register.freecrm.com/register/");
		Thread.sleep(5000);
		//driver.findElement(By.name("q")).click();
		
		WebElement ele=driver.findElement(By.name("email"));
		ele.sendKeys("ganesh");
		flash(ele,driver);
		
		Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(By.xpath("//div/p[contains(text(),'Latest stable version ')]"))).build().perform();
		try{
			System.out.println("searching for element");
			actions.click(driver.findElement(By.name("q"))).build().perform();
		}catch (NoSuchElementException e) {
			System.out.println("Error Message :  ----------------------");
			e.printStackTrace();
		}
		
		
	}
}
