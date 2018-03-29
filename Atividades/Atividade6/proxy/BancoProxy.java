package MAP.Atividades.Atividade6.proxy;

public class BancoProxy implements InterfaceBancoUsuarios{

	protected String usuario, senha;
	BancoUsuarios banco;
	
	public BancoProxy(String usuario, String senha) {
		banco = new BancoUsuarios();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	@Override
	public String getNumeroUsuarios() {
		if(temPermissaoDeAcesso()){
			return banco.getNumeroUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if(temPermissaoDeAcesso()){
			return banco.getUsuariosConectados();
		}
		return null;
	}
	
	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

}
