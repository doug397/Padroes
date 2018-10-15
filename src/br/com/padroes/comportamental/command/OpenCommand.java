package br.com.padroes.comportamental.command;

public class OpenCommand  implements ICommand{

	private Document document;
	
	
	public OpenCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		
		System.out.println("OpenCommand");
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
