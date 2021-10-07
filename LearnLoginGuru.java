package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLoginGuru {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		//learn login demo from demo.guru99.com
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mngr357026");
		driver.findElement(By.id("passwd")).sendKeys("EhEhUqU");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.close();
		

	}

}
