package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Obtener Objetos/webelements de la página web
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//Hacer login
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		//Métodos del explorador
		//Obtener el tirulo de la página
		String title = driver.getTitle();
		System.out.println("El titulo de la página es: " + title);
		
		//Obtener la URL
		String url = driver.getCurrentUrl();
		System.out.println("La URL actual es: " + url);

		//Métodos de navegación
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);		
		driver.navigate().refresh();
		
		//Verifica elemento desplegado en la página
		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(product) {
			System.out.println("El articulo es desplegado");
			
		}
		
		//Obtener el texto de un webelement
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodText.contains("Sauce Labs Backpack");//Contains es un método de Java que evalua 2 strings
		
		if(textCorrect) {
			System.out.println("El nombre del producto es correcto");
			
		}
		
		else {
			
			System.out.println("ERROR: El producto no es correcto");
		}
		Thread.sleep(3000);
		
		//Dropdown
		Select dropdown = new Select (driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("lohi");
		
	}

	
}
