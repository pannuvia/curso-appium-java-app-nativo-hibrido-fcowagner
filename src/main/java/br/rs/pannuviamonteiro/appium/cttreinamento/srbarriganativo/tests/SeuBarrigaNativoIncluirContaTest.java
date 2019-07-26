package br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BaseTest;
import br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.pages.SeuBarrigaNativoIncluirContaPage;

public class SeuBarrigaNativoIncluirContaTest extends BaseTest {

	private SeuBarrigaNativoIncluirContaPage seuBarrigaNativoIncluirContaPage;
	private SeuBarrigaNativoRealizarLoginTest seuBarrigaNativoLoginTest;

	public SeuBarrigaNativoIncluirContaTest() {
		this.seuBarrigaNativoIncluirContaPage = new SeuBarrigaNativoIncluirContaPage();
		this.seuBarrigaNativoLoginTest = new SeuBarrigaNativoRealizarLoginTest();
	}

	@Test
	public void deveInserirConta() {

		// realizar Login
		this.seuBarrigaNativoLoginTest.deveRealizarLogin();

		// acessar menu "CONTAS"
		clicarNoElementoPorXPathComTexto(("CONTAS"));

		// preencher conta
		preencherCampoPorLocatorComTexto((By.className("android.widget.EditText")), "Conta Pannuvia4");
		// this.seuBarrigaNativoIncluirContaPage.campoContas("Conta").sendKeys("Conta Pannuvia");

		// clicar em "SALVAR"
		// clicarNoElementoPorXPathComTexto(("SALVAR"));
		this.seuBarrigaNativoIncluirContaPage.botaoSalvar("SALVAR").click();

		// validar se login foi realizado com sucesso através do texto "Conta adicionada com sucesso"
		// this.seuBarrigaNativoIncluirContaPage.mensagem("Conta adicionada com sucesso");
		validarSeExisteElementoPorXpathComOTexto("Conta adicionada com sucesso");

	}

}
