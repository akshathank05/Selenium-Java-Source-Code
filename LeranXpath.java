package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeranXpath {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'uid']")).sendKeys("mngr357026");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("EhEhUqU");
		driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
		
		driver.close();
		
		

	}

}
