package sla;

import java.util.Scanner;

public class sprint4 {

	static Scanner entrada = new Scanner(System.in);
	static int numEqui = 0;

	public static void numequi() {
		while (numEqui < 1) {
			System.out.println("-------------------------------");
			System.out.println("Digite a quantidade de equipes:");
			numEqui = entrada.nextInt();
			System.out.println("-------------------------------");
			if(numEqui<1) {
				System.out.println("Ops, valor inválido tente novamente.");
				numEqui=0;
			}
		}

	}

	public static void printar(int result[][]) {
		System.out.println("Equipe:" + " \t	" + "Pontos:" + "\t" + "	Estética:");
		int loop=0;
		while (loop < 3) {
			System.out.println(result[loop][0] + "\t	" + "\t	" + result[loop][1] + "\t" + "\t" + result[loop][2]);
			loop++;
		}
		System.out.println("---------------------------------------------------");

	}

	public static int[][] sorter(int result[][]) {

		int loop = 0;
		while (loop < numEqui - 1) {
			int loop2 = loop + 1;
			while (loop2 < numEqui) {
				if (result[loop][1] < result[loop2][1]
						|| (result[loop][1] == result[loop2][1] && result[loop][2] < result[loop2][2])) {
					// Troca as equipes de posição
					int tempEquipe = result[loop][0];
					int tempPontuacao = result[loop][1];
					int tempEstetica = result[loop][2];
					result[loop][0] = result[loop2][0];
					result[loop][1] = result[loop2][1];
					result[loop][2] = result[loop2][2];
					result[loop2][0] = tempEquipe;
					result[loop2][1] = tempPontuacao;
					result[loop2][2] = tempEstetica;
				}
				loop2++;
			}
			loop++;
		}

		return result;
	}

	public static int[][] bat(int result[][]) {

		int loop = 0;
		while (loop < numEqui) {
			int loop2 = loop + 1;
			while (loop2 < numEqui) {
				int equipeA = result[loop][0];
				int equipeB = result[loop2][0];

				// Gerar valores randômicos para cada equipe
				int resultadoEquipeA = (int) (Math.random() * 10);
				int resultadoEquipeB = (int) (Math.random() * 10);

				// Exibir os resultados da batalha
				System.out.println("Equipe  " + equipeA + " - " + resultadoEquipeA + " pontos "+ "  x  " +  resultadoEquipeB+" pontos" 
				 + " - "+" Equipe "+equipeB );

				// Comparar os resultados e atribuir pontos
				if (resultadoEquipeA > resultadoEquipeB) {
					System.out.println("Vitória da equipe: " + equipeA);
					result[loop][1] += 3;  // Vitória = +3 pontos
				} else if (resultadoEquipeA < resultadoEquipeB) {
					System.out.println("Vitória da equipe: " + equipeB);
					result[loop2][1] += 3; // Vitória = +3 pontos
				} else {
					System.out.println("Empate!");
					result[loop][1]  += 1;  // Empate = +1 ponto
					result[loop2][1] += 1; // Empate = +1 ponto
				}
				System.out.println("---------------------------------------------------");

				loop2++;
			}

			loop++;
		}
		return result;
	}

	public static int numEqui(int ctl) {

		int nome = 0;
		

		while ( nome < 1) {

			System.out.println("Digite o número da " + (ctl + 1) + "ª equipe:");
			nome = entrada.nextInt();
			if (nome < 1) {
				System.out.println("Valor inválido, tente novamente");
				nome = 0;
			}
			System.out.println("--------------------------------------------");
		}

		return nome;

	}
	public static int[][] este(int numEqui,int result[][]) {

		int loop=0;
		while (loop < numEqui) {

			result[loop][0] = numEqui(loop);

			// Criar e preencher o array estetica com critérios de desempate
			while (result[loop][2] < 1) {
				System.out.println("Digite a nota de estética para a equipe " + (loop + 1) + ":");
				result[loop][2] = entrada.nextInt();
				if (result[loop][2] > 10||result[loop][2]<0) {
					System.out.println("Valor inválido, tente novamente");
					result[loop][2] = 0;
					System.out.println("---------------------------");
				}
			}

			loop++;
		}
		
		return result;
	}
		
	public static void main(String[] args) {

		numequi();

		
		int[][] result = new int[numEqui][3];
		
		result =este(numEqui, result);
		// Criar e preencher o array estetica com critérios de desempate
		
	

		

		System.out.println("---------------------------------------------------");

		result = bat(result);

		// primero placar
		System.out.println(" ");
		System.out.println("Clasificados: :");

		// Calcular os resultados finais

		// Ordenar os resultados em ordem decrescente de pontuação e critério de
		// estética

		result = sorter(result);

		// Imprimir os clasificados
		printar(result);
		System.out.println(" ");
		System.out.println("------------Finais-----------------:");
		int[][] pontF = result.clone();
		numEqui = 3;
		pontF[0][1] = 0;
		pontF[1][1] = 0;
		pontF[2][1] = 0;
		System.out.println("---------------------------------------------------");

		pontF = bat(pontF);

		System.out.println("------------Pódio-----------------:");

		pontF = sorter(pontF);

		printar(pontF);

		System.out.println("------------Vencedor -----------------:");
		System.out.println("Equipe:" + " \t" + "Pontos:" + "\t" + "\t" + "Estética:");

		System.out.println(pontF[0][0] + "\t" + "\t" + pontF[0][1] + "\t" + "\t" + pontF[0][2]);
		System.out.println("---------------------------------------------------");

	}
}