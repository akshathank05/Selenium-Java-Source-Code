package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/reg/?rs=7");
		driver.manage().window().maximize();
		
		WebElement elementMonth =driver.findElement(By.name("birthday_month"));
		Select selectMonthElement = new Select(elementMonth);
		selectMonthElement.selectByVisibleText("May");
		
		WebElement elementDay =driver.findElement(By.name("birthday_day"));
		Select selectDayElement = new Select(elementDay);
		selectDayElement.selectByVisibleText("5");
		
		WebElement elementYear = driver.findElement(By.name("birthday_year"));
		Select selectYearelement = new Select(elementYear);
		selectYearelement.selectByVisibleText("1992");
		
		//driver.close();

	}

}
