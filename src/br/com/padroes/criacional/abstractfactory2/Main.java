package br.com.padroes.criacional.abstractfactory2;

public class Main {
	
	public static void main(String[] args) {
		Core core = new Core();
		core.criarCarro(new FabricaCarroPopular());
	}

}
