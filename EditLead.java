package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the browser
		driver.get("http://leaftaps.com/opentaps/control/login"); //To load an URL
		
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.sendKeys("Demosalesmanager");
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmButton = driver.findElement(By.linkText("CRM/SFA"));
		crmButton.click();
		
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		
		WebElement createleadsButton = driver.findElement(By.linkText("Create Lead"));
		createleadsButton.click();
		
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("Kasadara");
		
		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameElement.sendKeys("Kayalvizhi");
		
		WebElement LastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		LastNameElement.sendKeys("Ranganathan");
		
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Kayal");
		
		WebElement departmentName = driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("IT");
		
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Software testing");
		
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("Kayal@gmail.com");
		
		WebElement stateProvinceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select d1 = new Select(stateProvinceElement);
		d1.selectByVisibleText("New York");
		
		WebElement submitButtonElement = driver.findElement(By.name("submitButton"));
		submitButtonElement.click();
		
		WebElement editButtonElement = driver.findElement(By.linkText("Edit"));
		editButtonElement.click();
		
		WebElement updateDescription = driver.findElement(By.id("updateLeadForm_description"));
		updateDescription.clear();
		
		WebElement importantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		importantNote.sendKeys("Important note");
		
		WebElement updateButtonElement = driver.findElement(By.className("smallSubmit"));
		updateButtonElement.click();
		
		System.out.println("Next page title is :" + driver.getTitle());	
	}
}
