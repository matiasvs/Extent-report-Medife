package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class Prueba_1 {

	private WebDriver driver;	
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	@Given("^Dado un usuario perfil xx conectado con lo siguientes datos$")
	public void dado_un_usuario_perfil_xx_conectado_con_lo_siguientes_datos() throws Throwable {
		  System.out.println("Inicio de conexcion"); System.setProperty(pathChrome,
		  browser ); driver = new ChromeDriver(); //driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(baseURL); driver.manage().window().maximize();		 
	}

	@Given("^Usuario: <maru>$")
	public void usuario_maru() throws Throwable {
	    System.out.println("Usuario: test");
	}

	@Given("^Pass: <(\\d+)>$")
	public void pass(int arg1) throws Throwable {
	    System.out.println("Password: secreta");
	}

	@Given("^la pantalla Alta de responsible de pago desplegada$")
	public void la_pantalla_Alta_de_responsible_de_pago_desplegada() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^seleciona el campo Tipo de Responsable$")
	public void seleciona_el_campo_Tipo_de_Responsable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^A Selecciono Empresa Empresa$")
	public void a_Selecciono_Empresa_Empresa() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^A Selecciono Empresa Externo$")
	public void a_Selecciono_Empresa_Externo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^A Selecciono Empresa Grupo$")
	public void a_Selecciono_Empresa_Grupo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After()
	public void embedScreenshot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException wde) {
				System.err.println(wde.getMessage());
			} catch (ClassCastException cce) {
				cce.printStackTrace();
			}
		}
		driver.quit();
	}
}
