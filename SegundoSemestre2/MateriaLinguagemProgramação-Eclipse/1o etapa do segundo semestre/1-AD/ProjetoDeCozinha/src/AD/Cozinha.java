package AD;

public class Cozinha {
	int pratos;
	String cozinhas;
	int cozinheiros;
	
	public void cozinhar(int prat) {
		pratos = prat;
	
		System.out.println("O n�mero de pratos informado est� preparado com sucesso! " + prat + " pratos no total.");
	}
	
	
	public void Lavarlouca() {
		System.out.println("Possuimos " + cozinheiros + " cozinheiros e toda a lou�a foi lava com sucesso");
		System.out.println("Muito obrigado :D");
	}
	
}
