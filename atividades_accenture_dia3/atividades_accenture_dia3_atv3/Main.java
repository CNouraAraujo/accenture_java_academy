package atividades_accenture_dia3_atv3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(10, 5);
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		printarJOption(retangulo.getArea(), retangulo.getPerimetro(), retangulo.getLado1(), retangulo.getLado2());
		
		retangulo.setLado2(7);
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		printarJOption(retangulo.getArea(), retangulo.getPerimetro(), retangulo.getLado1(), retangulo.getLado2());
		
		Retangulo retangulo2 = new Retangulo(11, 5);
		retangulo2.calcularArea();
		retangulo2.calcularPerimetro();
		printarJOption(retangulo2.getArea(), retangulo2.getPerimetro(), retangulo2.getLado1(), retangulo2.getLado2());
		
		Retangulo retangulo3 = new Retangulo(44, 9);
		retangulo3.calcularArea();
		retangulo3.calcularPerimetro();
		printarJOption(retangulo3.getArea(), retangulo3.getPerimetro(), retangulo3.getLado1(), retangulo3.getLado2());
		
		Retangulo retangulo4 = new Retangulo(10, 34);
		retangulo4.calcularArea();
		retangulo4.calcularPerimetro();
		printarJOption(retangulo4.getArea(), retangulo4.getPerimetro(), retangulo4.getLado1(), retangulo4.getLado2());
		
		Retangulo retangulo5 = new Retangulo(21, 13);
		retangulo5.calcularArea();
		retangulo5.calcularPerimetro();
		printarJOption(retangulo5.getArea(), retangulo5.getPerimetro(), retangulo5.getLado1(), retangulo5.getLado2());
		
		Retangulo retangulo6 = new Retangulo(10, 10);
		retangulo6.calcularArea();
		retangulo6.calcularPerimetro();
		printarJOption(retangulo6.getArea(), retangulo6.getPerimetro(), retangulo6.getLado1(), retangulo6.getLado2());
	
	}
	public static void printarJOption(double area, double perimetro, double lado1, double lado2) {
		JOptionPane.showMessageDialog(null, area, "Área para: "+ "("+lado1+" - "+ lado2+")", 1);
		JOptionPane.showMessageDialog(null, perimetro, "Perímetro para: "+ "("+lado1+" - "+ lado2+")", 1);
	}
}
