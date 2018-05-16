package MAP.Atividades.Atividade14;

public class Filho implements Familia {
	
	
	private Pai pai;
	private String email;
	
	

	@Override
	public String dados() {
		
		return "Nome: " + this.getNome() + "Idade: "+ this.getIdade() + "Email: " + this.email;
	}



	public String getNome(){
		
		return pai.getNome();
	}
	
	public int getIdade(){
		return pai.getIdade();
	}
	
	public void setNome(String nome){
		
		pai.setNome(nome);
		
	}
	
	public void setIdade(int idade){
		
		pai.setIdade(idade);
	}
	
	
	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
