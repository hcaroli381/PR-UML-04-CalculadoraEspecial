package calculadora.app;

import calculadora.dominio.Analizador;
import calculadora.dominio.ResultadoAnalisis;

public class GestorCalculadora {

	private Consola consola;
	private Calculadora calculadora;
	private Analizador analizador;

	public GestorCalculadora(Consola consola, Calculadora calculadora) {
		this.consola = consola;
		this.calculadora = calculadora;
		this.analizador = new Analizador();
	}

	// ejecucion de la calculadora (enter)
	public void ejecutar() {
		boolean quit = true;
		String ejecucion;
		double valorFinal;

		do {
			ejecucion = consola.leerTexto(">");
			ResultadoAnalisis resultado = analizador.analizar(ejecucion, this.calculadora.getResultadoActual());

			switch (resultado.comando()) {
			case CALCULO -> {
				valorFinal = calculadora.calcular(resultado.numeros(), resultado.operadores());
				consola.escribirLinea("" + valorFinal);
				calculadora.registrarOperacion(ejecucion, valorFinal);
			}

			case LIST -> {
				if (calculadora.getListaResultados().isEmpty()) {
					consola.escribirLinea("No hay historial para mostrar");
				}
			}
			}

		} while (quit);

	}

}
