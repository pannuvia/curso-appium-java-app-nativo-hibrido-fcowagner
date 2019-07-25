package br.rs.pannuviamonteiro.appium.cttreinamento.srbarrigahibrido.pages;

import static br.rs.pannuviamonteiro.appium.cttreinamento.core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;

public class SeuBarrigaHibridoPage extends BasePage {

	public WebElement preencherCampoEmail() {
		return getDriver().findElement((By.id("email")));
	}

	public WebElement preencherCampoSenha() {
		return getDriver().findElement((By.id("senha")));
	}

	public WebElement clicarBotaoEntrar() {
		return getDriver().findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement obterMensagem() {
		return getDriver().findElement(By.cssSelector("//div[@class='alert alert-success']"));
	}

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
