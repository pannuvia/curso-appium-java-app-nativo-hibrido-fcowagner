package br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.tests;

import org.junit.Test;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BaseTest;
import br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.pages.SeuBarrigaNativoRealizarLoginPage;

public class SeuBarrigaNativoRealizarLoginTest extends BaseTest{

	private SeuBarrigaNativoRealizarLoginPage seuBarrigaNativoLoginPage;
	
	public SeuBarrigaNativoRealizarLoginTest() {
		this.seuBarrigaNativoLoginPage = new SeuBarrigaNativoRealizarLoginPage();
	}
	
	@Test
	public void deveRealizarLogin() {
		
		//acessar o menu "SeuBarriga Nativo"
		clicarNoElementoPorXPathComTexto(("SeuBarriga Nativo"));
		
		//preencher email
		//preencherCampoPorLocatorComTexto((By.className("android.widget.EditText")), "a@a");
		this.seuBarrigaNativoLoginPage.campoNome("Nome").sendKeys("a@a");
		
		//preencher senha
		//preencherCampoPorLocatorComTexto((By.className("android.widget.EditText")), "a");
		this.seuBarrigaNativoLoginPage.campoSenha("Senha").sendKeys("a");
		
		//clicar em "ENTRAR"
		clicarNoElementoPorXPathComTexto("ENTRAR");
		//this.seuBarrigaNativoLoginPage.botaoEntrar("ENTRAR").click();
		
		//validar se login foi realizado com sucesso através do texto HOME
		//validarSeExisteElementoPorXpathComOTexto("HOME");
		this.seuBarrigaNativoLoginPage.textoMenu("HOME");
	}
	
}
