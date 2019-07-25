package br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.tests;

import org.junit.Before;
import org.openqa.selenium.By;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BaseTest;

public class SeuBarrigaNativoTest extends BaseTest{

	private BaseTest baseTest;
	
	public SeuBarrigaNativoTest() {
		this.baseTest = new BaseTest();
	}
	
	@Before
	public void deveRealizarLogin() {
		
		//acessar o menu "SeuBarriga Nativo"
		this.baseTest.clicarNoElementoPorXPathComTexto(("SeuBarriga Nativo"));
		
		//preencher email
		this.baseTest.preencherCampoPorLocatorComTexto((By.className("android.widget.EditText")), "a@a");
		
		
		//preencher senha
		
		//clicar em "ENTRAR"
		
		//validar se login foi realizado com sucesso
	}
	
}
