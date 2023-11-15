package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T14_Browser_Drag {
	
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
//	public void draggableBox() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Drag']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		WebElement draggableBox = driver.findElement(By.id("form:conpnl"));
//		System.out.println();
//		Actions dragAction = new  Actions(driver);
//				dragAction.dragAndDropBy(draggableBox, 250, 0).build().perform();
//	}
	
//	@Test
//	public void dragAndDropBox() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Drag']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		WebElement draggableBox = driver.findElement(By.id("form:drop"));
//		WebElement droppableBox = driver.findElement(By.id("form:drag"));
//		System.out.println();
//		Actions dragAction = new  Actions(driver);
//				dragAction.dragAndDrop(droppableBox, draggableBox).build().perform();
//	}

//	@Test
//	public void dragAndDropBox() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Drag']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		WebElement draggableBox = driver.findElement(By.id("form:drop"));
//		WebElement droppableBox = driver.findElement(By.id("form:drag"));
//		System.out.println();
//		Actions dragAction = new  Actions(driver);
//				dragAction.dragAndDrop(droppableBox, draggableBox).build().perform();
//	}
	
//	@Test
//	public void dragTableColumn() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Drag']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		WebElement nameColumn = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
//		WebElement categoryColumn = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt97']"));
//		WebElement qtyColumn = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt99']"));
//		Actions dragAction = new  Actions(driver);
//				dragAction.dragAndDrop(qtyColumn, categoryColumn).build().perform();
//				dragAction.dragAndDrop(categoryColumn, nameColumn).build().perform();
//	}
	
	@Test
	public void resizeImage() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Drag']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		WebElement logo = driver.findElement(By.id("form:logo"));
		int height = Integer.parseInt(logo.getCssValue("height"));
		int width = Integer.parseInt(logo.getCssValue("width"));
		
		Actions logoAction = new  Actions(driver);
	
	}
	
	@Test
	public void progressBar() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Drag']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		WebElement logo = driver.findElement(By.id("form:logo"));
		int height = Integer.parseInt(logo.getCssValue("height"));
		int width = Integer.parseInt(logo.getCssValue("width"));
		
		Actions logoAction = new  Actions(driver);
	
	}
	
	@Test
	public void rangeSlider() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Drag']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		WebElement logo = driver.findElement(By.id("form:logo"));
		int height = Integer.parseInt(logo.getCssValue("height"));
		int width = Integer.parseInt(logo.getCssValue("width"));
		
		Actions logoAction = new  Actions(driver);
	
	}

}
