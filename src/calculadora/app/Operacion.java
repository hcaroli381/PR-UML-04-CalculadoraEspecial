package calculadora.app;

public class Operacion {

	private String entrada;
	private double resultado;

	/**
	 * Operacion que desea realizar
	 * 
	 * @param entrada   texto de la operacion
	 * @param resultado resultado tras realizar la operacion
	 */
	public Operacion(String entrada, double resultado) {
		this.setEntrada(entrada);
		this.setResultado(resultado);
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	/*
	 * ToString que se usa en la lista de operaciones de la calculadora , solo la
	 * entrada
	 */
	public String toString() {
		return entrada;
	}
}
