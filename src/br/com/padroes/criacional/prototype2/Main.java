package br.com.padroes.criacional.prototype2;



public class Main {

	public static void main(String[] args) {
		
		IPrototype prototipoAro = new Aro16();
		
		IPrototype prototypo = prototipoAro.clonar();
		IPrototype prototypo2 = prototipoAro.clonar();
		IPrototype prototypo3 = prototipoAro.clonar();
		IPrototype prototypo4 = prototipoAro.clonar();
		IPrototype prototypo5 = prototipoAro.clonar();
		

	}

}
