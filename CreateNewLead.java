package week6.day1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewLead extends Base {
	@Test
	public void runCreateLead() {
		WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
		createLeadButton.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Siva");
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("S");
		WebElement fnameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fnameLocalElement.sendKeys("Siva");
		WebElement departmentNameElement = driver.findElement(By.name("departmentName"));
		departmentNameElement.sendKeys("Software Testing");
		WebElement descriptionElement = driver.findElement(By.name("description"));
		descriptionElement.sendKeys("Testing Create Lead using Selenium");
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("Siva@testleaf.com");
		WebElement stateProvinceElement = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateProvince = new Select(stateProvinceElement);
		stateProvince.selectByVisibleText("New York");
		WebElement submitButton = driver.findElement(By.className("smallSubmit"));
		submitButton.click();
		String title = driver.getTitle();
		System.out.println(title);

	}
}
