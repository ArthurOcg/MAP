package MAP.Atividades.Atividade7;

public class ImagemAdapter implements ImagemTarget{

	Imagem imagem;
	
	public ImagemAdapter( Imagem imagem) {
		this.imagem = imagem;
	}
	
	
	@Override
	public void carregarImagem() {
		imagem.cImagem();
		
	}

	@Override
	public void desenharImagem() {
		imagem.dImagem();
		
	}

}
