package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRadioButton {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		//inspect the element in the website and then check its id and put it here....clicking the radio button		
		//driver.findElement(By.id("vfb-7-1")).click();
		
		//clicking the check box
		driver.findElement(By.id("vfb-6-0")).click();
		driver.close();
	}

}
