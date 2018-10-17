package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PesquisarVideoYoutubeSteps {

	WebDriver driver;
	WebElement element;


	@Dado("^que estou acessando o youtube$")
	public void queEstouAcessandoOYoutube() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Backup\\Residência\\Driver\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}

	@Quando("^eu pesquisar \"([^\"]*)\"$")
	public void euPesquisar(String arg1) throws Throwable {
		driver.findElement(By.name("search_query")).sendKeys(arg1 + Keys.ENTER);
	}

	@Quando("^clicar pesquisar$")
	public void clicarPesquisar() throws Throwable {

		List<WebElement> search_result = driver.findElements(By.cssSelector("#results ol#search-results>li h3>a"));
		for (WebElement each_result : search_result) {
			System.out.println(each_result.getAttribute("title"));
		}
	}

	@Entao("^pesquisa concluida$")
	public void pesquisaConcluida() throws Throwable {
		System.out.println("Pesquisa concluida com sucesso");
	}

	@Dado("^que eu pesquisei \"([^\"]*)\"$")
	public void queEuPesquisei(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Backup\\Residência\\Driver\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=" + arg1);
	}

	@Quando("^eu selecionar o primeiro video$")
	public void euSelecionarOPrimeiroVideo() throws Throwable {
		List<WebElement> videos = driver.findElements(By.tagName("ytd-video-renderer"));
		videos.get(0).click();
	}

	@Entao("^ele deve tocar$")
	public void eleDeveTocar() throws Throwable {
		System.out.println("Video selecionado tocando");
	}

	@Dado("^que estou assistindo \"([^\"]*)\"$")
	public void queEstouAssistindo(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Backup\\Residência\\Driver\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get(arg1);
	}

	@Quando("^selecionar o video$")
	public void selecionarOVideo() throws Throwable {
		List<WebElement> videos = driver.findElements(By.tagName("ytd-compact-video-renderer"));
		videos.get(0).click();
	}

	@Entao("^ele deve trocar$")
	public void eleDeveTrocar() throws Throwable {
		System.out.println("Video selecionado da lista lateral com sucesso");
	}

}
