package br.com.padroes.estrutural.adapter2;

public class ImagemAdapter implements ImageTarget {

	// depois trocar para SDL_Surface para ter uma referencia do objeto 
	OpenGLImage imagem;
	
	public ImagemAdapter() {
		imagem = new OpenGLImage();
	}
	
	@Override
	public void carregarImagem(String nomeDoArquivo) {
		imagem.glCarregarImagem(nomeDoArquivo);
		
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		imagem.glDesenharImagem(posY, posX);
		
	}

}
