package calculadora.app;

import java.util.List;

public class Calculadora {
	private List<String> listaResultados;
	private double resultadoActual;

	public Calculadora(List<String> listaResultados, double resultadoActual) {
		this.listaResultados = listaResultados;
		this.resultadoActual = resultadoActual;
	}

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

	public double getResultadoActual() {
		return resultadoActual;
	}

	public void setResultadoActual(double resultadoActual) {
		this.resultadoActual = resultadoActual;
	}

	public List<String> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(String operacion) {
		listaResultados.add(operacion);
	}

}
