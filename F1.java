package sla;

import java.util.Scanner;

public class F1 {

	static Scanner entrada = new Scanner(System.in);
	static String pilotos[] = new String[] { "Daniel", "Kimi", "Lewis", "Nico", "sebastian" };

	public static int[][] encher(String pais[]) {

		int pontu[][] = new int[5][5];
		for (int loop = 0; loop < 5; loop++) {
			for (int loop2 = 0; loop2 < 5; loop2++) {
				System.out.println("Digite a pontuaçao do " + pilotos[loop2] + " para a pista da/o " + pais[loop]);
				pontu[loop2][loop] = entrada.nextInt();

			}

		}

		return pontu;
	}

	public static void exibir(int somaP[]) {
		int vence = 0;
		for (int loop = 0; loop < 5; loop++) {

			if (somaP[loop] > somaP[vence]) {
				vence = loop;

			}

		}
		System.out.println("O grande vencedor foi o " + pilotos[vence] + " com " + somaP[vence] + " Pontos");

	}

	public static int[] vetGP(int pontu[][]) {
		int venceGP[] = new int[5];
		for (int loop = 0; loop < 5; loop++) {
			for (int loop2 = 0; loop2 < 5; loop2++) {
				
				
				if (pontu[    venceGP[loop]   ]    [loop2] > pontu[loop][loop2]) {
					venceGP[loop] = loop2;

				}

			}
		}

		return venceGP;
	}

	// [x][] = pista
	// [][x]=piloto

	public static int[] soma(int pontu[][]) {
		int somaP[] = new int[5];

		for (int loop = 0; loop < 5; loop++) {
			for (int loop2 = 0; loop2 < 5; loop2++) {
				somaP[loop] += pontu[loop][loop2];

			}
		}

		return somaP;
	}

	public static void theMain(String pais[]) {
		int pontu[][] = encher(pais);
		int somaP[] = soma(pontu);
		int venceGP[] = vetGP(pontu);

		for (int loop = 0; loop < 5; loop++) {
			System.out.println("O vencedor da gp de " + pais[loop] + " Foi o " + pilotos[venceGP[loop]]);

		}

		exibir(somaP);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pais[] = new String[] { "Bélgica", "Itália", "Cingapura", "Malásia", "Japão" };

		theMain(pais);

	}

}
