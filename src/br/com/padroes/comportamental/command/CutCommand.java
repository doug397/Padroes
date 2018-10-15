package br.com.padroes.comportamental.command;

public class CutCommand  implements ICommand{

	private Document document;
	
	
	public CutCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		
		System.out.println("CutCommand");
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
