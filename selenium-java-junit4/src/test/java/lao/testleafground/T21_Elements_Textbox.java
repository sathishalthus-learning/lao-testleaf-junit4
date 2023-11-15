package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T21_Elements_Textbox {
	
	WebDriver driver=null;
	
	@Before
	public void beforeTest() throws InterruptedException {
		//
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(3));
	}
	
	@After
	public void afterTest() throws InterruptedException {
		//
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
	}
	
//	@Test
//	public void typeText() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:name")).sendKeys("JSA");
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void appendText() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt91")).getText());
//		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(", ");
//		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("INDIA");
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt91")).getText());
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void verifyDisabledBox() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt93")).getText());
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt91")).isEnabled());
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void clearTextbox() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt95")).getText());
//		driver.findElement(By.id("j_idt88:j_idt95")).clear();
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void retrieveTextboxContent() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt97")).getText());
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void typeAndMoveToNextField() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("sathish@althus.com");
//		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys(Keys.TAB);
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void pressEnterAndConfirmErrorMessage() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
//		System.out.println(driver.findElement(By.id("j_idt106:thisform:j_idt110")).getText());
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void pressEnterAndConfirmErrorMessage() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.id("j_idt106:j_idt113")).getLocation());
//		driver.findElement(By.id("j_idt106:float-input")).click();
//		System.out.println(driver.findElement(By.id("j_idt106:j_idt113")).getLocation());
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void typeNameAndChooseThirdOption() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("jsa");
//		Thread.sleep(Duration.ofSeconds(1));
//		driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'][3]")).click();
//		Thread.sleep(Duration.ofSeconds(1));
//	}
	
//	@Test
//	public void typeDateAndConfirmWithCalendar() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("11/1/2023");
//		Thread.sleep(Duration.ofSeconds(1));
//		
//		Thread.sleep(Duration.ofSeconds(1));
//	}
	
//	@Test
//	public void typeDateAndConfirmWithCalendar() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("23");
//		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys(Keys.ARROW_UP);
//		System.out.println(driver.findElement(By.id("j_idt106:j_idt118_input")).getCssValue("aria-valuenow"));
//		Thread.sleep(Duration.ofSeconds(1));
//	}
	
	@Test
	public void typeAndConfirmSliderMoves() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("23");
		Thread.sleep(Duration.ofSeconds(1));
	}
	
	@Test
	public void clickAndConfirmKeyboardAppears() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("23");
		Thread.sleep(Duration.ofSeconds(1));
	}
	
	@Test
	public void customToolbar() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("23");
		Thread.sleep(Duration.ofSeconds(1));
	}
	
	@Test
	public void textEditor() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("23");
		Thread.sleep(Duration.ofSeconds(1));
	}
}
