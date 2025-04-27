package br.dev.samarasantos.temperatura.model;

public class Temperatura {

	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double converterParaKelvin () {
		 return this.celsius + 273.15;
		 
		
	}
	public double converterParaFahrenheit () {
		return  (this.celsius * 9.0/5.0) + 32;
		
	}
}
