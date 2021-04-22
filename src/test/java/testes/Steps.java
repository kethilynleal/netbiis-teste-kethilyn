package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import paginas.Metodos;
import paginas.Navegacoes;

public class Steps {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	Navegacoes nav = new Navegacoes();
	
	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) throws IOException {
		
		metodos.abrirNavegador(site, "CHROME", "Abro o navegador e o site");

	}
	
	@Quando("realizo login no site com dados corretos")
	public void realizo_login_no_site_com_dados_corretos() throws IOException {

		nav.loginFutsat("user@email.com", "123456", "F952818B", "Realizo login no site");
		
	}

	@Quando("realizo login no site com dados incorretos")
	public void realizo_login_no_site_com_dados_incorretos() throws IOException {

		nav.loginFutsat("user@email.com", "123456", "123456", "Realizo login no site");
		
	}

	@E("faço a validação do login com dados corretos")
	public void faço_a_validação_do_login_com_dados_corretos() throws IOException, InterruptedException {
		
		nav.validarLogin("Valido autenticação correta");

	}


	@E("faço a validação do login com dados incorretos")
	public void faço_a_validação_do_login_com_dados_incorretos() throws IOException, InterruptedException {
		
		nav.validarLoginInvalido("Valido autenticação incorreta");

	}

	@E("tiro evidência do login correto")
	public void tiro_evidência_do_login_correto() throws IOException {
		
		nav.printScreen("Login com dados corretos", "Tiro print do login com dados corretos");

	}

	@E("tiro evidência do login incorreto")
	public void tiro_evidência_do_login_incorreto() throws IOException {
		
		nav.printScreen("Login com dados incorretos", "Tiro print do login com dados incorretos");

	}

	@Entao("encerro o teste")
	public void encerro_o_teste() throws IOException {
		
		metodos.fecharBrowser("Fecho o navegador e encerro o teste");

	}
	
}
