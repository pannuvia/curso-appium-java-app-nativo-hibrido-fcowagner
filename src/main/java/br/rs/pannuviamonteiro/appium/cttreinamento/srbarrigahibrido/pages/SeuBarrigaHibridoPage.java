package br.rs.pannuviamonteiro.appium.cttreinamento.srbarrigahibrido.pages;

import static br.rs.pannuviamonteiro.appium.cttreinamento.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.rs.pannuviamonteiro.appium.cttreinamento.core.BasePage;

public class SeuBarrigaHibridoPage extends BasePage {

	public WebElement campoEmail() {
		return getDriver().findElement((By.id("email")));
	}

	public WebElement campoSenha() {
		return getDriver().findElement((By.id("senha")));
	}

	public WebElement botaoEntrar() {
		return getDriver().findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement campoMensagem() {
		return getDriver().findElement(By.cssSelector("//div[@class='alert alert-success']"));
	}
	
	

}
