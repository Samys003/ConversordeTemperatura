package br.dev.samarasantos.temperatura.model;

public class Temperatura {

	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin (double kelvin) {
		return kelvin = celsius + 273.15;
		
	}
	
	public double converterParaFahreinheit (double fahreheit) {
		return fahreheit = (celsius * 1.8) + 32; 
	}
	
}
