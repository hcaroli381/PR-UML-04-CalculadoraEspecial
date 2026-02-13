package calculadora.dominio;

import java.util.List;

public class Operacion {
	Analizador analizador = new Analizador();
	private String entrada;

	private double resultado;

	public Operacion(String entrada) {
		this.setEntrada(entrada);
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

}
