package atividades_accenture_dia3_atv4;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(10);
		circulo.calcularArea();
		circulo.calcularPerimetro();
		printarJOption(circulo.getRaio(), circulo.getArea(), circulo.getPerimetro());
		circulo.setRaio(4);
		circulo.calcularArea();
		circulo.calcularPerimetro();
		printarJOption(circulo.getRaio(), circulo.getArea(), circulo.getPerimetro());
		
		Circulo circulo2 = new Circulo(22);
		circulo2.calcularArea();
		circulo2.calcularPerimetro();
		printarJOption(circulo2.getRaio(), circulo2.getArea(), circulo2.getPerimetro());
		circulo2.setRaio(52);
		circulo2.calcularArea();
		circulo2.calcularPerimetro();
		printarJOption(circulo2.getRaio(), circulo2.getArea(), circulo2.getPerimetro());
		
		Circulo circulo3 = new Circulo(5);
		circulo3.calcularArea();
		circulo3.calcularPerimetro();
		printarJOption(circulo3.getRaio(), circulo3.getArea(), circulo3.getPerimetro());
		circulo3.setRaio(40);
		circulo3.calcularArea();
		circulo3.calcularPerimetro();
		printarJOption(circulo3.getRaio(), circulo3.getArea(), circulo3.getPerimetro());
		
		Circulo circulo4 = new Circulo(88);
		circulo4.calcularArea();
		circulo4.calcularPerimetro();
		printarJOption(circulo4.getRaio(), circulo4.getArea(), circulo4.getPerimetro());
		circulo4.setRaio(4);
		circulo4.calcularArea();
		circulo4.calcularPerimetro();
		printarJOption(circulo4.getRaio(), circulo4.getArea(), circulo4.getPerimetro());
		
		Circulo circulo5 = new Circulo(23);
		circulo5.calcularArea();
		circulo5.calcularPerimetro();
		printarJOption(circulo5.getRaio(), circulo5.getArea(), circulo5.getPerimetro());
		circulo5.setRaio(2);
		circulo5.calcularArea();
		circulo5.calcularPerimetro();
		printarJOption(circulo5.getRaio(), circulo5.getArea(), circulo5.getPerimetro());
		
		Circulo circulo6 = new Circulo(15);
		circulo6.calcularArea();
		circulo6.calcularPerimetro();
		printarJOption(circulo6.getRaio(), circulo6.getArea(), circulo6.getPerimetro());
		circulo6.setRaio(8);
		circulo6.calcularArea();
		circulo6.calcularPerimetro();
		printarJOption(circulo6.getRaio(), circulo6.getArea(), circulo6.getPerimetro());

	}

	public static void printarJOption(double raio, double area, double perimetro) {
		JOptionPane.showMessageDialog(null, area, "Área para raio: " + "(" + raio + ")", 1);
		JOptionPane.showMessageDialog(null, perimetro, "Perímetro para raio: " + "(" + raio + ")", 1);
	}
}
