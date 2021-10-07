package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTableElements {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
		System.out.println(text);
		driver.close();
		
		

	}

}
