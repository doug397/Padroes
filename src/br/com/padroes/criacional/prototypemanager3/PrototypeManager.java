package br.com.padroes.criacional.prototypemanager3;

import java.util.TreeMap;

public class PrototypeManager {
	
	private TreeMap<String , IPrototype> map;
	
	public PrototypeManager() {
		map = new TreeMap<String, IPrototype>();
	}
	
	public void  addPrototype(String key,IPrototype value) {
		map.put(key, value);
	}
	
	public IPrototype getPrototype(String key) {
		return map.get(key);
	}

}
