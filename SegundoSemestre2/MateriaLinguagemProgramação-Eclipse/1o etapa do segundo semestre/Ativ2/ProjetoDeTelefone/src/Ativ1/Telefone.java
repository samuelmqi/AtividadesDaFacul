package Ativ1;

public class Telefone {
	//atributos(caracter�sticas) nome de atributos minusculos:
	//atributos � padr�o colocar aqui em cima, mas pode colocar em outro lugar
	String cor;
	String contato;
	String marca;
	
	/*public= publico, pode ser acessado pela classe principal ou outras classes. 
	 * void=Como n�o precisa de resposta, ent�o usa o void 
	 * pra n�o ter retorno de resposta nem uma. Por exemplo Boolean
	 * no lugar do void.
	 */
	//metodo sempre no infinito e com letra maiuscula no inicio
	//Metodos s�o nossas a��es, funcionalidades
	public void Ligar(String cont) {//metodo(comportamento) Ligar //variavel(Cont(parametro que o metodo ta recebendo) de contato) qualquer, pra o telefone ligar ele precisa do contato
		// pode atribuir atributo com o paramentro: mas se quisesse usar logo o parametro podia
		contato = cont;
		
		System.out.println("Ligando para " + cont);
	}
	
	public void TocarMusica() {
		System.out.println("Come�ando o som!");
	}
}