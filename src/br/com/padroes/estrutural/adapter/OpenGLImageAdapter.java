package br.com.padroes.estrutural.adapter;

/*
 * Agora vamos definir os adaptadores:
 * 
 * **/
public class OpenGLImageAdapter extends OpenGLImage implements ImageTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		glCarregarImagem(nomeDoArquivo);
		
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		glDesenharImagem(posX, posY);
		
		
	}

}
