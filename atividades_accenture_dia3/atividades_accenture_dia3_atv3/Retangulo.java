package atividades_accenture_dia3_atv3;

public class Retangulo {
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;

	public Retangulo() {
	}

	public Retangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void calcularArea() {
		double area;
		area = this.lado1 * this.lado2;
		this.area = area;
	}

	public void calcularPerimetro() {
		double perimetro;
		perimetro = (2 * this.lado1) + (2 * this.lado2);
		this.perimetro = perimetro;
	}

}
