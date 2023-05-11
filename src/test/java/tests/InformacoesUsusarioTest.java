package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * site: http://www.juliodelima.com.br/taskit
 * usuario: diegomes2023
 * senha: diegomes2023
 */

public class InformacoesUsusarioTest {

    String usuario = "diegomes2023";
    String senha = "diegomes2023";

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("http://www.juliodelima.com.br/taskit");  //=> acessa a pagina de login
        navegador.findElement(By.linkText("Sign in")).click();  //=> clicar no texto "Sign in"
        navegador.findElement(By.id("login-sign-in")).click();  //=> clicar no campo com o id:"login-sign-in"
        navegador.findElement(By.id("login-sign-in")).sendKeys(usuario);   //=> preencher o campo com o usuario
        navegador.findElement(By.id("password-sign-in")).click();  //=> clicar no campo com o id:"password-sign-in"
        navegador.findElement(By.id("password-sign-in")).sendKeys(senha);   //=> preencher o campo com a senha
        navegador.findElement(By.id("btn-submit-sign-in")).click();   //=> clicar no link que tenha o id:"btn-submit-sign-in"

        Thread.sleep(2000);
        WebElement me = navegador.findElement(By.className("me"));
        String texto = me.getText();

        assertEquals("Hi, diego",texto);

        navegador.close();
    }
}
