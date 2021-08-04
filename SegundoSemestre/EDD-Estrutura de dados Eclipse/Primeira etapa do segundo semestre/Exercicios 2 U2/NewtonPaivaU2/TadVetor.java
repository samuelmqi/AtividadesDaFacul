package NewtonPaivaU2;

import java.util.Arrays;//biblioteca array

public class TadVetor {// essa class tem como fun��o executar opera��es do Tad(tipo abstrato de dados)
						// do vetor

	/*
	 * Private: A �nica classe que tem acesso ao atributo � a pr�pria classe que o
	 * define ou seja, se uma classe Pessoa declara um atributo privado chamado
	 * nome, somente a classe Pessoa ter� acesso a ele. No caso somente o TadVetor
	 * ira poder acessar
	 */

	/*
	 * esse MAX � um controle pra controlar a quantidade maxima de itens que pode
	 * ser inserido dentro do vetor, como se ele fosse um limitador.
	 */
	private static final int MAX = 100; // constante= que permite no maximo 100
	private static final int VAZIO = -1;/*
										 * constante= Quando quiser verificar se um determinado espa�o do vetor esta
										 * vazio(0) ae se compara com essa constante. Tanto int como double
										 */

	// Tres atributos:
	// vetor que armazena os inteiros .
	private int[] v;// espa�o ainda n�o alocado.

	private int tamanho;// quantos itens ja tenho dentro desse vetor.

	private int capacidade;// e qual a capacidade desse vetor para armazenar esses itens.

	// public: Todos tem acesso.
	// construtor para criar a TAD Vetor.
	public TadVetor(int capacidade) {/*
										 * Um metodo dentro da class o TadVetor recebe um atributo.Ele fala qual � o
										 * tamanho do vetor que eu preciso
										 */
		/*
		 * this refere-se a se proprio, ele � necess�rio em situa��es que voc� precisa
		 * referenciar o proprio objeto. Voc� identifica a variavel local da classe.
		 */

		// o new � a forma como o Java trabalha aloca��o dinamica, ent�o toda vez que a
		// gente precisa alocar espa�o na memoria se usa o new.

		/*
		 * o tamanho do vetor ele vai ser definido pela capacidade que a gente informa a
		 * aloca��o n�o esta sendo feita em cima na declara��o, ela esta sendo feita na
		 * hora de criar o objeto.
		 */
		this.v = new int[capacidade];// aloca��o dinamica.
		this.tamanho = 0;// inicializo o tamanho com 0
		this.capacidade = capacidade;// inicializo a capacidade com o valor que foi solicitado
		// estou preparando o meu TadVetor pra ele criar o vetor da forma que eu desejo.

		/*
		 * for (int i = 0; i< v.length; i++){ Segunda maneira: Exercicio U2: Outra
		 * maneira de inicializar com o -1, utilizando a constante VAZIO e definindo ela
		 * para -1 ele verifica se o vetor esta vazio(0), se ele estiver ele coloca os
		 * -1 ate preencher no espa�o do vetor todo. v[i] = VAZIO; }
		 */

	}

	protected void imprimir() {// metodo para imprimir, o estado do TAD vetor
		System.out.println("TAD Vetor");// nome
		System.out.println("Tamanho/capacidade : " + tamanho + "/" + capacidade);// tamanho e capacidade

		/*
		 * Classe do java "Arrays" A gente consegue imprimir o conteudo do vetor usando
		 * o metodo da classe arrays toString ele converte os numeros para String.
		 */

		/*
		 * Arrays.fill(v, tamanho, v.length, -1); /* Primeira maneira: Exercicio U2:
		 * esse metodo fill substitui os valores dentro do vetor especifico, a partir do
		 * �ndice inicial a um �ndice final, no caso com -1, indicando o vetor, as
		 * posi��es desejadas "tamanho" colocando o length para saber o tamanho dele, o
		 * espa�o que ele foi alocado do vetor e colocando o numero que deseja
		 * substituir. O metodo utilizado funciona somente para tipo inteiros.
		 */
		System.out.println(Arrays.toString(v));// Imprimi o conteudo do vetor
	}

	// inserir um novo valor(uma chave) na TAD vetor
	public int inserir(int valor) {
		// verificar se h� espa�o disponivel
		if (tamanho == capacidade) {// comparando tamanho com a capacidade
			// System.out.println("O vetor j� est� cheio" + "N�o foi possivel inserir o
			// valor " + valor);
			// return -1;//n�o inseriu
			System.out.println("O vetor j� est� cheio");
			System.out.println("Ampliando o vetor...");
			// crescer o vetor para permitir a inser��o
			crescer();// chamando a fun��o crescer, ele ira aumentar o tamanho do vetor
		}

		// armazeno o valor
		v[tamanho] = valor;
		// atualizo o tamanho
		tamanho++;
		// retorno o indice onde o valor foi inserido
		return tamanho - 1;
	}

	private void crescer() {// esse metodo vai ampliar o espa�o, pra gente conseguir continuar recebendo
							// valores novos.
		// criar um vetor tempor�rio maior
		int[] temp = new int[capacidade * 2];/*
												 * dobrando a capacidade vetor temporario maior para poder armazenar os
												 * valores com um espa�o maior de memoria.
												 */

		/*
		 * for (int i = 0; i< temp.length; i++){ Continua��o da segunda
		 * maneira: Exercicio U2: Como a minha classe esta utlizando aloca��o dinamica
		 * � preciso fazer a mesma coisa no objeto(opere��o) que faz a aloca��o
		 * dinamica, pois quando o vetor encher ele ir� dar sequencia com o -1
		 * 
		 * temp[i] = VAZIO; }
		 */

		// copiar os valores do vetor atual para o temporario
		for (int i = 0; i < v.length; i++) {
			temp[i] = v[i];// copiando os valores de um vetor para o outro.
		}
		// atualizar o vetor para a nova alocacao
		v = temp;// ela pega referencia do objeto temporario da varivel vetor temp
		// v recebe temp, v vai receber o endere�o de memoria de temp
		capacidade = capacidade * 2;// capacidade recebe capacidade*2, ent�o isso que dizer que capacidade dobrou.

		System.out.println("Vetor ampliado para " + capacidade);
	}

}
