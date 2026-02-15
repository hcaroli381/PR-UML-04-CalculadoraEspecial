package calculadora.app;

public class Operacion {

	private String entrada;
	private double resultado;

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

	public String toString() {
		return entrada;
	}
}
