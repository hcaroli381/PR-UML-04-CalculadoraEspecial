package calculadora.app;

import calculadora.dominio.Analizador;
import calculadora.dominio.ResultadoAnalisis;
import calculadora.dominio.TipoOperador;

public class GestorCalculadora {

	private Consola consola;
	private Calculadora calculadora;
	private Analizador analizador;
	private ResultadoAnalisis resultadoAnalisis;
	private TipoOperador tipoOperador;

	public GestorCalculadora(Consola consola, Calculadora calculadora) {
		this.consola = consola;
		this.calculadora = calculadora;
	}

	// ejecucion de la calculadora (enter)
	public void ejecutar() {
		boolean quit = false;
		String ejecucion;
		double resultadoActual = 0;
		double numero1, numero2;
		do {
			ejecucion = consola.leerTexto(">");
			calculadora.setListaResultados(ejecucion);
			resultadoAnalisis = analizador.analizar(ejecucion, resultadoActual);
			numero1 = resultadoAnalisis.numeros().getFirst();
			numero2 = resultadoAnalisis.numeros().getLast();
			resultadoActual = switch (resultadoAnalisis.operadores()) {
			case default -> 0;
			};
			if (ejecucion == "quit") {
				quit = true;
			}
		} while (quit = false);

	}

}
