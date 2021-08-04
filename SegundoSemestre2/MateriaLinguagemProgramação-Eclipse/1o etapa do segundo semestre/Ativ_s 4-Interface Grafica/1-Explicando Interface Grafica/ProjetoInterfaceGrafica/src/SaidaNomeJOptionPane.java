import javax.swing.JOptionPane;//JOptionPane � uma classe que possibilita a cria��o de uma caixa de dialogo padr�o que ou solicita um valor para o usu�rio ou retorna uma informa��o.Com alguns metodos e parametros
//Swing � uma biblioteca
//JOptionPane so entende Strings, � preciso converter para entender outros tipos de dados.

public class SaidaNomeJOptionPane {

	public static void main(String[] args) {

		// Usando recursos do JOptionPane
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String sobreNome = JOptionPane.showInputDialog("Digite o seu sobre nome: ");
//showInputDialog ele recebe o que eu digitar Igual o Scanner, so que em forma de tela

		JOptionPane.showInternalMessageDialog(null, "Nome completo -> " + nome + " " + sobreNome);
//showInternalMessageDialog ele mostra o que foi digitado pelo o usuario em forma de tela.
		// null --> um tipo de dado, mas pra que serve ? � um parametro que determina o
		// Quadro no qual o di�logo � exibido; se nulo, ou se o parentComponent n�o tem
		// nenhum quadro, um quadro padr�o � usado para enviar a mensagem do objeto

		JOptionPane.showConfirmDialog(null, "Deseja realmente seguir?");
		// showConfirmDialog para confirma algo...
	}

}
