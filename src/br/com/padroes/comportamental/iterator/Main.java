package br.com.padroes.comportamental.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Object> objetos = new ArrayList<>();
		objetos.add("Douglas");
		objetos.add("Larissa");
		
		Iterator i = new ListIterator(objetos);
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		
		}

	}

}
