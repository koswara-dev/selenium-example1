package testingproject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {
	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.google.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
	}
}
