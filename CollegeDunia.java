package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CollegeDunia
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://collegedunia.com/college/2868-mallamma-marimallappa-womens-arts-and-commerce-college-mysore");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> clg = driver.findElements(By.xpath("li[class='jsx-947163246 position-relative mr-12 list-item-text nav-item/a']"));
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		for (WebElement w : clg)
		{
			w.click();
		}
		a.keyUp(Keys.CONTROL);
		a.perform();

		

	}

}
