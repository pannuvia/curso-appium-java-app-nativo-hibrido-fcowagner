package br.rs.pannuviamonteiro.appium.cttreinamento.srbarrigahibrido.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;
import br.rs.pannuviamonteiro.appium.cttreinamento.core.BaseTest;
import br.rs.pannuviamonteiro.appium.cttreinamento.srbarrigahibrido.pages.SeuBarrigaHibridoPage;

public class SeuBarrigaHibridoTest extends BaseTest {

	private BasePage basePage;
	private SeuBarrigaHibridoPage seuBarrigaHibridoPage;
	
	public SeuBarrigaHibridoTest() {
		this.basePage = new BasePage(); 
		this.seuBarrigaHibridoPage = new SeuBarrigaHibridoPage();
	}

	@Test
	public void deveRealizarLogin() throws InterruptedException {
		
		//acessar o menu "SeuBarriga Híbrido"
		this.basePage.clicarNoTextoDoElementoPorXpath("SeuBarriga Híbrido");
		Thread.sleep(3000);
		this.seuBarrigaHibridoPage.entrarNoContexto();
		this.seuBarrigaHibridoPage.alterarParaContexto();
		
		//preencher email
		this.seuBarrigaHibridoPage.preencherCampoEmail().sendKeys("a@a");
		
		//preencher senha
		this.seuBarrigaHibridoPage.preencherCampoSenha().sendKeys("a");;
		
		//clicar em ENTRAR
		this.seuBarrigaHibridoPage.clicarBotaoEntrar().click();
		
		//validar mensagem 
		assertEquals("Bem vindo, a!", (this.seuBarrigaHibridoPage.obterMensagem()));
	}
	
	@After
	public void tearDown() {
		this.seuBarrigaHibridoPage.sairDoContexto();
	}
	
}
