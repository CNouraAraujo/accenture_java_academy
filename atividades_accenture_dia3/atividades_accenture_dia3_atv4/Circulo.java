package atividades_accenture_dia3_atv4;

public class Circulo {
	private double raio;
	private double area;
	private double perimetro;
	private static final double PI = 3.14;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public Circulo() {

	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public static double getPi() {
		return PI;
	}

	public void calcularArea() {
		double area = Math.pow(this.raio, 2) * PI;
		this.area = area;
	}

	public void calcularPerimetro() {
		double perimetro = 2 * PI * this.raio;
		this.perimetro = perimetro;
	}

}
