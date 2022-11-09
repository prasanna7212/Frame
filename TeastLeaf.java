package Week.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeastLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main1(String[] args1) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://testleaf.herokuapp.com/pages/frame.html");
			driver.manage().window().maximize();
			driver.switchTo().frame(0);
			WebElement name = driver.findElement(By.xpath("//button[text()='Click Me']"));
			name.click();
			String text = name.getText();
			System.out.println(text);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			driver.switchTo().frame(0);
			WebElement name1 = driver.findElement(By.id("Click1"));
			name1.click();
			String text1 = name1.getText();
			System.out.println(text1);
			driver.switchTo().defaultContent();		
		}

	


	}

}
