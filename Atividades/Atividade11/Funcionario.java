package MAP.Atividades.Atividade11;

public class Funcionario {

	
	protected double salarioBase;
	protected Gratificacao cargo;
    protected int nivel;

	public Funcionario(Gratificacao cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		cargo.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
  	public Gratificacao getCargo() {
		return cargo;
	}

	public void setCargo(Gratificacao cargo) {
		this.cargo = cargo;
	}
	
	
	
}
