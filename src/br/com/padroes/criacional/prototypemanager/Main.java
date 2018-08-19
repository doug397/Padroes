package br.com.padroes.criacional.prototypemanager;

public class Main {

	public static void main(String[] args) {
	
		
		Circulo c = new Circulo();
		Triangulo t = new Triangulo();
		Square s = new Square();
		
		IPrototype prototypo;
		
		prototypo= c.clone();
		prototypo = t.clone();
		prototypo = s.clone();
		
	}

}
