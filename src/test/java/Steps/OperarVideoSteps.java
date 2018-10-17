package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OperarVideoSteps {
	WebDriver driver;
	
	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}
	
	@Test
	@Dado("^o video \"([^\"]*)\"$")
	public void oVideo(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Backup\\Residência\\Driver\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=fB8TyLTD7EE");
	}
	
	@Test
	@Quando("^clicar no play$")
	public void clicarNoPlay() throws Throwable {
	   driver.findElement(By.cssSelector("#movie_player")).click();	   
	}

	@Test
	@Entao("^pausar o video$")
	public void pausarOVideo() throws Throwable {
		System.out.println("Video pausado");
	}
	
	@Test
	@Dado("^esta pausado$")
	public void estaPausado() throws Throwable {
		driver.findElement(By.cssSelector("#movie_player")).click();	 
	}
	
	@Test
	@Entao("^continuar o video$")
	public void continuarOVideo() throws Throwable {
		System.out.println("Video Continuado");
	}
	
	@Test
	@Quando("^eu setar o volume para \"([^\"]*)\"$")
	public void euSetarOVolumePara(String arg1) throws Throwable {
	    WebElement video = driver.findElement(By.cssSelector(".ytp-volume-panel"));
	    video.findElement(By.name("aria-valuetext")).sendKeys(arg1);
	
	}

	@Test
	@Entao("^o volume deve ser reajustado$")
	public void oVolumeDeveSerReajustado() throws Throwable {
	    System.out.println("Volume alterado");
	}
	
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}
