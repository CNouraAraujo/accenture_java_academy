package atividades_accenture_dia2;

import java.util.Scanner;

public class JogoDaVelha {
	// CODIGO SEM TRATAMENTO DE ERROS!!!!!!!!
	// CODIGO SEM TRATAMENTO DE ERROS!!!!!!!!
	// CODIGO SEM TRATAMENTO DE ERROS!!!!!!!!
	public static void main(String[] args) {
		String[][] tabuleiro = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

		Scanner sc = new Scanner(System.in);
		
		String player = "X";
		do {
			imprimirTabuleiro(tabuleiro);
			System.out.println("Digite sua jogada por coordenada do jogador "+player+": ");
			int eixoX = sc.nextInt();
			int eixoY = sc.nextInt();
			System.out.println(eixoX + " " + eixoY);
			tabuleiro[eixoX][eixoY] = player;
			imprimirTabuleiro(tabuleiro);
			vitoria(tabuleiro, player);
			if (player == "X") {
				player = "O";
			}
			else if (player == "O") {
				player = "X";
			}
		} while (true);
	}
	

	public static void imprimirTabuleiro(String tabuleiro[][]) {
		// impress�o do tabuleiro
		System.out.print("\n\n 0   1    2\n\n");
		for (int posicao1 = 0; posicao1 < 3; posicao1++) {
			for (int posicao2 = 0; posicao2 < 3; posicao2++) {
				System.out.print(" " + tabuleiro[posicao1][posicao2]);
				if (posicao2 < 2) {
					System.out.print(" | ");
				}
				if (posicao2 == 2) {
					System.out.print("  " + posicao1);
				}
			}
			if (posicao1 < 2) {
				System.out.print("\n------------");
			}
			System.out.println("\n");
		}
	}

	public static void vitoria(String[][] tabuleiro, String jogador) {
		if (tabuleiro[0][0] != " " && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[0][2] != " " && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[0][0] != " " && tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[0][1] != " " && tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[0][2] != " " && tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[0][0] != " " && tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[1][0] != " " && tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if (tabuleiro[2][0] != " " && tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2]) {
			System.out.println("Vitória do jogador " + jogador);
			System.exit(0);
		} else if(tabuleiro[0][0] != " " && tabuleiro[0][1] != " " && tabuleiro[0][2] != " " && tabuleiro[1][0] != " " && tabuleiro[1][1] != " " && tabuleiro[1][2] != " " && tabuleiro[2][0] != " " && tabuleiro[2][1] != " " && tabuleiro[2][2] != " "){
			System.out.println("Empate!");
			System.exit(0);
		}
	}
	

}
