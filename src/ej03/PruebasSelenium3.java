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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
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
        
        assertEquals("Datos correctos", valido.getText());
	}
	
	@Test
	void test10Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("1Amaro Suarez");
        fecha.sendKeys("31/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertTrue(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertFalse(textoErrorFecha);
	}
	
	@Test
	void test11Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro _ Suarez");
        fecha.sendKeys("31/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertTrue(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertFalse(textoErrorFecha);
	}
	
	@Test
	void test12Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("");
        fecha.sendKeys("31/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertTrue(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertFalse(textoErrorFecha);
	}
	
	@Test
	void test13Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro1Suarez");
        fecha.sendKeys("31/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertTrue(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertFalse(textoErrorFecha);
	}
	
	@Test
	void test14Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("00/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertFalse(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertTrue(textoErrorFecha);
	}
	
	@Test
	void test15Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("32/12/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertFalse(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertTrue(textoErrorFecha);
	}
	
	@Test
	void test16Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("12/00/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertFalse(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertTrue(textoErrorFecha);
	}
	
	@Test
	void test17Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("12/13/2004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertFalse(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertTrue(textoErrorFecha);
	}
	
	@Test
	void test18Error() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomap = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nomap.sendKeys("Amaro Suarez");
        fecha.sendKeys("12/12/20004");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNomap"));
        boolean textoError = error.isDisplayed();
        assertFalse(textoError);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoErrorFecha = errorFecha.isDisplayed();
        assertTrue(textoErrorFecha);
	}
	
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
