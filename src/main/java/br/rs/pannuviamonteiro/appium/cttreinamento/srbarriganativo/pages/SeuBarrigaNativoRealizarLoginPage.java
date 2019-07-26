package br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.pages;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;
import io.appium.java_client.MobileElement;

public class SeuBarrigaNativoRealizarLoginPage extends BasePage {

	public MobileElement campoNome(String nome) {
		return elementoPorXPathComTexto(nome);
	}
	
	public MobileElement campoSenha(String senha) {
		return elementoPorXPathComTexto(senha);
	}
	
	public MobileElement botaoEntrar(String textoBotao) {
		return elementoPorXPathComTexto(textoBotao);
	}
	
	public MobileElement textoMenu(String textoMenu) {
		return elementoPorXPathComTexto(textoMenu);
	}
	
}
