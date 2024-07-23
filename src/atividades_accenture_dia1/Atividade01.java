package atividades_accenture_dia1;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double total_a, total_b, total_c, total_value;

		System.out.print("Digite a quantidade de assentos da classe A: ");
		int a_class_quantity = sc.nextInt();

		System.out.print("Digite a quantidade de assentos da classe B: ");
		int b_class_quantity = sc.nextInt();

		System.out.print("Digite a quantidade de assentos da classe C: ");
		int c_class_quantity = sc.nextInt();

		total_a = a_class_quantity * 50;
		total_b = b_class_quantity * 30;
		total_c = c_class_quantity * 20;

		total_value = total_a + total_b + total_c;
		System.out.println();
		System.out.printf("O valor de A foi de R$: %.2f\n", total_a);
		System.out.printf("O valor de B foi de R$: %.2f\n", total_b);
		System.out.printf("O valor de C foi de R$: %.2f\n", total_c);
		System.out.println("============================================");
		System.out.printf("O valor total foi de R$: %.2f\n", total_value);

		sc.close();
	}

}
