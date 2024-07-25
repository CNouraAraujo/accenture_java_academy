package atividades_accenture_dia3_atv2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JogoDaVelha {
    public static void main(String[] args) {
        String[][] tabuleiro = {
            {"     ", "     ", "     "},
            {"     ", "     ", "     "},
            {"     ", "     ", "     "}
        };
        
        Scanner scanner = new Scanner(System.in);
        String jogadorAtual = "X";
        boolean jogoContinua = true;
        
        while (jogoContinua) {
            // Chamada para imprimir o tabuleiro
            imprimirTabuleiro(tabuleiro);
            JOptionPane.showMessageDialog(null, imprimirTabuleiro(tabuleiro), "Jogador atual: " +jogadorAtual, 1);
            // Entrada do jogador
            String linha_input_dialog = JOptionPane.showInputDialog("Digite a Linha: ");
            String coluna_input_dialog = JOptionPane.showInputDialog("Digite a Coluna: ");
//            int linha = scanner.nextInt();
            int linha = Integer.parseInt(linha_input_dialog);
            int coluna = Integer.parseInt(coluna_input_dialog);

            // Verificar se a jogada é válida
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna].equals(" ")) {
                tabuleiro[linha][coluna] = jogadorAtual;
                
                // Verificar vencedor
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    imprimirTabuleiro(tabuleiro);
                   String str_vencedor = "Jogador " + jogadorAtual + " vence!";
                    JOptionPane.showMessageDialog(null, str_vencedor);
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
// OBS: tive dificuldade nessa parte, utilizei IA para entender o que deveria ser feito pois não sabia que precisava construir uma String para passar como parametro no showMessageDialog
// OBS2: Também não conhecia a biblioteca StringBuilder!!!!
    public static String imprimirTabuleiro(String[][] tabuleiro) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n    0     1     2\n\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(" ").append(tabuleiro[i][j]);
                if (j < 2) {
                    sb.append(" |");
                }
            }
            sb.append("  ").append(i).append("\n");
            if (i < 2) {
                sb.append("------------------\n");
            }
        }
        return sb.toString();
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
