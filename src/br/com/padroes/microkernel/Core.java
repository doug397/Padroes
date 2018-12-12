package br.com.padroes.microkernel;

public class Core implements ICore {
	
	private IBDControler bdControler;
	private IUIControler uiControler;
	private IPluginControler  pluginControler;
	
	public Core() {
		bdControler = new DBControler();
		uiControler = new UIControler();
		pluginControler = new PluginControler();
		
	}

	@Override
	public void init() {
		bdControler.loadDb();
		uiControler.loadControlers();
		pluginControler.loadPlugins();
		
	}

}
