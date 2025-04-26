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
		 kelvin = celsius + 273.15;
		 return kelvin;
		
	}
	public double converterParaFahreinheit (double fahreheit) {
		fahreheit = (celsius * 9/5) + 32;
		return fahreheit;
	}
}
