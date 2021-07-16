package Package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Test2 {
		
		public static void main (String[]arg)
		{	
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// specifier le chemein de test	
			WebDriver driver = new ChromeDriver();     // crier un objet 
			//ChromeDriver driver1= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");//le site web a tester 
			driver.manage().window().maximize();// pour agrandir la page afficher 
			driver.getPageSource();
			String codeSource =driver.getPageSource();
			System.out.println("le code source est :"+codeSource);
			
			if (codeSource.contains("OrangeHRM")){
				System.out.println("Passed");
			}
			else
			{ 
				System.out.println("Failed");
			}
			
		}
}