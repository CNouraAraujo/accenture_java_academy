package atividades_accenture_dia1;

public class Atividade02 {
	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numero = 8; 
		boolean achou = false;
		int position = 0;

		for (int i = 0; i < 10; i++) {
			if (vetor[i] == 8) {
				achou = true;
				position = i;
			}
			
		}
		if (achou) {
			System.out.println("Achei");
			System.out.printf("Na posição %d está localizado o numero %d", position, numero);
			// O primeiro erro estava ao tentar utilizar duas variáveis do escopo do loop FOR
			// O segundo erro estava ao tentar utilizar o print Line em um print Formatado
		}
	}
}
