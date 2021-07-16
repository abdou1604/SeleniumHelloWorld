package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {	
	
	
	public static void main (String[]arg)
	{	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// specifier le chemein de test	
		WebDriver driver = new ChromeDriver();     // crier un objet 
		//ChromeDriver driver1= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//le site web a tester 
		driver.manage().window().maximize();// pour agrandir la page afficher 
		
		driver.getTitle();
		
		String titlePage =driver.getTitle();
		System.out.println("le titre est :"+titlePage);
		
		if		(titlePage.equals("OrangeHRM")) {
			
			System.out.println("le test est reussie ");
			
		}
		else {
				System.out.println("le test a echoue");
			}
		String urlPage =driver.getCurrentUrl();
		System.out.println("le url est :"+urlPage);
		
		if		(urlPage.equals("https://opensource-demo.orangehrmlive.com/")) {
			
			System.out.println("le test Url est reussie ");
			
		}
		else {
			
			System.out.println("le test a echoue");
		
		}	
	}
}
	
	
	
	
