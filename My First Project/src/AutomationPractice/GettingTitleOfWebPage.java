package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTitleOfWebPage {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// declaring variable for storing actual and expected title
		String exepectedTitle = "amazon.com";
		String actualTitle = "";
		// Launch Browser and store title of web page
		driver.get("https://amazon.com");
		actualTitle = driver.getTitle();
		// Compare actual and Expected title
		if (actualTitle.contentEquals(exepectedTitle)) {
			System.out.println("Both titles are matched");

		} else {
			System.out.print("Both the titles are not matched");
			System.out.print(actualTitle);
		}

	}

}
