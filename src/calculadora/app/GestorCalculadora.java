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
				} else {
					for (int i = 0; i < calculadora.getListaResultados().size(); i++) {
						consola.escribirLinea((i + 1) + ". " + calculadora.getListaResultados().get(i).toString());
					}
				}
				consola.escribirLinea("Resultado actual :" + calculadora.getResultadoActual());
			}
			case RESET -> {
				calculadora.reset();
				consola.escribirLinea("Reinicio de calculadora");
			}
			case RESULT -> {
				consola.escribirLinea("Resultado actual :" + calculadora.getResultadoActual());
			}
			case QUIT -> {
				consola.escribirLinea("Saliendo...");
				quit = false;
			}
			case ERROR -> {
				consola.escribirLinea("ERROR" + resultado.mensajeError());
			}
			}

		} while (quit);

	}

}
