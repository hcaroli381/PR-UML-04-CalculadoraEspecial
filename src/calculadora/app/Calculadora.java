package calculadora.app;

import java.util.ArrayList;
import java.util.List;

import calculadora.dominio.TipoOperador;

public class Calculadora {
	private List<Operacion> listaResultados;
	private double resultadoActual;

	public Calculadora(List<Operacion> listaResultados, double resultadoActual) {
		this.listaResultados = new ArrayList<>();
		this.resultadoActual = resultadoActual;
	}

	public double calcular(List<Double> numeros, List<TipoOperador> operadores) {
		double acumulado = numeros.get(0);

		for (int i = 0; i < operadores.size(); i++) {
			double siguienteNumero = numeros.get(i + 1);
			TipoOperador operador = operadores.get(i);

			switch (operador) {
			case SUMA -> acumulado = sumar(acumulado, siguienteNumero);
			case RESTA -> acumulado = restar(acumulado, siguienteNumero);
			case MULTIPLICACION -> acumulado = multiplicar(acumulado, siguienteNumero);
			case DIVISION -> acumulado = dividir(acumulado, siguienteNumero);
			}
		}

		return acumulado;
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

	public List<Operacion> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(Operacion operacion) {
		listaResultados.add(operacion);
	}

	public void registrarOperacion(String entrada, double resultado) {
		this.resultadoActual = resultadoActual;
		this.listaResultados.add(new Operacion(entrada, resultado));
	}

	public void reset() {
		this.listaResultados.clear();
		this.resultadoActual = 0.0;
	}

	public List<Operacion> list() {
		return listaResultados;
	}

}
