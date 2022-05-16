package senaiCursos;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeCurso {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Arquivos de Programas\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador() {
		driver.get("https://sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
		driver.findElement(By.className("class=\"material-icons material-icons-sub\"")).sendkeys("gestão");
		driver.findelement(By.ClassName("class=\"material-icons material-icons-sub\"")).ckick();
	}
}
