package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * site: http://www.juliodelima.com.br/taskit
 * usuario: diegomes2023
 * senha: diegomes2023
 */

public class InformacoesUsusarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("http://www.juliodelima.com.br/taskit");  //=> acessa a pagina de login
        navegador.findElement(By.linkText("Sign in")).click();//=> clicar no texto "Sign in"

//        clicar no campo com o id:"login-sign-in"
//        preencher o campo com o usuario
//        clicar no campo com o id:"password-sign-in"
//        preencher o campo com a senha
//        clicar no link que tenha o id:"btn-submit-sign-in"
//        valida que o usuario esta logado atraves da class="me"

    }
}
