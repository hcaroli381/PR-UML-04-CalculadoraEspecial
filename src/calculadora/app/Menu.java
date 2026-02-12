package calculadora.app;

public class Menu {
	private Consola consola;

	public Menu(Consola consola) {
		this.consola = consola;

	}

	public void mostrar() {
		consola.escribirLinea("CALCULADORA");
		consola.escribirLinea("----------------");
	}

	public String leerOpcion() {
		return consola.leerTexto(">");
	}
}
