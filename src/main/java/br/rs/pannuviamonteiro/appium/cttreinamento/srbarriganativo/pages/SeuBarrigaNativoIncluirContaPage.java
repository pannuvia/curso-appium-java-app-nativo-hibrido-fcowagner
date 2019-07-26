package br.rs.pannuviamonteiro.appium.cttreinamento.srbarriganativo.pages;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;
import io.appium.java_client.MobileElement;

public class SeuBarrigaNativoIncluirContaPage extends BasePage {

	public MobileElement campoContas(String contas) {
		return elementoPorXPathComTexto(contas);
	}
	
	public MobileElement botaoSalvar(String textoBotao) {
		return elementoPorXPathComTexto(textoBotao);
	}
	
	public MobileElement mensagem(String textoMensagem) {
		return elementoPorXPathComTexto(textoMensagem);
	}
	
}
