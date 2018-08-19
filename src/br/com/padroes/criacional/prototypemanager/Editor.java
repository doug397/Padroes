package br.com.padroes.criacional.prototypemanager;

public class Editor {
	
	private IPrototype prototype;

	public Editor(IPrototype prototype) {
		
		this.prototype = prototype;
	}
	
	public void setScene() {
		IPrototype d1 = prototype.clone();
		IPrototype d2 = prototype.clone();
		IPrototype d3 = prototype.clone();
		IPrototype d4 = prototype.clone();
		
	}
}
