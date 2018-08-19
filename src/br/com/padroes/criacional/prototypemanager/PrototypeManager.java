package br.com.padroes.criacional.prototypemanager;

import java.util.TreeMap;

public class PrototypeManager {
	
	 private TreeMap<String, IPrototype> map;
	 
	 public PrototypeManager() {
		 map = new TreeMap<>();
	 }
	 
	 public void addPrototype(String key,IPrototype value) {
		 
		 map.put(key, value);
	 }
	 
	 public IPrototype lookup(String key) {
		 return map.get(key);
	 }
}
