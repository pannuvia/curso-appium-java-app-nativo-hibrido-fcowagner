package br.rs.pannuviamonteiro.appium.cttreinamento.instalacaoapk;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstalarAPKTest {
	
	private AndroidDriver<MobileElement> driver;
	
	@Test
	public void instalarAPK() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\DBSERVER\\BACKUP PROJETOS\\eclipse-workspace\\curso-appium-com-page-object-java-fcowagner\\src\\main\\resources\\CTAppium-1-2.apk");
		desiredCapabilities.setCapability("noReset", "true");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

		driver.quit();
	}
}
