package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	// Elementos Privados
	
	private By email = By.id("email");
	private By senha = By.id("password");
	private By token = By.id("token");
	private By botaoLogin = By.id("button");
	private By validarLoginInvalido = By.xpath("/html/body/div[2]/div[3]/div/div[2]/p");
	private By validarLogin = By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div[1]/span/span[2]/span/h6");

	// Elementos Públicos
	
	public By getEmail() {
		return email;
	}

	public By getValidarLoginInvalido() {
		return validarLoginInvalido;
	}

	public By getValidarLogin() {
		return validarLogin;
	}

	public By getToken() {
		return token;
	}

	public By getSenha() {
		return senha;
	}

	public By getBotaoLogin() {
		return botaoLogin;
	}
	
}
