package calculadora.dominio;

import java.util.List;

public class Operacion {
	Analizador analizador = new Analizador();
	private String entrada;
	private ResultadoAnalisis resultado;

	public Operacion(String entrada, int resultado) {
		this.entrada = entrada;
		this.resultado = analizador.analizar(entrada, resultado);
	}

}
