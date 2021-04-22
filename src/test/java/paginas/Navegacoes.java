package paginas;

import java.io.IOException;

import elementos.ElementosWeb;

public class Navegacoes {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	public void loginFutsat (String email, String senha, String token, String descricaoPasso) throws IOException {
		
		metodos.escrever(el.getEmail(), email, "Escrevo e-mail");
		metodos.escrever(el.getSenha(), senha, "Escrevo a senha");
		metodos.escrever(el.getToken(), token, "Escrevo o token");
		metodos.clicar(el.getBotaoLogin(), "Clico no botão login");
		
	}
	
	public void validarLogin (String descricaoPasso) throws IOException, InterruptedException {
		
		metodos.pausa(4000, "Espero dois segundos");
		metodos.validarTexto(el.getValidarLogin(), "MAQUINA UNIAO SUB 10", "Valido o login");
		
	}
	
	public void validarLoginInvalido (String descricaoPasso) throws IOException, InterruptedException {
		
		metodos.pausa(4000, "Espero dois segundos");
		metodos.validarTexto(el.getValidarLoginInvalido(), "O Token deve possuir 8 dígitos", "Valido o login invalido");
		
	}
	
	public void printScreen (String nomePrint, String descricaoPasso) throws IOException {
		
		metodos.screnShoot(nomePrint);
		
	}

}
