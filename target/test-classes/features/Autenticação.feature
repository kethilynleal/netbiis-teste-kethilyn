#language: pt
#autor: kethilyn.leal@gmail.com

@Executa
Funcionalidade: Teste de autenticação Futsat
  Eu como usuário do site, quero realizar login
  Utilizando um usuário real, depois tentar com usuário inválido

  Contexto: Abro o site
  	Dado que eu acesse o site "https://futstat-match-web-staging.azurewebsites.net/"

  @Executa
  Cenario: Realizo teste de autenticação correta
    Quando realizo login no site com dados corretos
    E faço a validação do login com dados corretos
    E tiro evidência do login correto
    Entao encerro o teste
   
  @Executa  
  Cenario: Realizo teste de autenticação incorreta
    Quando realizo login no site com dados incorretos
    E faço a validação do login com dados incorretos
    E tiro evidência do login incorreto
    Entao encerro o teste
