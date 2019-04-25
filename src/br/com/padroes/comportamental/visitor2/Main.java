package br.com.padroes.comportamental.visitor2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<IVisitor> visitores = new ArrayList<IVisitor>();
		List<Element> elementos = new ArrayList<Element>();
		
		
		visitores.add(new EstatisticaVisitor());
		elementos.add(new Aluno(10));
		elementos.add(new Professor());
		elementos.add(new Professor());
		elementos.add(new Professor());
		elementos.add(new Professor());
		elementos.add(new Aluno(20));
		elementos.add(new Aluno(30));
		elementos.add(new Aluno(10));
		elementos.add(new Aluno(20));
		elementos.add(new Aluno(10));
		elementos.add(new Aluno(10));
		elementos.add(new Aluno(10));

		for(Element ele : elementos)
			for(IVisitor i : visitores)
				ele.accept(i);
		
        EstatisticaVisitor esta = (EstatisticaVisitor) visitores.get(0);
		
		System.out.println("Total de alunos :"+ esta.getTotalAlunos());
		System.out.println("Total de professores :"+ esta.getTotalProfessores());
		System.out.println("Total notas dos alunos :"+ esta.getTotalNotasAluno());
		System.out.println("Média total de alunos :"+ esta.getMediaNotasAluno());

	}

}
