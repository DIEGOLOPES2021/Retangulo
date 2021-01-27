package br.com.empresa.model;

public class Retangulo {

	private double altura;
	private double base;
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return this.base;
	}
	
	public double calculaArea() {
		return this.base * this.altura;
	}
	
	public double calculaPerimetro() {
		
		return 2* (this.base = this.altura);
	}
	
}
