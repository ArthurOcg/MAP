package MAP.Atividades.Atividade7;

public class Cliente {

	public static void main(String[] args) {
		
		ImagemAdapter adaptador = new ImagemAdapter(new ImagemPNG());
		
		adaptador.carregarImagem();
		
		adaptador = new ImagemAdapter(new ImagemJPEG());
		
		adaptador.carregarImagem();
		
		adaptador = new ImagemAdapter(new ImagemBMP());
		
		adaptador.carregarImagem();

	}

}
