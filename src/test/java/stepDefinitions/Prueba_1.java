package stepDefinitions;

import java.io.IOException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import PageObjects.AltaResponsableDePago;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class Prueba_1 {

	private WebDriver driver;	
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	@Before()
	public void browserInitialize() throws IOException {

		//System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		
		/*
		 * Hashtable<String, Object> chromePreferences = new Hashtable<String,
		 * Object>(); //Below two chrome preference settings will disable popup dialog
		 * when download file.
		 * chromePreferences.put("profile.default_content_settings.popups",
		 * chromePreferences); chromePreferences.put("download.prompt_for_download",
		 * chromePreferences);
		 * 
		 * //Set file save to directory.
		 * chromePreferences.put("download.default_directory", chromePreferences);
		 * 
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.setExperimentalOption("prefs", chromePreferences);
		 * 
		 * DesiredCapabilities cap = DesiredCapabilities.chrome();
		 * cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		 */
		 
		
//		System.setProperty(pathChrome, browser ); 
//		driver = new ChromeDriver(); //driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(baseURL); 
//		driver.manage().window().maximize();		 
		 
	}
	
	@Given("^Dado un usuario perfil xx conectado con lo siguientes datos$")
	public void dado_un_usuario_perfil_xx_conectado_con_lo_siguientes_datos() throws Throwable {
		//driver.get("http://sume-test.apps.openshift.ase.local/#/alta-responsable-pago/datos-personales");
		System.out.println("Inicio cucumber");
		
		System.setProperty(pathChrome, browser ); 
		driver = new ChromeDriver(); //driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); 
		driver.manage().window().maximize();
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
	    System.out.println("Carga de pantalla de Alta de responsable de pago");
	}

	@When("^seleciona el campo Tipo de Responsable$")
	public void seleciona_el_campo_Tipo_de_Responsable() throws Throwable {
	    System.out.println("Seleccion tipo de responsable");
	}

	@When("^A Selecciono Empresa(.*)$")
	public void a_Selecciono_Empresa_Empresa(String tipoResponsable) throws Throwable {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);		
	}

//	@When("^A Selecciono Empresa Externo$")
//	public void a_Selecciono_Empresa_Externo() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^A Selecciono Empresa Grupo$")
//	public void a_Selecciono_Empresa_Grupo() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	
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
