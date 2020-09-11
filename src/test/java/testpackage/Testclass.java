package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class Testclass {

	@Test
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		WebDriver driver = new ChromeDriver(capability);
		// driver = new ChromeDriver();
		driver.get(
				"https://sarathicov.nic.in:8443/cas/loin?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.close();

	}
}
