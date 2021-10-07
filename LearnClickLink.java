package Week2.Day3;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClickLink {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.ca/?gws_rd=ssl");
		driver.manage().window().maximize();
		
		//driver.findElementByLinkText("Français").click();
		String title = driver.getTitle();
		String str = title.trim();
		System.out.println(str);
		/*
		 * if(str == "Google") { System.out.println("Pass"); }else {
		 * System.out.println("Fail"); }
		 */
		
		
		driver.close();

	}

}
