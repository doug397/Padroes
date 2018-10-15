package br.com.padroes.comportamental.command;

public class CopyCommand  implements ICommand{

	private Document document;
	
	
	
	public CopyCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		System.out.println("CopyCommand");
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
