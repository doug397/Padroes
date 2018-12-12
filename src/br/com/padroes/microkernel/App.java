package br.com.padroes.microkernel;

public class App {

	public static void main(String[] args) {
		ICore core = new Core();
		core.init();

	}

}
