package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImage {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.swtestacademy.com/xpath-selenium/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@class = 'header-image is-logo-image']")).click();
		driver.close();
		
		
		
		

	}

}
