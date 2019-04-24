package br.com.padroes.comportamental.command2;

public class Main {

	public static void main(String[] args) {
		
		
		Operacao calculo = new Operacao();
		Calculadora calculadora = new Calculadora();
		
		ICommand command = new SomaCommand(calculo);
		calculadora.setICommand(command);
		calculadora.operacao();
		
		
		command = new SubtracaoCommand(calculo);
		calculadora.setICommand(command);
		calculadora.operacao();
		
		command = new MultiplicacaoCommand(calculo);
		calculadora.setICommand(command);
		calculadora.operacao();
		
		command = new DivisaoCommand(calculo);
		calculadora.setICommand(command);
		calculadora.operacao();
		
		

	}

}
