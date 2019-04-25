package br.com.padroes.comportamental.visitor2;

public class DormirVisitor implements IVisitor {
	

	@Override
	public void visitAluno(Aluno aluno) {
		aluno.setDormir(true);
		
	}

	@Override
	public void visitProfessor(Professor professor) {
		professor.setDormir(true);
		
	}

}
