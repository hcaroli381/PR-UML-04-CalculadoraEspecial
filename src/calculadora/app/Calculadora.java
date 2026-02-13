package calculadora.app;

import calculadora.dominio.Analizador;
import calculadora.dominio.ResultadoAnalisis;

public class Calculadora {
	Analizador analizador = new Analizador();
	ResultadoAnalisis resultadoAnalisis = new ResultadoAnalisis();

	private double sumar(double double1, double double2) {
		return double1 + double2;
	}

	private double restar(double double1, double double2) {
		return double1 - double2;
	}

	private double multiplicar(double double1, double double2) {
		return double1 * double2;
	}

	private double dividir(double double1, double double2) {
		return double1 / double2;
	}

	private double calcular(String entrada) {
		double entrada1,entrada2,resultado = 0;
		char simbolo;
		resultadoAnalisis = analizador.analizar(entrada, resultado);
		resultado = switch(analizador.) {
		case
		}
		
		
	}

}
