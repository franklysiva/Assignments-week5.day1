package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends Base {
	@Test
	public void DuplicateLead() {
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
						WebElement duplicateLeadButton = driver.findElement(By.xpath("(//a[@class = 'subMenuButton'])[1]"));
						duplicateLeadButton.click();
						WebElement companyName1 = driver.findElement(By.id("createLeadForm_companyName"));
						companyName1.clear();
						WebElement companyName2 = driver.findElement(By.id("createLeadForm_companyName"));
						companyName2.sendKeys("TestLeaf_New");
						WebElement firstnameElement1 = driver.findElement(By.id("createLeadForm_firstName"));
						firstnameElement1.clear();
						WebElement firstnameElement2 = driver.findElement(By.id("createLeadForm_firstName"));
						firstnameElement2.sendKeys("SK Siva");
						WebElement submitButton2 = driver.findElement(By.className("smallSubmit"));
						submitButton2.click();
						String title1 = driver.getTitle();
						System.out.println(title1);
			}

}
