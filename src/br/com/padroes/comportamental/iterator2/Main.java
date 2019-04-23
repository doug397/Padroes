package br.com.padroes.comportamental.iterator2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Object> objetos = new ArrayList<>();
		objetos.add(new Aluno("Douglas"));
		objetos.add(new Aluno("Larissa"));
		
		Iterator i = new ListIterator(objetos);
		
		for(i.first() ; !i.isDone() ; i.next()) {
			Aluno aluno =(Aluno) i.currentItem();
			System.out.println(aluno.getNome());
		}
		


	

	}

}
