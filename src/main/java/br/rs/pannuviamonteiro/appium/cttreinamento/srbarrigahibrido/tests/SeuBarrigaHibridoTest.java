package br.rs.pannuviamonteiro.appium.cttreinamento.srbarrigahibrido.tests;

import static br.rs.pannuviamonteiro.appium.cttreinamento.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.After;
import org.junit.Test;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;
import br.rs.pannuviamonteiro.appium.cttreinamento.core.BaseTest;
import br.rs.pannuviamonteiro.appium.cttreinamento.srbarrigahibrido.pages.SeuBarrigaHibridoPage;

public class SeuBarrigaHibridoTest extends BaseTest {

	private BaseTest baseTest;
	private SeuBarrigaHibridoPage seuBarrigaHibridoPage;
	
	public SeuBarrigaHibridoTest() {
		this.baseTest = new BaseTest(); 
		this.seuBarrigaHibridoPage = new SeuBarrigaHibridoPage();
	}
	
	@Test
	public void deveRealizarLogin() throws InterruptedException {
		
		//acessar o menu "SeuBarriga Híbrido"
		this.baseTest.clicarNoElementoPorXPathComTexto(("SeuBarriga Híbrido"));
		Thread.sleep(3000);
		entrarNoContexto();
		alterarParaContexto();
		
		//preencher email
		this.seuBarrigaHibridoPage.campoEmail().sendKeys("a@a");
		
		//preencher senha
		this.seuBarrigaHibridoPage.campoSenha().sendKeys("a");
		
		//clicar em ENTRAR
		this.seuBarrigaHibridoPage.botaoEntrar().click();
		
		//validar mensagem 
		assertEquals("Bem vindo, a!", (this.seuBarrigaHibridoPage.campoMensagem()).getText());
	}
	
	@After
	public void tearDown() {
		sairDoContexto();
	}
	
//*****************************************************************************************************************************************************************************
	
	public void entrarNoContexto() {
		Set<String> contextHandles = getDriver().getContextHandles();

		// imprimir contextos existentes
		for (String nomeContexto : contextHandles) {
			System.out.println(nomeContexto);
		}
	}

	public void alterarParaContexto() {
		Set<String> contextHandles = getDriver().getContextHandles();
		getDriver().context((String) contextHandles.toArray()[1]);
	}

	public void sairDoContexto() {
		getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
	}
	
}
