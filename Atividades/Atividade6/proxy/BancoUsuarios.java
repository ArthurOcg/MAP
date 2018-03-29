package MAP.Atividades.Atividade6.proxy;

public class BancoUsuarios implements InterfaceBancoUsuarios{

	
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoUsuarios() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}
	
	
	@Override
	public String getNumeroUsuarios() {
		// TODO Auto-generated method stub
		return new String("Total de usuários: " + quantidadeDeUsuarios);
	}

	@Override
	public String getUsuariosConectados() {
		// TODO Auto-generated method stub
		return new String("Usuários conectados: " + usuariosConectados);
	}

}
