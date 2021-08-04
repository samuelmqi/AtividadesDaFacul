import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import javax.swing.JOptionPane;

public class CampeonatoBrasileiro {// 4 criar Classe Principal CampeonatoBrasileiro

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// 4.1) Criar um mapa contendo o time e o estado

		// times do tipo Time com nome, cor
		Time Atletico_MineroMap = new Time();
		Atletico_MineroMap.nome = "Atletico Mineiro";
		Atletico_MineroMap.cor = "Preto e Branco";

		Time CruzeiroMap = new Time();
		CruzeiroMap.nome = "Cruzeiro";
		CruzeiroMap.cor = "Azul e Branco";

		Time FluminenseMap = new Time();
		FluminenseMap.nome = "Fluminense";
		FluminenseMap.cor = "Verde e Vermelho";

		Time CoritibaMap = new Time();
		CoritibaMap.nome = "Coritiba";
		CoritibaMap.cor = "Verde e Branco";

		Time SantosMap = new Time();
		SantosMap.nome = "Santos";
		SantosMap.cor = "Preto e Branco";

		Time EC_VitoriaMap = new Time();
		EC_VitoriaMap.nome = "EC_Vitoria";
		EC_VitoriaMap.cor = "Preto e Vermelho";

		Time Sao_PauloMap = new Time();
		Sao_PauloMap.nome = "S�o Paulo";
		Sao_PauloMap.cor = "Preto, Vermelho e Branco";

		Time CorinthiansMap = new Time();
		CorinthiansMap.nome = "Corinthians";
		CorinthiansMap.cor = "Preto e Branco";

		Time BotafogoMap = new Time();
		BotafogoMap.nome = "Botafogo";
		BotafogoMap.cor = "Preto e Branco";

		Time CearaMap = new Time();
		CearaMap.nome = "Cear�";
		CearaMap.cor = "Peeto e Branco";

		// estados do tipo Estado com o nome dos estados, usando uma classe com o nome
		// Estado para n�o confundir
		Estado e1 = new Estado();
		e1.nome = "MG";
		Estado e2 = new Estado();
		e2.nome = "RJ";
		Estado e3 = new Estado();
		e3.nome = "PR";
		Estado e4 = new Estado();
		e4.nome = "SP";
		Estado e5 = new Estado();
		e5.nome = "ES";
		Estado e6 = new Estado();
		e6.nome = "CE";

		// mapa dos times e estados
		Map<Time, Estado> timesEstadosMap = new HashMap<>();

		timesEstadosMap.put(Atletico_MineroMap, e1);
		timesEstadosMap.put(CruzeiroMap, e1);
		timesEstadosMap.put(FluminenseMap, e2);
		timesEstadosMap.put(CoritibaMap, e3);
		timesEstadosMap.put(SantosMap, e4);
		timesEstadosMap.put(EC_VitoriaMap, e5);
		timesEstadosMap.put(Sao_PauloMap, e4);
		timesEstadosMap.put(CorinthiansMap, e4);
		timesEstadosMap.put(BotafogoMap, e2);
		timesEstadosMap.put(CearaMap, e6);

		// 4.2) Encontrar o time do estado desejado, interagir com o usu�rio para
		// informar a sigla do estado.
		System.out.println(
				"Lista do tipo map com os times e estados de cada time registrado na tabela implementado com o Switch:");
		System.out.println("Informe a sigla do estado do seu time ou Digite 'Sair' para fechar o programa :D ");
		String nomeEstados = "a";

		while (!"Sair".equalsIgnoreCase(nomeEstados)) {
			nomeEstados = input.nextLine();
			if (!"Sair".equalsIgnoreCase(nomeEstados)) {
				switch (nomeEstados) {

				case "MG":
					System.out.println("\nSeu time �: " + Atletico_MineroMap.nome + " | Possuindo as cores: "
							+ Atletico_MineroMap.cor + "\nOu " + CruzeiroMap.nome + " | Possuindo as cores: "
							+ CruzeiroMap.cor + "\nO estado dos dois �: " + e1.nome);
					System.out.println("Qual � o seu time? ");
					nomeEstados = input.nextLine();
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "RJ":
					System.out.println("\nSeu time �: " + FluminenseMap.nome + " | Possuindo as cores: "
							+ FluminenseMap.cor + "\nOu " + BotafogoMap.nome + " | Possuindo as cores: "
							+ BotafogoMap.cor + "\nO estado dos dois �: " + e2.nome);
					System.out.println("\nQual � o seu time? ");
					nomeEstados = input.nextLine();
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "PR":
					System.out.println("\nSeu time �: " + CoritibaMap.nome + " | Possuindo as cores: " + CoritibaMap.cor
							+ "\nO estado desse time �: " + e3.nome);
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "SP":
					System.out.println("\nSeu time �: " + SantosMap.nome + " | Possuindo as cores: " + SantosMap.cor
							+ "\nOu " + Sao_PauloMap.nome + " | Possuindo as cores: " + Sao_PauloMap.cor + "\nOu "
							+ CorinthiansMap.nome + " | Possuindo as cores: " + CorinthiansMap.cor
							+ "\nO estado dos tr�s �: " + e4.nome);
					System.out.println("\nQual � o seu time? ");
					nomeEstados = input.nextLine();
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "BA":
					System.out.println("\nSeu time �: " + EC_VitoriaMap.nome + " | Possuindo as cores: "
							+ EC_VitoriaMap.cor + "\nO estado desse time �: " + e5.nome);
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "CE":
					System.out.println("\nSeu time �: " + CearaMap.nome + " | Possuindo as cores: " + CearaMap.cor
							+ "\nO estado desse time �: " + e6.nome);
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				default:
					System.out.println("\nN�o possui time com esse estado, informe outro estado, que n�o seja o mesmo: "
							+ nomeEstados + "\nOu digite 'Sair' para fechar o programa");
				}
			}
			if (nomeEstados.equalsIgnoreCase("Sair")) {
				System.out.println("\nFechando o Switch...");
			}
		}

		System.out.println("\nEntrando no modo JOptionPane...\n");

		// 4.3) Criar uma cole��o de times-> Utilizar a interface List -> Implementa��o
		// ArrayList
		// Incluir 10 times
		List<String> colocacaoTimesList = new ArrayList<String>();

		Time Atletico_MineiroList = new Time();
		Atletico_MineiroList.nome = "Atletico Mineiro";
		Atletico_MineiroList.colocacao = 1;
		colocacaoTimesList.add(Atletico_MineiroList.nome + Atletico_MineiroList.colocacao);

		Time CruzeiroList = new Time();
		CruzeiroList.nome = "Cruzeiro";
		CruzeiroList.colocacao = 2;
		colocacaoTimesList.add(CruzeiroList.nome + CruzeiroList.colocacao);

		Time FluminenseList = new Time();
		FluminenseList.nome = "Fluminense";
		FluminenseList.colocacao = 3;
		colocacaoTimesList.add(FluminenseList.nome + FluminenseList.colocacao);

		Time CoritibaList = new Time();
		CoritibaList.nome = "Coritiba";
		CoritibaList.colocacao = 4;
		colocacaoTimesList.add(CoritibaList.nome + CoritibaList.colocacao);

		Time SantosList = new Time();
		SantosList.nome = "Santos";
		SantosList.colocacao = 5;
		colocacaoTimesList.add(SantosList.nome + SantosList.colocacao);

		Time EC_VitoriaList = new Time();
		EC_VitoriaList.nome = "EC Vit�ria";
		EC_VitoriaList.colocacao = 6;
		colocacaoTimesList.add(EC_VitoriaList.nome + EC_VitoriaList.colocacao);

		Time Sao_PauloList = new Time();
		Sao_PauloList.nome = "S�o Paulo";
		Sao_PauloList.colocacao = 7;
		colocacaoTimesList.add(SantosList.nome + Sao_PauloList.colocacao);

		Time CorinthiansList = new Time();
		CorinthiansList.nome = "Corinthians";
		CorinthiansList.colocacao = 8;
		colocacaoTimesList.add(CorinthiansList.nome + CorinthiansList.colocacao);

		Time BotafogoList = new Time();
		BotafogoList.nome = "Botafogo";
		BotafogoList.colocacao = 9;
		colocacaoTimesList.add(BotafogoList.nome + BotafogoList.colocacao);

		Time CearaList = new Time();
		CearaList.nome = "Cear�";
		CearaList.colocacao = 10;
		colocacaoTimesList.add(CearaList.nome + CearaList.colocacao);

		// Interagir com o usu�rio, via JOptionPane e perguntar qual o seu time do
		// cora��o
		String digitaTime = JOptionPane.showInputDialog("Qual � o seu time do cora��o: \n" + Atletico_MineiroList.nome
				+ " - MG\n" + CruzeiroList.nome + " - MG\n" + FluminenseList.nome + " - RJ\n" + CoritibaList.nome
				+ " - PR\n" + SantosList.nome + " - SP\n" + EC_VitoriaList.nome + " - ES\n" + Sao_PauloList.nome
				+ " - SP\n" + CorinthiansList.nome + " - SP\n" + BotafogoList.nome + " - RJ\n" + CearaList.nome
				+ " - CE\n");

		// Se o time existir, informar a mensagem "O seu time do cora��o esta na
		// coloca��o" + coloca��o.
		if (digitaTime.equalsIgnoreCase("Atletico Mineiro")) {
			colocacaoTimesList.get(0);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + Atletico_MineiroList.nome
					+ " esta na coloca��o: " + Atletico_MineiroList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Cruzeiro")) {
			colocacaoTimesList.get(1);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + CruzeiroList.nome + " esta na coloca��o: "
					+ CruzeiroList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Fluminense")) {
			colocacaoTimesList.get(2);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + FluminenseList.nome + " esta na coloca��o: "
					+ FluminenseList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Coritiba")) {
			colocacaoTimesList.get(3);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + CoritibaList.nome + " esta na coloca��o: "
					+ CoritibaList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Santos")) {
			colocacaoTimesList.get(4);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + SantosList.nome + " esta na coloca��o: "
					+ SantosList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("EC Vit�ria")) {
			colocacaoTimesList.get(5);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + EC_VitoriaList.nome + " esta na coloca��o: "
					+ EC_VitoriaList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("S�o Paulo")) {
			colocacaoTimesList.get(6);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + Sao_PauloList.nome + " esta na coloca��o: "
					+ Sao_PauloList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Corinthians")) {
			colocacaoTimesList.get(7);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + CorinthiansList.nome + " esta na coloca��o: "
					+ CorinthiansList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Botafogo")) {
			colocacaoTimesList.get(8);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + BotafogoList.nome + " esta na coloca��o: "
					+ BotafogoList.colocacao + "� lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Cear�")) {
			colocacaoTimesList.get(9);
			JOptionPane.showMessageDialog(null, "O seu time de cora��o " + CearaList.nome + " esta na coloca��o: "
					+ CearaList.colocacao + "� lugar da tabela");
		}
		// Se o time n�o existir, informar a mensagem: "Time n�o participando do
		// Brasileir�o!!!"
		else {
			JOptionPane.showMessageDialog(null, "Time n�o participando do Brasileir�o!!!");
		}
		JOptionPane.showMessageDialog(null, "Obrigado por usar o nosso software\nClick em OK para sair :D");

		// 4.4) Criar uma cole��o de torcedores -> Utilizar a interface List ->
		// Implementa��o ArrayList
		List colecaoTorcedorList = new ArrayList();

		// Incluir 5 torcedores
		Torcedor pedroTorcedor = new Torcedor();
		pedroTorcedor.nome = "Pedro";
		pedroTorcedor.idade = 18;
		colecaoTorcedorList.add(pedroTorcedor);

		Torcedor rodrigoTorcedor = new Torcedor();
		rodrigoTorcedor.nome = "Rodrigo";
		rodrigoTorcedor.idade = 24;
		colecaoTorcedorList.add(rodrigoTorcedor);

		Torcedor josueTorcedor = new Torcedor();
		josueTorcedor.nome = "Josue";
		josueTorcedor.idade = 18;
		colecaoTorcedorList.add(josueTorcedor);

		Torcedor samuelTorcedor = new Torcedor();
		samuelTorcedor.nome = "Samuel";
		samuelTorcedor.idade = 19;
		colecaoTorcedorList.add(samuelTorcedor);

		Torcedor rafaelaTorcedor = new Torcedor();
		rafaelaTorcedor.nome = "Rafaela";
		rafaelaTorcedor.idade = 30;
		colecaoTorcedorList.add(rafaelaTorcedor);

		// Incluir dois times para cada torcedor e Imprimir na tela os torcedores que
		// torcem pelo time Santos
		
		//outra maneira para incluir os dois times para cada Torcedor:
		
		//tirando a lista set torcedor do metodo timeSet � possivel puxar ela em outra classe, com isso � so passar o time em forma de objeto para a lista.
		//Time santos = new time();
		//santos.nome = "Santos";
		//pedroTorcedor.timesTorcedorSet.add(Atletico_MineiroList.nome ou CorinthiansMap.nome ou atleticoMineiroSet.nome ou santos.nome);
		
		System.out.println(
				"Lista tipo list(Os torcedores) e lista tipo set(Lista na classe Torcedores dos times) com o pessoal que torce para o Corinthians\n");
		System.out.println("Torcedores que torce para o Santos:");
		System.out.println("O " + pedroTorcedor.nome + " tem " + pedroTorcedor.idade + " anos e torce para o time: "
				+ pedroTorcedor.timeSet("Santos") + " e " + pedroTorcedor.timeSet("Atletico Mineiro") + "\n");
		System.out.println("O " + rodrigoTorcedor.nome + " tem " + rodrigoTorcedor.idade + " anos e torce para o time: "
				+ rodrigoTorcedor.timeSet("Santos") + " e " + rodrigoTorcedor.timeSet("Ceara") + "\n");

		// Imprimir na tela os torcedores que n�o torcem pelo time Santos
		System.out.println("Torcedores que n�o torce para o Santos:");
		System.out.println("O " + josueTorcedor.nome + " tem " + josueTorcedor.idade + " anos e torce para o time: "
				+ josueTorcedor.timeSet("Cruzeiro") + " e " + josueTorcedor.timeSet("Coritiba") + "\n");
		System.out.println("O " + samuelTorcedor.nome + " tem " + samuelTorcedor.idade + " anos e torce para o time: "
				+ samuelTorcedor.timeSet("Corinthians") + " e " + samuelTorcedor.timeSet("EC Vitoria") + "\n");
		System.out.println("A " + rafaelaTorcedor.nome + " tem " + rafaelaTorcedor.idade + " anos e torce para o time: "
				+ rafaelaTorcedor.timeSet("Fluminense") + " e " + pedroTorcedor.timeSet("Corinthians") + "\n");

		// Retirar da lista os torcedores que torcem para o Corinthians
		System.out.println("Lista tipo list dos torcedores sem o pessoal que torce para o Corinthians: ");
		colecaoTorcedorList.remove(samuelTorcedor);
		colecaoTorcedorList.remove(rafaelaTorcedor);

		// Imprimir na tela os torcedores que n�o torcem para o Corinthians
		for (int i = 0; i < colecaoTorcedorList.size(); i++) {

			Torcedor aux = (Torcedor) colecaoTorcedorList.get(i);

			System.out.println(
					aux.nome + " tem " + aux.idade + " anos e n�o torce para o " + aux.timeSet("Corinthians\n"));
		}

		// 4.5) Criar uma cole��o de times -> Utilizar a interface Set
		Set<String> colecaoTimesSet = new HashSet<>();

		// Criando um objeto do tipo Time com o nome da vari�vel atleticoMineiro
		Time atleticoMineiroSet = new Time();
		atleticoMineiroSet.nome = "Atl�tico Mineiro";

		// Incluindo o objeto q est� na vari�vel atleticoMineiro dentro da lista
		colecaoTimesSet.add(atleticoMineiroSet.nome);

		Time cruzeiroSet = new Time();
		cruzeiroSet.nome = "Cruzeiro";
		colecaoTimesSet.add(cruzeiroSet.nome);

		Time fluminenseSet = new Time();
		fluminenseSet.nome = "Fluminense";
		colecaoTimesSet.add(fluminenseSet.nome);

		Time coritibaSet = new Time();
		coritibaSet.nome = "Coritiba";
		colecaoTimesSet.add(coritibaSet.nome);

		Time santosSet = new Time();
		santosSet.nome = "Santos";
		colecaoTimesSet.add(santosSet.nome);

		// Imprimir na tela todos os nomes dos times
		System.out.println("Lista do tipo set dos times sem remover o ultimo da coloca��o: \n");
		Iterator<String> auxTimes = colecaoTimesSet.iterator();
		while (auxTimes.hasNext()) {
			String time = auxTimes.next();
			System.out.println(time);
			System.out.println("");
		}
		// Puxar pontua��o metodos ganhar, perder e empatar
		atleticoMineiroSet.ganhar(35);
		atleticoMineiroSet.perder(1);
		atleticoMineiroSet.empatar(2);

		cruzeiroSet.ganhar(0);
		cruzeiroSet.perder(1);
		cruzeiroSet.empatar(17);

		fluminenseSet.ganhar(25);
		fluminenseSet.perder(6);
		fluminenseSet.empatar(0);

		coritibaSet.ganhar(13);
		coritibaSet.perder(2);
		coritibaSet.empatar(12);

		santosSet.ganhar(13);
		santosSet.perder(0);
		santosSet.empatar(4);

		// Imprimir na tela o time da 1� coloca��o com o metodo colocacao
		System.out.println("Coloca��o da lista do tipo set dos times: \n");
		atleticoMineiroSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + atleticoMineiroSet.ganhar(0));
		System.out.println("");

		cruzeiroSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + cruzeiroSet.ganhar(0));
		System.out.println("");

		fluminenseSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + fluminenseSet.ganhar(0));
		System.out.println("");

		coritibaSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + coritibaSet.ganhar(0));
		System.out.println("");

		santosSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + santosSet.ganhar(0));

		// Retirar da cole��o o time da �ltima coloca��o
		// Remove o objeto que est� na vari�vel de refer�ncia cruzeiro
		colecaoTimesSet.remove(cruzeiroSet.nome);
		colecaoTimesSet.remove(santosSet.nome);

		// Imprimir na tela sem o ultimo da coloca��o
		System.out.println("\nLista do tipo set dos times sem o ultimo da coloca��o: \n");
		auxTimes = colecaoTimesSet.iterator();
		while (auxTimes.hasNext()) {
			String time = auxTimes.next();
			System.out.println(time);
			System.out.println("");
		}

	}

}