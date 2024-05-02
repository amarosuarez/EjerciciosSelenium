package ej03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSelenium3 {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
		
	}

	@Test
	void test1Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("12/08/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test2Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("01/08/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test3Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("02/08/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test4Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("30/08/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test5Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("31/08/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}

	@Test
	void test6Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("31/01/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test7Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("31/02/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test8Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("31/11/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	@Test
	void test9Valido() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("31/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        
        assertEquals(valido.getText(), "Datos correctos");
	}
	
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
