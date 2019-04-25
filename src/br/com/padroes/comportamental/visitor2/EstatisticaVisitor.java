package br.com.padroes.comportamental.visitor2;

public class EstatisticaVisitor implements IVisitor {
	
	private int totalAlunos;
	private int totalNotasAluno;
	private int totalProfessores;
	
	public EstatisticaVisitor() {
		totalAlunos = 0;
		totalNotasAluno = 0;
		totalProfessores = 0;
	}


	@Override
	public void visitAluno(Aluno aluno) {
		totalAlunos++;
		totalNotasAluno += aluno.getNota();
		
	}

	@Override
	public void visitProfessor(Professor professor) {
		totalProfessores ++;	
	}
	
	public double getMediaNotasAluno() {
		return totalNotasAluno/totalAlunos;
	}
	
	public int getTotalAlunos() {
		return totalAlunos;
	}

	public int getTotalNotasAluno() {
		return totalNotasAluno;
	}

	public int getTotalProfessores() {
		return totalProfessores;
	}

}
