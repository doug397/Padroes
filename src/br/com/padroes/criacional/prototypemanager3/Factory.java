package br.com.padroes.criacional.prototypemanager3;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	
	private List<IPrototype> colecao;
	private PrototypeManager manager;
	private static Factory instance;

	private Factory() {
		super();
		colecao = new ArrayList<IPrototype>();
		manager = new PrototypeManager();
	}
	
	public static Factory getInstance() {
		if(instance == null)
			instance = new Factory();
		return instance;
	}
	
	public void create (String key, int quantidade) {
		
		IPrototype prototype = manager.getPrototype(key);
		for(int i = 0; i<quantidade ; i++) 
			colecao.add(prototype.clonar());
		
	}
	
	public void addPrototype(String key, IPrototype value) {
		manager.addPrototype(key, value);
	}
	
	
}
