package atividades_accenture_dia3_atv2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Xadrez {
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
            JOptionPane.showMessageDialog(null, imprimirBoard(board));
// OBS: DIFERENTE DO JOGO DA VELHA, OPTEI POR FILTRAR O CARACTER DA STRING NO XADREZ COMO FORMA DE APRENDIZADO, FAZENDO DE DUAS FORMAS DIFERENTES!!
//            System.out.println("Digite a linha e coluna da peça que deseja mover (ex: 6 2): ");
            String linha_coluna = JOptionPane.showInputDialog("Digite a linha e coluna da peça que deseja mover (ex: 6 2): ");
            int linhaOrigem = Character.getNumericValue(linha_coluna.charAt(0));
            int colunaOrigem = Character.getNumericValue(linha_coluna.charAt(2));
            
//            int linhaOrigem = scanner.nextInt();
//            int colunaOrigem = scanner.nextInt();

            System.out.println("Digite a linha e coluna de destino (ex: 4 2): ");
            String linha_coluna_destino = JOptionPane.showInputDialog("Digite a linha e coluna de destino (ex: 4 2): ");
            int linhaDestino = Character.getNumericValue(linha_coluna_destino.charAt(0));
            int colunaDestino = Character.getNumericValue(linha_coluna_destino.charAt(2));
//            int colunaDestino = scanner.nextInt();
//            int colunaDestino = scanner.nextInt();

            if (movimentoValido(board, linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
                board[linhaDestino][colunaDestino] = board[linhaOrigem][colunaOrigem];
                board[linhaOrigem][colunaOrigem] = " ";
            } else {
                System.out.println("Movimento inválido! Tente novamente.");
            }
        }

        scanner.close();
    }

    public static String imprimirBoard(String[][] board) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                sb.append(board[i][j]).append("  ");
            }
            sb.append("\n");
        }
        return sb.toString();
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
