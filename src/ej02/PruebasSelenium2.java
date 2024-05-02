package ej02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSelenium2 {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
		
	}

	@Test
	void test1Valido() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("112");
        directivoBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        boolean validoDisplayed = valido.isDisplayed();
        assertTrue(validoDisplayed);
	}

	@Test
	void test2Valido() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("112");
        directivo.sendKeys("-");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement valido = driver1.findElement(By.cssSelector("h3"));
        boolean validoDisplayed = valido.isDisplayed();
        assertTrue(validoDisplayed);
        
	}
	
	@Test
	void test3Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("000");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test4Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("12");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test5Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("1112");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test6Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("asas");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test7Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("11,2");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test8Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("-112");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test9Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("@");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test10Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("");
        directivo.sendKeys("+");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
	}
	
	@Test
	void test11Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("112");
        directivo.sendKeys("c");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
	}
	
	@Test
	void test12Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("112");
        directivo.sendKeys("1");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
	}
	
	@Test
	void test13Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("112");
        directivo.sendKeys("#");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
	}
	
	@Test
	void test14Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("112");
        directivo.sendKeys("++");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
	}
	
	@Test
	void test15Error() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numero = driver1.findElement(By.id("numero"));        
        WebElement directivo = driver1.findElement(By.id("directivo"));
        
        numero.sendKeys("112");
        directivo.sendKeys("");
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
	}
	
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
