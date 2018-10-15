package br.com.padroes.comportamental.visitor;

public interface IVisitor {

  void visitAluno(Aluno aluno);
  void visitProfessor(Professor professor);
}
