package atividades_accenture_dia2;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        String[][] tabuleiro = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };
        
        Scanner scanner = new Scanner(System.in);
        String jogadorAtual = "X";
        boolean jogoContinua = true;
        
        while (jogoContinua) {
            // Chamada para imprimir o tabuleiro
            imprimirTabuleiro(tabuleiro);

            // Entrada do jogador
            System.out.println("Jogador " + jogadorAtual + ", insira suas coordenadas (linha e coluna): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            // Verificar se a jogada é válida
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna].equals(" ")) {
                tabuleiro[linha][coluna] = jogadorAtual;
                
                // Verificar vencedor
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogadorAtual + " vence!");
                    jogoContinua = false;
                } else if (tabuleiroCheio(tabuleiro)) {
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("O jogo empatou!");
                    jogoContinua = false;
                } else {
                    jogadorAtual = jogadorAtual.equals("X") ? "O" : "X";
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
// Aqui foi definida uma função chamada imprimir tabuleiro para ser chamada toda vez que houver atualização
    public static void imprimirTabuleiro(String[][] tabuleiro) {
        System.out.print("\n\n 0   1   2\n\n");
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
                System.out.print("\n-----------");
            }
            System.out.println("\n");
        }
    }

    public static boolean verificarVencedor(String[][] tabuleiro, String jogador) {
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0].equals(jogador) && tabuleiro[i][1].equals(jogador) && tabuleiro[i][2].equals(jogador)) {
                return true;
            }
            if (tabuleiro[0][i].equals(jogador) && tabuleiro[1][i].equals(jogador) && tabuleiro[2][i].equals(jogador)) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador)) {
            return true;
        }
        if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador)) {
            return true;
        }
        return false;
    }

    public static boolean tabuleiroCheio(String[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
