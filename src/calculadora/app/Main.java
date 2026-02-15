package calculadora.app;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Consola consola = new Consola();
		Calculadora calculadora = new Calculadora(new ArrayList<>(), 0);
		GestorCalculadora gestor = new GestorCalculadora(consola, calculadora);

		gestor.ejecutar();
		consola.cerrar();
	}

}
