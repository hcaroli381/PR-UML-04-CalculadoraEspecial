package calculadora.app;

public class Main {

	public static void main(String[] args) {
		Consola consola = new Consola();
		Menu menu = new Menu(consola);

		menu.mostrar();
	}

}
