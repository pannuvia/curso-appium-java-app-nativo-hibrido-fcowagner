package br.rs.pannuviamonteiro.appium.cttreinamento.core;

import static br.rs.pannuviamonteiro.appium.cttreinamento.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;

public class BaseTest {

	private BasePage basepage;

	public BaseTest() {
		this.basepage = new BasePage();
	}

	@Rule
	public TestName testName = new TestName();

	@AfterClass
	public static void finalizarDriver() {

		// fechar driver
		DriverFactory.destroyDriver();
	}

	@After
	public void deveFecharDriver() {

		// gerar screenshot no fim do teste
		deveGerarScreenshot();

		// resetar app no fim do teste
		DriverFactory.getDriver().resetApp();
	}

	public void deveGerarScreenshot() {
		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/" + testName.getMethodName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// refatorado
	public void preencherCampoPorLocatorComTexto(By by, String texto) {
		this.basepage.campoPor(by).sendKeys(texto);
	}

//**********************************************************            CLICAR         ****************************************************************************************

	// refatorado
	public void clicarNoElementoPor(By by) {
		this.basepage.elementoPor(by).click();
	}

	// refatorado
	public void clicarNoElementoPorXPathComTexto(String textoDoElemento) {
		this.basepage.elementoPorXPathComTexto(textoDoElemento).click();
	}

	// refatorado
	public void clicarNumaCoordenadaDoElementoComTexto(String texto, int x, int y) {
		this.basepage.coordenadaDoElementoComTexto(texto, x, y).perform();
	}

	// refatorado
	public void clicarNumaCoordenadaDoElemento(int x, int y) {
		this.basepage.coordenadaDoElemento(x, y);
	}

	// refatorado
	public void clicarNoComboPorXPathComValor(By by, String valor) {
		this.basepage.comboPorXPathComValor(by, valor).click();
	}

//**********************************************************            CAPTURAR         ***************************************************************************************

	// refatorado
	public String capturarElementoPorXPathComTexto(String textoDoElemento) {
		return this.basepage.elementoPorXPathComTexto(textoDoElemento).getText();
	}

	// refatorado
	public String capturarPorTexto(By by) {
		return this.basepage.textoPorLocator(by).getText();
	}

	// refatorado
	public String capturarTituloDoAlertaPorID() {
		return this.basepage.tituloDoAlertaPorID().getText();
	}

	// refatorado
	public String capturarTipoDeAlertaPorXpath(String tipoAlerta) {
		return this.basepage.tipoDeAlertaPorXpath(tipoAlerta).getText();
	}

	// refatorado
	public String capturarMensagemDoAlertaPorID() {
		return this.basepage.mensagemDoAlertaPorID().getText();
	}

//**********************************************************            VALIDAR        ****************************************************************************************

	public boolean validarSeEstaMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}

	public boolean validarSeExisteElementoPorXpathComOTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
		return elementos.size() > 0;
	}

}
