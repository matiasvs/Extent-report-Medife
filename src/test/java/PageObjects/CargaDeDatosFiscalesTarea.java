package PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CargaDeDatosFiscalesTarea {

	private WebDriver driver;
	
	// CONSTRUCTOR //
	public CargaDeDatosFiscalesTarea (WebDriver driver) {
		this.driver = driver;
	}
	
	// INFORMACION GENERAL
	private By ByTipodeResponsable = By.id("managerTypeId");
	private By ByCuitCuil = By.id("cuitId");
	private By ByRazonSocial = By.id("fiscalNameId");
	private By ByFechaBaja = By.id("lowDateId");
	private By ByEstado = By.id("stateId");
	private By ByFechaVigencia = By.id("validDateId");
	private By ByEmailGeneral = By.id("emailId");

	// INFORMACION FISCAL
	private By ByCondicionIVA = By.id("ivaConditionId");
	private By ByFechaInicioCondicionIVA = By.id("ivaConditionDateId");
	private By ByCondicionIIBB = By.id("iibbCondition");
	private By ByNumeroIIBB = By.id("numeroiibb");
	
	// FORMA DE PAGO
	private By ByFormaDePago = By.id("wayPayId");
	private By ByNumeroDeTarjeta = By.id("nroTarjeta");
	private By ByFechaVencimientoTarjeta = By.id("vencimientoTarjetaDateId");
	private By ByTipoDeTarjeta = By.id("tipoTarjeta");
	
	// Adherido factura electr�nica
	private By ByAdheridoAFacturaElectronica = By.id("mat-checkbox-2");
	private By ByEmailAdherido = By.id("billingEmailId");
	
	// DOMICILIO DE FACTURA
	private By ByProvincia = By.id("provinceId");
	private By ByPartido = By.id("inputPartido");
	private By ByLocalidad = By.id("inputLocalidad");
	private By ByCodigoPostal = By.id("postalCodeId");
	private By ByCodigoPostalArea = By.id("cpaId");
	private By ByCalle = By.id("streetId");
	private By ByNumero= By.id("numberId");
	private By ByPiso = By.id("floorId");
	private By ByDepartamento = By.id("departmentId");
	private By ByBarrio = By.id("districtId");
	private By ByManzana = By.id("sectorId");
	private By ByCasa = By.id("homeId");
	private By ByTorre = By.id("towerId");
	private By ByEntreCalle1 = By.id("betweenStreet1Id");
	private By ByEntreCalle2 = By.id("betweenStreet2Id");
	private By ByAclaracion = By.id("mat-input-23");
	
	// DOMICILIO DE FACTURA BOTONES
	private By ByValidar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[10]/div/button");
	private By ByConfirmar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[11]/div/button[3]");
	private By ByGuardar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[11]/div/button[2]");
	private By ByCancelar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[11]/div/button[1]");
	
	// TELEFONO
	private By ByNuevoTelefono = By.xpath("//*[@id=\'collapseTelefonoData\']/div/div/div/button");
	
	// TELEFONO - PopUp
	private By ByTipoDeTelefono = By.id("telephoneTypeId");
	private By ByPrefijo = By.id("telephonePrefixId");
	private By ByNumeroPopup = By.id("telephoneNumberId");
	private By ByNumeroInterno = By.id("telephoneInternalId");
	
	// TELEFONO - PopUp - BOTON
	private By ByConfirmarTelefonoPopUp = By.xpath("//*[@id=\"mat-dialog-3\"]/app-telefono/div[2]/div/button");
												    //*[@id="mat-dialog-3"]/app-telefono/div[2]/div/button
	private By ByConfirmarNuevo = By.xpath("//*[@id=\"mat-dialog-4\"]/app-telefono/div[2]/div/button");
	private By ByCheckboxTelefono = By.xpath("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Interno'])[1]/following::div[1]");
	private By ByModificarTelefono = By.xpath("//*[@id=\'collapseTelefonoData\']/div/div[2]/div/button[2]");
	private By ByBorrarTelefono = By.xpath("//*[@id=\'collapseTelefonoData\']/div/div[2]/div/button[3]");
	
	
	// BOTONES - Domicilio de facturacion
	private By ByBtnValidar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[10]/div/button");
	private By ByBtnConfirmar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[11]/div/button[3]");
	private By ByBtnGuardar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[11]/div/button[2]");
	private By ByBtnCancelar = By.xpath("//*[@id=\'collapseBillingAdress\']/div[11]/div/button[1]");
	
	// METODOS Informacion general
	public void ingresoTipoResponsable(String tipoResponsable) {
		this.driver.findElement(ByTipodeResponsable).sendKeys(tipoResponsable.trim());
	}	

	public void ingresoCuitCuil(String cuitCuil) {
		this.driver.findElement(ByCuitCuil).sendKeys(cuitCuil.trim());
	}
	
	public void ingresoRazonSocial(String razonSocial) {
		this.driver.findElement(ByRazonSocial).sendKeys(razonSocial.trim());
	}
	
	public void ingresoFechaBaja(String fechaBaja) {
		this.driver.findElement(ByFechaBaja).sendKeys(fechaBaja.trim());
	}
	
	public void ingresoEstado(String estado) {
		this.driver.findElement(ByEstado).sendKeys(estado.trim());
	}
	
	public void ingresoFechaVigencia(String fechaVigencia) {
		this.driver.findElement(ByFechaVigencia).sendKeys(fechaVigencia.trim());
	}	

	public void ingresoEmailGeneral(String emailGeneral) {
		this.driver.findElement(ByEmailGeneral).sendKeys(emailGeneral.trim());
	}
	
	// METODOS informacion fiscal
	public WebElement ingresoCondicionIVA(String condicionIVA) {
		this.driver.findElement(ByCondicionIVA).sendKeys(condicionIVA);
		Actions action = new Actions(driver);		 
		action.sendKeys(Keys.TAB).build().perform();
		return null;
	}	

	public void ingresoFechaInicioCondicionIVA(String fechaInicioCondicionIVA) {
		this.driver.findElement(ByFechaInicioCondicionIVA).sendKeys(fechaInicioCondicionIVA.trim());
	}	

	public WebElement ingresoCondicionIIBB(String condicionIIBB) {
		//this.driver.findElement(ByCondicionIIBB).sendKeys(Keys.SPACE);
		this.driver.findElement(ByCondicionIIBB).sendKeys(condicionIIBB);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		return null;
	}	

	public void ingresoByNumeroIIBB(String numeroIIBB) {
		this.driver.findElement(ByNumeroIIBB).sendKeys(numeroIIBB.trim());
	}
	
	// METODOS forma de pago	
	public WebElement ingresoFormaDePagoPresencial() {
		this.driver.findElement(ByFormaDePago).sendKeys(Keys.DOWN, Keys.TAB);
		return null;
	}
	
	public WebElement ingresoFormaDepagoDebitoEnCuenta() {
		this.driver.findElement(ByFormaDePago).sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);
		return null;
	}
	
	public WebElement ingresoFormaDePagoDebitoAutomatico() {
		this.driver.findElement(ByFormaDePago).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.TAB);
		return null;		
	}
	
	public void numeroDeTarjeta(String numeroTarjeta) {
		this.driver.findElement(ByNumeroDeTarjeta).sendKeys(numeroTarjeta.trim());
	}
	
	public void fechaDeVencimientoTarjeta(String fechaTarjeta) {
		this.driver.findElement(ByFechaVencimientoTarjeta).sendKeys(fechaTarjeta.trim());;		
	}
	
	//yTipoDeTarjeta ByTipoDeTarjeta
	public WebElement tipoDeTarjetaDebito(String tarjetaDebito) {
		this.driver.findElement(ByTipoDeTarjeta).sendKeys(Keys.DOWN , Keys.TAB);
		return null;
	}		
		
	// METODOS Adherido factura electr�nica	
//	public void ingresoAdheridoAFacturaElectronica(String adheridoAFacturaElectronica) {
//		this.driver.findElement(ByAdheridoAFacturaElectronica).sendKeys(Keys.SPACE);
//		//*[normalize-space(text()) and normalize-space(.)='Adherido factura electr�nica'])[1]/following::div[4]
//	}
	
	public void BingresoAdheridoAFacturaElectronica() throws InterruptedException {
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adherido factura electr�nica'])[1]/following::div[4]")).click();
		System.out.println("check22");
		Thread.sleep(2000);
	}
	
	public void ingresoEmailAdherido(String emailAdherido) {
		this.driver.findElement(ByEmailAdherido).sendKeys(emailAdherido.trim());
	}
	
	// METODOS DOMICILIO DE FACTURA
	public void ingresoProvincia(String provincia) {
		this.driver.findElement(ByProvincia).sendKeys(provincia.trim());
	}
	
	public void ingresoPartido(String partido) {
		this.driver.findElement(ByPartido).sendKeys(partido.trim());
	}
	
	public void ingresoLocalidad(String localidad) {
		this.driver.findElement(ByLocalidad).sendKeys(localidad.trim());
	}
	
	public void ingresoCodigoPostal(String codigoPostal) {
		this.driver.findElement(ByCodigoPostal).sendKeys(codigoPostal.trim());
	}
	
	public void ingresoCodigoPostalArea(String codigoPostalArea) {
		this.driver.findElement(ByCodigoPostalArea).sendKeys(codigoPostalArea.trim());
	}
	
	public void ingresoCalle(String calle) {
		this.driver.findElement(ByCalle).sendKeys(calle.trim());
	}
	
	public void ingresoNumero(String numero) {
		this.driver.findElement(ByNumero).sendKeys(numero.trim());
	}
	
	public void ingresoPiso(String piso) {
		this.driver.findElement(ByPiso).sendKeys(piso.trim());
	}
	
	public void ingresoDepartamento(String departamento) {
		this.driver.findElement(ByDepartamento).sendKeys(departamento.trim());
	}
	
	public void ingresoBarrio(String barrio) {
		this.driver.findElement(ByBarrio).sendKeys(barrio.trim());
	}
	
	public void ingresoManzana(String manzana) {
		this.driver.findElement(ByManzana).sendKeys(manzana.trim());
	}
	
	public void ingresoCasa(String casa) {
		this.driver.findElement(ByCasa).sendKeys(casa.trim());
	}
	
	public void ingresoTorre(String torre) {
		this.driver.findElement(ByTorre).sendKeys(torre.trim());
	}
	
	public void ingresoEntreCalle1(String entreCalle1) {
		this.driver.findElement(ByEntreCalle1).sendKeys(entreCalle1.trim());
	}
	
	public void ingresoEntreCalle2(String entreCalle2) {
		this.driver.findElement(ByEntreCalle2).sendKeys(entreCalle2.trim());
	}
	
	public void ingresoAclaracion(String aclaracion) {
		this.driver.findElement(ByAclaracion).sendKeys(aclaracion.trim());
	}
	
	// METODOS DOMICILIO DE FACTURA BOTONES
	public void ingresoValidar(String validar) {
		this.driver.findElement(ByValidar).sendKeys(validar.trim());
	}
	
	public void ingresoConfirmar(String confirmar) {
		this.driver.findElement(ByConfirmar).sendKeys(confirmar.trim());
	}
	
	public void ingresoGuardar(String guardar) {
		this.driver.findElement(ByGuardar).sendKeys(guardar.trim());
	}
	
	public void ingresoCancelar(String cancelar) {
		this.driver.findElement(ByCancelar).sendKeys(cancelar.trim());
	}
	
	// METODOS TELEFONO
	public void ingresoNuevoTelefono () {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.elementToBeClickable(ByNuevoTelefono));
		guru99seleniumlink.click();		
		}
//		this.driver.findElement(ByNuevoTelefono).click();
//		Thread.sleep(8000);
//	}

//	public void ingresoNuevoTelefono () throws InterruptedException {
//		this.driver.findElement(ByNuevoTelefono).click();
//		Thread.sleep(8000);
//	}
	
	// METODOS TELEFONO - PopUp
	public WebElement ingresoTipoDeTelefono(String tipoDeTelefono) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement guru99seleniumlink2;
		guru99seleniumlink2= wait.until(ExpectedConditions.elementToBeClickable(ByTipoDeTelefono));
		guru99seleniumlink2.sendKeys(tipoDeTelefono);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		return null;		
		}
		
//	public WebElement ingresoTipoDeTelefono(String tipoDeTelefono) throws InterruptedException {
//		this.driver.findElement(ByTipoDeTelefono).sendKeys(tipoDeTelefono);
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(8000);
//		return null;
//	}	
	
	public void ingresoPrefijo(String prefijo) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement guru99seleniumlink3;
		guru99seleniumlink3= wait.until(ExpectedConditions.elementToBeClickable(ByPrefijo));
		guru99seleniumlink3.sendKeys(prefijo);
		}
		//this.driver.findElement(ByPrefijo).sendKeys(prefijo.trim());
	//}
//	public void ingresoPrefijo(String prefijo) {
//		this.driver.findElement(ByPrefijo).sendKeys(prefijo.trim());
//	}
	
	public void ingresoPrefijoNuevo(String prefijo) {
		this.driver.findElement(ByPrefijo).clear();
		this.driver.findElement(ByPrefijo).sendKeys(prefijo.trim());
	}
	
	public void ingresoNumeroPopup(String numeroPopUp) {
		this.driver.findElement(ByNumeroPopup).sendKeys(numeroPopUp.trim());
	}
	
	public void ingresoNumeroPopupNuevo(String numeroPopUp) {
		this.driver.findElement(ByNumeroPopup).clear();
		this.driver.findElement(ByNumeroPopup).sendKeys(numeroPopUp.trim());
	}
	
	public void ingresoNumeroInterno(String interno) {
		this.driver.findElement(ByNumeroInterno).sendKeys(interno.trim());
	}
	
	// METODOS TELEFONO - PopUp - BOTON  //*[@id="mat-dialog-4"]/app-telefono/div[2]/div/button
	public void ingresoConfirmarPopUp() {
		this.driver.findElement(ByConfirmarTelefonoPopUp).click();
	}
	
	public void ingresoConfirmarPopUpNuevo() {
		this.driver.findElement(ByConfirmarNuevo).click();
	}
	
	//METODOS BOTONES
	public void btnValidar() throws InterruptedException {
		this.driver.findElement(ByBtnValidar).click();
		Thread.sleep(2000);
	}

	public void btnConfirmar() throws InterruptedException {
		this.driver.findElement(ByBtnConfirmar).click();
		Thread.sleep(2000);
	}
	
	public void btnGuardar() throws InterruptedException {
		this.driver.findElement(ByBtnGuardar).click();
		Thread.sleep(2000);
	}
	
	public void btnCancelar() throws InterruptedException {
		this.driver.findElement(ByBtnCancelar).click();
		Thread.sleep(2000);
	}
	
//	public void checkboxTelefono() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement guru99seleniumlink5;
//		guru99seleniumlink5= wait.until(ExpectedConditions.elementIfVisible(//*[normalize-space(text()) and normalize-space(.)='Interno'])[1]/following::div[1]));
//		guru99seleniumlink5.click()));
//	}
	public void checkboxTelefono() throws InterruptedException {
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Interno'])[1]/following::div[1]")).click();
		System.out.println("check22");
		Thread.sleep(2000);
	}
	
//	public void btnModificar() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement guru99seleniumlink5;
//		guru99seleniumlink5= wait.until(ExpectedConditions.elementToBeClickable(ByModificarTelefono));
//		guru99seleniumlink5.click();
//		}
	
	public void btnModificar() throws InterruptedException {
		this.driver.findElement(ByModificarTelefono).click();
		Thread.sleep(3000);
	}
	
	public void btnBorrarTelefono() throws InterruptedException {
		this.driver.findElement(ByBorrarTelefono).click();
		Thread.sleep(1000);
	}
	
	// VALIDAR MENSAJES //	
	public void checkPantallaDatosFiscales() {
		String stringDatosFiscales2 = this.driver.findElement(By.xpath("/html/body/app-root/app-responsable-pago-datos-fiscales/mat-toolbar/span[1]")).getText();
		//html/body/app-root/app-responsable-pago/mat-toolbar/span[1]
		System.out.println("Se muestra el mensaje: "+stringDatosFiscales2);
		//assertEquals(stringDatosFiscales2, "Responsable de pago guardado correctamente", "No se encontro el mensaje de Responsable de pago guardado: ");
		assertEquals(stringDatosFiscales2, "Alta de Responsable de Pago - Carga de Datos Fiscales", "No se encontro el mensaje de Responsable de pago guardado: ");
	}
	
	public void checkBtnOnlyValidar() {
		String stringValidar = this.driver.findElement(By.xpath("")).getText();
		System.out.println("Se muestra el mensaje: "+stringValidar);
		assertEquals(stringValidar, "", "No se encontro el mensaje para el boton validar: ");
	}
	
	
	
	
	
	// Validar campos telefono
	public void checkTelefonoTipo() {
		String StringTipo = this.driver.findElement(By.xpath("//*[@id=\'collapseTelefonoData\']/div/div[1]/table/tbody/tr/td[2]")).getText();
		System.out.println("Se guardo el tipo de telefono: " + StringTipo);
		assertEquals(StringTipo, "Particular", "No se encontro el valor correspondientes:: ");
	} 
	
	public void checkTelefonoPrefijo() {
		String StringPrefijo = this.driver.findElement(By.xpath("//*[@id=\'collapseTelefonoData\']/div/div[1]/table/tbody/tr/td[3]")).getText();
		System.out.println("Se guardo el Perfijo del telefono: " + StringPrefijo);
		assertEquals(StringPrefijo, "011", "No se guardo el valor esperado: ");
	}
	
	public void checkTelefonoNumero() {
		String StringNumero = this.driver.findElement(By.xpath("//*[@id=\'collapseTelefonoData\']/div/div[1]/table/tbody/tr/td[4]")).getText();
		System.out.println("Se guardo el Numero de telefono: " + StringNumero);
		assertEquals(StringNumero, "67867878", "No se guardo el valor esperado: ");
	}
	
	public void checkInternoHabilitado() {
		boolean StringInterno = this.driver.findElement(By.id("mat-form-field-label-75")).isDisplayed();
		System.out.println("El campo Interno es visible: " +StringInterno);
	}
	
	
	
	
}
