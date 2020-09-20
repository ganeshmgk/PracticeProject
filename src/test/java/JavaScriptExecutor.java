import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D://JarsDrivers//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://cosmocode.io/");
		driver.get("http:www.demo.automationtesting.in");
	}
}
