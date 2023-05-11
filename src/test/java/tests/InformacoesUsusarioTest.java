package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * site: <a href="http://www.juliodelima.com.br/taskit">...</a>
 * usuario: diegomes2023
 * senha: diegomes2023
 */

public class InformacoesUsusarioTest {
    private WebDriver navegador;
    @Before
    public void setup(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        this.navegador = new ChromeDriver();
    }
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() throws InterruptedException {
        String usuario = "diegomes2023";
        String senha = "diegomes2023";

        this.navegador.get("http://www.juliodelima.com.br/taskit");  //=> acessa a pagina de login
        this.navegador.findElement(By.linkText("Sign in")).click();  //=> clicar no texto "Sign in"
        this.navegador.findElement(By.id("login-sign-in")).click();  //=> clicar no campo com o id:"login-sign-in"
        this.navegador.findElement(By.id("login-sign-in")).sendKeys(usuario);   //=> preencher o campo com o usuario
        this.navegador.findElement(By.id("password-sign-in")).click();  //=> clicar no campo com o id:"password-sign-in"
        this.navegador.findElement(By.id("password-sign-in")).sendKeys(senha);   //=> preencher o campo com a senha
        this.navegador.findElement(By.id("btn-submit-sign-in")).click();   //=> clicar no link que tenha o id:"btn-submit-sign-in"

        Thread.sleep(2000);
        WebElement me = this.navegador.findElement(By.className("me"));
        String texto = me.getText();

        assertEquals("Hi, diego",texto);
    }
    @After
    public void tearDown(){
        this.navegador.close();
    }
}
