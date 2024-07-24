package atividades_accenture_dia2;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        String[][] board = {
                {"R", "N", "B", "Q", "K", "B", "N", "R"},
                {"P", "P", "P", "P", "P", "P", "P", "P"},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {"p", "p", "p", "p", "p", "p", "p", "p"},
                {"r", "n", "b", "q", "k", "b", "n", "r"}
        };

        Scanner scanner = new Scanner(System.in);
        boolean jogoContinua = true;

        while (jogoContinua) {
            imprimirBoard(board);

            System.out.println("Digite a linha e coluna da peça que deseja mover (ex: 6 2): ");
            int linhaOrigem = scanner.nextInt();
            int colunaOrigem = scanner.nextInt();

            System.out.println("Digite a linha e coluna de destino (ex: 4 2): ");
            int linhaDestino = scanner.nextInt();
            int colunaDestino = scanner.nextInt();

            if (movimentoValido(board, linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
                board[linhaDestino][colunaDestino] = board[linhaOrigem][colunaOrigem];
                board[linhaOrigem][colunaOrigem] = " ";
            } else {
                System.out.println("Movimento inválido! Tente novamente.");
            }
        }

        scanner.close();
    }

    public static void imprimirBoard(String[][] board) {
        System.out.print("\n  0 1 2 3 4 5 6 7\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean movimentoValido(String[][] board, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
        // Verificar se a posição de origem contém uma peça
        if (board[linhaOrigem][colunaOrigem].equals(" ")) {
            return false;
        }
        // Verificar se a posição de destino está vazia
        if (!board[linhaDestino][colunaDestino].equals(" ")) {
            return false;
        }
        // Adicionar outras regras de movimento conforme necessário
        return true;
    }
}
