package br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.pages;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;
import io.appium.java_client.MobileElement;

public class SeuBarrigaNativoIncluirContaPage extends BasePage {

	public MobileElement campoNomeConta(String nomeConta) {
		return elementoPorXPathComTexto(nomeConta);
	}
	
	public MobileElement botaoSalvar(String textoBotao) {
		return elementoPorXPathComTexto(textoBotao);
	}
	
	public MobileElement campoConta(String conta) {
		return textoPorLocator(conta);
	}
	
	public MobileElement mensagem(String textoMensagem) {
		return elementoPorXPathComTexto(textoMensagem);
	}
	
}
