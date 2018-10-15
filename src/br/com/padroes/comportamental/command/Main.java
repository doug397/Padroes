package br.com.padroes.comportamental.command;

public class Main {

	public static void main(String[] args) {
	
		Document document = new Document();
		MacroCommand historico = new MacroCommand();
		Application app = new Application();
		ICommand command ;
		
		
		command = new OpenCommand(document);
		app.setCommand(command);
		historico.addCommand(command);
		
		
		command = new CutCommand(document);
		app.setCommand(command);
		historico.addCommand(command);
		
		command = new PasteCommand(document);
		app.setCommand(command);
		historico.addCommand(command);
		
		
		command = new CopyCommand(document);
		app.setCommand(command);
		historico.addCommand(command);
		
		
		command = new CloseCommand(document);
		app.setCommand(command);
		historico.addCommand(command);
		
		
		
		historico.execute();
		
		
		
		
		

	}

}
